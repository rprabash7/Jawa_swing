import javax.swing.*;
import java.awt.event.*;
class PrimeNumbers implements ActionListener{
JTextField Number, ResultField;
JButton Check;
PrimeNumbers(){
JFrame frame = new JFrame("Checking Prime Number");
frame.setSize(300,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);

JLabel Num=new JLabel("Enter The Number: ");
Num.setBounds(20,20,60,20);

Number=new JTextField();
Number.setBounds(90,20,150,20);

ResultField = new JTextField();  
ResultField.setBounds(90, 50, 150, 20);  
ResultField.setEditable(false);  

Check = new JButton("Calculate");  
Check.setBounds(90, 80, 100, 30);
Check.addActionListener(this);

frame.add(Num);
frame.add(Number);
frame.add(ResultField);
frame.add(Check);  

frame.setVisible(true);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==Check){
int i,count,j;
int n=Integer.parseInt(Number.getText());
StringBuilder primes = new StringBuilder();
for(j=2;j<=n;j++){
count=0;
for(i=1;i<=n;i++){
if(j%i==0){
count++;
}
}

if(count==2){
primes.append(j).append(" ");
}

}
ResultField.setText(primes.toString());
}

}
public static void main(String args[]){
new PrimeNumbers();
}
}