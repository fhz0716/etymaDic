import com.fhz.StartUP;
import com.fhz.entity.Student;
import com.fhz.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: etymaDic
 * @description: 学生服务测试
 * @author: FuHZ
 * @create: 2019-12-26 16:00
 **/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartUP.class)
public class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void t01() {
        Student student = new Student();

        student.setName("Adrian");

        studentService.insertStudent(student);
    }
}
