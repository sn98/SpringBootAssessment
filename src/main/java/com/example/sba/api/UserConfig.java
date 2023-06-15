//package com.example.sba.api;
//
//import com.example.sba.api.model.User;
//import com.example.sba.api.repositories.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class UserConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(UserRepository repository){
//        return args -> {
//            User sean = new User(
//                    "12345678",
//                    0,
//                    "sean",
//                    "seangayle995@gmail.com"
//            );
//            User john = new User(
//                    "12345678",
//                    0,
//                    "john",
//                    "johngayle995@gmail.com"
//            );
//
//            repository.saveAll(
//                    List.of(sean, john)
//            );
//        };
//    }
//}
