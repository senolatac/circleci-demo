package com.sha.circlecidemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sa
 * @date 6.06.2021
 * @time 15:36
 */
@RestController
@RequestMapping("api")
public class ApiController
{
    @GetMapping("test")
    public ResponseEntity<?> test()
    {
        return ResponseEntity.ok("test");
    }
}
