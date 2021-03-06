package com.mrliu.www.strategy.quarter.number.impl;

import com.mrliu.www.enums.Quarter;
import com.mrliu.www.strategy.quarter.number.QuarterNumberStrategy;

import java.time.LocalDate;
import java.time.Month;

/**
 * 第二季度
 *
 * @author liuyangos8888
 */
public class SecondQuarter implements QuarterNumberStrategy {

    /**
     * 获取第二季度
     *
     * @param localDate 传入时间
     * @return 季度
     */
    @Override
    public Quarter getQuarterNumber(LocalDate localDate) {

        return Quarter.SECOND;

    }
}
