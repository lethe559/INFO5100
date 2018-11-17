
package Assignment_8;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}

public class Calculator extends JFrame {
    private JButton nums[];
    private JButton add, subtract, multiply, divide, calculate, clear;
    private JTextField resultTextField;
    private Operation o;
    private int first;
    private int second;
    private String stringNum1 = "";
    private String stringNum2 = "";
    private Font font;
    private boolean isSecond = false;

    public Calculator() {
        createComponents();
        setLayout();
        addComponent();
        addBehaviorToComponent();
        display();
    }

    private void createComponents() {
        font = new Font("TimesNewRoman", Font.PLAIN, 30);
        nums = new JButton[10];
        for (int i = 0; i <= 9; i++) {
            nums[i] = new JButton(String.valueOf(i));
            nums[i].setFont(font);
        }

        add = new JButton("+");
        add.setFont(font);
        subtract = new JButton("-");
        subtract.setFont(font);
        multiply = new JButton("×");
        multiply.setFont(font);
        divide = new JButton("÷");
        divide.setFont(font);
        calculate = new JButton("=");
        calculate.setFont(font);
        resultTextField = new JTextField(8);
        resultTextField.setSize(300,30);
        resultTextField.setFont(font);
        clear = new JButton("C");
        clear.setFont(font);
    }

    private void setLayout() {
        GridLayout gl = new GridLayout(5, 4);
        Container c = this.getContentPane();
        c.setLayout(gl);
    }

    private void addComponent() {
        Container c = getContentPane(); 
        JPanel p = new JPanel();
        p.add(nums[7]);
        p.add(nums[8]);
        p.add(nums[9]);
        p.add(add);
        c.add(p);
        p = new JPanel();
        p.add(nums[4]);
        p.add(nums[5]);
        p.add(nums[6]);
        p.add(subtract);
        c.add(p);
        p = new JPanel();
        p.add(nums[1]);
        p.add(nums[2]);
        p.add(nums[3]);
        p.add(multiply);
        c.add(p);
        p = new JPanel();
        p.add(nums[0]);
        p.add(calculate);
        p.add(clear);
        p.add(divide);
        c.add(p);
        p = new JPanel();
        p.add(resultTextField);
        c.add(p);
    }

    class NumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!isSecond) {
                stringNum1 += ((JButton) e.getSource()).getText();
                first = Integer.parseInt(stringNum1);
            } else {
                stringNum2 += ((JButton) e.getSource()).getText();
                second = Integer.parseInt(stringNum2);
            }
        }
    }

    class OperatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            isSecond = true;
            if (e.getSource() == add) {
                o = Operation.ADD;
            }
            if (e.getSource() == subtract) {
                o = Operation.SUBTRACT;
            }
            if (e.getSource() == multiply) {
                o = Operation.MULTIPLY;
            }
            if (e.getSource() == divide) {
                o = Operation.DIVIDE;
            }
            if (e.getSource() == clear) {
                resultTextField.setText("");
                isSecond = false;
                stringNum1="";
                stringNum2="";
            }
        }
    }

    class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int result;
            if (o == Operation.ADD) {
                result = first + second;
                resultTextField.setText(first + " + " + second + " = " + result);
            }
            if (o == Operation.SUBTRACT) {
                result = first - second;
                resultTextField.setText(first + " - " + second + " = " + result);
            }
            if (o == Operation.MULTIPLY) {
                result = first * second;
                resultTextField.setText(first + " × " + second + " = " + result);
            }
            if (o == Operation.DIVIDE) {
                result = first / second;
                resultTextField.setText(first + " ÷ " + second + " = " + result);
            }
        }
    }


    private void addBehaviorToComponent() {
        NumberListener nl = new NumberListener();
        for (int i = 0; i < 10; i++) {
            nums[i].addActionListener(nl);
        }
        OperatorListener ol = new OperatorListener();
        add.addActionListener(ol);
        subtract.addActionListener(ol);
        multiply.addActionListener(ol);
        divide.addActionListener(ol);
        clear.addActionListener(ol);
        CalculateListener cl = new CalculateListener();
        calculate.addActionListener(cl);
    }

    private void display() {
        setSize(600, 600);
        setVisible(true);
    }

    public static void main(String args[]) {
        Calculator cal = new Calculator();
    }
}