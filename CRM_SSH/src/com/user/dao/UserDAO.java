package com.user.dao;

import com.user.bean.User;


public interface UserDAO {
   boolean add(User mUser);
   boolean delete(User mUser);
   boolean change(User mUser);
   boolean query(User mUser);
}
