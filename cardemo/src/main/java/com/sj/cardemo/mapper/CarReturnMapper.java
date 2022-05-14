package com.sj.cardemo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.sj.cardemo.bean.CarReturn;

import org.springframework.stereotype.Repository;

@Repository
public interface CarReturnMapper {

}

//public interface CarReturnMapper extends JpaRepository<CarReturn,Integer> {
//    @Query(value="select * from car_return where admin_id=?3 and able=?4 limit ?1,?2",nativeQuery=true)
//    public List<CarReturn> findAllByAdminIdAndAble(Integer index, Integer size, Integer adminId, Integer able);
//
//    public int countByAdminIdAndAble(Integer adminId,Integer able);
//
//    @Transactional
//    @Rollback(value=false)
//    @Modifying(clearAutomatically = true)
//    @Query(value="update car_return set able=1,create_time=?2,update_time=?3 where order_id=?1",nativeQuery=true)
//    public void updateByOrderId(String orderId, Timestamp createTime,Timestamp updateTime);
//
//    //查询所有
//    @Query(value="select * from car_return where admin_id=?3 and able=?4 limit ?1,?2",nativeQuery=true)
//    public List<CarReturn> findAllByAdminId(Integer index, Integer size, Integer adminId,int able);
//
//    @Query(value="select count(*) from car_return where admin_id=?1 and able=1",nativeQuery=true)
//    public int countByAdminId(Integer adminId);
//}
