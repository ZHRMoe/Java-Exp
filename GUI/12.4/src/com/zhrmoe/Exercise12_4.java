package com.zhrmoe;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ZHRMoe on 15/4/15.
 */
public class Exercise12_4 extends JFrame {

    ZHRMoePanel panel1 = new ZHRMoePanel(0);
    ZHRMoePanel panel2 = new ZHRMoePanel(1);

    public Exercise12_4() {
        this.setSize(650, 60);
        this.setLayout(new GridLayout(1, 2));
        this.add(panel1);
        this.add(panel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Exercise 4");
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise12_4();
    }
}
