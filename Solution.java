class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] out = new int[matrix[0].length][matrix.length];
        List<Integer> temp = new ArrayList<>();

        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                temp.add(matrix[j][i]);
            }
        }

        int k = 0;
        for(int i=0; i<out.length; i++){
            for(int j=0; j<out[i].length; j++){
                out[i][j] = temp.get(k++);
            }
        }
        return out;
    }
}

// 00 01 02
// 10 11 12

// 00 10
// 01 11
// 02 12
