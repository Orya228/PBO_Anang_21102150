package com.Anang.PBO.Pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame{
    private JTextField NamaTextField;
    private JTextField NimTextField;
    private JComboBox ComboProdi;
    private JTextField TelpTextField;
    private JRadioButton LakiLakiRadioButton;
    private JRadioButton PerempuanRadioButton;
    private JTextArea AlamatTextArea;
    private JButton saveButton;
    private JButton clearButton;
    private JPanel mainPanel;
    private ButtonGroup JK;

    public Registration(){
        super("Folmulir registrasi");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800,600);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NamaTextField.setText("");
                NimTextField.setText("");
                TelpTextField.setText("");
                AlamatTextArea.setText("");
                ComboProdi.setSelectedIndex(0);
                JK.clearSelection();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = NamaTextField.getText();
                String NIM = NimTextField.getText();
                String prodi = (String) ComboProdi.getSelectedItem();
                String telp = TelpTextField.getText();
                String alamat = AlamatTextArea.getText();
                String JK;
                if(LakiLakiRadioButton.isSelected()){
                    JK = "Laki-Laki";
                } else if (PerempuanRadioButton.isSelected()) {
                    JK = "Perempuan";
                }else {
                    JK = "Tidak diketahui";
                }
                //Menampilkan msgbox
                JOptionPane.showMessageDialog
                        (null,"Data berhasil disimpan!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }
}
