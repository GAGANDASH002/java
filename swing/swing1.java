package java.swing;

//import given packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//define a class subclass of JFrame and implements ActionListener
class mywindow extends JFrame implements ActionListener{

//declare components
JLabel l;
JButton b1;
JButton b2;


//define constructor
mywindow(){
setLayout(new FlowLayout());
setSize(200,100);
setVisible(true);

//create objects of components
l= new JLabel("Welcome");
b1= new JButton("Yes");
b2= new JButton("No");

//use contentpane to create a container
Container c = getContentPane();
c.add(l);
c.add(b1);
c.add(b2);

//register listener
b1.addActionListener(this);
b2.addActionListener(this);
}

//implement methods of ActionListener
public void actionPerformed(ActionEvent e){
String s1= b1.getActionCommand();
String s2= b2.getActionCommand();

if(s1.equals("Yes")){
l.setText("You pressed yes");
}
if(s2.equals("No")){
l.setText("You pressed no");
}
else
{
System.out.println("no button pressed");
}
}

//main method
public static void main(String x[]){
new mywindow();
}
}


