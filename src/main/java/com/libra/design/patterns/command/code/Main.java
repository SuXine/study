package com.libra.design.patterns.command.code;


import com.libra.design.patterns.command.code.impl.StringCommand;

/**
 * Description:
 *
 * @author sx
 * @date 2021-02-05
 */
public class Main {
    public static void main(String[] args) {
        StringCommand stringCommand = new StringCommand("hello word");
        stringCommand.doit();
        System.out.println(stringCommand.getS());
        stringCommand.undo();
        System.out.println(stringCommand.getS());
        stringCommand.undo();
        System.out.println(stringCommand.getS());
    }
}
