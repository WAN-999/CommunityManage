package com.wzh.communityManage.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String name;

    private Integer role;

    private String password;

    private Integer cid;

    private static final long serialVersionUID = 1L;
}