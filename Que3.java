public class Que3 {
    public static void main(String[] args) {
        int row = 5;
        int col = 4;
        int adventure  [] = {5,1};
        int gold[] = {4,3};
        int monster [] = {3,1};

      int steps =   Que2.cal(adventure,monster,gold);
      if(steps == -1){
          System.out.println("No path required---impossible");
      }
      else{
          printPath(gold,adventure);
      }
    }

    private static void printPath(int[] gold, int[] adventure) {
        int currentRow = adventure[0];
        int curentColumn = adventure[1];


        int rowDiff = gold[0]-adventure[0];
        int colDiff = gold[1]-adventure[1];

        boolean down = (colDiff>0)?true:false;
        boolean right = (rowDiff>0)?true:false;


        System.out.print("("+currentRow+","+curentColumn+")"+"->");

        int row = Math.abs(rowDiff);
        int col = Math.abs(colDiff);

        while (col-->0){
            if (right) curentColumn--; else  curentColumn++;
            System.out.print("("+currentRow+","+curentColumn+")"+"->");
        }

        while (row-->0){
            if (down) currentRow--; else  currentRow++;
            System.out.print("("+currentRow+","+curentColumn+")"+"->");
        }

        System.out.print("reached");


    }
}
