package com.komarov884.vocabulator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

/**
 * PopulatorConfig.
 *
 * @author Vasilii_Komarov
 */
@Profile("initdata") //TODO: Think out!
@Configuration
public class PopulatorConfig {

    @Bean
    public Jackson2RepositoryPopulatorFactoryBean repositoryPopulator() {
        Resource sourceData = new ClassPathResource("init-data/irregular-verbs/b/irregular-verbs-b.json");
        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources(new Resource[] { sourceData });
        return factory;
    }

}
