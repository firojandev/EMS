package com.ehome2u.ems.services.impl;

import com.ehome2u.ems.model.UserModel;
import com.ehome2u.ems.repository.UserRepository;
import com.ehome2u.ems.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository mUserRepository;

    @Override
    public List<UserModel> getAll() {
        return mUserRepository.findAll();
    }

    @Override
    public Page<UserModel> get(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return mUserRepository.findAll(pageable);
    }
}
