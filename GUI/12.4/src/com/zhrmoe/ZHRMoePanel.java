package com.zhrmoe;

import javax.swing.*;

/**
 * Created by ZHRMoe on 15/4/15.
 */
public class ZHRMoePanel extends JPanel {

    public JButton button1;
    public JButton button2;
    public JButton button3;

    public String str1;
    public String str2;
    public String str3;


    public ZHRMoePanel(int i) {
        str1 = String.format("Button %d", i * 3 + 1);
        str2 = String.format("Button %d", i * 3 + 2);
        str3 = String.format("Button %d", i * 3 + 3);
        button1 = new JButton(str1);
        button2 = new JButton(str2);
        button3 = new JButton(str3);
        this.add(button1);
        this.add(button2);
        this.add(button3);
    }
}
