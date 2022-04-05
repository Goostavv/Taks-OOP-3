/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskoop3;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Gustav
 */
public class GUI extends JFrame implements ActionListener {
    
    JLabel LTitle = new JLabel("Cuboid Calculator");
    
    JLabel LLenght = new JLabel("Lenght");
    JTextField textFieldLenght = new JTextField(5);
    JLabel LWidth = new JLabel("Width");
    JTextField textFieldWidht = new JTextField(5); 
    JLabel labelHeight = new JLabel("Height");
    JTextField textFieldHeight = new JTextField(5);
       
    JLabel LResult = new JLabel("Result :");
    JLabel LArea = new JLabel();
    JLabel LCircumference = new JLabel();
    JLabel LSurfaceArea = new JLabel();
    JLabel LVolume = new JLabel();
       
    JButton buttonCalculate = new JButton("Calculate");
    JButton buttonReset = new JButton("Reset");

    public GUI() {
        setTitle("Cuboid Calculator");
           
        setSize(500, 500);
        setLayout(null);
        add(LTitle);
        add(LLenght);
        add(textFieldLenght);
        add(LWidth);
        add(textFieldWidht);
        add(labelHeight);
        add(textFieldHeight);
        
        add(LResult);
        add(LArea);
        add(LCircumference);
        add(LSurfaceArea);
        add(LVolume);
        
        add(buttonCalculate);
        add(buttonReset);
           
       
        LTitle.setBounds(200,5,140,30);
        LLenght.setBounds(50,40,100,20);
        textFieldLenght.setBounds(130,40,150,20);
        LWidth.setBounds(50,70,100,20);
        textFieldWidht.setBounds(130,70,150,20);
        labelHeight.setBounds(50,100,100,20);
        textFieldHeight.setBounds(130,100,150,20);
       
        LResult.setBounds(30,150,100,30);
        LArea.setBounds(30,200,200,30);
        LCircumference.setBounds(30,215,200,30);
        LVolume.setBounds(30,230,200,30);
        LSurfaceArea.setBounds(30,245,200,30);
        
        buttonCalculate.setBounds(100,300,100,20);
        buttonReset.setBounds(250,300,100,20);
           
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
       
        buttonCalculate.addActionListener(this);
        buttonReset.addActionListener(this);
       }
       
    @Override
    public void actionPerformed(ActionEvent e){
        double lenght, Width, height;
           
        if (e.getSource() == buttonCalculate) {
            if (textFieldLenght.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lenght can not be empty!");
            } else if (textFieldWidht.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Width can not be empty!");
            } else if (textFieldHeight.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Height can not be empty!");
            } else {
                try {
                    lenght = Double.parseDouble(textFieldLenght.getText());
                    Width = Double.parseDouble(textFieldWidht.getText());
                    height = Double.parseDouble(textFieldHeight.getText());
                    
                    Cuboid cuboid = new Cuboid(lenght, Width, height);
                    
                    LArea.setText("Rectangle Area                      : " + cuboid.Area());
                    LCircumference.setText("Rectangle Circumference   : " + cuboid.Circumference());
                    LVolume.setText("Cuboid Volume                       : " + cuboid.volume());
                    LSurfaceArea.setText("Cuboid Surface Area            : " + cuboid.surfacearea());
                } catch(NumberFormatException err){
                    JOptionPane.showMessageDialog(this, "Please only input a number !!!");
                }
            }
        }
           
        if (e.getSource() == buttonReset) {
            LArea.setText(" ");
            LCircumference.setText(" ");
            LSurfaceArea.setText(" ");
            LVolume.setText(" ");
            textFieldLenght.setText("");
            textFieldWidht.setText("");
            textFieldHeight.setText("");
        }
    }
}
