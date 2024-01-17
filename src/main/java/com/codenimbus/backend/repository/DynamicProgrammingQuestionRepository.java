package com.codenimbus.backend.repository;

import com.codenimbus.backend.entity.DynamicProgrammingQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicProgrammingQuestionRepository extends JpaRepository<DynamicProgrammingQuestion, Long> {
}
