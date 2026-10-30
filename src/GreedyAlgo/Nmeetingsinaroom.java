package GreedyAlgo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//Why store {end, start} ?
//
//You want to prioritize meetings that finish early.
//Because:
//
//        👉 If a meeting ends early, it leaves more free time for future meetings.
//Greedy idea: Always pick the meeting that ends earliest.*****
//
//What does lastend mean?
//
//It represents:
//
//        👉 “Until what time is the room occupied?”
//

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        List<int[]> meetings=new ArrayList<>();
        for(int i=0;i< start.length;i++){
            meetings.add(new int[]{end[i],start[i]});
        }
        meetings.sort(Comparator.comparingInt(a-> a[0]));
        //sort by end
        //If current meeting’s start time is after last selected meeting’s end → we can attend it.
        int lastend=-1;
        int count=0;
        for(int[] m:meetings){
            if(m[1]>lastend){
                count++;
                lastend=m[0];
            }
        }
        return count;
    }
}

