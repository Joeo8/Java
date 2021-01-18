[TOC]

### Github无法显示和上传头像（已解决）

#### 问题描述

>打开Github，头像位置错乱，上传头像无限等待，F12查看网页请求发现报错

#### 原因

> DNS有问题

#### 解决方法

>window系统中，在C:\Windows\System32\drivers\etc文件夹修改hosts文件，添加以下内容：

```
#头像上传
199.232.96.133 media.githubusercontent.com
#头像显示
199.232.96.133 avatars0.githubusercontent.com
199.232.96.133 avatars1.githubusercontent.com
199.232.96.133 avatars2.githubusercontent.com
199.232.96.133 avatars3.githubusercontent.com
199.232.96.133 avatars4.githubusercontent.com
199.232.96.133 avatars5.githubusercontent.com
199.232.96.133 avatars6.githubusercontent.com
199.232.96.133 avatars7.githubusercontent.com
199.232.96.133 avatars8.githubusercontent.com
```

------



#### 注意:small_red_triangle:

​		要使用管理员模式打开并修改文件，或者复制文件进行修改后再进行替换。
​		IP地址199.232.96.133是githubusercontent.com的IP地址，可能会有变化，可以在https://www.ipaddress.com/中进行查询。

（在上传头像出错的时候按F12看出错信息，可以看到网址media.githubusercontent.com）

