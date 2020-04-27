package cn.project.service;

import cn.project.domain.Account;

import java.util.List;

public interface IAccountService {

    /**
     *查询所有
     */
    public List<Account> findAll();

    /**
     * 根据账户名称查询
     */
    public Account findByName(String name);

    /**
     *保存新账户
     */
    public void saveAccount(Account account);

    /**
     *修改账户信息
     */
    public void updateAccount(Account account);

    /**
     * 根据ID值删除账户
     */
    public void deleteAccount(int id);
}
