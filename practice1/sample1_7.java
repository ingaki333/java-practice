package practice1;

public class sample1_7 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        
        int w = x; //変数の入れ替え
        x = y;
        y = w;

        System.out.println("x=" + x + ",y=" + y);
    }
}
