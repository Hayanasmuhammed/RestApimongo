package com.example.Restapi.UserService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Restapi.Model.User;
import com.example.Restapi.Repository.UserRepository;
import com.example.Restapi.UserReq.UserReq;

@Service

public class UserService {

	@Autowired
	private UserRepository userRepo;

	public User add(UserReq user) {

		User ur = new User(user.getUserId(), user.getName(), user.getRollNumber(), null);
		return userRepo.save(ur);
	}

	public List<User> disp() {
		List<User> res = new ArrayList<>();
		List<User> userList = userRepo.findAll();

		Iterator<User> iterator = userList.iterator();

		while (iterator.hasNext()) {
			User user = (User) iterator.next();
			if (user.getDelete() == null) {
				res.add(user);
			}

		}

		return res;
	}

	public void del(String userId) {
		Optional<User> user = userRepo.findById(userId);
		User ur = user.get();
		ur.setDelete(LocalDateTime.now());
		userRepo.save(ur);
	}

	public void update(String ID,UserReq req) {
		Optional<User> user = userRepo.findById(ID);
		User ur = user.get();
		ur.setName(req.getName());
		ur.setRollNumber(req.getRollNumber());
		userRepo.save(ur);
		// TODO Auto-generated method stub
		
	}

}
