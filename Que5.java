import java.util.*;

public class Que5 {
  static   int row = 5;
   static int col = 4;
    public static void main(String[] args) {

        int adventure  [] = {4,1};

        int gold[] = {2,3};
        int numberOfPits = 2;
        int p1[] = {2, 1};
        int p2[] = {4, 3};

        char[][] arr = new char[row][col];

        fillIt(adventure, gold,arr);
        fillPits(arr);
        print(arr);

//
//        ArrayList<ArrayList<Character>> ans = new ArrayList<>();
//        goForGold(adventure, gold, arr,3,0,1,2,ans,new ArrayList<>());


    }

    private static void goForGold(int[] adventure, int[] gold, char[][] arr, int advRow, int advCol, int golRow, int goldCol,ArrayList<ArrayList<Character>> ans,List<Character> temp) {
        if (arr[advRow][advCol]=='G') {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(temp.size()>(row*col))return;

        if(advRow<0 || advRow>=row || advCol<0 || advCol>=col  ) return;
        if(arr[advRow][advCol]=='P') return;

        // go left
        temp.add('Y');
        goForGold(adventure,gold,arr,advRow,advCol-1,golRow,goldCol,ans,temp);
        temp.remove(temp.size() - 1);

        //go right
        temp.add('Y');
        goForGold(adventure,gold,arr,advRow,advCol+1,golRow,goldCol,ans,temp);
        temp.remove(temp.size() - 1);

        // go Up
        temp.add('Y');
        goForGold(adventure,gold,arr,advRow,advCol,golRow-1,goldCol,ans,temp);
        temp.remove(temp.size() - 1);

        //go down
        temp.add('Y');
        goForGold(adventure,gold,arr,advRow,advCol-1,golRow+1,goldCol,ans,temp);
        temp.remove(temp.size() - 1);

    }

    private static void fillPits(char[][] arr) {
        arr[1][0] = 'P';
        arr[3][2] = 'P';
    }

    private static void print(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void fillIt(int[] adventure, int[] gold,char arr[][]) {
        arr[adventure[0]-1][adventure[1]-1] = 'A';
        arr[gold[0]-1][gold[1]-1] = 'G';
    }
}
