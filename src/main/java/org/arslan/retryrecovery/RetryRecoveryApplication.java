package org.arslan.retryrecovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class RetryRecoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetryRecoveryApplication.class, args);
    }

}
