package com.fhz.service.impl;

import com.fhz.dao.StudentDAO;
import com.fhz.entity.Student;
import com.fhz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ssm
 * @description: 学生服务实现
 * @author: FuHZ
 * @create: 2019-11-28 22:11
 **/
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public int insertStudent(Student student) {
        return studentDAO.insertStudent(student);
    }
}
