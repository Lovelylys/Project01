package LiYanshan.java;

import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    private static int num;

    public HelloWorld(ArrayList list1) {
        this.list1 = list1;
    }

    /**
     * 快捷键的使用
     * 1.执行 alt + r
     * 2.补全提示 alt + /
     * 3.单行注释 ctrl + /
     * 4.多行注释 ctrl + shift + /
     * 5.复制一行 ctrl + alt + down 但是和显示屏控制冲突了
     * 6.删除一行 ctrl + d
     * 7.向上移动 alt + up
     * 8.向下移动 alt + down
     * 9.向下开始新的一行(start new line) shift + enter
     * 10.向上开始新的一行(start new line before current) ctrl +shift + enter
     * 11.查看源码(class) ctrk + 选中指定的结构 或 ctrl + shift + t
     * 12.万能解错/生成返回值变量 alt + enter
     * 13.返回到上一个编辑的页面(back) alt + left
     * 14.进入到下一个编辑的页面(针对于上条) alt + right
     * 15.查看继承关系(type hierarchy)  F4
     * <p>
     * 16.格式化代码 ctrl + shift + f
     * 17.提示方法参数类型(parameter info) ctrl + alt + /
     * 18.复制代码 ctrl + c
     * 19.撤销 ctrl + z
     * 20.反撤销 CTRL + y
     * 21.剪切 CTRL + X
     * 22.粘贴 ctrl + v
     * 23.保存 ctrl + s
     * 24.全选 ctrl + a
     * 25.选中数行，整体往后移动  tab
     * 26.选中数行，整体往前移动 shift + tab
     * 27.查看类的结构，类似于eclipse的outline  ctrl + o (可以查看具体有哪些方法，看结构)
     * 28.重构：修改变量名与方法名(rename) alt + shift + r
     * 29.大写转小写/小写转大写(toggle case) ctrl + shift + y
     * 30.生成构造器/get/set/toString          alt + shift + s
     *
     * 31.查看文档说明 F2
     * 32.收起所有的方法(collapse all) alt + shift + c
     * 33.打开所有方法(expand all) alt +  shift + x
     * 34.打开代码所在硬盘文件夹(show in explorer) ctrl + shift + x
     * 35.生成try-catch等(surround with) alt + shift + z
     * 36.局部变量抽取为成员变量(introduce field)  alt + shift + f   当多个方法都用到同一个变量，就可以改为成员变量
     * 37.查找/替换(当前)   ctrl + f
     * 38.查找(全局)        ctrl + h
     * 39.查找文件          double shift
     * 40.查看类的继承结构图(show UML Diagram)   ctrl + shift + u
     * 41.查看方法的多层重写结构(method hierarchy)         ctrl + alt + h
     * 42. 添加到收藏(add to favorites)          ctrl + alt + f
     * 43.抽取方法(Extract Method)              alt + shift + m
     * 44.打开最近修改的文件(recently files)     ctrl + e
     * 45.关闭当前打开的代码栏(close)             ctrl + w
     *
     * 46.关闭所有的代码栏(close all)            ctrl + shift + w
     * 47.快速搜索类中的错误(next highlighted error) ctrl + shift + q
     * 48.选择要粘贴的内容             ctrl + shift + v     可以从最近多次复制的内容中选择粘贴
     * 49.查找方法再那里被调用(call hierarchy)    ctrl + shift + h
     *
     * @param args
     */
    private static ArrayList list1 = new ArrayList();

    public static void main(String[] args) {
        num = 10;
        getList();
    }

    public static void getList() {
        System.out.println("Hello World!");

        System.out.println();
        Date date = new Date();

        list1.add(2, date);
    }


}
