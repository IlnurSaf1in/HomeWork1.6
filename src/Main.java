import java.util.Random;

public class Main {
    public static int[] generateRandomArray(){
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100_000) + 100_100;
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[] = generateRandomArray();
        int allExpensesMonth = 0;
        for (int i = 0; i < arr.length; i++){
            allExpensesMonth = allExpensesMonth + arr[i];
        }


        System.out.println(allExpensesMonth + " Сумма трат за месяц" );
        float averageExpenses= allExpensesMonth / arr.length;
        System.out.println(averageExpenses + " средние затраты за день");
        int maxExpenses = arr[0];
        int minExpenses = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxExpenses < arr[i]){
                maxExpenses = arr[i];
                if (minExpenses > arr[i]) {
                    minExpenses = arr[i];
                }

            }
        }
        System.out.println(maxExpenses + " Max zna4enie");
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
