package com.fengfan.rest.table.repository;

import com.fengfan.rest.table.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author fengfan
 * @description TODO
 * @date 2022/5/13 15:02
 */
@RepositoryRestResource(path = "teachers", collectionResourceRel = "t", itemResourceRel = "teacher")
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
