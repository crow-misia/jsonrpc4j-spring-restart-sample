package com.example.demo;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

@JsonRpcService("/calc")
public interface CalcApi {
    int sum(@JsonRpcParam("a") int a, @JsonRpcParam("b") int b);
}
