import java.util.Scanner;

public class testt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie");
        String name = scanner.nextLine();
        System.out.println("dzien dobry " + name + " !");
        int number = 14;
        System.out.println(number);

        switch (number){
            case 1:
                System.out.println("asasassa");
                break;
            case 2: {
                System.out.println("adadad");
                break;
            }
            default:
                System.out.println("default");
    ////////adadadada
        }


    }
}
