package com.market.shoppingmall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing //감시자로 설정
public class JpaConfig {
}
