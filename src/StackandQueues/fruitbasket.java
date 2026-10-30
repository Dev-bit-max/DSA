package StackandQueues;

import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> ans=new HashMap<>();

        int lastfruit=0,secondlastf=0;
        int maxlen=0,laststreak=0;
        int currcount=0;
        for(int fruit:fruits){
            if(fruit==lastfruit||secondlastf==fruit){
                currcount++;
            }
            else{
                currcount=laststreak+1;
            }

            if(fruit==lastfruit){
                laststreak++;
            }
            else{
                laststreak=1;
                secondlastf=lastfruit;
                lastfruit=fruit;
            }
            maxlen=Math.max(maxlen,currcount);
        }
        return maxlen;
    }
}


