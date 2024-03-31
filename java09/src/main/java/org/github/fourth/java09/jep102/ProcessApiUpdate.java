package org.github.fourth.java09.jep102;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.IOException;

/**
 * https://openjdk.org/jeps/102
 * 增强Process相关API：获取进程信息
 */
@SuppressFBWarnings("DLS_DEAD_LOCAL_STORE")
public class ProcessApiUpdate {
    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", "echo 'exec new process'");
        Process process = processBuilder.start();

        long pid = process.pid(); // 子进程的pid
        System.out.println(pid);
        ProcessHandle.Info info = process.info(); // 子进程的相关信息
    }
}
