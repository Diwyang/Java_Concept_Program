package com.dj.design.patterns.strategy1.algorithms;

import com.dj.design.patterns.strategy1.strategy.IBaseOperation;

public class MultiplicationOperation implements IBaseOperation {

    @Override
    public int doOperation(int value1, int value2) {
        int mul = value1 * value2;

        return mul;
    }

}
