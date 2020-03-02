# 2019-nCoV
2019-nCoV data platform command line client.

## Getting

If you want source code, you can

```
git clone https://github.com/FeilyZhang/2019-nCoV.git
```

If you just want to use it simply, you can download the compressed package [here](https://github.com/FeilyZhang/2019-nCoV/releases).

## How to use

### Before using
You need to install JDK1.8 or jre1.8 (if you just want to run it), configure your environment variables (there are many tutorials on the Internet), and then double-click the bat file to run it.

Of course, you can also add the bat file to the path variable under your environment variable, so that you can run it from the command prompt under CMD, with the command of `2019ncov` as below.

```
λ 2019ncov
Welcome to 2019-nCoV data query tool.
Current version is v0.01.
This software is licensed through MIT open source agreement.

The direct data source of this tool is https://lab.isaaclin.cn/ncov
The project address of this tool is https://github.com/FeilyZhang/2019-nCoV
If you have any questions, you can submit the issue or email me(fei@feily.tech).

Copyright (c) 2020, github.com/FeilyZhang. All rights reserved.

Type 'help' or 'h' for help. Type 'exit' or 'e' to exit this tool.

2019nCoV >
```
### List of all commands

cmd | introduction
----|-----
`prc -s` | Time series data of China since 4:00 pm, January 24, 2020.
`prc -n` | Latest data, not time series since 4:00 pm, January 24, 2020.
`pro -s -省市` | Time series data of each province since 4:00 pm, January 24, 2020.
`pro -n -省市` | Latest data, not time series since 4:00 pm, January 24, 2020.

Currently supported provinces and cities include:

省市 | 省市 | 省市 | 省市 | 省市 | 省市
----|----|----|----|----|-----
上海市 | 云南省 | 北京市 | 吉林省 | 四川省 | 天津市
安徽省 | 山东省 | 山西省 | 广东省 | 江苏省 | 江西省
河北省 | 河南省 | 浙江省 | 海南省 | 湖北省 | 湖南省
甘肃省 | 福建省 | 贵州省 | 辽宁省 | 重庆市 | 陕西省
青海省 | 黑龙江省 | 澳门 | 香港 | 台湾 | 内蒙古自治区
宁夏回族自治区 | 广西壮族自治区 | 新疆维吾尔自治区 | 西藏自治区

Please operate in strict accordance with the name of the above province.

### Some examples are as follows

#### Obtain complete and up-to-date national epidemic data since 4:00 pm, January 24, 2020
```
2019nCoV > prc -n
Request succeeded, parsing...
Write file succeeded, path is C:\Users\fei47\Desktop\1582804528356.csv
```

#### Obtain complete time series data of the whole country since 4:00 pm, January 24, 2020
```
2019nCoV > prc -s
Request succeeded, parsing...
Write file succeeded, path is C:\Users\fei47\Desktop\1582804558056.csv
```
Due to the large amount of data, this command may be time-consuming for data analysis. In particular, if your network is slow, there may be a timeout request or other problems. The current solution is to adjust the network quality and try again.

#### Obtain complete and latest epidemic data of a province since 4:00 pm, January 24, 2020
 ```
 2019nCoV > pro -n -陕西省
 Request succeeded, parsing...
 Write file succeeded, path is C:\Users\fei47\Desktop\1582804728127.csv
 ```
 You need to pay attention to the format of the command. The names of provinces can only be listed in the table above.
 
#### Obtain complete time series data of a province since 4:00 pm, January 24, 2020
 ```
 2019nCoV > pro -s -陕西省
 Request succeeded, parsing...
 Write file succeeded, path is C:\Users\fei47\Desktop\1582804891865.csv
 ```
 etc...
 
## Copyright and notices

+ This software is licensed through MIT open source agreement.
+ The direct data source of this tool is https://lab.isaaclin.cn/ncov
+ The project address of this tool is https://github.com/FeilyZhang/2019-nCoV
+ If you have any questions, you can submit the issue or email me(fei@feily.tech)
+ Copyright (c) 2020, github.com/FeilyZhang. All rights reserved.
