import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldSwing {
    JLabel label = new JLabel("Hello World!");
    JLabel klickLabel = new JLabel("Klicks: ");

    int klickCount = 0;

    JTextField textField = new JTextField("DefaultText");

    JButton changeGreet = new JButton("Hallo");
    JButton button = new JButton("Beenden");
    JFrame frame = new JFrame("HelloWorldSwing");

    public HelloWorldSwing() {
    }

    public void createAndShowGUI(){
        JPanel panel = new JPanel();

        label.setBackground(Color.RED);
        label.setOpaque(true);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(gridBagLayout);

        // Layout sagen, wo die Constraints gelten sollen
        gridBagLayout.setConstraints(panel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 10;
        gbc.ipady = 10;
        panel.add(klickLabel, gbc);

        textField.setMinimumSize(new Dimension(100, 20));
        textField.setSize(150, 40);
        textField.setPreferredSize(new Dimension(150, 40));
        textField.setMaximumSize(new Dimension(250, 60));
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(textField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(label, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(changeGreet, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(button, gbc);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(800, 600);

        // Immer letzter Punkt
        frame.setVisible(true);
    }


    public void main(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
                setButtonListener();
            }
        });
    }


    public void setButtonListener(){
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // System.exit(0);
                if(label.getText().equals("Hello World!")){
                    String textfeld = textField.getText();
                    int i = Integer.parseInt(textfeld);
                    System.out.println(i+1);
                    label.setText("Hallo " + textfeld);
                    label.setBackground(Color.CYAN);
                } else {
                    label.setText("Hello World!");
                    label.setBackground(Color.RED);
                }

                klickCount++;
                klickLabel.setText("Klicks: " + klickCount);
            }
        };
        changeGreet.addActionListener(buttonListener);

        ActionListener closeButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        button.addActionListener(closeButton);
    }



}
