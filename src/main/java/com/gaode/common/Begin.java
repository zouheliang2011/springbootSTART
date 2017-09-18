package com.gaode.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

import com.gaode.common.bean.UserInfo;

//import com.ruiyun.taobao.login.LoginConfiguration;
//import com.ruiyun.taobao.mqs.ItemDistributionConfiguration;

@ServletComponentScan
@SpringBootApplication
@EnableConfigurationProperties({UserInfo.class})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@MapperScan("com.gaode*.dao")
public class Begin {
	public static void main(String[] args) {  
        SpringApplication.run(Begin.class);  
    }  
}
