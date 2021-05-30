package com.test.monitoring.testmonitoring.controller;

import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RequestControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @BeforeAll
  public static void setup() {
    Metrics.addRegistry(new SimpleMeterRegistry());
  }

  @Test
  public void testRequest() throws Exception {
    this.mockMvc
        .perform(get("/request"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("response")));
  }
}
