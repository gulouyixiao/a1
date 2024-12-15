package com.curriculum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableCaching
@EnableScheduling //开启任务调度
@EnableTransactionManagement //开启事务管理注解模式
public class CurriculumApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurriculumApiApplication.class, args);
	}

}