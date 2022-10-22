package com.nowconder.community.service;

import com.nowconder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service //业务组件
//演示bean的初始化、销毁管理
//@Scope("singleton")//默认
//@Scope("prototype")
public class AlphaService {
    public AlphaService(){
        System.out.println("实例化AlphaService");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化AlphaService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁AlphaService");
    }

    @Autowired
    private AlphaDao alphaDao;
    public String find(){
        return alphaDao.select();
    }

    @Autowired
    @Qualifier("fromMy")
    private AlphaDao alphaDao1;
    public String find1(){
        return alphaDao1.select();
    }
}
