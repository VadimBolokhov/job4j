package ru.job4j.tracker;

import java.util.Scanner;

/**
 * ConsoleInput.
 * @author Vadim Bolokhov
 * @version $Id$
 * @since 0.1
 */
public class ConsoleInput implements Input {
    /** Считывание консольного ввода пользователя */
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
