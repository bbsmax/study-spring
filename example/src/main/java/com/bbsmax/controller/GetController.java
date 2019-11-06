package com.bbsmax.controller;

import com.bbsmax.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //localohost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") //http://localhost:8080/api/getMethod
    public String getRequest(){
        return "Hi getMethod";
    }

    @GetMapping("/getParameter") //http://localhost:8080/api/getParamter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name="password") String pwd){
        String password = "bbbb"; //만약 내부적으로 파라미터의 변수명과 같은 변수명을 사용해야 하는경우 @RequestParam(name="같음 변수명")을 사용하여 받는다.
        System.out.println("id :"+id );
        System.out.println("password :" + pwd);
        return id + pwd;
    }

    //http://localhost:8080/api/multiParameter?account=abcd&email=test@natemcom&page=10
    @GetMapping("/multiPrameter")
    public SearchParam multiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());
        //return "OK";
        //json형태로 값을 돌려준다.
//        { "account": "bbsmax", "email": "test@natemcom","page": 1 }
        //spring 에서는 jackson 라이브러리를 사용함.
        return searchParam;

    }
}
