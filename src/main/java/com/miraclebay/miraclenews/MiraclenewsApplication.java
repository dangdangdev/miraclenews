package com.miraclebay.miraclenews;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;


@SpringBootApplication
@MapperScan("com.miraclebay.miraclenews.mapper")
public class MiraclenewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiraclenewsApplication.class, args);
    }
    public void test(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(arrayList);

    }
}
