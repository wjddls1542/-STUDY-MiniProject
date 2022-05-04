package com.study.board.repository;

import com.study.board.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    @Query("select u from User u where u.userid=:userid and u.password=:password")
    User selectUserInfo(@Param("userid")String userid, @Param("password")String password);

}
