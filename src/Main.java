import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("The Number Of Book (Befor b1) = " + Book.getNumberOfNumberObject());
        Book b1 = new Book();
        System.out.println("The Number Of Book (After b1) = " + Book.getNumberOfNumberObject());
        Book b2 = new Book("Basem" , 50 , 'o');
        System.out.println("The Number Of Book (After b2) = " + Book.getNumberOfNumberObject());

        System.out.println("\n\n Befor ");
        System.out.println(b1);
        System.out.println("----------------------------------------------");
        System.out.println(b2);


        b1=b2.getCopy();
        b1.setTitle("Ibrahim Kamal");
        b2.setPages(100);


        System.out.println("\n\n Befor ");
        System.out.println(b1);
        System.out.println("----------------------------------------------");
        System.out.println(b2);

    }
}