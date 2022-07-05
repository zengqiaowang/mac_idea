package com.qtopay;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zengqiaowang
 * @create 2022-07-04-3:47 PM
 */
public class TemplatesTest {
    //模版6：prsf: 可生成private static final
    public static final int num=1;
    //prsfi prsfs
    //模版1：psvm
    public static void main(String[] args) {

        //模版2：sout
        System.out.println("hello");
        //变形: soutp/soutm/xxx.out
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        
        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);

        //模版三：fori
        String[] arr = new String[]{"Tom","Jerry","Hanmeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //模版四：list.for
        ArrayList list = new ArrayList();
        for (Object o : list) {
            System.out.println(o);
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        
        //模版五：ifn
        ArrayList list1 = new ArrayList();
        list1.add(123);
        list1.add(345);
        list1.add(567);
        if (list1 == null) {
            
        }
    }
    public  void test1() {

    }

    //测试自己定制的模版
    public void test (){

    }
}
