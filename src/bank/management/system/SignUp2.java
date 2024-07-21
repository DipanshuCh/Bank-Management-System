package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {

    String formNo;
    JComboBox combo, combo2, combo3, combo4, combo5;
    JTextField textPan, textAdhaar;
    JRadioButton r1,r2,r3, r4;
    JButton but;


    public SignUp2(String form){

        super("APPLICATION FORM");

        ImageIcon im  = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image im2 = im.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon im3 = new ImageIcon(im2);
        JLabel image = new JLabel(im3);
        image.setBounds(100,5,100,100);
        add(image);

        this.formNo = form;

        JLabel l1 = new JLabel("Page 2-");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(400,10,300,50);
        add(l1);

        JLabel l2 = new JLabel("Additional Details -");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(350,40,300,50);
        add(l2);

        JLabel l3 = new JLabel("Religion: ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(200,110,300,50);
        add(l3);

        // religion
        String[] religion = {"Hindu","Muslim","Christian","Sikh","Other"};
        combo = new JComboBox(religion);
        combo.setBackground(new Color(245, 155, 66));
        combo.setFont(new Font("Raleway",Font.BOLD,15));
        combo.setBounds(400,125,300,20);
        add(combo);



        // category
        JLabel l4 = new JLabel("Category: ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(200,155,300,50);
        add(l4);

        String[] category = {"General","OBC","SC","ST"};
        combo2 = new JComboBox(category);
        combo2.setBackground(new Color(245, 155, 66));
        combo2.setFont(new Font("Raleway",Font.BOLD,15));
        combo2.setBounds(400,170,300,20);
        add(combo2);



        // Income
        JLabel l5 = new JLabel("Income: ");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(200,200,300,50);
        add(l5);

        String[] income = {"Null", "<1,50,000", "<2,50,000", "5,00,000","upto 10,00,000","Above"};
        combo3 = new JComboBox(income);
        combo3.setFont(new Font("Raleway",Font.BOLD,15));
        combo3.setBackground(new Color(245, 155, 66));
        combo3.setBounds(400,215,300,20);
        add(combo3);


        // education
        JLabel l6 = new JLabel("Education: ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(200,250,300,50);
        add(l6);

        String[] education = {"Graduate", "Post-Graduate", "Doctrate", "Other"};
        combo4 = new JComboBox(education);
        combo4.setBackground(new Color(245, 155, 66));
        combo4.setFont(new Font("Raleway",Font.BOLD,15));
        combo4.setBounds(400,260,300,20);
        add(combo4);


        // Occupation
        JLabel l7 = new JLabel("Occupation: ");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(200,300,300,50);
        add(l7);

        String[] occupation = {"Student", "Salaried", "Service", "Business","Retired","Other"};
        combo5 = new JComboBox(occupation);
        combo5.setBackground(new Color(245, 155, 66));
        combo5.setFont(new Font("Raleway",Font.BOLD,15));
        combo5.setBounds(400,315,300,20);
        add(combo5);


        // PAN or Adhaar
        JLabel l8 = new JLabel("PAN NO: ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(200,350,300,50);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,15));
        textPan.setBounds(400,365,300,20);
        add(textPan);


        // adhaar
        JLabel l9 = new JLabel("Adhar");
        l9.setFont(new Font("Araleway",Font.BOLD,18));
        l9.setBounds(200,400,300,50);
        add(l9);

        textAdhaar = new JTextField();
        textAdhaar.setFont(new Font("Raleway",Font.BOLD,15));
        textAdhaar.setBounds(400,415,300,20);
        add(textAdhaar);


        // senior citizen
        JLabel l10 = new JLabel("Senior Citizen");
        l10.setFont(new Font("Araleway",Font.BOLD,18));
        l10.setBounds(200,450,300,50);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Araleway", Font.BOLD,18));
        r1.setBackground(new Color(245, 155, 66));
        r1.setBounds(400,450,100,50);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Araleway", Font.BOLD,18));
        r2.setBackground(new Color(245, 155, 66));
        r2.setBounds(550,450,100,50);
        add(r2);



        // existing account
        JLabel l11 = new JLabel("Existing Account");
        l11.setFont(new Font("Araleway",Font.BOLD,18));
        l11.setBounds(200,500,300,50);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Araleway", Font.BOLD,18));
        r3.setBackground(new Color(245, 155, 66));
        r3.setBounds(400,500,100,50);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Araleway", Font.BOLD,18));
        r4.setBackground(new Color(245, 155, 66));
        r4.setBounds(550,500,100,50);
        add(r4);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(r3);
        bg2.add(r4);



        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Araleway",Font.BOLD,18));
        l12.setBounds(500,10,300,50);
        add(l12);


        JLabel l13 = new JLabel(formNo);
        l13.setFont(new Font("Araleway",Font.BOLD,18));
        l13.setBounds(600,10,300,50);
        add(l13);


        but = new JButton("Next");
        but.setFont(new Font("Araleway",Font.BOLD,15));
        but.setForeground(Color.black);
        but.setBackground(Color.white);
        but.addActionListener(this);
        but.setBounds(630,550,70,22);
        add(but);


        // create frame for the additional details
        setLayout(null);
        setSize(850,650);
        setLocation(250,10);
        getContentPane().setBackground(new Color(245, 155, 66));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String)combo.getSelectedItem();
        String cat = (String)combo2.getSelectedItem();
        String inc = (String)combo3.getSelectedItem();
        String edu = (String)combo4.getSelectedItem();
        String ocu = (String)combo5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAdhaar.getText();

        String senCitizen = " ";
        if (r1.isSelected()){
            senCitizen = "Yes";
        }
        else if(r2.isSelected()){
            senCitizen = "NO";
        }

        String extAccount = " ";
        if (r3.isSelected()){
            extAccount = "Yes";
        }else if(r4.isSelected()){
            extAccount = "No";
        }

        try{
            if (textPan.getText().equals("") || textAdhaar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Connect con = new Connect();
                String q = "insert into signup2 values('"+formNo+"','"+rel+"', '"+cat+"', '"+inc+"','"+edu+"', '"+ocu+"', '"+pan+"', '"+aadhar+"', '"+senCitizen+"', '"+extAccount+"')";
                con.statement.executeUpdate(q);
                new SignUp3(formNo);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }



    public static void main(String[] args) {
        new SignUp2("");

    }


}
