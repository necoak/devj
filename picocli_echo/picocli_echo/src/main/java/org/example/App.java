package org.example;

import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * Hello world!
 *
 */
@CommandLine.Command(name =  "echo")
public class App  implements Callable<Integer> {

    @CommandLine.Parameters(paramLabel = "Message")
    String message;

    @Override
    public Integer call()  {
        System.out.println(message);
        return 0;
    }

    public static void main( String[] args ) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}
