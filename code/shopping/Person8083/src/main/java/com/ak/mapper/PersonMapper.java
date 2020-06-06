package com.ak.mapper;

import com.ak.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonMapper {

    /**
     * 表示登录
     *
     * @param user_id
     * @param user_password
     * @return
     */
    int CheckLogin(@Param("user_id") int user_id, @Param("user_password") String user_password);

    /**
     * 返回的是刚刚插入的主键值
     * @param p
     * @return
     */
    int AddPerson(Person p);

    /**
     * 根据用户 的id 来查找用户信息
     * @param id
     * @return
     */
    Person FindPersonById(int id);

    /**
     * 修改用户 信息
     * @param person
     * @return
     */
    int ModifyPerson(Person person);

    /**
     * 根据 用户等级，查找所有用户
     * @param user_lev
     * @return
     */
    List<Person> FindPersonAll(int user_lev);

    /**
     * 删除 用户
     * @param user_id
     * @return
     */
    int DeletePerson(int user_id);

    /**
     * 修改钱
     *
     * @param user_money
     * @param user_id
     * @return
     */
    int AddMoney(@Param("user_money") Double user_money, @Param("user_id") int user_id);

    int findid();
}
