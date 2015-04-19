package com.hcjcch.designpattern.templatedesignpatten.test2;

import com.hcjcch.designpattern.templatedesignpatten.test2.Account;

/**
 * Created by hcjcch on 2015/4/19.
 */
public class MoneyMarketAccount extends Account {
    @Override
    protected String doCalculateAccountType() {

        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {

        return 0.045;
    }
}