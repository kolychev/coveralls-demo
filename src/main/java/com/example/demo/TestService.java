package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class TestService {

  public void testMethod(boolean arg) {
    if (arg) {
      System.out.println("1");
    } else {
      System.out.println("2");
    }
  }

  public void testMethod2() {
    System.out.println("3");
  }
}
