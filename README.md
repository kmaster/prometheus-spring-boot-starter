计划用于添加一个prometheus的starter



使用方法：在需要使用的工程中添加如下信息
 1、pom
 
        <dependency>
             <groupId>cn.kt</groupId>
             <artifactId>prometheus-spring-boot-starter</artifactId>
             <version>1.0</version>
         </dependency>
         
 2、配置文件
 
 kt.prometheus.enable=true
 kt.prometheus.name=netscape