package com.curriculum.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <P>
 * 		Mybatis-Plus 配置
 * </p>
 */
@Configuration
@MapperScan("com.curriculum.mapper")
public class MybatisPlusConfig {
	/**
	 * 新的分页插件
	 */
	@Bean
	public MybatisPlusInterceptor mybatisPlusInterceptor() {
		MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
		// 添加分页插件
		PaginationInnerInterceptor pageInterceptor = new PaginationInnerInterceptor();
		// 设置请求的页面大于最大页后操作，true调回到首页，false继续请求。默认false
		pageInterceptor.setOverflow(false);
		// 单页分页条数限制，默认无限制
		pageInterceptor.setMaxLimit(500L);
		// 设置数据库类型
		pageInterceptor.setDbType(DbType.MYSQL);
		interceptor.addInnerInterceptor(pageInterceptor);
		return interceptor;
	}


}