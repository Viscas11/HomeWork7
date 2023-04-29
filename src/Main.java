import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        question();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);{
        System.out.println();}

        double[] weight1 = {1.57, 7.654, 9.986};
        System.out.println(weight1[0]);
        System.out.println(weight1[1]);
        System.out.println(weight1[2]);{
        System.out.println();}

        int[] box = {-2, -1, 0, 1, 2};
        for (int i =0; i <= 4; i++) {
            System.out.println(box[i]);}
            System.out.println();
        }

    public static void task2() {
        System.out.println("Задача 2");
        System.out.println();

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(Arrays.toString(weight));
        System.out.println();

        double[] weight1 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(weight1));
        System.out.println();

        int[] box = {-2, -1, 0, 1, 2};
        System.out.println(Arrays.toString(box));
        System.out.println();
        }
    public static void question() {
        System.out.println("Вопрос");
        int[][] twoDimArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twoDimArray[i][j] + ", ");
            }
        }
        System.out.println("как в таком случае убрать запятую в конце и как поменятьпорядок вывода (что бы было задом на перед)? ");
    }
}