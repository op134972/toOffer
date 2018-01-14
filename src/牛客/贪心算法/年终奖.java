package 牛客.贪心算法;

public class 年终奖 {
	public int getMost(int[][] board) {
        // write code here
        int[][] arr = new int[board.length][board[0].length];
        for(int i = 0;i<arr.length;i++){
            
            for(int j = 0;j<arr[0].length;j++){
                if(i == 0 && j ==0){
                    arr[i][j] = board[i][j];
                }
                else if(i == 0){
                    arr[i][j] = board[i][j]+arr[i][j-1];
                }
                else if(j == 0){
                    arr[i][j] = board[i][j]+arr[i-1][j];
                }else{
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1])+board[i][j];
                }
            }
        }
        
        return arr[arr.length-1][arr[0].length-1];
    }
}
