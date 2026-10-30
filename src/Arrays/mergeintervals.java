package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//class Solution {
//    public int[][] merge(int[][] intervals) {
//        List<List<Integer>> ans=new ArrayList<>();
//        int n= intervals.length;
//        int i=0;
//        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
//        while(i<n){
//        int start=intervals[i][0];
//        int end=intervals[i][1];
//        int j=i+1;
//        while(j<n && end<=intervals[j][1]){
//            end=Math.max(end,intervals[j][1]);
//            j++;
//            }
//        ans.add(Arrays.asList(start,end));
//        i=j;
//        }
//        int[][] merge = ans.stream()
//                .map(list -> list.stream().mapToInt(i -> i).toArray())
//                .toArray(int[][]::new);
//        return merge;
//    }
//}


//class Solution {
//    public int[][] merge(int[][] intervals) {
//
//        Arrays.sort(intervals,(a,b)-> a[0] - b[0]);
//        List<int[]> list = new ArrayList<>();
//        int start =intervals[0][0];
//        int end =intervals[0][1];
//
//        for(int i=1; i<intervals.length; i++)
//        {
//            if(end >= intervals[i][0])
//            {
//                end = Math.max(end,intervals[i][1]);
//                continue;
//            }
//            list.add(new int[]{start,end});
//            start = intervals[i][0];
//            end = intervals[i][1];
//
//        }
//        list.add(new int[]{start,end});
//
//        return list.toArray(new int [list.size()][]);
//
//    }

//
//class Solution {
//    public int[][] merge(int[][] intervals) {
//        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
//        List<int[]> ans=new ArrayList<>();
//        int start=intervals[0][0];
//        int end=intervals[0][1];
//        for(int[] interval:intervals){
//            if(end>=interval[0]){
//                end=Math.max(end,interval[1]);
//                continue;
//            }
//            ans.add(new int[]{start,end});
//            start=interval[0];
//            end=interval[1];
//        }
//        ans.add(new int[]{start,end});
//        return ans.toArray(new int[ans.size()][]);
//
//    }
//}