package com.oreilly;

import com.oreilly.entities.BaseballGame;
import com.oreilly.entities.Game;
import com.oreilly.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.oreilly")
public class AppConfig {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private List<Team> teams;

    @Bean
    public Game game() {
        BaseballGame baseballGame = new BaseballGame(teams.get(0), teams.get(1));
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }

}
