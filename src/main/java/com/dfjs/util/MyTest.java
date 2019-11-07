package com.dfjs.util;

/**
 * @author WD
 * @title: MyTest
 * @projectName mybatisgenerated
 * @description: TODO
 * @date 2019/6/10--17:02
 */
public class MyTest {

    public static void main(String[] args) {
         String  str="补扣图文咨询预支的余额-补扣图文咨询预支的心币";
        System.out.println(str.substring(0,str.indexOf("-")));
        System.out.println(str.substring(str.indexOf("-")+1,str.length()));
    }
}
