public class Main {
    public static void main(String[] args) {
        System.out.println("Task4");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i]++;
                System.out.println(weight[0] + "," + weight[1] + "," + weight[2]);
            }
        }
    }
}


