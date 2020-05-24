package goodsprovider.mapper;

import common.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonMapper {

    /**
     * 修改钱
     * @param user_money
     * @param user_id
     * @return
     */
    int AddMoney(@Param("user_money") Double user_money, @Param("user_id") int user_id);

    /**
     * 根据用户 的id 来查找用户信息
     * @param id
     * @return
     */
    Person FindPersonById(int id);
}
