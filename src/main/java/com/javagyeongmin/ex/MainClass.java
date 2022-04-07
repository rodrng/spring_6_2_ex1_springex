package com.javagyeongmin.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//�����̳� ��ü�� ApplicationConfig Ŭ������ �����Ͽ� ����
		
		Student student1 = ctx.getBean("student1",Student.class);
		Student student2 = ctx.getBean("student2",Student.class);
		
		System.out.println(student1.getName());//ȫ�浿
		System.out.println(student2.getName());//�̼���
		
		ctx.close();
		
		
		
	}

}