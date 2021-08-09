package com.zhang.dao;

import com.zhang.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 定义dao层接口 继承JapRepository(含有需要的数据库中的增删改查）
 * 当我们进行复杂操作的时候需要自己书写sql语句
 */
public interface StudentDao extends JpaRepository<Student, Integer> {

    /**
     * 根据id去查询一条学生信息
     * @param id
     * @return
     */
    Student findStudentById(Integer id);
}
