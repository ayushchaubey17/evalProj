public class Que2 {
    public static void main(String[] args) {
        int row = 5;
        int col = 4;
        int adventure  [] = {4,1};
        int gold[] = {2,3};
        int monster [] = {3, 1};

        System.out.println(cal(adventure,monster,gold));
    }

     static int cal(int[] adventure, int[] monster, int[] gold) {
        int minForMonster = Que1.count(monster,gold);
        int minForAdventure = Que1.count(adventure,gold);

        if(minForAdventure <= minForMonster) return minForAdventure;
        else return -1;

    }
}
