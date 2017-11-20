package com.example.springcloud.topup.controller;

import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;

import com.example.springcloud.topup.AbstractApplicationTest;

@AutoConfigureStubRunner(ids = { "com.example.springcloud.sms:topup-service:+:stubs:8082" }, workOffline = true)
public class TestTopUpController extends AbstractApplicationTest {

}
