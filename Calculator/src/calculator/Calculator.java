package calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ahmet Hüzeyfe Demir
 */
public class Calculator {
     static String s1,s2,islem,sonuc;
     static JLabel label;
     static JTextField tf;
    static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,topla,cikar,carp,bol,ans,esit;
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Hesap Makinesi");
       IcSinif handler = new IcSinif();
        
         label = new JLabel("Ekran");
        label.setBounds(100,10,100,50);
        tf = new JTextField(20);
        tf.setText("");
        tf.setBounds(100,70,200,50);
        
        //buttons
        b1=new JButton("1");
        b1.setBounds(100,130,50,30);
        b2=new JButton("2");
        b2.setBounds(160,130,50,30);
        b3=new JButton("3");
        b3.setBounds(220,130,50,30);
        b4=new JButton("4");
        b4.setBounds(100,170,50,30);
        b5=new JButton("5");
        b5.setBounds(160,170,50,30);
        b6=new JButton("6");
        b6.setBounds(220,170,50,30);
        b7=new JButton("7");
        b7.setBounds(100,210,50,30);
        b8=new JButton("8");
        b8.setBounds(160,210,50,30);
        b9=new JButton("9");
        b9.setBounds(220,210,50,30);
        b0=new JButton("0");
        b0.setBounds(160,250,50,30);
        
        //operants
       topla = new JButton("+");
       topla.setBounds(280,130,50,30);
       cikar = new JButton("-");
       cikar.setBounds(280,170,50,30);
       carp = new JButton("*");
       carp.setBounds(280,210,50,30);
       bol = new JButton("/");
       bol.setBounds(280,250,50,30);
       esit = new JButton("=");
       esit.setBounds(220,250,50,30);
       ans = new JButton("Ans");
       ans.setBounds(95,250,60,30);
       
        
        //add  action listener to number buttons
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        b0.addActionListener(handler);
        
        //add  action listener to operants buttons
        topla.addActionListener(handler);
        cikar.addActionListener(handler);
        carp.addActionListener(handler);
        bol.addActionListener(handler);
        esit.addActionListener(handler);
        ans.addActionListener(handler);
        
        
        
       
       
        f.add(label);  f.add(tf);  f.add(b1);  f.add(b2);  f.add(b3);  f.add(b4);  f.add(b5);  f.add(b6);  f.add(b7);  f.add(b8);  f.add(b9);  f.add(b0);  f.add(topla);  f.add(cikar);  f.add(carp);  f.add(bol);
        f.add(esit);  f.add(ans);
        
        
        f.getContentPane().setBackground( Color.pink );
        f.setSize(400,350);  
        f.setLayout(null);  
        f.setVisible(true);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public static class IcSinif implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b1)
          tf.setText(tf.getText() +"1"); 
            else if(e.getSource()==b2)
                tf.setText(tf.getText() +"2");
            else if(e.getSource()==b3)
                tf.setText(tf.getText() +"3");
            else if(e.getSource()==b4)
                tf.setText(tf.getText() +"4");
            else if(e.getSource()==b5)
                tf.setText(tf.getText() +"5");
            else if(e.getSource()==b6)
                tf.setText(tf.getText() +"6");
            else if(e.getSource()==b7)
                tf.setText(tf.getText() +"7");
            else if(e.getSource()==b8)
                tf.setText(tf.getText() +"8");
            else if(e.getSource()==b9)
                tf.setText(tf.getText() +"9");
            else if(e.getSource()==b0)
                tf.setText(tf.getText() +"0");
            else if(e.getSource()==topla)
            {
               s1 = tf.getText();
               islem = "+";
               tf.setText("");
            }
            else if(e.getSource()==cikar)
            {
               s1 = tf.getText();
               islem = "-";
               tf.setText("");
            }
            else if(e.getSource()==carp)
            {
               s1 = tf.getText();
               islem = "*";
               tf.setText("");
                    }
            else if(e.getSource()==bol)
            {
               s1 = tf.getText();
               islem = "/";
               tf.setText("");
            }
            else if(e.getSource()==esit)
            {
                int sayi1 = Integer.parseInt(s1);
                s2 = tf.getText();
                int sayi2 = Integer.parseInt(s2);
                switch(islem){
                    case "+":
                        sonuc = String.valueOf(sayi1+sayi2);
                        tf.setText(s1+"+"+s2+"="+sonuc);
                        break;
                    case "-":
                        sonuc = String.valueOf(sayi1-sayi2);
                        tf.setText(s1+"-"+s2+"="+sonuc);
                        break;
                    case "*":
                        sonuc = String.valueOf(sayi1*sayi2);
                        tf.setText(s1+"*"+s2+"="+sonuc);
                    break;
                    case "/":
                        sonuc = String.valueOf(sayi1/sayi2);
                        tf.setText(s1+"/"+s2+"="+sonuc);
                        break;
                }
            }
            else if(e.getSource()==ans)
                tf.setText(sonuc);
        
        
        
        }
    }       
    
}

