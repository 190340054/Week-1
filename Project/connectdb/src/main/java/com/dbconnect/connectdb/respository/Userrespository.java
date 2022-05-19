package com.dbconnect.connectdb.respository;

import com.dbconnect.connectdb.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrespository extends JpaRepository<Users, Integer> {
}
