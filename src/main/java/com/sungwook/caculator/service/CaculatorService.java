package com.sungwook.caculator.service;

import org.springframework.stereotype.Service;

@Service
public class CaculatorService {
    public String add(String arg1, String arg2){
        int num1 = this.StringToInt(arg1);
        int num2 = this.StringToInt(arg2);
        int result = num1 + num2;

        return Integer.toString(result);
    }

    private int StringToInt(String string){
        return Integer.parseInt(string);
    }
}
