package smsManager.dao;

import smsManager.entity.SmsValidate;

public interface SmsValidateMapper {
    int deleteByPrimaryKey(String id);

    int insert(SmsValidate record);

    int insertSelective(SmsValidate record);

    SmsValidate selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SmsValidate record);

    int updateByPrimaryKey(SmsValidate record);
}