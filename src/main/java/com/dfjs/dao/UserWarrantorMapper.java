package com.dfjs.dao;

import com.dfjs.entity.UserWarrantor;
import com.dfjs.entity.UserWarrantorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWarrantorMapper {
    long countByExample(UserWarrantorExample example);

    int deleteByExample(UserWarrantorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserWarrantor record);

    int insertSelective(UserWarrantor record);

    List<UserWarrantor> selectByExample(UserWarrantorExample example);

    UserWarrantor selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserWarrantor record, @Param("example") UserWarrantorExample example);

    int updateByExample(@Param("record") UserWarrantor record, @Param("example") UserWarrantorExample example);

    int updateByPrimaryKeySelective(UserWarrantor record);

    int updateByPrimaryKey(UserWarrantor record);
}