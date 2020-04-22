package com.frame.frame.test;

import java.util.Properties;

/**
 * @author shr
 * @version 1.0
 * @date 2020-04-22 1:43 下午
 */


public class test4everyone {
    public static void main(String[] args) {
        System.out.println("--------------------");
        getSystem();
        System.out.println("--------------------");
    }

    public static void getSystem(){
        Properties properties = System.getProperties();
        String os = properties.getProperty("os.name");
        String osVersion = properties.getProperty("os.version");
        String osArch = properties.getProperty("os.arch");
        String osUser = properties.getProperty("user.name");
        System.out.println(os);
        System.out.println(osVersion);
        System.out.println(osArch);
        System.out.println(osUser);
    }
}
