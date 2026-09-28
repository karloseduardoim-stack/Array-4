import javax.swing.JOptionPane;
public class atvd4 {
public static void main(String []args) {
	int numeral[]=new int[99];
	
	for (int k=0;  k<99; k++) {
		
		numeral[k]=Integer.parseInt(JOptionPane.showInputDialog("Acerte o número\n Ou o loop se repetirá:"));
		   if(numeral[k]==99) {
				JOptionPane.showMessageDialog(null,"Está certo");
				break;
			}
			     else if(numeral[k]!=99 ||numeral[k]<=0 ) {
			    	 numeral[k]=Integer.parseInt(JOptionPane.showInputDialog("Acerte o número\n Ou o loop se repetirá:"));
			     }
	}
  
}
}
