package com.sungwook.caculator.controller;

import com.sungwook.caculator.model.OperatorModel;
import com.sungwook.caculator.model.ResultModel;
import com.sungwook.caculator.service.CaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CaculatorController {
    @Autowired
    CaculatorService caculatorService;
    ResultModel resultmodel = new ResultModel();


    @GetMapping("Add")
    @ResponseBody
    public ResponseEntity Add(@RequestParam("arg1")String operand1, @RequestParam("arg2")String operand2){

        String result = caculatorService.add(operand1, operand2);
        resultmodel.setResult(result);

        return ResponseEntity.ok(resultmodel);
    }

    @GetMapping("Multiply")
    public String Multiply(@RequestParam(name="arg1")String operand1, @RequestParam(name="arg2")String operand2){
//        operatormodel.setOperand1(operand1);
//        int result = Integer.parseInt(arg1) * Integer.parseInt(arg2);

        return "index.html";
    }
}
