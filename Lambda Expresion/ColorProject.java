import java.awt.*;
import java.awt.event.*;
public class ColorProject extends Frame{
        Button b1,b2,b3;
        public ColorProject(String title) {
            super(title);
            setLayout(new FlowLayout());
            b1 = new Button("Red");
            b2 = new Button("Green");
            b3 = new Button("Blue");

            b1.setFont(new Font("Arial",Font.BOLD,22));
            b2.setFont(new Font("Arial", Font.BOLD,22));
            b3.setFont(new Font("Arial",Font.BOLD,22));

            ActionListener aa = (ae) -> {
                Button bb = (Button) ae.getSource();
                if(bb == b1) {
                    setBackground(Color.red);
                }
                else if(bb == b2) {
                    setBackground(Color.green);
                }else{
                    setBackground(Color.blue);
                }
            };

            b1.addActionListener(aa);
            b2.addActionListener(aa);
            b3.addActionListener(aa);

            add(b1);
            add(b2);
            add(b3);
            setSize(450,400);
            setVisible(true);
            
        }
    public static void main(String args[]){
        new ColorProject("Frame Application.");
    }  
}
