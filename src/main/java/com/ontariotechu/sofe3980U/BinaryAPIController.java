package com.ontariotechu.sofe3980U;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BinaryAPIController {

	@GetMapping("/add")
	public String addString(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                        @RequestParam(name="operator", required=false, defaultValue="+") String operator,
                       @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
		Binary number1=new Binary (operand1);
		Binary number2=new Binary (operand2);

        switch (operator) {
            case "*": return Binary.multiply(number1, number2).getValue();
            case "&": return Binary.and(number1, number2).getValue();
            case "|": return Binary.or(number1, number2).getValue();
            default:  return Binary.add(number1, number2).getValue();
        }
	}
	
	@GetMapping("/add_json")
	public BinaryAPIResult addJSON(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                        @RequestParam(name="operator", required=false, defaultValue="+") String operator,
                       @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
		Binary number1=new Binary (operand1);
		Binary number2=new Binary (operand2);
        Binary result;
        switch (operator) {
            case "*": result = Binary.multiply(number1, number2); break;
            case "&": result = Binary.and(number1, number2); break;
            case "|": result = Binary.or(number1, number2); break;
            default:  result = Binary.add(number1, number2); break;
        }
        
        return new BinaryAPIResult(number1, operator, number2, result);
	}

}