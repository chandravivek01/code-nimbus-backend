package com.codenimbus.backend.repository;

import com.codenimbus.backend.entity.Dsa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DsaRepository extends JpaRepository<Dsa, Long> {
}
