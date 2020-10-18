package com.wzh.communityManage.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * community
 * @author 
 */
@Data
public class Community implements Serializable {
    private Integer id;

    private String name;

    private Integer masterid;

    private String description;

    private static final long serialVersionUID = 1L;
}