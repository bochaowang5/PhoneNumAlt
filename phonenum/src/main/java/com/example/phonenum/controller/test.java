package com.example.phonenum.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@CrossOrigin
@RestController
public class test {

    @GetMapping("/test")
    public String getAlternatives(@RequestParam("phone") String number)
    {
        String str = number;
        char[] input = str.toCharArray();
        String ans = helper(input);
        return ans;
    }

    public static String helper(char[] num)
    {
//        JSONObject jo = new JSONObject();

        Queue<String> result = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        final String[][] alt = {
                {"0"},
                {"1"},
                {"2", "a", "b", "c"},
                {"3", "d", "e", "f"},
                {"4", "g", "h", "i"},
                {"5", "j", "k", "l"},
                {"6", "m", "n", "o"},
                {"7", "p", "q", "r", "s"},
                {"8", "t", "u", "v"},
                {"9", "w", "x", "y", "z"}
        };

        int len = num.length;
        for(int k = 0; k < alt[num[0] - '0'].length; k++) {
            result.add(alt[num[0] - '0'][k]);
        }
        for(int i = 1; i < len; i++)
        {
            while(result.peek().length() != (i+1)){
                String temp = result.poll();
                for(int m = 0; m < alt[num[i] - '0'].length; m++) {
                    StringBuilder sbt = new StringBuilder();
                    sbt.append(temp).append(alt[num[i] - '0'][m]);
                    result.add(sbt.toString());
                }
            }
        }
//        int index = 1;
        while(!result.isEmpty()){
//            jo.put(result.poll());
//            index++;
            sb.append("{").append("\"value\"").append(":\"").append(result.poll()).append("\"").append(result.isEmpty()?"}":"},");
        }
        sb.append("]");
//        return jo.toString();
        return sb.toString();
    }
}
