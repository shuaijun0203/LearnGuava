package com.shuaijun.LearnGuava;

import com.google.common.base.Joiner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.StringJoiner;

@SpringBootApplication
public class LearnGuavaApplication {

    public static void main(String[] args) {

		SpringApplication.run(LearnGuavaApplication.class, args);

        Joiner joiner = Joiner.on("; ").skipNulls();
        String str= joiner.join("Hello", null, "World");

        System.out.println(str);
    }

}
