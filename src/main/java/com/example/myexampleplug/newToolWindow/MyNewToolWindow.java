package com.example.myexampleplug.newToolWindow;

import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.components.JBTabbedPane;

import javax.swing.*;

public class MyNewToolWindow {
    private JPanel panel;
    private JBTabbedPane tabbedPane;

    public MyNewToolWindow(ToolWindow toolWindow) {
        tabbedPane = new JBTabbedPane();

        JPanel p1 = new JPanel();
        p1.add(new JLabel("Content 1"));
        JPanel p2 = new JPanel();
        p2.add(new JLabel("Content 2"));

        tabbedPane.setBounds(50,50,200,200);
        tabbedPane.add("Content 1", p1);
        tabbedPane.add("Content 2", p2);

//        panel = new JPanel();
//        panel.add(tabbedPane);
    }


    public JBTabbedPane getContent(){
        return this.tabbedPane;
    }

}
