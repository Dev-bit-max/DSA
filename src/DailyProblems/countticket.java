package DailyProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> business=new ArrayList<>();;
        boolean ans=true;
        for(int i=0;i<code.length;i++){
            if(!code[i].isEmpty()){
                for(int j=0;j<code[i].length();j++){
                    if(code[i].charAt(j)<'a'||code[i].charAt(j)>'z'||code[i].charAt(j)<'0'||code[i].charAt(j)>'9'||code[i].charAt(j)<'A'||code[i].charAt(j)>'Z'||code[i].charAt(j)!='_') {
                        ans = false;
                        break;
                    }
                    }
                if(ans==true){
                    if(isActive[i]==true){
                     business.add(businessLine[i]);
                    }
                }
                }
            }
        Collections.sort(business);
        return business;
        }
    }
