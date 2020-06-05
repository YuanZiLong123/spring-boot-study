package com.example.springbootstudy;

import com.example.springbootstudy.controller.IndexController;
import com.example.springbootstudy.controller.IndexNoController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author admin
 * @date 2020-06-05 13:59
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class SpringbootConfig {


    @Bean
    public IndexController controller(){
        return new IndexController();

    }

}
