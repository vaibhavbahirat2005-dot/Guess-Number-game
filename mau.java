import java.util.Scanner;
public class mau{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do{
            System .out.println("Guess my number :");
            userNumber = sc.nextInt();

            if(userNumber == myNumber) {
                
            System.out.println("Woohoo your guess is correct !!");
            break;
            }
            else if (userNumber > myNumber){
                System.out.println("your number is largest");
            }
            else{
                System.out.println(" your number is lower");
            }

        }while(userNumber >=0);
        System.out.println("my number was :" +myNumber);
    }
    
}