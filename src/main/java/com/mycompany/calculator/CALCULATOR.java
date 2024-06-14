/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;

/**
 *
 * @author TANISHQ
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CALCULATOR extends JFrame implements ActionListener
{
    JPanel disp,no;
    JLabel la;
    JTextField area,area2;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,equal,daci,pow,clr1,clr,cle;
    String no1,no2,result="";
    Boolean fadd=false,fsub=false,fmul=false,fdiv=false,fpow=false,fsqr=false,fdaci=false; 
    
    
    public CALCULATOR()
    {
        disp=new JPanel();
        disp.setBackground(Color.red);
        disp.setLayout(new GridLayout(3,1));
        
        la=new JLabel("CALCULATOR",JLabel.CENTER);
        la.setOpaque(true);
        la.setBackground(Color.blue);
        la.setForeground(Color.black);
        
        la.setFont(new Font("Sarif",Font.BOLD,25));
        
        area=new JTextField();
        area.setHorizontalAlignment(JTextField.RIGHT);
        area.setFont(new Font("Sarif",Font.CENTER_BASELINE,25));
        area.setBackground(Color.black);
        area.setForeground(Color.white);
        area.setEditable(false);
        
        area2=new JTextField();
        area2.setHorizontalAlignment(JTextField.RIGHT);
        area2.setFont(new Font("Sarif",Font.CENTER_BASELINE,25));
        area2.setBackground(Color.black);
        area2.setForeground(Color.white);
        area.setEditable(false);
        
        disp.add(la);
        disp.add(area2);
        disp.add(area);
        
        no=new JPanel();
        no.setBackground(Color.pink);
        no.setLayout(new GridLayout(5,4,10,10));
        no.setBorder(BorderFactory.createLineBorder(Color.red, 8));
        Font fo=new Font("Dialog",Font.BOLD,30);
        
        b0=new JButton("0");
        b0.setFont(fo);
        
        b1=new JButton("1");
        b1.setFont(fo);
        
        b2=new JButton("2");
        b2.setFont(fo);
        
        b3=new JButton("3");
        b3.setFont(fo);
        
        b4=new JButton("4");
        b4.setFont(fo);
//        b4.setBackground(Color.green);
        
        
        b5=new JButton("5");
//        b5.setBorder(BorderFactory.createLineBorder(Color.blue, 6, true));
        b5.setFont(fo);
        
        b6=new JButton("6");
        b6.setFont(fo);
        
        b7=new JButton("7");
        b7.setFont(fo);
        
        b8=new JButton("8");
        b8.setFont(fo);
        
        b9=new JButton("9");
        b9.setFont(fo);
        
        daci=new JButton(".");
        daci.setFont(fo);
        
        div=new JButton("/");
        div.setFont(fo);
        
        mul=new JButton("*");
        mul.setFont(fo);
        
        sub=new JButton("-");
        sub.setFont(fo);
        
        add=new JButton("+");
        add.setFont(fo);
        
        equal=new JButton("=");
        equal.setFont(fo);
        
        pow=new JButton("(x)^y");
        pow.setFont(fo);
        
        clr1=new JButton("Back");
        clr1.setFont(fo);
        
        clr=new JButton("C");
        clr.setFont(fo);
        
        cle=new JButton("CE");
        cle.setFont(fo);
        
        no.add(clr);no.add(clr1);no.add(pow);no.add(div);
        no.add(b7);no.add(b8);no.add(b9);no.add(mul);
        no.add(b4);no.add(b5);no.add(b6);no.add(sub);
        no.add(b1);no.add(b2);no.add(b3);no.add(add);
        no.add(cle);no.add(b0);no.add(daci);no.add(equal);
        
        setSize(500,700);
        Container con=getContentPane();
        con.setLayout(new BorderLayout());
        
        con.add(disp, BorderLayout.NORTH);
        con.add(no , BorderLayout.CENTER);
        
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        daci.addActionListener(this);
        pow.addActionListener(this);
        clr.addActionListener(this);
        cle.addActionListener(this);
        clr1.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        equal.addActionListener(this);
        
        setLocationRelativeTo(null);
        show();
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b0)
        {
            String p=area.getText();
            area.setText(p+"0");
        }
        if(ae.getSource()==b1)
        {
            String p=area.getText();
            area.setText(p+"1");
        }
        if(ae.getSource()==b2)
        {
            String p=area.getText();
            area.setText(p+"2");
        }
        if(ae.getSource()==b3)
        {
            String p=area.getText();
            area.setText(p+"3");
        }
        if(ae.getSource()==b4)
        {
            String p=area.getText();
            area.setText(p+"4");
        }
        if(ae.getSource()==b5)
        {
            String p=area.getText();
            area.setText(p+"5");
        }
        if(ae.getSource()==b6)
        {
            String p=area.getText();
            area.setText(p+"6");
        }
        if(ae.getSource()==b7)
        {
            String p=area.getText();
            area.setText(p+"7");
        }
        if(ae.getSource()==b8)
        {
            String p=area.getText();
            area.setText(p+"8");
        }
        if(ae.getSource()==b9)
        {
            String p=area.getText();
            area.setText(p+"9");
        }
        if(ae.getSource()==daci)
        {
            String p=area.getText();
            area.setText(p+".");
            daci.setEnabled(false);
            fdaci=true;
        }
        
        if(ae.getSource()==add)
        {
            fadd=true;
            no1=area.getText();
            area2.setText(no1);
            area.setText("");
            daci.setEnabled(true);
        }
        if(ae.getSource()==sub)
        {
            fsub=true;
            no1=area.getText();
            area2.setText(no1);
            area.setText("");
            daci.setEnabled(true);
        }
        if(ae.getSource()==mul)
        {
            fmul=true;
            no1=area.getText();
            area2.setText(no1);
            area.setText("");
            daci.setEnabled(true);
        }
        if(ae.getSource()==div)
        {
            fdiv=true;
            no1=area.getText();
            area2.setText(no1);
            area.setText("");
            daci.setEnabled(true);
        }
        if(ae.getSource()==pow)
        {
            fpow=true;
            no1=area.getText();
            area.setText("");
            area2.setText(no1);
            daci.setEnabled(true);
        }
        if(ae.getSource()==clr1)
        {
            fsqr=true;
            no1=area.getText();
            daci.setEnabled(true);
            String temp="";
            for(int i=0;i<no1.length()-1;i++)
            {
                temp=temp+no1.charAt(i);
                if(no1.charAt(i)=='.')
                {
                    daci.setEnabled(false);
                }
                
              //System.out.println("2="+temp); 
            }
                
            area.setText(temp);
            
        }
        
        if(ae.getSource()==cle)
        {
            
            area.getText();
            area.setText("");
            fadd=false;
            fsub=false;
            fmul=false;
            fdiv=false;
            fpow=false;
            fsqr=false;
           
        }
        if(ae.getSource()==clr)
        {
            fadd=false;
            fsub=false;
            fmul=false;
            fdiv=false;
            fpow=false;
            fsqr=false; 
            no1=null;
            no2=null;
            area.getText();
            area.setText("");
            area2.setText("");
            daci.setEnabled(true);
        }
        
        if(ae.getSource()==equal)
        {
            no2=area.getText();
            if(fadd==true)
            {
                area2.setText(no1+"+"+no2);
                double re=0;
                double a1=Double.parseDouble(no1);
                double b2=Double.parseDouble(no2);
                re= (a1+b2);
                //System.out.println(re);
                result=String.valueOf(re);
                //System.out.println(result);
                area.setText(result);
            }
            
            else if(fsub==true)
            {
                area2.setText(no1+"-"+no2);
                double re=0;
                double a1=Double.parseDouble(no1);
                double b2=Double.parseDouble(no2);
                re= a1-b2;
                result=String.valueOf(re);
                area.setText(result);
            }
            
            else if(fmul==true)
            {
                area2.setText(no1+"*"+no2);
                double re=0;
                double a1=Double.parseDouble(no1);
                double b2=Double.parseDouble(no2);
                re= a1*b2;
                result=String.valueOf(re);
                area.setText(result);
            }
            
            else if(fdiv==true)
            {
                area2.setText(no1+"/"+no2);
                double re=0;
                double a1=Double.parseDouble(no1);
                double b2=Double.parseDouble(no2);
                if(b2==0)
                    result="It's WRONG Operation...!!!";
                else
                {
                    re= a1/b2;
                    result=String.valueOf(re);
                }
                area.setText(result);
            }
            
            else if(fpow==true)
            {
                area2.setText("("+no1+")"+no2);
                double re=1;
                double a1=Double.parseDouble(no1);
                int b2=Integer.parseInt(no2);
                for(int i=0;i<b2;i++)
                {
                re= a1*re;
                System.out.println(re);
                }
                result=String.valueOf(re);
                area.setText(result);
            }
            
//            else if(fsqr==true)
//            {
//                double re=0;
//                double a1=Double.parseDouble(no1);
//                double b2=Double.parseDouble(no2);
//                result= no1+no2;
//                area.setText(result);
//            }
            
        }
    }

    public static void main(String[] args)
    {
        CALCULATOR cal=new CALCULATOR();
    }
}
