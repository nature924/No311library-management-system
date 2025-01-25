package com.library.bean;

/**
 * Author: JieYuDa
 * Desc:
 * File created at 2019/11/19
 */
public class LendDate extends Lend {
    private String lendDateStr;
    private String backDateStr;

    public String getLendDateStr() {
        return lendDateStr;
    }

    public void setLendDateStr(String lendDateStr) {
        this.lendDateStr = lendDateStr;
    }

    public String getBackDateStr() {
        return backDateStr;
    }

    public void setBackDateStr(String backDateStr) {
        this.backDateStr = backDateStr;
    }
}
