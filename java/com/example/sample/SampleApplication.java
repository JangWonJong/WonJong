package com.example.sample;

import com.example.sample.member.controller.AuthController;
import com.example.sample.oop.controller.OopController;
import com.example.sample.quiz.controller.QuizController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		AuthController memberController = new AuthController();
		OopController phoneController = new OopController();
		QuizController quizController = new QuizController();


		while (true){
			System.out.println("[Menu] 0.Exit" +
					" 1. Auth 2.OOP 3.Quiz 4.Algorithm");
			switch (scanner.next()){
				case "0":
					System.out.println("### Exit ###");return;
				case "1":
					memberController.execute(scanner);
					System.out.println("### Auth ###");break;
				case "2":
					phoneController.execute(scanner);
					System.out.println("### OOP ###");break;
				case "3":
					quizController.execute(scanner);
					System.out.println("### Quiz ###");break;
				case "4":
					System.out.println("### Algorithm ###");break;
				default:
					System.out.println("Invalid Menu");break;
			}

		}
	}

}
//phoneController.execute(scanner);