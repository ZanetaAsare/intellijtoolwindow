package com.example.myexampleplug.runConfiguration;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.ComponentWithBrowseButton;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DemoSettingsEditor extends SettingsEditor<DemoRunConfiguration> {
    private JPanel myPanel;
    private LabeledComponent<ComponentWithBrowseButton> myMainClass;


    @Override
    protected void resetEditorFrom(@NotNull DemoRunConfiguration s) {

    }

    @Override
    protected void applyEditorTo(@NotNull DemoRunConfiguration s) throws ConfigurationException {

    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        myPanel = new JPanel();
        return myPanel;
    }

    private void createUIComponents() {
        myMainClass = new LabeledComponent<ComponentWithBrowseButton>();
        myMainClass.setComponent(new TextFieldWithBrowseButton());
    }
}
