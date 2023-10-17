# Java 17 with Maven and Springboot in VSCode


<div align="center">
  <kbd>
    <img src="readme-images/overview.png" />
  </kbd>
</div>

## 說明


使用 VS Code 開發 Springboot MVC 專案

### 軟體下載

- [VS Code](https://code.visualstudio.com/download)
- [Java JDK 17](https://www.openlogic.com/openjdk-downloads)

### Java Jdk Setup
<div align="center">
  <kbd>
    <img src="readme-images/java-env.png" />
  </kbd>
</div>


### VS Code Plugin

- Java Extension Plugin
  <div align="center">
  <kbd>
    <img src="readme-images/java-plugin.png" />
  </kbd>
</div>

- Spring Boot Plugin
    <div align="center">
  <kbd>
    <img src="readme-images/spring-plugin.png" />
  </kbd>
</div>

- Extra Plugins
  - [19 Great VS Code Extensions](https://www.wearedevelopers.com/magazine/vs-code-extensions)
  - [20 Best VS Code Extensions For 2023](https://www.lambdatest.com/blog/best-vs-code-extensions/)
  - [Top 30 VS Code Extensions for Enhanced Programming](https://kinsta.com/blog/vscode-extensions/)

### Dependency: pom.xml 
```
<properties>
		<java.version>17</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>nz.net.ultraq.thymeleaf</groupId>
			<artifactId>thymeleaf-layout-dialect</artifactId>
			<version>3.3.0</version>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-configuration-processor</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.microsoft.sqlserver</groupId>
			<artifactId>mssql-jdbc</artifactId>
			<version>12.4.1.jre11</version>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
```

