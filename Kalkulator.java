import javax.swing.*;

public class Kalkulator {
	public static void main(String[] args){
		String a = JOptionPane.showInputDialog(null, "Podaj pierwsza liczbe");
		double x = Double.parseDouble(a);
		
		String b = JOptionPane.showInputDialog(null, "Podaj druga liczbe");
		double y = Double.parseDouble(b);
		
		String c = JOptionPane.showInputDialog(null, "symbol dzialania");
		
		double wynik = 0;
		
		String plus = "+";
		String minus = "-";
		String iloczyn = "*";
		String iloraz = "/";
		
		if(c.equals(plus) == true) {
			wynik = x + y;
		} else if(c.equals(minus) == true) {
			wynik = x - y;
		} else if(c.equals(iloczyn) == true) {
			wynik = x * y;
		} else if(c.equals(iloraz) == true) {
			wynik = x / y;
		} 
		JOptionPane.showMessageDialog(null, wynik);
	}
}
