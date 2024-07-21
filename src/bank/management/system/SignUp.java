package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

    // creating an random number for the application form
    Random ran = new Random();
    long first4 =  (ran.nextLong() % 9000L)+ 1000L;
    String first = " " + Math.abs(first4);                   // form Number

    JLabel label1, label2;

    //text field to store the name of the applicant
    JTextField textFieldName ,textFatherName, textEmail, textAddress, textCity, textPin, textState;

    // calendar
    JDateChooser dateChooser;

    JRadioButton r1,r2, r3, r4, r5;
    JButton  next;


    // constructor
    SignUp(){
        super("APPLICATION FORM");

        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i1 = im.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel i3 = new JLabel(i2);
        i3.setBounds(10,10,100,100);
        add(i3);

        JLabel label1 = new JLabel("APPLICATION FORM NO. "+ first4);
        label1.setBounds(150,5,400,60);
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(290,50,600,30);
        add(label2);


        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(250,80,600,30);
        add(label3);


        JLabel labelName = new JLabel("Name");
        labelName.setFont(new Font("Raleway",Font.BOLD,18));
        labelName.setBounds(100,140,400,20);
        add(labelName);

        // text field for Name
        textFieldName = new JTextField();
        textFieldName.setFont(new Font("Raleway",Font.BOLD,17));
        textFieldName.setBounds(250,140,310,24);
        add(textFieldName);


        JLabel fName = new JLabel("Father's Name");
        fName.setFont(new Font("Raleway",Font.BOLD,18));
        fName.setBounds(100,180,400,20);
        add(fName);

        // text field for Father's name
        textFatherName = new JTextField();
        textFatherName.setFont(new Font("Raleway",Font.BOLD,17));
        textFatherName.setBounds(250,180,310,24);
        add(textFatherName);


        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Raleway",Font.BOLD,18));
        gender.setBounds(100,225,400,20);
        add(gender);

        // adding buttons for choosing gender
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(250,220,60,30);
        add(r1);

        // adding buttons for choosing gender
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(350,220,100,30);
        add(r2);

        // Grouping the buttons this uses for check one box at a time
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);


        // label for DOB
        JLabel dob = new JLabel("Date Of Birth");
        dob.setFont(new Font("Raleway",Font.BOLD,18));
        dob.setBounds(100,275,400,20);
        add(dob);

        // choose date from calendar
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(10,105,105));
        dateChooser.setBounds(250,275,310,24);
        add(dateChooser);

        // label for emailAddress
        JLabel email = new JLabel("Email Address");
        email.setFont(new Font("Raleway",Font.BOLD,18));
        email.setBounds(100,325,400,20);
        add(email);


        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,17));
        textEmail.setBounds(250,325,310,24);
        add(textEmail);



        // label for marital status
        JLabel marital = new JLabel("Marital Status");
        marital.setFont(new Font("Raleway",Font.BOLD,18));
        marital.setBounds(100,375,400,20);
        add(marital);

        // adding buttons for choosing gender
        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(250,370,100,30);
        add(r3);

        // adding buttons for choosing gender
        r4 = new JRadioButton("UnMarried");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(350,370,100,30);
        add(r4);

        r5= new JRadioButton("Other");
        r5.setFont(new Font("Raleway",Font.BOLD,14));
        r5.setBackground(new Color(222,255,228));
        r5.setBounds(470,370,200,30);
        add(r5);

        // Grouping the buttons this uses for check one box at a time
        ButtonGroup bgMarried = new ButtonGroup();
        bgMarried.add(r3);
        bgMarried.add(r4);
        bgMarried.add(r5);




        // label for address
        JLabel labelAdd = new JLabel("Address");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,18));
        labelAdd.setBounds(100,425,400,20);
        add(labelAdd);


        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway",Font.BOLD,17));
        textAddress.setBounds(250,425,310,24);
        add(textAddress);

        // label for city
        JLabel labelCity = new JLabel("City");
        labelCity.setFont(new Font("Raleway",Font.BOLD,18));
        labelCity.setBounds(100,475,400,20);
        add(labelCity);


        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,17));
        textCity.setBounds(250,475,310,24);
        add(textCity);

        // label for PIN
        JLabel labelPin = new JLabel("PIN");
        labelPin.setFont(new Font("Raleway",Font.BOLD,18));
        labelPin.setBounds(100,525,400,20);
        add(labelPin);


        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,17));
        textPin.setBounds(250,525,310,24);
        add(textPin);



        // label for State
        JLabel labelState = new JLabel("State");
        labelState.setFont(new Font("Raleway",Font.BOLD,18));
        labelState.setBounds(100,575,400,20);
        add(labelState);


        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,17));
        textState.setBounds(250,575,310,24);
        add(textState);


        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,18));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(477,610,80,22);
        next.addActionListener(this);                    // storing the data into the database
        add(next);






        getContentPane().setBackground(new Color(222,255,228)); // used for set the background color instead of set the image
        setLayout(null);
        setSize(700,690);
        setLocation(350,0);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String Name = textFieldName.getText();
        String FatherName = textFatherName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        // for storing the gender of the person into the dataBase
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }

        String mail = textEmail.getText();

        // storing the marital status into database
        String marital = null;
        if (r3.isSelected()){
            marital = "Married";
        }else if(r4.isSelected()){
            marital = "UnMarried";
        }else if(r5.isSelected()){
            marital = "other";
        }


        String address = textAddress.getText();
        String city = textCity.getText();
        String pinCode = textPin.getText();
        String state = textState.getText();


        // storing the data into the database
        try{
            if (textFieldName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Need all the Fields");
            }
            else{
                Connect con = new Connect();
                String q = "insert into signup values('"+formNo+"','"+Name+"', '"+FatherName+"', '"+dob+"','"+gender+"', '"+mail+"', '"+marital+"', '"+address+"', '"+city+"', '"+pinCode+"', '"+state+"')";
                con.statement.executeUpdate(q);

                new SignUp2(formNo);
                setVisible(false); // to turn of the visibility of  this frame
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }



    public static void main(String[] args){
        new SignUp();
    }

}
