package me.lhz.service.impl;

import me.lhz.bo.TTest;
import me.lhz.dao.TTestH5Dao;
import me.lhz.service.ITTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TTestServiceImpl implements ITTestService {

    @Autowired
    private TTestH5Dao tTestH5Dao;

    @Override
    @Transactional(readOnly = false)
    public void save(TTest tTest) {
        tTestH5Dao.save(tTest);
    }

    @Override
    @Transactional(readOnly = false)
    public List<TTest> list() {
        return tTestH5Dao.list();
    }
}
