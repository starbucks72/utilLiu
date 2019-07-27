package com.mrliu.www.strategy.impl;

import com.mrliu.www.enums.WeekOfDayEnum;
import com.mrliu.www.strategy.Strategy;

/**
 * @author liuyangos8888
 */
public class MondayStrategy implements Strategy {


    /**
     * 周一的返回数字
     *
     * @param dayOfWeek 星期几
     * @return 周一的返回数字
     */
    @Override
    public Integer getWeekNumber(String dayOfWeek) {

        if (dayOfWeek.equals(WeekOfDayEnum.DAY_MONDAY.weekDay())) {
            return WeekOfDayEnum.DAY_MONDAY.number();
        }

        return 0;
    }

    /**
     * 数字返回周一
     *
     * @param dayOfWeek 数字（1-7）
     * @return 数字返回周一
     */
    @Override
    public String getWeekChineseName(Integer dayOfWeek) {

        if (dayOfWeek.equals(WeekOfDayEnum.DAY_MONDAY.number())) {
            return WeekOfDayEnum.DAY_MONDAY.weekDay();
        }

        return "输入的不是1-7的数字，不在合法星期范围内";
    }
}
