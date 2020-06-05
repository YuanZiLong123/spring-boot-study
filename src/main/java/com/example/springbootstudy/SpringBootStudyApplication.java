package com.example.springbootstudy;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

public class SpringBootStudyApplication {

	public static void main(String[] args) {

		SpringApplication boot = new SpringApplication(SpringbootConfig.class);
		boot.setBanner(new Banner() {
			@Override
			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
				System.out.println("这里是springboot");
			}
		});
		boot.setBannerMode(Banner.Mode.CONSOLE);
		boot.run(args);
	}
/*
	public static void main(String[] args) {


		SpringApplication.run(SpringbootConfig.class, args);
	}
*/

}
