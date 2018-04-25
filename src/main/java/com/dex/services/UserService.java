package com.dex.services;

import com.dex.model.User;

public interface UserService {
    User findUserByCredentials(User user);
}
