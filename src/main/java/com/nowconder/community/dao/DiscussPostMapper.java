package com.nowconder.community.dao;

import com.nowconder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    // @Param用于添加别名
    // 如果只有一个参数 并且的sql语句中的<if>中使用 则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
