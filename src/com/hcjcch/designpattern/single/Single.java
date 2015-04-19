package com.hcjcch.designpattern.single;

/**
 * Created by hcjcch on 2015/4/1.
 */

public class Single {
    private static Single single = null;

    private Single() {

    }

    public static Single getInstance() {
        if (single == null) {
            single = new Single();
        }
        return single;
    }
}