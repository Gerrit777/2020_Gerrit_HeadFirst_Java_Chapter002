//BLZ 379 uit HeadFirst Java boek -- Werkende versie :-) (28-MEI-2020)

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {
    JFrame frame;
    JLabel label;

    public static void main (String[] arg){
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(300,300);
        frame.setVisible(true);
    }

    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            Graphics2D g2D = (Graphics2D) g;
            int red = (int) (Math.random()*256);
            int green = (int) (Math.random()*256);
            int blue = (int) (Math.random()*256);
            Color startColor = new Color(red,green,blue);

            red= (int) (Math.random()*256);
            green= (int) (Math.random()*256);
            blue= (int) (Math.random()*256);
            Color endColor = new Color(red,green,blue);

            GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
            g2D.setPaint(gradient);
            g2D.fillOval(70,70,100,100);


        }
    }

    class LabelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            label.setText("Ouch!");
        }
    }
    class ColorListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            frame.repaint();
        }
    }


}
