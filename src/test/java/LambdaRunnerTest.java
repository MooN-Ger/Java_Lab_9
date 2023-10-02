import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LambdaRunnerTest {

    @Test
    public void func1Test() {
        assertEquals(4, LambdaRunner.method(LambdaDemo.func1, "Test"));
    }

    @Test
    public void func2NullTest() {
        assertNull(LambdaRunner.method(LambdaDemo.func2, ""));
    }

    @Test
    public void func2Test() {
        assertEquals('T', LambdaRunner.method(LambdaDemo.func2, "Test"));
    }

    @Test
    public void func3TrueTest() {
        assertTrue(LambdaRunner.method(LambdaDemo.func3, "HelloWorld"));
    }

    @Test
    public void func3FalseTest() {
        assertFalse(LambdaRunner.method(LambdaDemo.func3, "Hello World"));
    }

    @Test
    public void func4Test() {
        assertEquals(5, LambdaRunner.method(LambdaDemo.func4, "Hello,world,i,am,happy"));
    }

    @Test
    public void func5HumanTest() {
        Human human = new Human("Ivanov", "Ivan", "Ivanovich", 30, Gender.MALE);
        assertEquals(30, LambdaRunner.method(LambdaDemo.func5, human));
    }

    @Test
    public void func5StudentTest() {
        Student student = new Student("Petrov", "Petya", "Petrovich", 18, Gender.MALE, "OmGU", "Math", "Programmist");
        assertEquals(18, LambdaRunner.method(LambdaDemo.func5, student));
    }

    @Test
    public void func6HumanTest() {
        Human human1 = new Human("Ivanov", "Ivan", "Ivanovich", 30, Gender.MALE);
        Human human2 = new Human("Ivanov", "NeIvan", "NeIvanovich", 3, Gender.MALE);
        assertTrue(LambdaRunner.method(LambdaDemo.func6, human1, human2));
    }

    @Test
    public void func6StudentTest() {
        Student student1 = new Student("Petrov", "Petya", "Petrovich", 18, Gender.MALE, "OmGU", "Math", "Programmist");
        Student student2 = new Student("Petrov", "NePetya", "NePetrovich", 81, Gender.MALE, "NeOmGU", "NeMath", "NeProgrammist");
        assertTrue(LambdaRunner.method(LambdaDemo.func6, student1, student2));
    }

    @Test
    public void func6HumanStudentTest() {
        Human human = new Human("Ivanov", "Ivan", "Ivanovich", 30, Gender.MALE);
        Student student = new Student("Ivanov", "Petya", "Petrovich", 18, Gender.MALE, "OmGU", "Math", "Programmist");
        assertTrue(LambdaRunner.method(LambdaDemo.func6, human, student));
    }

    @Test
    public void func7HumanTest() {
        Human human = new Human("Ivanov", "Ivan", "Ivanovich", 30, Gender.MALE);
        assertEquals("Ivanov Ivan Ivanovich", LambdaRunner.method(LambdaDemo.func7, human));
    }

    @Test
    public void func7StudentTest() {
        Student student = new Student("Petrov", "Petya", "Petrovich", 18, Gender.MALE, "OmGU", "Math", "Programmist");
        assertEquals("Petrov Petya Petrovich", LambdaRunner.method(LambdaDemo.func7, student));
    }

    @Test
    public void func8Test() {
        Human human = new Human("Ivanov", "Ivan", "Ivanovich", 30, Gender.MALE);
        assertEquals(human.getAge()+1, LambdaRunner.method(LambdaDemo.func8, human).getAge());
    }

    @Test
    public void func9Test() {
        Human human1 = new Human("Ivanov", "Ivan", "Ivanovich", 31, Gender.MALE);
        Human human2 = new Human("Ivanov", "Ivan", "Ivanovich", 32, Gender.MALE);
        Human human3 = new Human("Ivanov", "Ivan", "Ivanovich", 33, Gender.MALE);
        List<Human> humans = new ArrayList<Human>();
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        int maxAge = 35;
        assertTrue(LambdaRunner.method(LambdaDemo.func9, humans, maxAge));
    }
}