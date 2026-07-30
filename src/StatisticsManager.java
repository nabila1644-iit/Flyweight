public class StatisticsManager {

    public static void showStatistics(Document doc, StyleFactory factory){

        int totalCharacters = doc.getCharacterCount();

        int uniqueStyles = factory.getStyleCount();

        int memoryWithoutFlyweight = totalCharacters * 6;

        int memoryWithFlyweight = uniqueStyles * 6;

        int saved = memoryWithoutFlyweight - memoryWithFlyweight;

        System.out.println("\n========== Statistics ==========");

        System.out.println("Total Characters : " + totalCharacters);

        System.out.println("Unique Style Objects : " + uniqueStyles);

        System.out.println("Estimated Saved Units : " + saved);

    }

}