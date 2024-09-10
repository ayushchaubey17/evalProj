public class Que1 {
    public static void main(String[] args) {
        int row = 5;
        int col = 4;
        int adv [] = {5,1};
        int pos[] = {1, 4};

        System.out.println(count(adv,pos));
    }

    public static int count(int[] adv, int[] pos) {
        int rowDifference = Math.abs(adv[0] - pos[0]);
        int columnDifference = Math.abs(adv[1] - pos[1]);
        return rowDifference + columnDifference;
    }
}
