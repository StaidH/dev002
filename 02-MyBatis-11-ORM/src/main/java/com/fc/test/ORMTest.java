package com.fc.test;

import com.fc.dao.AccountDao;
import com.fc.entity.Account;
import com.fc.entity.TAccount;
import com.fc.util.MybatisUtil;
import org.junit.Test;

import java.util.List;

public class ORMTest {
    @Test
    public void testCamelCase(){
        AccountDao accountDao = MybatisUtil.getMapper(AccountDao.class);

        List<TAccount> accounts = accountDao.findAllByCamelCase();

        for (TAccount account : accounts){
            System.out.println(account);
        }

        MybatisUtil.commit();
    }

    @Test
    public void testMap(){
        AccountDao accountDao = MybatisUtil.getMapper(AccountDao.class);

        Account account=accountDao.findById();

        System.out.println(account);

        MybatisUtil.commit();
    }

    @Test
    public void testAlias() {
        AccountDao accountDao = MybatisUtil.getMapper(AccountDao.class);

        List<Account> accounts = accountDao.findAll();

        for (Account account : accounts) {
            System.out.println(account);
        }

        MybatisUtil.commit();
    }
}

