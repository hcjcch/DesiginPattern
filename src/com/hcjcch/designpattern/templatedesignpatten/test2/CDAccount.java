package com.hcjcch.designpattern.templatedesignpatten.test2;


/**
 * Created by hcjcch on 2015/4/19.
 */

public class CDAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}