package com.video.server.mapper;


import com.video.server.domain.Sms;
import com.video.server.domain.SmsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmsMapper {
    long countByExample(SmsExample example);

    int deleteByExample(SmsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sms record);

    int insertSelective(Sms record);

    List<Sms> selectByExample(SmsExample example);

    Sms selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sms record, @Param("example") SmsExample example);

    int updateByExample(@Param("record") Sms record, @Param("example") SmsExample example);

    int updateByPrimaryKeySelective(Sms record);

    int updateByPrimaryKey(Sms record);
}