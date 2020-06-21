/* This is the beginning of a
multi-line comment
this is the end */
//add package
package com.example.ppw;
package com.example.ppw;
//add library 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootApplication
@SpringBootTest

public class PpwApplication {

	public static void main(String[] args) {
		SpringApplication.run(PpwApplication.class, args);
	}
	//application test
	class PpwApplicationTests {

	    @Test
	    void contextLoads() {
	    }
}

}
