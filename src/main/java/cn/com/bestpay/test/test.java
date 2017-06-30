package cn.com.bestpay.test;

import cn.com.bestpay.model.testModel;

/**
 * Created by user on wanghui 2016/9/22.
 */
public class test {

    public static void main(String[] args) throws Exception{
        //测试clone对象方法
        testModel tm = new testModel("1","2");

        System.out.println(tm.toString());

    }
}
