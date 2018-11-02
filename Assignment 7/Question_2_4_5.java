package Assignment_7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question_2_4_5 {
	
	
//	Question 2
    public static void parse(File file) {
        RandomAccessFile input = null;
        String line = null;
        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    
    
//  Question 4
    class solution{    
    	public static class Interval {
	    	int start;
	        int end;
	
	        Interval() {
	            start = 0;
	            end = 0;
	        }
	
	        public Interval(int s, int e) {
	            start = s;
	            end = e;
	        }
	
	        public String toString(){
	            return "{"+this.start+","+this.end+"}";
	        }
    	}

    	public List<Interval> merge(List<Interval> intervals) {
	        int n = intervals.size();
	        int[] start = new int[n];
	        int[] end = new int[n];
	        for (int i = 0; i < n; i++) {
	            start[i] = intervals.get(i).start;
	            end[i] = intervals.get(i).end;
	        }
	        Arrays.sort(start);
	        Arrays.sort(end);
	        List<Interval> res = new ArrayList<Interval>();
	        for (int i = 0 , j = 0 ; i < n; i++) {
	            if(i == n-1 || start[i+1] > end[i]){
	                res.add(new Interval(start[j],end[i]));
	                j = i+1;
	            }
	        }
	        return res;
    	}

    	
//  Question 5
    class solution{    
    	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        List<Integer> res = new ArrayList<>();
	        for (int i = 0; i < nums1.length; i++) {
	            res.add(nums1[i]);
	        }
	        for (int i = 0; i < nums2.length; i++) {
	            res.add(nums2[i]);
	        }
	        Collections.sort(res);
	        if(res.size() % 2 == 0){
	            double m = (double)res.get(res.size()/2);
	            double n = (double)res.get((res.size()/2)-1);
	            return (m+n)/2;
	        }else{
	            return res.get((res.size()-1)/2);
	        }
	    }
    }
    }
}