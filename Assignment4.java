public class Assignment4 {
	
	/**
	 * The deadline of assignment4 is 10/12/2018 23:59 PST.
	 * Please feel free to contact Zane and Amanda for any questions.
	 */
	
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
	
    public int firstUniqChar(String s){
		    int r [] = new int[26];
		    for(int i = 0; i < s.length(); i ++){
		        r [s.charAt(i) - 'a'] ++;
		    }
		    for(int i = 0; i < s.length(); i ++){
		        if(r [s.charAt(i) - 'a'] == 1){
		            return i;
		        }
		    }
		        return -1;
	}

	/*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n){
    		return (n - 1) % 9 + 1;
    }
    
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums){
    		int countZero = 0;
    		int i = 0;
    		for(i = 0; i < nums.length; i++){
    			if(nums[i] == 0) {
    				countZero++;
    			}
    			else if(nums[1] != 0){
    				nums[i-countZero] = nums[i];
    				nums[i] = 0;
    			}
    		}
     }
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.	 
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
	public String longestPalindrome(String s){
			int length = s.length();
			String result = "";
			if(length == 1){
				return s;
			}
			for(int i = 0; i < length; i++){
		        int right = i;
		        int left  = i;
		        
		        while(left > 0 && right < length - 1 && s.charAt(left - 1) == s.charAt(right + 1)){
		            left--;
		            right++;
		        }
		        
		        if((right - left + 1) > result.length()){
		            result = s.substring(left, right + 1);
		        }
		    }
		    
		    for(int i = 0; i < length - 1; i++){
		        if(s.charAt(i) == s.charAt(i + 1)){
		            int right = i + 1;
		            int left  = i;
		        
		            while(left > 0 && right < length - 1 && s.charAt(left - 1) == s.charAt(right + 1)){
		                left--;
		                right++;
		            }
		            
		            if((right - left + 1) > result.length()){
		                result = s.substring(left, right + 1);
		            }
		        }
		    }
		    return result;
    }
	
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      			  [4,5,6],
  			                  [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								                                 [8,5,2],
  								                                 [9,6,3] ],
     */
    public void rotate(int[][] matrix) {
	        int row = matrix.length;
	        int col = matrix[0].length;
	        if(row != col)
	            return;
	        for(int i = 0; i < (row + 1) / 2; i++)
	            for(int j = 0; j < col / 2; j++)
	                rotateClockwise90(matrix, row - 1, i, j);
	        return;
    }
    
    private void rotateClockwise90(int[][] matrix, int row, int i, int j){
	        int temp = matrix[i][j];
	        matrix[i][j] = matrix[row - j][i];
	        matrix[row - j][i] = matrix[row - i][row - j];
	        matrix[row - i][row - j] = matrix[j][row - i];
	        matrix[j][row - i] = temp;
    }
    
}