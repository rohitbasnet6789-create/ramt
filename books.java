public class books
{
    public static void main(String[] args)
    {
        String[] categories = {"Fiction", "Nepali"};
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];
        titles[0][0] = "The Power";
        prices[0][0] = 790.2;
        titles[1][0] = "Homosepian";
        prices[1][0] = 599.0;

        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);

            for (int j = 0; j < titles[i].length; j++) {
                System.out.println("Book Title: " + titles[i][j]);
                System.out.printf("Price: %.2f\n", prices[i][j]);
            }

            System.out.println();
        }
    }
    
}