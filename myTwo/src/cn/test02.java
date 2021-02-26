package cn;

import com.Demo03.Myservice;

import java.util.ServiceLoader;

public class test02 {
    public static void main(String[] args) {
        ServiceLoader<Myservice> myservices = ServiceLoader.load(Myservice.class);//加载服务

        for (Myservice myservice : myservices) {
            myservice.service();
        }
    }
}
