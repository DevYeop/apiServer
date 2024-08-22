package org.scoula.security.config;

import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {
        RootConfig.class,
        SecurityConfig.class
})
@Log4j
class SecurityConfigTest {
    @Autowired
    private PasswordEncoder pwEncoder;

    @Test
    public void testEncode() {
        String str = "1234";
        String enStr = pwEncoder.encode(str); // 암호화
        log.info("password: " + enStr);
        String enStr2 = pwEncoder.encode(str); // 암호화
        log.info("password: " + enStr2);
        log.info("match :" + pwEncoder.matches(str, enStr)); // 비밀번호 일치 여부 검사
        log.info("match :" + pwEncoder.matches(str, enStr2)); // 비밀번호 일치 여부 검사
    }
}