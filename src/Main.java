import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        {
            System.out.println();
        }

        double[] weight1 = {1.57, 7.654, 9.986};
        System.out.println(weight1[0]);
        System.out.println(weight1[1]);
        System.out.println(weight1[2]);
        {
            System.out.println();
        }

        int[] box = {-2, -1, 0, 1, 2};
        for (int i = 0; i <= 4; i++) {
            System.out.println(box[i]);
        }
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

    public static void task3() {
        System.out.println("Задача 3");
        System.out.println();

        int[] weight = {1, 2, 3};
        double[] weight1 = {1.57, 7.654, 9.986};
        int[] box = {-1, -2, 0, 1, 2};

        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = weight1.length - 1; i >= 0; i--) {
            System.out.print(weight1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = box.length - 1; i >= 0; i--) {
            System.out.print(box[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
        public static void task4 () {
            System.out.println("Задача 4");
            System.out.println();

            int[] weight ={1, 2, 3};

            for (int i = 0; i < weight.length; i++) {
                if (weight[i] % 2 != 0) {
                    weight[i] += 1;
                }
            }
            for (int i = 0; i < weight.length; i++) {
                if (i == weight.length - 1) {
                    System.out.print(weight[i]);
                    break;
                }
                System.out.print(weight[i] + ", ");
            }
        }
    }


