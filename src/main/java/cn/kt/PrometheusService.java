package cn.kt;

import org.springframework.beans.factory.annotation.Autowired;

public class PrometheusService {


    @Autowired
    PrometheusProperties prometheusProperties;


    //这里实现向prometheus推送数据
    public void test() {
        System.out.println("test: " + prometheusProperties.getName());
    }



}
