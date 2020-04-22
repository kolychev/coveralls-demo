package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestServiceTest {

  @Autowired
  private TestService service;

  @Test
  void testMethod() {
    service.testMethod(true);
  }
}