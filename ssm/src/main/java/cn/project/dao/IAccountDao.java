package cn.project.dao;

import cn.project.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户接口
 */
@Repository("accountDao")
public interface IAccountDao {
    /**
     *查询所有
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 根据账户名称查询
     */
    @Select("select * from account where name=#{name}")
    public Account findByName(String name);

    /**
     *保存新账户
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);

    /**
     *修改账户信息
     */
    @Update("update account set name=#{name},money=#{money} where id=#{id}")
    public void updateAccount(Account account);

    /**
     * 根据ID值删除账户
     */
    @Delete("delete from account where id=#{id}")
    public void deleteAccount(int id);
}
