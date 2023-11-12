package com.ray.usercenter.service;

import com.ray.usercenter.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ray.usercenter.model.domain.User;

/**
* @author lil ray
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2023-11-10 15:29:41
*/
public interface TeamService extends IService<Team> {


    /**
     * 创建队伍
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

}