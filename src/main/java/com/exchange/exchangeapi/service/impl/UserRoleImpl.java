package com.exchange.exchangeapi.service.impl;

import com.exchange.exchangeapi.entity.User;
import com.exchange.exchangeapi.entity.UserRole;
import com.exchange.exchangeapi.repo.UserRepo;
import com.exchange.exchangeapi.repo.UserRoleRepo;
import com.exchange.exchangeapi.service.UserRoleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserRoleImpl implements UserRoleService {
    private final UserRoleRepo userRoleRepo;
    private final UserRepo userRepo;
    @Autowired
    public UserRoleImpl(UserRoleRepo userRoleRepo, UserRepo userRepo) {
        this.userRoleRepo = userRoleRepo;
        this.userRepo = userRepo;
    }

    @Override
    public void initializeRole() {
        // save user role => issue ***
        // user (admin)
        List<UserRole> userRoles = userRoleRepo.findAll();
        if(userRoles.isEmpty()){
            UserRole role1 = new UserRole("UR-1","ADMIN","Super Privileges",null);
            UserRole role2 = new UserRole("UR-2","MANAGER","Management Privileges",null);
            UserRole role3 = new UserRole("UR-3","USER","Regular User",null);

            userRoleRepo.saveAll(List.of(role1, role2, role3));
        }
        userRepo.findUserById
        //save default user (admin)


    }
}
