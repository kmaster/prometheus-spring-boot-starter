package cn.kt;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "kt.prometheus")
public class PrometheusProperties {


    private String name = "init-name";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
