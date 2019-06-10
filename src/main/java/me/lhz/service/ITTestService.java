package me.lhz.service;

import me.lhz.bo.TTest;

import java.util.List;

public interface ITTestService {
    void save(TTest tTest);
    List<TTest> list();
}
