public class Main {
    public static void main(String[] args) {
        System.out.println("Task3");
        int [] weight = new int [3];
        weight[0]=1;
        weight[1]=2;
        weight[2]=3;
        System.out.println(weight[0] + "," + weight[1] + "," +weight[2]);

        float [] weight1 = {1.57f, 7.654f, 9.986f};
        System.out.println(weight1[0] + "," + weight1[1] + "," +weight1[2]);

        byte [] weight2 = {2, 4, 6 , 8};
        System.out.println(weight2[0] + "," + weight2[1] + "," +weight2[2]+","+weight2[3]);

        System.out.println(weight2[3] + "," + weight2[2] + "," +weight2[1]+","+weight2[0]);
        System.out.println(weight1[2] + "," + weight1[1] + "," +weight1[0]);
        System.out.println(weight[2] + "," + weight[1] + "," +weight[0]);
    }
}