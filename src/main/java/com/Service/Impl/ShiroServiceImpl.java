package com.Service.Impl;

import com.Dao.ShiroDao;
import com.Pojo.Permission;
import com.Pojo.User;
import com.Service.ShiroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/10.
 */
@Service("shiroService")
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private ShiroDao shiroDao;

    public User getUserByUserName(String username) {
        //根据用户名获取账户
        User user = shiroDao.getUserByUserName(username);
        return user;
    }

    public List<Permission> getPermissionsByUser(User user) {
        //获取到用户角色userRole
        List<Integer> roleId = shiroDao.getUserRoleByUserId(user.getId());
        List<Permission> perArrary = new ArrayList<>();

        if (roleId!=null&&roleId.size()!=0) {
            //根据roleid获取peimission
            for (Integer i : roleId) {
                perArrary.addAll(shiroDao.getPermissionsByRoleId(i));
            }
        }

        System.out.println(perArrary);
        return perArrary;
    }
    public User getUserById(int userId) {
		return this.shiroDao.selectByPrimaryKey(userId);
	}
	public void insert(String name, String password, String role) throws Exception {
		User user = new User();
		user.setAccount(name);
		user.setPassword(password);
		
		User search = shiroDao.getUserByUserName(name);
		if (search!=null) {
			throw new Exception("Username already exists");
		}
		
		this.shiroDao.insert(user);
		//添加到对应角色表
		User justAdded = getUserByUserName(name);
		int userId =justAdded.getId();
		//普通用户为2
		int roleId = 2;
		if (role.equals("admin")) {
			roleId = 1;
		}
		insertRole(userId,roleId);
	}
	public void insertRole(int userId, int roleId){
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("userId", userId);
		map.put("roleId", roleId);
		this.shiroDao.insertRole(map);
	}
	public List<User> getAllUsers(){
		List<User> lists = new ArrayList<User>();
		lists = shiroDao.selectAllUser();
		return lists;
	}
}
