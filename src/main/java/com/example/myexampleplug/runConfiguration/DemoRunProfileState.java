package com.example.myexampleplug.runConfiguration;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.ConfigurationPerRunnerSettings;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.configurations.RunnerSettings;
import com.intellij.execution.filters.TextConsoleBuilder;
import com.intellij.execution.filters.TextConsoleBuilderFactory;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DemoRunProfileState implements RunProfileState {
    private ExecutionEnvironment environment;
    private Project project;

    public DemoRunProfileState(ExecutionEnvironment environment, Project project) {
        this.environment = environment;
        this.project = project;
    }

    @Override
    public @Nullable ExecutionResult execute(Executor executor, @NotNull ProgramRunner<?> runner) throws ExecutionException {
//        DemoProcessHandler handler = DemoProcessHandler.create((DemoRunConfiguration) environment.getRunProfile());
//
//        TextConsoleBuilder builder = TextConsoleBuilderFactory.getInstance().createBuilder(project);
//        final ConsoleView console = builder != null ? builder.getConsole() : null;
//        if (console != null) {
//            console.addMessageFilter(new DemoConsoleFilter(project));
//            console.attachToProcess(handler);
//            handler.setConsole(console);
//        }
//
//        return new DemoExecutionResult(console, handler);
        return null;
    }

    public ConfigurationPerRunnerSettings getConfigurationSettings() {
        return environment.getConfigurationSettings();
    }

    public RunnerSettings getRunnerSettings() {
        return environment.getRunnerSettings();
    }
}
