package dev.sabri;

import java.io.FileNotFoundException;

public class ExceptionChallenge {
    public static void main(String... args) {
       String s = "-";
        try {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            try {
                try {
                    throw new FileNotFoundException();
                } catch (RuntimeException ex) {
                    s += "run";
                }
                throw new NullPointerException();
            } catch (Exception x) {
                s += "exec";
            } finally {
                s += "fin";
            }
        } finally {
            s += "of";
            try {
                throw new VirtualMachineError("JVMError") {
                };
            } catch (Error err) {
                s += "error" + err.getMessage();
            }
        }
        System.out.println("s = " + s);
    }
}
