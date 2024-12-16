import java.util.Stack;

class Villaflor_FinalExam {
    // Declare creature name and power level
    static class Creature {
        String creatureName;
        int powerLevel;

        //Initialize constructor
        Creature(String name, int powerLevel) {
            this.creatureName = name;
            this.powerLevel = powerLevel;
        }
    }

     // Bubble Sort implementation in Descending Order
     public static void bubbleSortDescending(Creature[] creatures) {
         int n = creatures.length;
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (creatures[j].powerLevel < creatures[j + 1].powerLevel) {
                     // Swap
                     Creature temp = creatures[j];
                     creatures[j] = creatures[j + 1];
                     creatures[j + 1] = temp;
                 }
             }
         }
     }

     // Selection Sort implementation in Ascending Order
     public static void selectionSortAscending(Creature[] creatures) {
         int n = creatures.length;
         for (int i = 0; i < n - 1; i++) {
             int minIndex = i;
             for (int j = i + 1; j < n; j++) {
                 if (creatures[j].powerLevel < creatures[minIndex].powerLevel) {
                     minIndex = j;
                 }
             }
             // Swap
             Creature temp = creatures[minIndex];
             creatures[minIndex] = creatures[i];
             creatures[i] = temp;
         }
     }

     // Display creatures
     public static void displayCreatures(Creature[] creatures) {
         for (Creature creature : creatures) {
             System.out.println(creature.creatureName + " - " + creature.powerLevel);
         }
     }

    public static void main(String[] args) {
        // Fixed data
        Creature[] creatureInfo = {
                new Creature("Dragon", 95),
                new Creature("Griffin", 88),
                new Creature("Unicorn", 78),
                new Creature("Phoenix", 92),
                new Creature("Centaur", 85)
        };

        // Bubble Sort in descending order by power level
        bubbleSortDescending(creatureInfo);
        System.out.println("\n*** Bubble Sort: Descending Order by Power Level ***");
        displayCreatures(creatureInfo);

        // Selection Sort in ascending order by power level
        selectionSortAscending(creatureInfo);
        System.out.println("\n*** Selection Sort: Ascending Order by Power Level ***");
        displayCreatures(creatureInfo);

        // Stack implementation
        Stack<Creature> creatureStack = new Stack<>();
        for (Creature creature : creatureInfo) {
            creatureStack.push(creature);
        }
        // Stack implementation popping creature
        System.out.println("\n*** Stack Implementation: Popping Creatures ***");
        while (!creatureStack.isEmpty()) {
            Creature creature = creatureStack.pop();
            System.out.println(creature.creatureName + " - " + creature.powerLevel);
        }
    }
}