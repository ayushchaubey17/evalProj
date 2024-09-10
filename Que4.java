public class Que4 {
    public static void main(String[] args) {
        int row = 5;
        int col = 4;
        int adventure  [] = {1,1};

        int monster [] = {2,3};
        int gold[] = {3,1};
        int trigger [] = {1,2};

        int minForMonster = Que1.count(monster,gold);
        int minForAdventure = Que1.count(adventure,gold);

        if(minForAdventure<=minForMonster){
            System.out.println(minForAdventure);
        }
        else{
            // he need to go to trigger
            int pathFromAdventureToTrigger = Que1.count(adventure, trigger);

            int pathFromTriggertoGold = Que1.count(trigger, gold);
            System.out.println(pathFromAdventureToTrigger+pathFromTriggertoGold);

        }
    }
}
