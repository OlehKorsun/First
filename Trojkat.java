import javax.swing.*;

public class Trojkat {
	public static void main(String[] args){
		String x = JOptionPane.showInputDialog(null, "Wprowadz liczbe a");
		double a = Double.parseDouble(x);
		
		String y = JOptionPane.showInputDialog(null, "Wprowadz liczbe b");
		double b = Double.parseDouble(y);
		
		String z = JOptionPane.showInputDialog(null, "Wprowadz liczbe c");
		double c = Double.parseDouble(z);
		// Если самая большая сторона меньше суммы двух других - значит всё в порядке
		double max = a;
		double sum = b+c;
		if(max<b){
			max = b;
			sum = a+c;
		} 
		if(max<c) {
			max = c;
			sum = a+b;
		}
		if(sum>max){
			JOptionPane.showMessageDialog(null, "Jest OK");
		} else {
			JOptionPane.showMessageDialog(null, "Nie jest OK");
		}
	}
}
