# Course-Requirements-Website
A website where students can see the graduation requirements for their major in HKUST.
- The expected process is for a student to register their username, password, email and role.
- If a student is not registered, they will fail to log-in.
- If a student registers with a username and an email, that username and email cannot be reused by any other student.
- Passwords can be repeated as they are not visible to any student.
- Once a student completes log-in, they will be redirected to the home page accessible to every student.
- Each student will also see a link to an additional page for their specific role.
- Within the role page, the student is redirected to a drive that contains the specific requirements for their major.


The code uses the following and may require specific configurations:
- JDK 22.02
- Maven
- pom.xml with the following dependencies: spring-boot-devtools, spring-boot-starter-security, spring-boot-starter-data-jpa, mysql-connector-j, spring-boot-starter-thymeleaf, spring-boot-starter-web, thymeleaf-extras-springsecurity6
- MySQL (to be able to use MySQL, please change the username and password in the application.properties file according to your own configuration)

