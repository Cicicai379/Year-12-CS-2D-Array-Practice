public class Array2dPractice {

    // Declare all methods as static.

    // 1. sumAllCells
    public static int sumAllCells(int[][] a){
        int ans=0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                ans += a[i][j];
            }
        }
        return ans;
    }

    // 2. sumRowN
    public static int sumRowN(int[][] a,int n){
        int ans=0;

            for(int j = 0; j<a[n].length; j++){
                ans += a[n][j];
            }

        return ans;
    }

    // 3. sumColN
    public static int sumColN(int[][] a,int n){
        int ans=0;

        for(int j = 0; j<a.length; j++){
            ans += a[j][n];
        }

        return ans;
    }

    // 4. sumAllCellsBetween
    public static int sumAllCellsBetween(int[][] a,int x1, int y1, int x2, int y2){
        int ans=0;

        for(int j = y1; j<a[x1].length; j++){
             ans += a[x1][j];
            System.out.println( a[x1][j]);
        }
        for(int i = x1+1; i<x2; i++){
            for(int j = 0; j<a[i].length; j++){
                ans += a[i][j];
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        if(x1!=x2){
            for(int j = 0; j<=y2; j++){
                ans += a[x2][j];
            }
        }


        return ans;
    }

}
