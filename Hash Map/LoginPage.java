import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class LoginPage extends Applet implements ActionListener{
    Panel p1,p2,p3,p;
    Button b1,b2;
    Label l,l1,l2;
    TextField tf1,tf2;
    static HashMap<String,String> map = new HashMap<String, String>();
    @Override
    public void init() {
        setLayout(new GridLayout(4,1));
        p = new Panel();
        l = new Label("Login Page");
        l.setFont(new Font("Arial",Font.BOLD,34));
        p.add(l);
        p1 = new Panel();
        l1 = new Label("Username");
        l1.setFont(new Font("Arial",Font.BOLD,22));
        tf1 = new TextField(20);
        tf1.setFont(new Font("Arial",Font.BOLD,22));
        p1.add(l1);
        p1.add(tf1);

        p2 = new Panel();
        l2 = new Label("Password");
        l2.setFont(new Font("Arial", Font.BOLD,22));
        tf1 = new TextField(20);
        tf1.setFont(new Font("Arial",Font.BOLD,22));
        tf2.setEchoChar('*');
        p2.add(l2);
        p2.add(tf1);

        p3 = new Panel();
        b1 = new Button("Submit");
        b1.setFont(new Font("Arial", Font.BOLD,22));
        b2 = new Button("Reset");
        b2.setFont(new Font("Arial",Font.BOLD,22));
        p3.add(b1);
        p3.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

        add(p);
        add(p1);
        add(p2);
        add(p3);

        map.put("admin", "Technocrat");

    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Button bb = (Button)ae.getSource();
        String s1 = tf1.getText();
        String s2 = tf2.getText();

        if(bb == b1){
            Set<String> ss = map.keySet();
            Iterator ii = ss.iterator();
            while(ii.hasNext()){
                String key = (String)ii.next();
                String value = map.get(key);
                if((s1.equals(key))& (s2.equals(value))){
                    showStatus("u are an Authorized User.");
                }else{
                    showStatus("U are not an Authorized User.");
                }
            }
        }else{
            tf1.setText("");
            tf2.setText("");
        }
    }
}
/*<applet code="login" width=440 height=400></applet>*/

 //Applet Progarm run in jdk 1.6 version
