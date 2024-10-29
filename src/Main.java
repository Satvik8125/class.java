import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age");
        int age = scanner.nextInt();
        if (age<5){
            System.out.println("you are a child");
        }else if(age>=5 && age<18){
            System.out.println("you are a teen");
        }else if(age>=18 && age<60){
            System.out.println("you are an adult");
        }else{
            System.out.println("you are a senior citizen");
        }

    }
}
