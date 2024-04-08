package java.swing;


/* Design a window which consists of three labels,three text fields
ad two buttons whose appearance is given below. When the ADD
button is clicked, the sum will be displayed in the result field.
Similarly, When the MUL button is clicked, the product will be
displayed in the result field.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mywin extends JFrame implements ActionListener{
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1,b2;

    mywin(){
        setLayout(new FlowLayout());
        setSize(200,100);
        setVisible(true);

        l1 = new JLabel("no1");
        
        l2= new JLabel("no2");
        
        l3 = new JLabel("result");
        b1 = new JButton("add");
        b2 = new JButton("mul");
        t1= new JTextField(5);
        t2= new JTextField(5);
        t3= new JTextField(5);
	t3.setEditable(false);


        Container c = getContentPane();
        c.add(l1);
        c.add(l2);
        c.add(l3);
        c.add(b1);
        c.add(b2);
        c.add(t1);
        c.add(t2);
        c.add(t3);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        int num1  = Integer.parseInt(t1.getText());
        int num2  = Integer.parseInt(t2.getText());
	int sum = num1+num2;
	int prod = num1*num2;
        if(e.getSource()==b1){
            t3.setText(String.valueOf(sum));
        }
        if(e.getSource()==b2){
            t3.setText(String.valueOf(prod));
        }
    }
    public static void main(String x[]){
        new mywin();
    }
}   