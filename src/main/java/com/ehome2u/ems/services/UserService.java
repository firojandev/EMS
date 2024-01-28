package com.ehome2u.ems.services;

import com.ehome2u.ems.model.UserModel;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    List<UserModel> getAll();
    Page<UserModel> get(int page, int size);
}
