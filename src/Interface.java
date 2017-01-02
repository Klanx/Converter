import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Joshua on 28.12.2016.
 */
public class Interface extends JFrame {
        private JTextField textfieldFilePath;
        private JButton buttonFilechooser;
        private int counter = 0;
        public Interface(){
            createView();

            setTitle("Edi Reader");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            pack();
            setLocationRelativeTo(null);
            setResizable(false);


        }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        textfieldFilePath = new JTextField();
        textfieldFilePath.setPreferredSize(new Dimension(300,30));
        panel.add(textfieldFilePath);

        buttonFilechooser = new JButton("Choose File");
        panel.add(buttonFilechooser);

    }

       public static void main(String [ ] args){
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Interface().setVisible(true);
                }
            });

        }

   /* private class ButtonCounterActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            counter++;
            updateCounter();
        }
    }*/
}
   /* labelCount = new JLabel();
        labelCount.setPreferredSize(
                new Dimension(200,30)
        );
        panel.add(labelCount);
        updateCounter();

        buttonCounter = new JButton("Click me");
        buttonCounter.addActionListener(
                new ButtonCounterActionListener()
        );
        panel.add(buttonCounter);

        buttonReset = new JButton("Reset me");
        buttonReset.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        counter=0;
                        updateCounter();
                    }
                }

        );
        panel.add(buttonReset);*/
      /*JFrame frame = new JFrame("FrameDemo");

            JPanel panel = new JPanel();
            panel.setBackground(Color.blue);
            frame.getContentPane().add(panel);

            JButton button = new JButton("This is a button");
            panel.add(button);

            JTextField textField = new JTextField();
            textField.setPreferredSize(new Dimension(200,25));
            panel.add(textField);



            //Setting the Frame Size
            frame.setSize(new Dimension(500,400));
            //Setting start Position
            frame.setLocationRelativeTo(null);
            //Set default close action
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //Set title to Frame
            frame.setTitle("Converter");
            //Block Size
            frame.setResizable(false);
            //Making the Frame visible
            frame.setVisible(true);*/
