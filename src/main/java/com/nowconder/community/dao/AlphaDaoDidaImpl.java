package com.nowconder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("fromMy")
public class AlphaDaoDidaImpl implements AlphaDao{
    @Override
    public String select() {
        return "From myself";
    }
}
