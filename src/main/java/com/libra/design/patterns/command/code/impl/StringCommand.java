package com.libra.design.patterns.command.code.impl;

import com.libra.design.patterns.command.code.Command;

/**
 * Description: 字符串操作类
 *
 * @author sx
 * @date 2021-02-05
 */
public class StringCommand implements Command {

    private String s;

    private Boolean isDo = Boolean.FALSE;

    public StringCommand(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    @Override
    public void doit() {
        this.isDo = Boolean.TRUE;
        this.s = "【" + getS() + "】";
    }

    @Override
    public void undo() {
        if (isDo) {
            this.s = getS().substring(1, this.s.length()-1);
            this.isDo = Boolean.FALSE;
        }else {
            throw new RuntimeException("没有操作");
        }
    }
}
