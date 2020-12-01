package entity;


import java.util.List;

/**
 * @author 枯墨竹
 * @date 2020/12/1
 **/
public class PageResult<T> {
    Integer code;
    String msg;
    Integer count;
    List<T> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"code\":")
                .append(code);
        sb.append(",\"msg\":\"")
                .append(msg).append('\"');
        sb.append(",\"count\":")
                .append(count);
        sb.append(",\"data\":")
                .append(data);
        sb.append('}');
        return sb.toString();
    }
}
