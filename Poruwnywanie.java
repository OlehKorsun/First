import javax.swing.*;

public class Poruwnywanie {
	public static void main(String[] args){
		String x = JOptionPane.showInputDialog(null, "Enter a");
		int a = Integer.parseInt(x);
		
		String y = JOptionPane.showInputDialog(null, "Enter b");
		int b = Integer.parseInt(y);
		
		String z = JOptionPane.showInputDialog(null, "Enter c");
		int c = Integer.parseInt(z);
		
		if(a==b && a==c && b==c) {
			JOptionPane.showMessageDialog(null, "Nie OK");
		} else if(a==b && a!=c && b!=c) {
			JOptionPane.showMessageDialog(null, "OK");
		} else if(a!=b && a==c && b!=c) {
			JOptionPane.showMessageDialog(null, "OK");
		} else if(a!=b && a!=c && b==c) {
			JOptionPane.showMessageDialog(null, "OK");
		} else if(a!=b && a!=c && b!=c) {
			JOptionPane.showMessageDialog(null, "Nie OK");
		}
	}
}
