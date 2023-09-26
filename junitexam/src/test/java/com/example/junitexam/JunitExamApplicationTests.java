package com.example.junitexam;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class JunitExamApplicationTests {
    // https://www.baeldung.com/java-optional

    @Test
    public void optionalTest() {
        String nullStr = null;
        log.info(Optional.ofNullable(nullStr).orElse("orElse() is null"));
        log.info(Optional.ofNullable(nullStr).orElseGet(() -> {
            return "orElseGet() is null";
        }));
    }
}
