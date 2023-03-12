package com.example.demoapplication;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

    TestRestTemplate restTemplate =new TestRestTemplate();

    @LocalServerPort
    int port;

    @Test
    void contextLoads() {
        assertThat(restTemplate.getForObject("http://localhost:" + port, String.class), is ("Hello World!"));
    }

}
