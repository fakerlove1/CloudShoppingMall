package com.ak.mapper;

import com.ak.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonMapper {

    /**
     * 修改钱
     * @param user_money  修改钱的数目
     * @param user_id  修改钱的 id
     * @return
     */
    int ModifyMoney(@Param("user_money") Double user_money, @Param("user_id") int user_id);

    /**
     * 根据用户 的id 来查找用户信息
     * @param id
     * @return
     */
    Person FindPersonById(int id);

    /**
     * 添加钱
     * @param money 需要添加 的钱 ,
     * @param user_id  被添加钱的用户
     * @return
     */
    int AddMoney(@Param("money") Double money ,@Param("user_id") int user_id);

    int MinMoney(@Param("money") Double money ,@Param("user_id") int user_id);

}
