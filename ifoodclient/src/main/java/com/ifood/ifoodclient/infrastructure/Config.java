package com.ifood.ifoodclient.infrastructure;

import com.ifood.ifoodclient.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class Config {

    private final RestaurantRepository restaurantRepository;

    @Bean
    public TerminateBean getTerminateBean() {
        return new TerminateBean(getCacheBean(), restaurantRepository);
    }

    @Bean
    public CacheBean getCacheBean() {
        return new CacheBean();
    }
}
