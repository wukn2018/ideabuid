package request;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * ***GOOD LUCK****
 *
 * @Author : Wukn
 * @Date : 2018/9/27
 */
@Data
public class User {

    private String name;
    private Integer id;

    @Override
    public String toString() {
        return JSON.toJSONString( this );
    }
}
