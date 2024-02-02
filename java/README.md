# 用 Java 解决一元二次方程

## 依赖
* 任何 JDK 17 往上
[Microsoft JDK 17.0.9](https://aka.ms/download-jdk/microsoft-jdk-17.0.9-windows-x64.msi)
* Visual Studio Code + Extension Pack for Java

**本程序使用上述环境完成，且目录结构符合标准，任何修改可能使其失效**

## 试
```bash
cd java-quadratic-equation/src
```
用 VSCode 打开 App.java，如果出现 Run/Debug 请按下 Run
接下来会启动终端运行

## 手动构建
```bash
cd java-quadratic-equation/src
mkdir ../bin
javac App.java
mv App.class ../bin/
```
之所以把 binary 搬过去事因为强迫症

### 运行
```bash
cd ../bin/
java App
```
它是一个循环的、经常显示错误的、有对象未 close 的



**2024 @ Starch Tech Inc Copyright**