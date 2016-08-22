package com.user.dao.impl;

import com.user.bean.User;
import com.user.dao.UserDAO;


public class UserDAOImpl implements UserDAO{
    private User mUser;
	public User getmUser() {
		return mUser;
	}

	public void setmUser(User mUser) {
		this.mUser = mUser;
	}

	@Override
	public boolean add(User mUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User mUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean change(User mUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean query(User mUser) {
		// TODO Auto-generated method stub
		return false;
	}

}
