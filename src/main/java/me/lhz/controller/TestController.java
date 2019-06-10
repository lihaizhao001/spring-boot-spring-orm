package me.lhz.controller;

import me.lhz.bo.TTest;
import me.lhz.service.ITTestService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController implements InitializingBean {

    @Autowired
    private ITTestService itTestService;

    @GetMapping("/list")
    public List<TTest> list(){
        return itTestService.list();
    }
    @GetMapping("/save")
    public List<TTest> add(TTest tTest){
        itTestService.save(tTest);
        return itTestService.list();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        itTestService.save(new TTest("killy"));
        itTestService.save(new TTest("amy"));
        itTestService.save(new TTest("louis"));
    }
}
