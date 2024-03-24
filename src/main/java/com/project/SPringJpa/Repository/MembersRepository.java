package com.project.SPringJpa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.SPringJpa.Entities.Members;

public interface MembersRepository extends JpaRepository<Members,String> {
Members findByMid(String mid);
List<Members> findByMjoinyearGreaterThan(int mjoinyear);
}
