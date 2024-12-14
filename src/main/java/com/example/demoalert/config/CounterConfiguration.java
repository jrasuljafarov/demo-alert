package com.example.demoalert.config;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CounterConfiguration {

    @Bean
    public Counter counter(MeterRegistry meterRegistry) {
        return Counter.builder("rate_count")
                .description("Number of Exchange Rate Updates")
                .register(meterRegistry);
    }

}
