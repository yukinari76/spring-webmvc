package yukinarisoftware.mvc.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIntegrationTest {

    @LocalServerPort
    private Integer port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testWithName() {
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port + "/hello", String.class);

        Assertions.assertNotNull(response);


    }

    @Test
    void testWithoutName() {
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port + "/hello", String.class);

        Assertions.assertNotNull(response);
    }


}
