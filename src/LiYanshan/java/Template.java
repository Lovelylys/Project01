package LiYanshan.java;

import java.util.ArrayList;

/**
 * @author abs
 * @Date 2018/12/4 - 21:08
 */
/*
    1.IDEA中的模版所处的位置: settings - Edtitor - Live Templates /Postfix Completion
 */
public class Template {
//    模版六： prsf
    private static final Customer CUST = new Customer();
    //变形： psf / psfi / psfs
    public static final int NUM = 10;
    public static final int NUM2 = 20;
    public static final String NATION = "China";

    //    模版一：psvm
    public static void main(String[] args) {

        //模板二： sout
        System.out.println("Hello");
        //变形： soutp/soutm/soutv/xxx.sout

        System.out.println("args = [" + args + "]");
        System.out.println("Template.main");
        int num = 10;
        System.out.println("num = " + num);

        int num2 = 20;//num2.sout
        System.out.println(num2);

        //模版三： fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //iter
        for (String arg : arr) {
            System.out.println(arg);

        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String arg = arr[i];
            System.out.println(arg);
        }
        
//        模版四：list.fori
        ArrayList list = new ArrayList ();
        for (Object o : list) {
            
        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr
        //倒序的遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        method(list);

    }

    public static void method(ArrayList list) {
        //模版五 ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //变形，list.null list.nn
        if (list == null) {

        }
        if (list != null) {

        }

    }
}
