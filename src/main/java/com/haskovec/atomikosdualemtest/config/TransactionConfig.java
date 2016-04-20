package com.haskovec.atomikosdualemtest.config;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

/**
 * Created by jhaskovec on 4/20/16.
 */
@Configuration
@EnableTransactionManagement
public class TransactionConfig implements TransactionManagementConfigurer {

	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		final UserTransaction userTransaction = new UserTransactionImp();
		final TransactionManager transactionManager = new UserTransactionManager();

		final JtaTransactionManager jtaTransactionManager = new JtaTransactionManager(userTransaction, transactionManager);

		return jtaTransactionManager;
	}

}
