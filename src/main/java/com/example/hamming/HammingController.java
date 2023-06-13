package com.example.hamming;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HammingController {



    @RequestMapping("/api/hamming")
    public int counter(@RequestParam String string){
        int cnt = 0;

        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) != '0'){
                cnt ++;
            }
        }

        return cnt;
    }



}
