package com.sj.cardemo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.sj.cardemo.bean.CarOrder;


import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper extends {

}
//public interface OrderMapper extends JpaRepository<CarOrder, Integer> {
//    @Query(value="select * from car_order where user_id=?1 limit ?2,?3",nativeQuery=true)
//    public List<CarOrder> findAllByUserId(Integer id,Integer index,Integer size);
//
//    @Query(value="select count(*) from car_order where user_id=?1 ",nativeQuery=true)
//    public int countByUid(Integer id);
//
//    @Query(value="select * from car_order where state=0 limit ?1,?2 ",nativeQuery=true)
//    public List<CarOrder> findAllByState(Integer index,Integer size);
//
//    @Query(value="select count(*) from car_order where state=0 ",nativeQuery=true)
//    public int countByState();
//
//    //拒绝订单
//    @Transactional
//    @Rollback(value=false)
//    @Modifying(clearAutomatically = true)
//    @Query(value="update car_order set state=2 ,admin_id=?2 where order_id=?1",nativeQuery=true)
//    public void updateById(String orderId,Integer adminId);
//
//    //根据adminId查询订单
//    @Query(value="select * from car_order where admin_id=?1 limit ?2,?3",nativeQuery=true)
//    public List<CarOrder> findAllByAdminId(Integer adminId,Integer index,Integer size);
//
//    @Query(value="select count(*) from car_order where admin_id=?1",nativeQuery=true)
//    public int countBYAdminId(Integer adminId);
//
//    //修改还车state
//    @Transactional
//    @Rollback(value=false)
//    @Modifying(clearAutomatically = true)
//    @Query(value="update car_order set state=3,update_time=?2 where order_id=?1",nativeQuery=true)
//    public void updateByOrderId(String orderId, Timestamp updateTime);
//
//
//    @Query(value="select * from car_order where order_id=?1",nativeQuery=true)
//    public CarOrder findAllById(String OrderId);
//
//
//    //视图数据 Bar
//    @Query(value="select * from car_order where state in(1,3) group by car_id",nativeQuery=true)
//    public List<CarOrder> findByState();
//    @Query(value="select count(car_id) from  car_order where state in (1,3) group by car_id;",nativeQuery=true)
//    public int[] counts();
//
//    //Pie
//    @Query(value="select * from car_order where state in(1,3)",nativeQuery=true)
//    public List<CarOrder> findPie();
//
//    @Query(value="select count(car_id) from car_order where state in (1,3) ",nativeQuery=true)
//    public int countPie();
//
//    //用户导出
//    public List<CarOrder> findAllByUserId(Integer userId);
//
//    //管理员导出
//    public List<CarOrder> findAllByAdminId(Integer adminId);
//
//}
