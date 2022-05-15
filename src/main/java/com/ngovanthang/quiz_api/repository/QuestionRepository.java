package com.ngovanthang.quiz_api.repository;

import com.ngovanthang.quiz_api.constaint.DoKho;
import com.ngovanthang.quiz_api.constaint.TypeQuestion;
import com.ngovanthang.quiz_api.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
//    @Query("select q from Question q join Category c on q.category.id = c.id where (:catatoryid is null or c.id = :catatoryid) and (:doKho is null or q.doKho = :doKho)")
//    List<Question> findAll(@Param(value = "catatoryid") Long catatoryid, @Param(value = "doKho") DoKho doKho, @Param(value = "typeQuestion")TypeQuestion typeQuestion);
}
