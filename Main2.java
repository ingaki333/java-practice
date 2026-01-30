public class Main2 {
    public static void main(String[] args) {
        boolean reslut = isAdult(20);
        System.out.println(reslut);
    }
    public static boolean isAdult(int age){
        if (age >=20){
            return true;
        }else{
            return false;
        }
    }
}
