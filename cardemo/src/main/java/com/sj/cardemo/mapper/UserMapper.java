package com.sj.cardemo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.sj.cardemo.bean.User;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

}
//public interface UserMapper extends JpaRepository<User, Integer> {
//
//////    @Query(value = "select * from user where username=?1 ", nativeQuery = true)
//////    public User findUserByName(String username);
////
////    //根据用户名查盐
////    @Query(value = "select salt from user where username=?1", nativeQuery = true)
////    public String saltByUsername(String username);
//
//    //检查用户名是否重复
//    public User findAllByUsername(String username);
//
//    //通过id查name
//    public User findUserById(Integer id);
//
//
//    //查询全部用户
//    @Override
//    @Query(value = "select * from user where perm=0 ", nativeQuery = true)
//    public Page<User> findAll(Pageable pageAble);
//
//}
