public class searchMatrix {
    public boolean searchMatrix(int[][] matrix,int target){
        for(int i = 0;i < matrix.length;i++){
            if(target >= matrix[i][0] && matrix[i][matrix[0].length]>=target){
                for(int j = 0;j < matrix[0].length;j++ ){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args){
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        for(int i = 0;i < matrix.length;i++){
            System.out.println(matrix[i][0]);
        }
    }
}
