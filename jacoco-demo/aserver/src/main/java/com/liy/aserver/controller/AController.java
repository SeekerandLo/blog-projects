package com.liy.aserver.controller;

import com.liy.aserver.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 被测试的Controller
 *
 * @author Liy
 * @date 2021/6/12
 **/
@RestController
@RequestMapping("aserver/")
public class AController {

    @Autowired
    AService aService;


    @GetMapping("add.json")
    public ResponseEntity<Integer> add(@RequestParam Integer p1, @RequestParam Integer p2) {
        return ResponseEntity.ok(aService.add(p1, p2));
    }

    @GetMapping("if-test.json")
    public ResponseEntity<Boolean> ifTest(@RequestParam Boolean flag) {
        return ResponseEntity.ok(aService.ifTest(flag));
    }
}
