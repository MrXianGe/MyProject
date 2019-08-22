package cn.itcast.user.mapper;


import cn.itcast.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Usermapper extends tk.mybatis.mapper.common.Mapper<User>{
}
