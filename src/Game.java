import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Breakfast breakfast = new Breakfast();
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("1 for breakfast");
        choice = input.nextInt();
        if(choice==1){
            breakfast.cook();
        }
    }
}
