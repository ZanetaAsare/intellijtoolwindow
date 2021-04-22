package com.example.myexampleplug.runConfiguration;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.ui.ConsoleView;
import org.jetbrains.annotations.NotNull;

public class DemoProcessHandler extends OSProcessHandler {
    public DemoProcessHandler(@NotNull GeneralCommandLine commandLine) throws ExecutionException {
        super(commandLine);
    }

    public DemoProcessHandler(@NotNull Process process, String commandLine) {
        super(process, commandLine);
    }


//    public static DemoProcessHandler create(DemoRunConfiguration config) throws ExecutionException {
//
//    }

    public void setConsole(ConsoleView console) {
    }
}
