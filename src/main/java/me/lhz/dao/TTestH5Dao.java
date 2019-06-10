package me.lhz.dao;

import me.lhz.bo.TTest;

import java.util.List;

public interface TTestH5Dao {
    void save(TTest tTest);
    List<TTest> list();
}
