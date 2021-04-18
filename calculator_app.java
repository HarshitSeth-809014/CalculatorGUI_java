import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class calculator_app extends JFrame {

    private final JTextField textField_1;

    /**
     * Launch the application.
     */

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                calculator_app frame = new calculator_app();
                frame.setLocation(500, 200);
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    double num, ans;
    int calculation;

    /**
     * Create the frame.
     */

    public void arithmetic_operations() {
        switch (calculation) {
            case 1 -> {
                ans = num + Double.parseDouble(textField_1.getText());
                textField_1.setText(Double.toString(ans));
            }
            case 2 -> {
                ans = num - Double.parseDouble(textField_1.getText());
                textField_1.setText(Double.toString(ans));
            }
            case 3 -> {
                ans = num * Double.parseDouble(textField_1.getText());
                textField_1.setText(Double.toString(ans));
            }
            case 4 -> {
                ans = num / Double.parseDouble(textField_1.getText());
                textField_1.setText(Double.toString(ans));
            }
        }
    }
    public calculator_app() {
        setLocation(500, 250);
        setResizable(false);
        setType(Type.POPUP);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 343, 390);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        textField_1 = new JTextField();
        textField_1.setFocusable(false);
        textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
        textField_1.setEditable(false);
        textField_1.setFont(new Font("Tahoma", Font.BOLD, 23));
        textField_1.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setFocusable(false);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1.setForeground(new Color(220, 20, 60));

        JButton btnNewButton = new JButton("+");
        btnNewButton.setFocusable(false);
        btnNewButton.addActionListener(e -> {
            num = Double.parseDouble(textField_1.getText());
            calculation = 1;
            textField_1.setText("");
            lblNewLabel_1.setText(num + " +");
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1 = new JButton("7");
        btnNewButton_1.setFocusable(false);
        btnNewButton_1.addActionListener(e -> textField_1.setText(textField_1.getText() + "7"));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_1 = new JButton("8");
        btnNewButton_1_1.setFocusable(false);
        btnNewButton_1_1.addActionListener(e -> textField_1.setText(textField_1.getText() + "8"));
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_2 = new JButton("9");
        btnNewButton_1_2.setFocusable(false);
        btnNewButton_1_2.addActionListener(e -> textField_1.setText(textField_1.getText() + "9"));
        btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnC = new JButton("C");
        btnC.setFocusable(false);
        btnC.addActionListener(e -> textField_1.setText(""));
        btnC.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_3 = new JButton("<--");
        btnNewButton_3.setFocusable(false);
        btnNewButton_3.addActionListener(e -> {
            int length = textField_1.getText().length();
            int number = textField_1.getText().length() - 1;
            String store;

            if(length > 0) {
                StringBuilder back = new StringBuilder(textField_1.getText());
                back.deleteCharAt(number);
                store = back.toString();
                textField_1.setText(store);
            }
        });
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_2_1 = new JButton("-");
        btnNewButton_1_2_1.setFocusable(false);
        btnNewButton_1_2_1.addActionListener(e -> {
            num = Double.parseDouble(textField_1.getText());
            calculation = 2;
            textField_1.setText("");
            lblNewLabel_1.setText(num + " -");
        });
        btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_3 = new JButton("4");
        btnNewButton_1_3.setFocusable(false);
        btnNewButton_1_3.addActionListener(e -> textField_1.setText(textField_1.getText() + "4"));
        btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_4 = new JButton("5");
        btnNewButton_1_4.setFocusable(false);
        btnNewButton_1_4.addActionListener(e -> textField_1.setText(textField_1.getText() + "5"));
        btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_5 = new JButton("6");
        btnNewButton_1_5.setFocusable(false);
        btnNewButton_1_5.addActionListener(e -> textField_1.setText(textField_1.getText() + "6"));
        btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_6 = new JButton("*");
        btnNewButton_1_6.setFocusable(false);
        btnNewButton_1_6.addActionListener(e -> {
            num = Double.parseDouble(textField_1.getText());
            calculation = 3;
            textField_1.setText("");
            lblNewLabel_1.setText(num + " *");
        });
        btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_7 = new JButton("1");
        btnNewButton_1_7.setFocusable(false);
        btnNewButton_1_7.addActionListener(e -> textField_1.setText(textField_1.getText() + "1"));
        btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_8 = new JButton("2");
        btnNewButton_1_8.setFocusable(false);
        btnNewButton_1_8.addActionListener(e -> textField_1.setText(textField_1.getText() + "2"));
        btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_9 = new JButton("3");
        btnNewButton_1_9.setFocusable(false);
        btnNewButton_1_9.addActionListener(e -> textField_1.setText(textField_1.getText() + "3"));
        btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_10 = new JButton("/");
        btnNewButton_1_10.setFocusable(false);
        btnNewButton_1_10.addActionListener(e -> {
            num = Double.parseDouble(textField_1.getText());
            calculation = 4;
            textField_1.setText("");
            lblNewLabel_1.setText(num + " /");
        });
        btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_11 = new JButton("0");
        btnNewButton_1_11.setFocusable(false);
        btnNewButton_1_11.addActionListener(e -> textField_1.setText(textField_1.getText() + "0"));
        btnNewButton_1_11.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_12 = new JButton(".");
        btnNewButton_1_12.setFocusable(false);
        btnNewButton_1_12.addActionListener(e -> textField_1.setText(textField_1.getText() + "."));
        btnNewButton_1_12.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1_13 = new JButton("=");
        btnNewButton_1_13.setFocusable(false);
        btnNewButton_1_13.addActionListener(e -> {
            arithmetic_operations();
            lblNewLabel_1.setText("");
        });
        btnNewButton_1_13.setFont(new Font("Tahoma", Font.BOLD, 14));

        JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
        rdbtnNewRadioButton.setFocusable(false);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbtnNewRadioButton);
        rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        rdbtnNewRadioButton.addActionListener(e -> {
            textField_1.setEnabled(true);
            btnNewButton_1.setEnabled(true);
            btnNewButton_3.setEnabled(true);
            btnNewButton_1_1.setEnabled(true);
            btnNewButton_1_2.setEnabled(true);
            btnNewButton_1_3.setEnabled(true);
            btnNewButton_1_4.setEnabled(true);
            btnNewButton_1_5.setEnabled(true);
            btnNewButton_1_6.setEnabled(true);
            btnNewButton_1_7.setEnabled(true);
            btnNewButton_1_8.setEnabled(true);
            btnNewButton_1_9.setEnabled(true);
            btnNewButton_1_10.setEnabled(true);
            btnNewButton_1_11.setEnabled(true);
            btnNewButton_1_12.setEnabled(true);
            btnNewButton_1_2_1.setEnabled(true);
            btnC.setEnabled(true);
            btnNewButton.setEnabled(true);
            btnNewButton_1_13.setEnabled(true);
        });

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
        rdbtnNewRadioButton_1.setFocusable(false);
        buttonGroup.add(rdbtnNewRadioButton_1);
        rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        rdbtnNewRadioButton_1.setSelected(true);
        if(rdbtnNewRadioButton_1.isSelected()){
            textField_1.setEnabled(false);
            btnNewButton_1.setEnabled(false);
            btnNewButton_3.setEnabled(false);
            btnNewButton_1_1.setEnabled(false);
            btnNewButton_1_2.setEnabled(false);
            btnNewButton_1_3.setEnabled(false);
            btnNewButton_1_4.setEnabled(false);
            btnNewButton_1_5.setEnabled(false);
            btnNewButton_1_6.setEnabled(false);
            btnNewButton_1_7.setEnabled(false);
            btnNewButton_1_8.setEnabled(false);
            btnNewButton_1_9.setEnabled(false);
            btnNewButton_1_10.setEnabled(false);
            btnNewButton_1_11.setEnabled(false);
            btnNewButton_1_12.setEnabled(false);
            btnNewButton_1_2_1.setEnabled(false);
            btnC.setEnabled(false);
            btnNewButton.setEnabled(false);
            btnNewButton_1_13.setEnabled(false);
        }
        rdbtnNewRadioButton_1.addActionListener(e -> {
            textField_1.setEnabled(false);
            btnNewButton_1.setEnabled(false);
            btnNewButton_3.setEnabled(false);
            btnNewButton_1_1.setEnabled(false);
            btnNewButton_1_2.setEnabled(false);
            btnNewButton_1_3.setEnabled(false);
            btnNewButton_1_4.setEnabled(false);
            btnNewButton_1_5.setEnabled(false);
            btnNewButton_1_6.setEnabled(false);
            btnNewButton_1_7.setEnabled(false);
            btnNewButton_1_8.setEnabled(false);
            btnNewButton_1_9.setEnabled(false);
            btnNewButton_1_10.setEnabled(false);
            btnNewButton_1_11.setEnabled(false);
            btnNewButton_1_12.setEnabled(false);
            btnNewButton_1_2_1.setEnabled(false);
            btnC.setEnabled(false);
            btnNewButton.setEnabled(false);
            btnNewButton_1_13.setEnabled(false);
        });

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(btnNewButton_1_3, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(btnNewButton_1_4, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(btnNewButton_1_5, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(btnNewButton_1_6, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(btnNewButton_1_7, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(btnNewButton_1_8, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(btnNewButton_1_9, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(btnNewButton_1_10, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(btnNewButton_1_11, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(btnNewButton_1_12, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(btnNewButton_1_13, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                                .addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                .addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                                .addComponent(rdbtnNewRadioButton_1, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                                                                .addGap(97)))
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(btnNewButton_1_2_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(3))
                                                        .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
                                                                        .addComponent(textField_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                                .addComponent(rdbtnNewRadioButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(18)
                                                                                .addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                .addComponent(btnC, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(10)
                                                                                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(5)))
                                                .addContainerGap())
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addPreferredGap(ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18))))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addGap(7)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(rdbtnNewRadioButton)
                                        .addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnC, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(rdbtnNewRadioButton_1)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                                .addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnNewButton_1_2_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(btnNewButton_1_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_1_4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_1_5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_1_6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(btnNewButton_1_7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_1_8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_1_9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_1_10, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(btnNewButton_1_11, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_1_12, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_1_13, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                .addGap(27))
        );
        contentPane.setLayout(gl_contentPane);
    }

}
