package com.myapp.rachdemo.repository;

import com.myapp.rachdemo.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}