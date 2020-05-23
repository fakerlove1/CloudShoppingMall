package com.joker.personprovider8081.mapper;

import com.joker.common.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PersonMapper {

    /**
     *  表示登录
     * @param user_id
     * @param user_password
     * @return
     */
     int CheckLogin(@Param("user_id") String user_id,@Param("user_password") String user_password);

     int AddPerson(Person p);
     Person FindPersonById(int id);
     int FindPersonALl();
     int DeletePerson(int user_id);
}
