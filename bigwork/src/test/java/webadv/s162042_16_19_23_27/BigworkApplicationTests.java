package webadv.s162042_16_19_23_27;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import webadv.s162042_16_19_23_27.entity.Course;
import webadv.s162042_16_19_23_27.entity.course_back_27;
import webadv.s162042_16_19_23_27_repository.TeacherRepository1;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BigworkApplicationTests {
	@Autowired
	public TeacherRepository1 t1;
	public Course course;

	@Test
	public void contextLoads() {
	t1.findClassGrades("1");
	}

}
