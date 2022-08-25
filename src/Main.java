public class Main {
    public static void yearCheck(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год "+year+" высокосный!");
        } else System.out.println("Год "+year+" невысокосный!");
    }
    public static void main(String[] args) {
        int year = 2008;
        yearCheck(year);
    }
}
