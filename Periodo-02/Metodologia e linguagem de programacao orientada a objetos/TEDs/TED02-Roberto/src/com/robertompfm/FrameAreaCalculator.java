package com.robertompfm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameAreaCalculator {
    // constants
    private final int WIDTH = 300;
    private final int HEIGHT = 200;
    private final int LABEL_WIDTH = 100;
    private final int LABEL_HEIGHT = 20;
    private final int FIELD_WIDTH = 100;
    private final int FIELD_HEIGHT = 20;

    // frames, labels, fields and buttons
    private JFrame windowFrame;

    private JLabel lengthLabel;
    private JLabel widthLabel;
    private JLabel frameWidthLabel;
    private JLabel frameAreaLabel;

    private JTextField lengthField;
    private JTextField widthField;
    private JTextField frameWidthField;
    private JTextField frameAreaField;

    private JButton calculateButton;
    private JButton clearButton;
    private JButton exitButton;

    // constructor
    public FrameAreaCalculator() {
        // frame settings
        this.windowFrame = new JFrame("Frame Area Calculator");
        this.windowFrame.setSize(WIDTH, HEIGHT);

        // labels settings
        this.lengthLabel = new JLabel("Length: ", SwingConstants.RIGHT);
        this.lengthLabel.setBounds(50, 10, LABEL_WIDTH, LABEL_HEIGHT);
        this.widthLabel = new JLabel("Width: ", SwingConstants.RIGHT);
        this.widthLabel.setBounds(50, 30, LABEL_WIDTH, LABEL_HEIGHT);
        this.frameWidthLabel = new JLabel("Frame width: ", SwingConstants.RIGHT);
        this.frameWidthLabel.setBounds(50, 50, LABEL_WIDTH, LABEL_HEIGHT);
        this.frameAreaLabel = new JLabel("Frame area: ", SwingConstants.RIGHT);
        this.frameAreaLabel.setBounds(50, 120, LABEL_WIDTH, LABEL_HEIGHT);

        // field settings
        this.lengthField = new JTextField();
        this.lengthField.setBounds(WIDTH / 2, 10, FIELD_WIDTH, FIELD_HEIGHT);
        this.widthField = new JTextField();
        this.widthField.setBounds(WIDTH / 2, 30, FIELD_WIDTH, FIELD_HEIGHT);
        this.frameWidthField = new JTextField();
        this.frameWidthField.setBounds(WIDTH / 2, 50, FIELD_WIDTH, FIELD_HEIGHT);
        this.frameAreaField = new JTextField();
        this.frameAreaField.setBounds(WIDTH / 2, 120, FIELD_WIDTH, FIELD_HEIGHT);
        this.frameAreaField.setEditable(false);

        // button settings
        this.calculateButton = new JButton("Calculate");
        this.calculateButton.setBounds(WIDTH / 2 + 45, 80, 100, 30);
        this.clearButton = new JButton("Clear");
        this.clearButton.setBounds((WIDTH - 90) / 2 - 5, 80, 90, 30);
        this.exitButton = new JButton("Exit");
        this.exitButton.setBounds(WIDTH / 2 - 145, 80, 90, 30);

        // adding components
        this.windowFrame.add(this.lengthLabel);
        this.windowFrame.add(this.widthLabel);
        this.windowFrame.add(this.frameWidthLabel);
        this.windowFrame.add(this.frameAreaLabel);

        this.windowFrame.add(this.lengthField);
        this.windowFrame.add(this.widthField);
        this.windowFrame.add(this.frameWidthField);
        this.windowFrame.add(this.frameAreaField);

        this.windowFrame.add(this.calculateButton);
        this.windowFrame.add(this.clearButton);
        this.windowFrame.add(this.exitButton);

        addListeners();
    }

    public void calculateFrameArea() {
        try {
            double length = Double.parseDouble(this.lengthField.getText());
            double width = Double.parseDouble(this.widthField.getText());
            double frameWidth = Double.parseDouble(this.frameWidthField.getText());

            MyFrame myFrame = new MyFrame(length, width, frameWidth);
            double frameArea = myFrame.getFrameArea();
            this.frameAreaField.setText("" + frameArea);

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this.windowFrame, "Make sure the inputs are numbers in the correct format (e.g. 23.4)");
        }
    }

    public void clearFields() {
        this.lengthField.setText("");
        this.widthField.setText("");
        this.frameWidthField.setText("");
        this.frameAreaField.setText("");
    }

    public void addListeners() {
        // exits the program when the window is closed
        this.windowFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // calculate button action listener
        this.calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFrameArea();
            }
        });

        // clear button action listener
        this.clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        // button exit action listener
        this.exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void initialize() {
        this.windowFrame.setLayout(null);
        this.windowFrame.setVisible(true);
    }

}
