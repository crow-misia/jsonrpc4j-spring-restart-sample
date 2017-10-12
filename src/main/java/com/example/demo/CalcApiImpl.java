package com.example.demo;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
@AutoJsonRpcServiceImpl
public class CalcApiImpl implements CalcApi {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
