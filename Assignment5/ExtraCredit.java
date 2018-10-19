package Assignment_5;
import java.util.List;
import java.util.ArrayList;

public class ExtraCredit {
//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order. (Score 2)
//	For example, Given the following matrix: 
//	{{1,2,3},
//	{4,5,6},
//	{7,8,9}}
//	You should return {1,2,3,6,9,8,7,4,5}.

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		
        if(matrix.length == 0 || matrix[0].length == 0) return result;
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        while(true){
            for(int i = left; i <= right; i++) result.add(matrix[top][i]);
            top++;
            if(left > right || top > bottom) break;
            
            for(int i = top; i <= bottom; i++) result.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;
            
            for(int i = right; i >= left; i--) result.add(matrix[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;
            
            for(int i = bottom; i >= top; i--) result.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }
        
        return result;
	}

	
}