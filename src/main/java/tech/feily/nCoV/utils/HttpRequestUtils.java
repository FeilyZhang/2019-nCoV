package tech.feily.nCoV.utils;

import java.io.IOException;

import javax.swing.filechooser.FileSystemView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import tech.feily.nCoV.model.AreaModel;
import tech.feily.nCoV.model.AreaResultsModel;
import tech.feily.nCoV.model.FileModel;
import tech.feily.nCoV.model.OverallModel;
import tech.feily.nCoV.model.OverallResultsModel;
import okhttp3.Headers.Builder;

public class HttpRequestUtils {
    
    static OkHttpClient client = new OkHttpClient();
    static String desktop = FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath();
    static String saveFile = null;
    
    public static void get(String url, final String type) {
        Request req = new Request.Builder()
                .url(url)
                .headers(setHeaders())
                .get()
                .build();
        try {
            Response res = client.newCall(req).execute();
            if (res.code() == 200) {
                System.out.println("Request succeeded, parsing...");
                String json = res.body().string();
                JSONObject obj = JSON.parseObject(json);
                String saveFile = desktop + "\\" + System.currentTimeMillis() + ".csv";
                FileModel fm = FileUtils.open(saveFile);
                if (type.equalsIgnoreCase("prc")) {
                    OverallModel all = JSONArray.parseObject(JSONObject.toJSONString(obj), OverallModel.class);
                    FileUtils.write(CSVUtils.getCSVOverallTitle() + "\n", fm);
                    for (OverallResultsModel rst : all.getResults()) {
                        FileUtils.write(rst.toString(), fm);
                    }
                } else if (type.equalsIgnoreCase("pro")) {
                    AreaModel area = JSONArray.parseObject(JSONObject.toJSONString(obj), AreaModel.class);
                    FileUtils.write(CSVUtils.getCSVAreaTitle() + "\n", fm);
                    for (AreaResultsModel rst : area.getResults()) {
                        FileUtils.write(rst.toStringWithoutCities(), fm);
                    }
                }
                FileUtils.close(fm);
                System.out.println("Write file succeeded, path is " + saveFile + "\n");
            } else {
                System.out.println("Unexpected response, response status is " + res.isSuccessful() 
                    + ", response code is " + res.code() + ".\n");
            }
        } catch (IOException e) {
            System.out.println("The request failed, details are as followes:\n" + e.getMessage() + "\n");
        }
    }
    

    public static Headers setHeaders() {
        Builder headerBuilder = new Builder();
        headerBuilder.add("Accept", "text/plain, text/html");
        headerBuilder.add("Accept-Language", "en,zh");
        headerBuilder.add("User-Agent", "Mozilla/5.0 (Linux; X11)");
        headerBuilder.add("Cache-Control", "no-cache");
        return headerBuilder.build();
    }
    
}
