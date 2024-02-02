# 用 C++ 解决一元二次方程

具体原理在我的 [Blog](https://acidec.github.io/2022/12/05/cpp-quadratic-equation/)
## 支持操作系统
所有安装了 C++ 编译器的
## 构建 && 运行
### Windows
可以使用 [git-for-windows](https://git-scm.com/download/win) 或者下载压缩包的方式获取代码

**推荐使用 [MSVC Build Tool](https://aka.ms/vs/17/release/vs_BuildTools.exe) 作为构建工具**

打开开始菜单里的 `Developer PowerShell for VS 2022`
```cmd
cd cpp-quadratic-equation/src
cl main.cpp
.\main.exe
```
### GNU/Linux
用包管理器安装 `clang` 和 `make`:
```bash
## Arch Linux 及其衍生发行版
sudo pacman -S clang make
## Debian 及其衍生发行版
sudo apt install clang make
## RHEL 及其衍生发行版
sudo dnf in clang make
## openSUSE/SUSE Linux Enterprise
sudo zypper in clang make
## Gentoo Linux
sudo emerge -av clang make
```
下载代码:
```bash
git clone https://github.com/acidec/cpp-quadratic-equation.git
```
运行:
```bash
cd cpp-quadratic-equation
make
make run
```
### macOS
安装 Command Line Tools(CLT) for Xcode
```zsh
xcode-select --install
```
下载代码
```zsh
git clone https://github.com/acidec/cpp-quadratic-equation.git
```
运行
```zsh
cd cpp-quadratic-equation
make
make run
```
## 清理
> 需要类 Unix OS
```zsh
cd cpp-quadratic-equation
make clean
```

**2024 @ Starch Tech Inc Copyright**
