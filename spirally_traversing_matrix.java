class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> result = new ArrayList<Integer>();

    int rows = matrix.length;
    int columns = matrix[0].length;
    
    int up = 0;
    int left = 0;
    int right = columns-1;
    int down = rows-1;
    
    while(result.size()<rows*columns)
    {
        
        //traverse from left to right
        
        for(int col = left; col<=right; col++)
        {
            result.add(matrix[up][col]);
        }
        
        // traverse up to down
        
        for(int row= up+1 ; row<=down; row++)
        {
            result.add(matrix[row][right]);
        }
        
        if(up!=down)
        {
            //traverse from right to left
            for(int col= right-1; col>=left; col--)
            {
                result.add(matrix[down][col]);
            }
        }
        
        if(left!=right)
        {
            //traverse from down to up
            for(int row = down-1; row>up; row--)
            {
                result.add(matrix[row][left]);
            }
        }
        left++;
        right--;
        up++;
        down--;
    }
    return result;
    }
}

