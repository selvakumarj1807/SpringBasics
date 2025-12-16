package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

        Student student01 = (Student) context.getBean("st1");
        student01.writeExam();

        Student student02 = (Student) context.getBean("st2");
        student02.writeExam();
    }
}
