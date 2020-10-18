package com.wzh.communityManage.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * activity
 * @author 
 */
@Data
public class Activity implements Serializable {
    private Integer id;

    private Integer applierid;

    private Integer approvalid;

    /**
     * status
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}