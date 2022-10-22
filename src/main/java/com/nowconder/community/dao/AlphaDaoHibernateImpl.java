package com.nowconder.community.dao;

import org.springframework.stereotype.Repository;
@Repository("alphaHibernate")
//@Repository //为了能被扫描 能被装配到容器
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
