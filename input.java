public class UserMainCode {
    public static int totalHillweight(int totalLevels, int headLevelWeight, int weightIncrement) {
        int totalWeight = 0;
        int levelWeight = headLevelWeight;

        for (int level = 1; level <= totalLevels; level++) {
            totalWeight += levelWeight * level;
            levelWeight += weightIncrement;
        }

        return totalWeight;
    }

    public static void main(String[] args) {
        int totalLevels = 5;
        int headLevelWeight = 10;
        int weightIncrement = 2;

        int totalWeight = totalHillweight(totalLevels, headLevelWeight, weightIncrement);
        System.out.println("Total weight of the hill pattern: " + totalWeight);
    }
}
n