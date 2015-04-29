一、工程目录结构

根目录

├ source 
├ LICENCE.txt 
├ README.md 
目录简要解释
根目录

├ source --源代码 
├ LICENCE.txt --开源协议 
├ README.md --项目帮助及项目信息 
二、源代码目录结构

source

├ src 
├ libs 
├ res 
├ AndroidManifest.xml 
├ proguard-project.txt 
└ project.properties 
1、src目录 
src目录用于存放工程的包及java源码文件。

下面是src目录的子目录：

src 

├ com.finddreams.alipay --带分隔线灰色背景的九宫格完整源码
├ com.github.johnpersano.supertoasts --超级吐司（待完善）
├ com.github.johnpersano.supertoasts.util --超级吐司工具类

2、libs目录 
libs目录用于存放项目引用的第三方jar包。

libs目录里的jar包文件：

libs

├ android-support-v4.jar --v4兼容包
├ jackson-all-1.9.2.jar --解析json的包
├ umeng_sdk.jar --友盟的sdk
├ zxing-1.6.jar --二维码处理的包
├ zxing-1.6.jar --universal-image-loader-1.9.3.jar 异步加载图片类
3、res目录 
res目录存放工程用到的图片、布局、样式等资源文件。
res目录的子目录：

res 

├ anim 
├ color 
├ drawable 
├ drawable-hdpi 
├ drawable-ldpi 
├ drawable-mdpi 
├ drawable-xhdpi 
├ interpolator
├ layout 
├ menu 
├ raw 
├ values 
└ values-zh 
4、AndroidManifest.xml
AndroidManifest.xml用于设置应用程序的版本、主题、用户权限及注册Activity等组件及其他配置。