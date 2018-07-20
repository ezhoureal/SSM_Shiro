package com.Dao;

import com.Pojo.Permission;
import com.Pojo.User;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface ShiroDao {

    /**
     * 根据账号获取相应账户
     * @param username
     * @return UserPojo
     */
    User getUserByUserName(String username);

    /**
     * 根据角色id获取该账号的权限
     * @param roleId
     * @return List
     */
    List<Permission> getPermissionsByRoleId(int roleId);

    /**
     * 根据userId获取角色id
     * @param id
     * @return LIST
     */
    List<Integer> getUserRoleByUserId(int id);

    /**
     * 添加账户
     * @param record
     * @return
     */
    int insert(User record);
    /**
     * 添加账户对应的身份
     * @param map
     * @return
     */
    int insertRole(Map<String,Integer> map);
    /**
     * 添加具有完整信息的账户（包括年龄）
     * @param record
     * @return
     */
    int insertSelective(User record);
    /**
     * 根据id调用相应账户
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);
    /**
     * 调用所有账户
     * @return
     */
    List<User> selectAllUser();
}
