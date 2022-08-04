import java.util.Random;

public class Main {
    public static int[] day(){
        Random random = new Random();
        int[] days = new int[30];
        for (int i = 0; i < days.length; i++){
            days[i] = random.nextInt(100_000) + 100_100;
        }
        return days;

    }
    public static void main(String[] args) {
        int allExpensesMonth = 0;
    for (int i = 0; i < day().length; i++){
    allExpensesMonth = allExpensesMonth + day()[i];
    }


        System.out.println(allExpensesMonth + " Сумма трат за месяц" );
        float averageExpenses= allExpensesMonth;
        System.out.println(averageExpenses / 30 + " трат в день в среднем");
        int maxExpenses = 0;
        for (int i = 0; i < day().length; i++) {
            if (maxExpenses < day()[i]){
                maxExpenses = day()[i];

            }
        }
        System.out.println(maxExpenses + " Max zna4enie");
        int minExpenses = maxExpenses;
        for (int i = 0; i < day().length; i++) {
            if (minExpenses > day()[i]) {
                minExpenses = day()[i];
            }
        }
        System.out.println(minExpenses + " min zna4enie");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int nameSize = reverseFullName.length ;
        for (int i = 0; i < nameSize / 2 ; i ++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[nameSize - 1 - i];
            reverseFullName[nameSize - 1 - i] = temp;

        }
        System.out.println(reverseFullName);
        char[] reverseFullName1 = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int nameSize1 = reverseFullName.length ;
        System.out.println(nameSize1);
        for (int i = reverseFullName1.length - 1 ; i >=0 ; i--){
            System.out.print(reverseFullName1[i]);
        }

        }

}
