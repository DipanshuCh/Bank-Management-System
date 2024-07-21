package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    // Declare a global variable
    JLabel label1, label2, label3;

    JTextField textField2;

    JPasswordField passwordField3;

    JButton button1,button2,button3;

    Login(){
        // give a title to the frame of the BMS
        super("Bank Management System");

        // Bank image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);


        // card Image
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,345,100,100);
        add(iimage);



        // use of JLabel : - JLabel is used to display a short string or text on the frame
        // JLabel is used to display text, image or both
        label1 = new JLabel("WELCOME TO SBI ATM");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde", Font.BOLD,20));
        label1.setBounds(290,120,310,60);
        add(label1);


        label2 = new JLabel("Card No: ");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Ralway", Font.BOLD, 18));
        label2.setBounds(200,180,310,60);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(350,195,210,30);
        textField2.setFont(new Font("Arial",Font.BOLD,18));
        add(textField2);



        label3 = new JLabel("PIN: ");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway", Font.BOLD, 18));
        label3.setBounds(200,230,310,60);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(350,245,210,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,18));
        add(passwordField3);



        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,16));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(310,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,16));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(440,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,16));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.setBounds(310,350,230,30);
        button3.addActionListener(this);
        add(button3);






        // background of the frame
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);



        // set the size of the frame
        setLayout(null);
        setSize(850,480);
        setLocation(180,100);
//        setUndecorated(true);
        setVisible(true); // without this keyword the frame will not be visible

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            if (e.getSource() == button1){
                Connect con = new Connect();
                String card_no = textField2.getText();
                String pin = passwordField3.getText();
                String que = "select * from login where card_No = '"+card_no+"' and pin = '"+pin+"'";
                ResultSet resultSet = con.statement.executeQuery(que);
                if (resultSet.next()){
                    setVisible(false);
                    new main_class(pin);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Card Number or PIN");
                }
            }
            else if(e.getSource() == button2){
                textField2.setText("");
                passwordField3.setText("");
            }
            else if(e.getSource() == button3){
                new SignUp();
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }


    public static void main(String[] args){
        Login ob = new Login();
    }
}
