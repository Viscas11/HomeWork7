
public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int [] weight = new int [3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        double [] weight1 = {1.57, 7.654, 9.986};
        System.out.println(weight1[0]);
        System.out.println(weight1[1]);
        System.out.println(weight1[2]);
        int [][] twoDimArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(" " + twoDimArray[i][j] + " ");
                }
                System.out.println();
            }
    }
        // вроде выполнил задачу =)

}