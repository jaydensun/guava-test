package com.jayden.guavatest;

import com.google.common.util.concurrent.RateLimiter;

import java.util.Date;

public class TestRateLimiter {
    public static void main(String[] args) throws InterruptedException {
        RateLimiter rateLimiter = RateLimiter.create(0.2);
        System.out.println("start " + new Date());
        while (true) {
//            rateLimiter.acquire();
            Thread.sleep(2000);
            System.out.println("now " + new Date());
        }
    }

}
