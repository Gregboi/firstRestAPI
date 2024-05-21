package com.mcafee.app.rest.Repo;

import com.mcafee.app.rest.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository <User, Long> {
}
