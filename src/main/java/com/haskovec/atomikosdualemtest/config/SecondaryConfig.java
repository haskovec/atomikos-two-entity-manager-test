package com.haskovec.atomikosdualemtest.config;

import com.haskovec.atomikosdualemtest.domain.secondarydb.Secondary;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by jhaskovec on 4/15/16.
 */
@Configuration
@EnableJpaRepositories(basePackageClasses = {Secondary.class},
		entityManagerFactoryRef = "secondaryEntityManagerFactory")
public class SecondaryConfig {
}
