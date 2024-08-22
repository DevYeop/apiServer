package org.scoula.security.account.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {
    private String username; // admin
    private String password; //
    private String email; //
    private Date regDate;
    private Date updateDate;

    private List<AuthVO> authList;

    UserDetails details;
}