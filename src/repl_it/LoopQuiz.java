package repl_it;


import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class LoopQuiz {



    public static void main(String[] args) {

        try {
            String satr = "java";
            System.out.println(satr.charAt(20));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("a");
        } catch (NullPointerException e) {
            System.out.println("b");
        }
        try {
            String satr = "java";
            System.out.println(satr.charAt(20));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("a");
        } catch (NullPointerException e) {
            System.out.println("b");
        } finally {
            System.out.println("c");

        }

    }}












