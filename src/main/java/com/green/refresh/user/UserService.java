package com.green.refresh.user;

import com.green.refresh.user.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper mapper;

    @Autowired
    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }

    public int insUser(UserInsDto dto) {
        return mapper.insUser(dto);
    }


    public List<UserSelVo> selUser(int iuser) {
        UserSelDto dto = new UserSelDto();
        dto.setIuser(iuser);
        return mapper.selUser(dto);
    }


    public int updUser(UserUpdDto dto) {
        return mapper.updUser(dto);
    }

    public int delUser(int iuser) {
        UserDelDto dto = new UserDelDto();
        dto.setIuser(iuser);

        return mapper.delUser(dto);
    }
}
