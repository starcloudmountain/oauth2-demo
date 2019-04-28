package moe.cnkirito.security.oauth2.code.endpoint;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author 徐靖峰[OF2938]
 * company qianmi.com
 * Date 2018-04-25
 */
@Data
@EqualsAndHashCode(of = "qq")
@ToString(exclude = "fans")
@Builder
public class QQAccount {

    private String qq;
    private String nickName;
    private String level;
    private List<QQAccount> fans;
    
    public static QQAccount builder() {
    	return new QQAccount();
    }
    
    public QQAccount build() {
    	return this;
    }
    
    public QQAccount level(String v) {
    	this.level=v;
    	return this;
    }
    
    public QQAccount nickName(String v) {
    	this.nickName=v;
    	return this;
    }
    
    public QQAccount qq(String v) {
    	this.qq=v;
    	return this;
    }
    
    public List<QQAccount> getFans(){
    	return null;
    }
    
    public void setFans(List<QQAccount> list) {
    	this.fans=list;
    }

}
