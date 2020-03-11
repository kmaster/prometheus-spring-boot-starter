package cn.kt;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(PrometheusService.class)
@ConditionalOnProperty(prefix = "kt.prometheus", value = "enable", matchIfMissing = false)
@EnableConfigurationProperties(PrometheusProperties.class)
public class PrometheusAutoConfigration {


    @Bean
    @ConditionalOnMissingBean
    public PrometheusService prometheusService() {
        return new PrometheusService();
    }

}
