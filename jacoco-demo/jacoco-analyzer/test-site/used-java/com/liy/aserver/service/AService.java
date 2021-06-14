package com.liy.aserver.service;

import org.springframework.stereotype.Service;

/**
 * 被测试的服务
 * @author Liy
 * @date 2021/6/12
 **/
@Service
public class AService {

    public Integer add(Integer p1, Integer p2){
        System.out.println(p1);
        System.out.println(p2);

        return p1 + p2;
    }

    public Boolean ifTest(Boolean flag){
        if(flag){
            System.out.println("flag is true");
        }else {
            System.out.println("flag is false");
        }

        return flag;
    }

}
