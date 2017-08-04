package com.example.Utiles;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * @author felix.yu
 */
@XmlRootElement(name = "responseVo")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ResponseVo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String info;
    private String status;
    private Object data;
    
    public ResponseVo() {}
    public ResponseVo(String status) {
        this.status = status;
    }
    public ResponseVo(String status, String info) {
        this.status = status;
        this.info = info;
    }
    public ResponseVo(String status, String info, Object data) {
        this.status = status;
        this.info = info;
        this.data = data;
    }
    
    
	public String getInfo() {
        if (StringUtils.isEmpty(info)){
            if("1".equals(status)){
                info = "获取成功";
            }else{
                info = "获取失败";
            }
        }
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
//    @Override
//    public String toString(){
//		return JSONObject.fromObject(this).toString(1);
//
//    }
}

