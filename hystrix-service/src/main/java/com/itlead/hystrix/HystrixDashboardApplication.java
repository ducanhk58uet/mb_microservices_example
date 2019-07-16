package com.itlead.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableTurbineStream
@EnableHystrixDashboard
@EnableAsync
public class HystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class);
    }
}
