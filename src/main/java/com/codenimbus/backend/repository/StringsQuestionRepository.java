package com.codenimbus.backend.repository;

import com.codenimbus.backend.entity.StringsQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StringsQuestionRepository extends JpaRepository<StringsQuestion, Long> {
}
