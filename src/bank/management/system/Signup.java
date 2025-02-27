package bank.management.system;

import java.awt.Color;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

// import com.toedter.calendar.JDateChooser;



import javax.swing.*;

import java.util.Random;

public class Signup<dateChooser>  extends JFrame implements ActionListener{
    
    JTextField textName,textFname,textEmail,textAdd,textcity,textState,textPin;
    JButton next;

    JRadioButton r1,r2,m1,m2,m3;

    Random ran=new Random();
    long num=(ran.nextLong() % 9000L)+1000L;
    String first=""+Math.abs(num);

    Signup(){
        super("Application Form");
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("Application Form No."+first);
        label1.setBounds(400, 20, 600, 40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setBounds(600, 70, 600, 20);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setBounds(550, 90, 600, 30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);

         JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 150, 200, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD, 14));
        textName.setBounds(300, 150, 400, 25);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100, 200, 200, 30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD, 14));
        textFname.setBounds(300, 200, 400, 30);
        add(textFname);


        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 250, 200, 30);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(245, 129, 66));
        r1.setBounds(300, 250, 60, 30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(245, 129, 66));
        r2.setBounds(450, 250, 90, 30);
        add(r2);

        ButtonGroup bt=new ButtonGroup();
        bt.add(r1);
        bt.add(r2);

        JLabel labelEmail = new JLabel("Email Address:");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 320, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD, 14));
        textEmail.setBounds(300, 320, 400, 25);
        add(textEmail);
        
        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100, 380, 200, 30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300, 380, 100, 30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway", Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222, 255, 228));
        m2.setBounds(450,380,100,30);
        m2.setFont(new Font("Raleway", Font.BOLD,14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(600, 380, 100, 30);
        m3.setFont(new Font("Raleway", Font.BOLD,14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 19));
        labelAdd.setBounds(100, 450, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 12));
        textAdd.setBounds(300, 450, 400, 30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 19));
        labelCity.setBounds(100, 500, 200, 30);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway", Font.BOLD, 12));
        textcity.setBounds(300, 500, 400, 25);
        add(textcity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 19));
        labelPin.setBounds(100, 550, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 12));
        textPin.setBounds(300, 550, 400, 25);
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.BOLD, 19));
        labelstate.setBounds(100, 600, 200, 30);
        add(labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 12));
        textState.setBounds(300, 600, 400, 25);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(245, 129, 66));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        String form_no=first;
        String name=textName.getText();
        String fname=textFname.getText();
        // String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";

        }
        else{
            gender="Female";
        }

        String email=textEmail.getText();
        String marital=null;
        if(m1.isSelected()){
            marital="Married";
        }
        else if(m2.isSelected()){
            marital="UnMarried";
        }
        else{
            marital="Others";
        }

        String address=textAdd.getText();
        String city=textcity.getText();
        String pincode=textPin.getText();
        String state=textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");

            }
            else{
                Conn con1=new Conn();
                String q="insert into signup values('"+form_no+"','"+name+"','"+fname+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }

        }
        catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String args[]){
        new Signup();
    }
}
