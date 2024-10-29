import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        boolean isLeap = false;
        if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
            isLeap = true;
        }
        if(isLeap){
            System.out.println(" This year is leap year ");
        }else{
            System.out.println(" This year is not leap year ");
        }
    }
}
