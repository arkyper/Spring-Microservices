
package com.ark.user.service.services;

import com.ark.user.service.entities.User;
import java.util.List;


public interface UserService {

    

    // Create User
    User saveUser(User user);

    // Get All Users
    List<User> getAllUsers();

    // Get Single User by UserID
    User getUser(String userId);

    // Update User
    User updateUser(User user);

    // Delete User
    void deleteUser(String userId);

}
