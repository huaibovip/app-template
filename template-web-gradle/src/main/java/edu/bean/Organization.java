package edu.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 机构
 */
@Getter
@Setter
@Accessors(chain = true)
public class Organization implements Serializable {
    private static final long serialVersionUID = 1L;

    private long   id;       // 机构 ID
    private String name;     // 机构名字
    private String host;     // 机构域名
    private int    port;     // 网站端口
    private long   adminId;  // 管理员 ID
    private long   parentId; // 上级机构 ID
}
