package com.Service;

import com.Pojo.Permission;
import com.Pojo.User;

import java.util.List;

public interface ShiroService {

    /**
     * 根据账号获取账号密码
     * @param username
     * @return UserPojo
     */
     User getUserByUserName(String username);

    /**
     * 根据账号获取该账号的权限
     *
     * @param user
     * @return List
     */
    List<Permission> getPermissionsByUser(User user);
    /**
     * 根据id获得账户
     * @param userId
     * @return
     */
    User getUserById(int userId);
    /**
     * 添加账号
     * @param name
     * @param password
     * @param role
     * @throws Exception
     */
	void insert(String name, String password, String role) throws Exception;
	/**
	 * 添加用户的角色信息
	 * @param userId
	 * @param roleId
	 */
	void insertRole(int userId, int roleId);
	/**
	 * 获得所有用户
	 * @return
	 */
	List<User> getAllUsers();
}
