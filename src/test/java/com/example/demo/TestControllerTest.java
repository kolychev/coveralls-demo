package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
class TestControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private TestService testService;

  @Test
  void test() throws Exception{
    mockMvc.perform(MockMvcRequestBuilders.post("/test")).andExpect(MockMvcResultMatchers.status().isOk());
  }
}