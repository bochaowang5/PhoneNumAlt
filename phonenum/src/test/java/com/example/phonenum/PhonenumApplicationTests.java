package com.example.phonenum;

import com.example.phonenum.controller.test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PhonenumApplicationTests {

    @Autowired
    private test controller;

    @Test
    void contextLoads() throws Exception{
        assertThat(controller).isNotNull();
    }

    @Test
    public void getAlter() throws Exception {
        assertThat(controller.getAlternatives("52").contains("5a"));
    }

}
