//BLZ 379 uit HeadFirst Java boek -- Werkende versie :-) (28-MEI-2020)
//https://stackoverflow.com/questions/41107/how-to-generate-a-random-alpha-numeric-string?noredirect=1&lq=1

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class TwoButtons {
    JFrame frame;
    JLabel label;
    private Object String;

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
            String easy = RandomString.digits + "ACEFGHJKLMNPQRUVWXYabcdefhijkprstuvwx";
            RandomString tickets = new RandomString(7, new SecureRandom(), easy);
            label.setText(java.lang.String.valueOf(tickets));
        }
        public class RandomString {

            /**
             * Generate a random string.
             */
            public String nextString() {
                for (int idx = 0; idx < buf.length; ++idx)
                    buf[idx] = symbols[random.nextInt(symbols.length)];
                return new String(buf);
            }

            public  final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            public  final String lower = upper.toLowerCase(Locale.ROOT);

            public  static final String digits = "0123456789";

            public  final String alfanum= upper + lower + digits;

            private final Random random;

            private final char[] symbols;

            private final char[] buf;

            public RandomString(int length, Random random, String symbols) {
                if (length < 1) throw new IllegalArgumentException();
                if (symbols.length() < 2) throw new IllegalArgumentException();
                this.random = Objects.requireNonNull(random);
                this.symbols = symbols.toCharArray();
                this.buf = new char[length];
            }

        }
    }
    class ColorListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            frame.repaint();
        }
    }



}
