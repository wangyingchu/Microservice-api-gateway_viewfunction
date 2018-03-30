package com.viewfunction.microserviceAPI_Gateway;

import com.viewfunction.microserviceAPI_Gateway.util.ApplicationLauncherUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class MicroserviceApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApiGatewayApplication.class, args);
        ApplicationLauncherUtil.printApplicationConsoleBanner();
	}
}
