package com.example.demo.batch.jobs;


import com.example.demo.batch.domain.User;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by KimYJ on 2018-04-02.
 */
public class InactiveItemProcessor implements ItemProcessor<User, User> {

    @Override
    public User process(User user) {
        return user.setInactive();
    }
}
