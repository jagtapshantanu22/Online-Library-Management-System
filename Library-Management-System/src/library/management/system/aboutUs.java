package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

    private JPanel contentPane;

    public static void main(String[] args) {
        new aboutUs().setVisible(true);
    }

    public aboutUs() {

        super("About Us - Library Management System ");
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\Lib.jpeg"));
        setBackground(new Color(173, 216, 230));
        setBounds(500, 250, 700, 500);

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("New label");
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/Lib.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(500, 40, 100, 100);
        contentPane.add(l1);


        JLabel l3 = new JLabel("Library");
        l3.setForeground(new Color(10, 0, 3));
        l3.setFont(new Font("Georgia", Font.BOLD , 34));
        l3.setBounds(160, 40, 150, 55);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Mangement System");
        l4.setForeground(new Color(10, 0, 3));
        l4.setFont(new Font("Georgia", Font.BOLD, 34));
        l4.setBounds(70, 90, 405, 40);
        contentPane.add(l4);

        /*JLabel l5 = new JLabel("");
        l5.setForeground(new Color(30, 144, 255));
        l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        l5.setBounds(185, 140, 100, 21);
        contentPane.add(l5);*/


        JLabel l6 = new JLabel("Developed By : Group 16");
        l6.setFont(new Font("Georgia", Font.BOLD, 30));
        l6.setBounds(70, 198, 600, 35);
        contentPane.add(l6);

        /*JLabel l7 = new JLabel("Contact Us : 7738740277");
        l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l7.setBounds(70, 260, 600, 34);
        contentPane.add(l7);

        JLabel l8 = new JLabel("Thankyou for Viewing our Project !");
        l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l8.setBounds(70, 290, 600, 34);
        contentPane.add(l8);

        JLabel l9 = new JLabel("Follow us on Instagram : madhanismit");
        l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
        l9.setBounds(70, 320, 600, 34);
        contentPane.add(l9);*/


        JLabel l10 = new JLabel("Ronit,Shantanu,Smit");
        l10.setForeground(new Color(0, 0, 0));
        l10.setFont(new Font("Georgia", Font.BOLD , 18));
        l10.setBounds(70, 280, 600, 34);
        contentPane.add(l10);


        contentPane.setBackground(Color.WHITE);
    }


}