package cn.project.service.impl;

import cn.project.dao.IAccountDao;
import cn.project.domain.Account;
import cn.project.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("accountService")
public class AccountService implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findByName(String name) {
        return accountDao.findByName(name);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(int id) {
        accountDao.deleteAccount(id);
    }
}
