package Assignment_8;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class StudentInformationSystem extends JFrame {
    private JTable studentsTable;
    private JButton add;
    private JTextField ID;
    private JTextField firstName;
    private JTextField lastName;
    private JLabel idLabel;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JRadioButton male;
    private JRadioButton female;
    private JRadioButton unkown;
    private Students students;
    DefaultTableModel tableModel;
    
    enum GENDER {
        MALE, FEMALE, UNKOWN
    }
    
    class Student {
        int id;
        String first;
        String last;
        GENDER gender;
        
        public Student(int id, String first, String last, GENDER gender) {
            this.id = id;
            this.first = first;
            this.last = last;
            this.gender = gender;
        }
    }

    public StudentInformationSystem() {
        createComponents();
        setLayout();
        addComponents();
        setBehaviours();
        display();
    }

    private void createComponents() {
        students = new Students();
        studentsTable = new JTable();
        tableModel = (DefaultTableModel) studentsTable.getModel();
        tableModel.setColumnCount(4);
        tableModel.setColumnIdentifiers(new String[]{"ID", "FirstName", "LastName", "Gender"});
        tableModel.fireTableDataChanged();
        ID = new JTextField(5);
        firstName = new JTextField(10);
        lastName = new JTextField(10);
        idLabel = new JLabel("ID: ");
        firstNameLabel = new JLabel("FirstName: ");
        lastNameLabel = new JLabel("LastName: ");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        unkown = new JRadioButton("Unknown");
        add = new JButton("Add Student");
    }

    private void addComponents() {
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(unkown);
        JScrollPane jsp = new JScrollPane(studentsTable);
        Container con = getContentPane();
        con.add(jsp, BorderLayout.NORTH);
        JPanel p = new JPanel();
        p.add(idLabel);
        p.add(ID);
        p.add(firstNameLabel);
        p.add(firstName);
        p.add(lastNameLabel);
        p.add(lastName);
        p.setPreferredSize(new Dimension(600, 20));
        con.add(p, BorderLayout.CENTER);
        p = new JPanel();
        p.add(male);
        p.add(female);
        p.add(unkown);
        p.add(add);
        p.setPreferredSize(new Dimension(600, 50));
        con.add(p, BorderLayout.SOUTH);
    }

    private void setLayout() {
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
    }

    private void setBehaviours() {
        add.addActionListener(new addListener());
    }

    private void display() {
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new StudentInformationSystem();
    }

    class addListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String id = ID.getText();
            String first = firstName.getText();
            String last = lastName.getText();
            GENDER g;
            if (male.isSelected()) {
                g = GENDER.MALE;
            } else if (female.isSelected()) {
                g = GENDER.FEMALE;
            } else {
                g = GENDER.UNKOWN;
            }
            Student s = new Student(Integer.parseInt(id), first, last, g);
            students.addStudent(s);
            ID.setText("");
            firstName.setText("");
            lastName.setText("");
            tableModel.addRow(new String[]{s.id + "", s.first, s.last, s.gender + ""});
        }
    }

    class Students {
        private Collection<Student> students = new ArrayList<Student>();
        public Collection<Student> getStudents() {
            return students;
        }

        public void addStudent(Student s) {
            students.add(s);
        }

        public int getNumberOfStudents() {
            return getStudents().size();
        }
    }
}