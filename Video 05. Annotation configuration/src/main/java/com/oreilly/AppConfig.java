package com.oreilly;

import com.oreilly.entities.BaseballGame;
import com.oreilly.entities.Cubs;
import com.oreilly.entities.Game;
import com.oreilly.entities.RedSox;
import com.oreilly.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@Import(InfractureConfig.class)
@ComponentScan(basePackages = "com.oreilly")
public class AppConfig {

    @Autowired
    private DataSource dataSource;

    @Resource
    private Team redSox;

    @Resource
    private Team cubs;

    @Bean
    public Game game(DataSource dataSource) {
        BaseballGame baseballGame = new BaseballGame(redSox, cubs);
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }

    @Bean
    public Team redSox() {
        return new RedSox();
    }

    @Bean
    public Team cubs() {
        return new Cubs();
    }

}
