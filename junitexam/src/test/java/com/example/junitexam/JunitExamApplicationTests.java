package com.example.junitexam;

import java.beans.Transient;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class JunitExamApplicationTests {
    @Test
    public void optionalTest() {
        // https://www.baeldung.com/java-optional
        String nullStr = null;
        log.info(Optional.ofNullable(nullStr).orElse("orElse() is null"));
        log.info(Optional.ofNullable(nullStr).orElseGet(() -> {
            return "orElseGet() is null";
        }));
    }

    @Test
    public void streamTest() {
        var arr = new String[] { "a", "b", "c" };
        var stream = Arrays.stream(arr);
        var streamOfArrayPart = Arrays.stream(arr, 1, 3); // 1~2 요소 [b, c]
        streamOfArrayPart.forEach(k -> {
            log.info(k);
        });
    }
}
