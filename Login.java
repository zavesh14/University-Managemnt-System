package UniversityManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton loginbtn, cancelbtn;
    JTextField tfusername, tfpassword;
    //JPasswordField tfpassword;

    Login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        //Username
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20,100, 20);//left, up, length, width
        add(lblusername);


         tfusername  = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);

        //Password
        JLabel lbpassword = new JLabel("Password");
        lbpassword.setBounds(40, 60,100, 20);//left, up, length, width
        add(lbpassword);


         tfpassword  = new JPasswordField();
        tfpassword.setBounds(150, 60, 150, 20);
        add(tfpassword);

        //login button
        loginbtn = new JButton("Login");
        loginbtn.setBounds(40, 140, 120, 30);
        loginbtn.setBackground(Color.BLACK);
        loginbtn.setForeground(Color.WHITE);
        loginbtn.addActionListener(this);
        loginbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(loginbtn);

        //Cancel button
        cancelbtn = new JButton("Cancel");
        cancelbtn.setBounds(180, 140, 120, 30);
        cancelbtn.setBackground(Color.BLACK);
        cancelbtn.setForeground(Color.WHITE);
        cancelbtn.addActionListener(this);
        cancelbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancelbtn);

        //Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        //Frame
        setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);
    }
    public static void main(String[] args){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == loginbtn){
            String username = tfusername.getText();
            String password = tfpassword.getText();

            String query = "select * from login where username='"+username+"' and password='"+password+"'";

            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);

                if(rs.next()){
                    setVisible(false);
                    new Project();
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                }
                c.s.close();

            } catch(Exception e){
                e.printStackTrace();
            }

        } else if(ae.getSource() == cancelbtn) {
            setVisible(false);
        }
    }
}
