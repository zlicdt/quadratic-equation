# 用 Rust 解决一元二次方程

具体原理在我的 [Blog](https://acidec.github.io/2022/11/04/rust-quadratic-equation/)
## 支持操作系统
* 构建需要 [Rust](https://rust-lang.org) 安装
* 可以在任何系统运行
## 构建 && 运行
**确保你装了 [Rust](https://rust-lang.org).**
### Windows
可以使用 [git-for-windows](https://git-scm.com/download/win) 或者下载压缩包的方式获取代码

打开 ``PowerShell``
```cmd
cargo build
cargo run
```
### GNU/Linux
安装 Rust:
```bash
curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh
```
下载代码:
```bash
git clone https://github.com/acidec/rust-quadratic-equation.git
```
构建 && 运行
```bash
cd rust-quadratic-equation
cargo build
cargo run
```
### macOS
安装 Command Line Tools(CLT) for Xcode.
```bash
xcode-select --install
```
安装 Rust
```bash
curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh
```
下载代码
```bash
git clone https://github.com/acidec/rust-quadratic-equation.git
```
运行
```bash
cd rust-quadratic-equation
cargo build
cargo run
```

**2024 @ Starch Tech Inc Copyright**
