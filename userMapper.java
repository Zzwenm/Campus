package com.example.taoxiao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update; 
@Mapper  
public interface userMapper {  
	@Select("select * from user")  
    List<user> show();
    
    @Select("select * from user where name=#{name}")  
    List<user> select(String name);
    
    @Insert("INSERT INTO user VALUES(#{null}, #{account}, #{address}, #{phonenumber}, #{wechat}, #{email}, #{qq}, #{word})")
    boolean insert(@Param("name") String name,@Param("address") String address, @Param("phonenumber") String phonenumber,
    		@Param("wechat") String wechat,@Param("email") String email,@Param("qq") String qq,@Param("word") String word);
    
    @Update("update user set name=#{name},address=#{address},phonenumber=#{phonenumber},wechat=#{wechat},email=#{email},"
    		+ "qq=#{qq},word=#{word} ")
    boolean update(@Param("name") String name,@Param("address") String address, @Param("phonenumber") String phonenumber,
    		@Param("wechat") String wechat,@Param("email") String email,@Param("qq") String qq,@Param("word") String word);
    @Delete("delete user where name=#{name}")
    boolean delete(String name);
    
}  


