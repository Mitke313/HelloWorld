package org.etsntesla.it;
import static org.etsntesla.it.RunShellCommand.execute;

public class Main {
    public static void main(String[] args) {
        execute(new String[]{"dir","/p"});
    }
}