package com.ibm.sec.repositories;

import com.ibm.sec.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
    public Status findByName(String name);
}
