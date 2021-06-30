# opa
Opa assessment
Description: 
this an exercise for Opa SAS which include:
-> java service for getting natural perfect numbers with an interval.
-> running: it is important to make sure to get a java 8 jdk or jdk 1.8
			after that you can execute by terminal: gradlew clean bootRun

-> Endpoints:
		POST	
		http://localhost:8080/Exercise2/perfectNaturalNum
		headers: Content-Type: application/json
		body->  {
					"firstNum": 0,
					"secondNum": 9000
				}
		
		GET
		http://localhost:8080/Exercise2/getExecutionHistory

->Pseudocode:
		perfectNaturalNumber(int firstNum, int secondNum){
			 numbers[];
			 for (int i = firstNum; i <= secondNum; i++) {
				if (i == 0) {
					ignore
				}
				int sum = 0;
				for (int j = 1; j < i; j++) {
					if (i % j == 0 && i % j != i) {
						sum += j;
					}

				}
				if (i == sum) {
					numbers.add(i);
				}
			 }
			 return numbers;
			
		}

-> The application is going to run in any enviroment with a java virtual machine jdk 1.8.

-> The application is created by using java and spring standars  that's why is easy to add new features.

-> The application used a database in memory to persist the information.
	http://localhost:8080/h2-console/
	url=jdbc:h2:mem:testdb
	username=sa
	password=password

-> This is a microservice using spring boot which makes sure easy scaling. 