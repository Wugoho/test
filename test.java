import javax.swing.JOptionPane;
import java.util.Scanner;

public class test{
	public static void main(String[] args) {
		System.out.print("Geben Sieu ein Wort ein:\n");
		//JOptionPane.showMessageDialog(null, "Willkommen zur\nJava Programmierung!");
		Scanner neuesObjekt = new Scanner(System.in);
		String inputString = neuesObjekt.nextLine();
		System.out.println("Das eingegebene Wort war:" + inputString);
	}
}
