package com.example.myexampleplug.toolWindow;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;


public class MyToolWindow {
    private JLabel label;
    private JButton button;
    private JPanel panel;
    private JPanel newPanel;
    private int count = 0;

    public MyToolWindow(ToolWindow toolWindow) {

        button = new JButton("Click me");
        button.addActionListener(e -> incrementCount());

        label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        panel.add(button);
        panel.add(label);

        newPanel = new JPanel();
        JLabel newLabel = new JLabel("New content in new tab");
        newPanel.add(newLabel);

    }

    public void incrementCount(){
        count++;
        label.setText("Number of clicks: " + count);
    }

    public JPanel getContent() {
        return this.panel;
    }

    public JPanel getNewContent(){
        return this.newPanel;
    }
}
