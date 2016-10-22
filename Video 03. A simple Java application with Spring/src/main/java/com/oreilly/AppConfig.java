package com.oreilly;

import com.oreilly.entities.BaseballGame;
import com.oreilly.entities.Cubs;
import com.oreilly.entities.Game;
import com.oreilly.entities.RedSox;
import com.oreilly.entities.Team;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Game game() {
        return new BaseballGame(redSox(), cubs());
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
