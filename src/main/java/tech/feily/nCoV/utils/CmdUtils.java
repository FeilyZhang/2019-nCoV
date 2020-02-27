package tech.feily.nCoV.utils;

import java.util.HashMap;
import java.util.Map;

import tech.feily.nCoV.model.CmdModel;

public class CmdUtils {
    
    static CmdModel cm = new CmdModel();
    static String cmd = "", opt = "";
    static String[] globals = {"上海市", "云南省", "以色列", "伊拉克", "伊朗", "俄罗斯", "克罗地亚", "内蒙古自治区", 
            "加拿大", "北京市", "印度", "台湾", "吉林省", "四川省", "埃及", "天津市", "奥地利", "宁夏回族自治区", "安徽省", 
            "尼泊尔", "山东省", "山西省", "巴基斯坦", "巴林", "巴西", "希腊", "广东省", "广西壮族自治区", "德国", "意大利", 
            "斯里兰卡", "新加坡", "新疆维吾尔自治区", "日本", "柬埔寨", "格鲁吉亚", "比利时", "江苏省", "江西省", "河北省", 
            "河南省", "法国", "泰国", "浙江省", "海南省", "湖北省", "湖南省", "澳大利亚", "澳门", "瑞典", "瑞士", "甘肃省", 
            "福建省", "科威特", "罗马尼亚", "美国", "芬兰", "英国", "菲律宾", "西班牙", "西藏自治区", "贵州省", "越南", 
            "辽宁省", "重庆市", "钻石公主号邮轮", "阿富汗", "阿尔及利亚", "阿曼", "阿联酋", "陕西省", "青海省", "韩国", 
            "香港", "马来西亚", "黎巴嫩", "黑龙江省"};
    static String[] provinces = {"上海市", "云南省", "北京市", "吉林省", "四川省", "天津市", "安徽省", "山东省", 
            "山西省", "广东省", "江苏省", "江西省", "河北省", "河南省", "浙江省", "海南省", "湖北省", "湖南省", "甘肃省",
            "福建省", "贵州省", "辽宁省", "重庆市","陕西省", "青海省", "黑龙江省", "澳门", "香港", "台湾", "内蒙古自治区",
            "宁夏回族自治区", "广西壮族自治区", "新疆维吾尔自治区", "西藏自治区"};
    static Map<String, Map<String, String>> cmdMap = new HashMap<String, Map<String, String>>();
    
    static {
        // Time series data of China since statistics.
        Map<String, String> prcMap = new HashMap<String, String>();
        prcMap.put("prcn", "https://lab.isaaclin.cn/nCoV/api/overall?latest=1");
        prcMap.put("prcs", "https://lab.isaaclin.cn/nCoV/api/overall?latest=0");
        cmdMap.put("prc", prcMap);
        // Time series data of each province since statistics.
        Map<String, String> proMap = new HashMap<String, String>();
        proMap.put("pron", "https://lab.isaaclin.cn/nCoV/api/area?latest=1&province=");
        proMap.put("pros", "https://lab.isaaclin.cn/nCoV/api/area?latest=0&province=");
        cmdMap.put("pro", proMap);
    }
    
    public static void welcome() {
        System.out.println("Welcome to 2019-nCoV data query tool.");
        System.out.println("Current version is v0.01.");
        System.out.println("This software is licensed through MIT open source agreement.");
        System.out.println("\nThe direct data source of this tool is https://lab.isaaclin.cn/ncov");
        System.out.println("The project address of this tool is https://github.com/FeilyZhang/2019-nCoV");
        System.out.println("If you have any questions, you can submit the issue or email me(fei@feily.tech).\n");
        System.out.println("Copyright (c) 2020, github.com/FeilyZhang. All rights reserved.");
        System.out.println("\nType 'help' or 'h' for help. Type 'exit' or 'e' to exit this tool.\n");
    }
    
    public static void execute(String cmdline) throws InterruptedException {
        if (!cmdline.contains("-")) {
            System.out.println("Command format error, please try again.\n");
            return;
        }
        String[] split = removeSpace(cmdline).split("-");
        if (split.length == 2 && split[0].equalsIgnoreCase("prc")) {
            if (cmdMap.containsKey(split[0]) && cmdMap.get(split[0]).containsKey(split[0] + split[1])) {
                HttpRequestUtils.get(cmdMap.get(split[0]).get(split[0] + split[1]), "prc");
            } else {
                System.out.println("Wrong command or parameter options, please try again.\n");
            }
        } else if (split.length == 3 && split[0].equalsIgnoreCase("pro")) {
            if (!isExist(split[2])) {
                System.out.println("Incorrect province / City input, please try again.\n");
                return;
            }
            if (cmdMap.containsKey(split[0]) && cmdMap.get(split[0]).containsKey(split[0] + split[1])) {
                HttpRequestUtils.get(cmdMap.get(split[0]).get(split[0] + split[1]) + split[2], "pro");
            } else {
                System.out.println("Wrong command or parameter options, please try again.\n");
            }
        } else {
            System.out.println("Wrong command or parameter options, please try again.\n");
        }
    }
    
    public static String removeSpace(String cmdline) {
        String finalCmd = "";
        for (int i = 0; i < cmdline.length(); i++) {
            if (cmdline.charAt(i) != ' ') {
                finalCmd += cmdline.charAt(i);
            }
        }
        return finalCmd;
    }
    
    public static boolean isExist(String province) {
        for (String str : provinces) {
            if (str.equals(province)) {
                return true;
            }
        }
        return false;
    }
    
    public static void help() {
        String hlp = "List of all commands:\n"
                + "prc -s     \tTime series data of China since 4:00 pm, January 24, 2020.\n"
                + "prc -n     \tLatest data, not time series since 4:00 pm, January 24, 2020.\n"
                + "pro -s -省市 \tTime series data of each province since 4:00 pm, January 24, 2020.\n"
                + "  eg. pro -s -北京市\n"
                + "pro -n -省市 \tLatest data, not time series since 4:00 pm, January 24, 2020.\n"
                + "  eg. pro -n -北京市\n"
                + "\nCurrently supported provinces and cities include:";
        System.out.println(hlp);
        for (int i = 1; i < provinces.length + 1; i++) {
            if (i % 6 != 0) {
                System.out.print("\t" + provinces[i - 1]);
            } else {
                System.out.println("\t" + provinces[i - 1]);
            }
        }
        System.out.println("\n\nPlease operate in strict accordance with the name of the above province.\n");
    }
}
