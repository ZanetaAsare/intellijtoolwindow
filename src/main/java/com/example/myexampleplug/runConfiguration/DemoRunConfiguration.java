package com.example.myexampleplug.runConfiguration;

import com.intellij.execution.BeforeRunTask;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.util.ReflectionUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class DemoRunConfiguration extends RunConfigurationBase{

    private RunConfigurationOptions myOptions;

    protected DemoRunConfiguration(@NotNull Project project, @Nullable ConfigurationFactory factory, @Nullable String name) {
        super(project, factory, name);
    }

    @Override
    public @NotNull SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
        return new DemoSettingsEditor();
    }

    @Override
    public void checkConfiguration() throws RuntimeConfigurationException {

    }

    @Override
    public @Nullable RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) throws ExecutionException {
        return new DemoRunProfileState(environment, getProject());
    }


    @NotNull
    private RunConfigurationOptions createOptions() {
        return (RunConfigurationOptions) ReflectionUtil.newInstance(getOptionsClass());
    }

    @NotNull
    protected RunConfigurationOptions getOptions() {
        return myOptions;
    }

    @Override
    public void setBeforeRunTasks(@NotNull List value) {
        super.setBeforeRunTasks(value);
    }

    @Override
    public @NotNull List<BeforeRunTask<?>> getBeforeRunTasks() {
        return super.getBeforeRunTasks();
    }
}
