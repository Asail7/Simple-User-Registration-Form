import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField T1,T2,T3;
    JRadioButton r1,r2;
    ButtonGroup G;
    JComboBox<String> C;
    JButton BS,BR;
    public MyFrame(){
        super("Registration Form");
        setLayout(new GridLayout(7,2));
       // grid.setHgap(10);
        //grid.setVgap(15);
       // setLayout(grid);
        l1=new JLabel("Registration form");
        add(l1);
        JPanel p1=new JPanel();
        add(p1);
        l2=new JLabel("Name");
        add(l2);
        T1=new JTextField(10);
        add(T1);
        l3=new JLabel("Mobail Number");
        add(l3);
        T2=new JTextField(10);
        add(T2);
        l4=new JLabel("Gender");
        add(l4);
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        G=new ButtonGroup();
        G.add(r1);
        G.add(r2);
        r1.setSelected(true);
        JPanel p2=new JPanel();
        p2.add(r1);
        p2.add(r2);
        add(p2);

        //lo ma zan aswy add l r1 w r2
        l5=new JLabel("YBD");
        add(l5);
        String[] years={"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        C=new JComboBox<>(years);
        add(C);
        l6=new JLabel("Address");
        add(l6);
        T3=new JTextField(10);
        add(T3);

        BS=new JButton("Submet");
        BR=new JButton("Rset");
        //JPanel p3=new JPanel();
        add(BS);
        add(BR);
        //add(p3);

        BS.addActionListener(this);
        BR.addActionListener(this);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(BS)){
            if (T1.getText().isEmpty()||T2.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Name or Mobail number are required ,Please Complete The Form!","Error",JOptionPane.ERROR_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null,"Regestiration Sussfuly.","Success",JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource().equals(BR)) {
            T1.setText("");
            T2.setText("");
            T3.setText("");
            r1.setSelected(true);
            JOptionPane.showMessageDialog(null,"Regestiration Reset it is done!.","Reset",JOptionPane.INFORMATION_MESSAGE);


        }
    }
    public static void main(String args[]){
        MyFrame m=new MyFrame();
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
        m.setVisible(true);
        m.setSize(400,400);

    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField T1,T2,T3;
    JRadioButton r1,r2;
    ButtonGroup G;
    JComboBox<String> C;
    JButton BS,BR;
    public MyFrame(){
        super("Registration Form");
        setLayout(new GridLayout(7,2));
       // grid.setHgap(10);
        //grid.setVgap(15);
       // setLayout(grid);
        l1=new JLabel("Registration form");
        add(l1);
        JPanel p1=new JPanel();
        add(p1);
        l2=new JLabel("Name");
        add(l2);
        T1=new JTextField(10);
        add(T1);
        l3=new JLabel("Mobail Number");
        add(l3);
        T2=new JTextField(10);
        add(T2);
        l4=new JLabel("Gender");
        add(l4);
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        G=new ButtonGroup();
        G.add(r1);
        G.add(r2);
        r1.setSelected(true);
        JPanel p2=new JPanel();
        p2.add(r1);
        p2.add(r2);
        add(p2);

        //lo ma zan aswy add l r1 w r2
        l5=new JLabel("YBD");
        add(l5);
        String[] years={"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        C=new JComboBox<>(years);
        add(C);
        l6=new JLabel("Address");
        add(l6);
        T3=new JTextField(10);
        add(T3);

        BS=new JButton("Submet");
        BR=new JButton("Rset");
        //JPanel p3=new JPanel();
        add(BS);
        add(BR);
        //add(p3);

        BS.addActionListener(this);
        BR.addActionListener(this);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(BS)){
            if (T1.getText().isEmpty()||T2.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Name or Mobail number are required ,Please Complete The Form!","Error",JOptionPane.ERROR_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null,"Regestiration Sussfuly.","Success",JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource().equals(BR)) {
            T1.setText("");
            T2.setText("");
            T3.setText("");
            r1.setSelected(true);
            JOptionPane.showMessageDialog(null,"Regestiration Reset it is done!.","Reset",JOptionPane.INFORMATION_MESSAGE);


        }
    }
    public static void main(String args[]){
        MyFrame m=new MyFrame();
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
        m.setVisible(true);
        m.setSize(400,400);

    }
}
