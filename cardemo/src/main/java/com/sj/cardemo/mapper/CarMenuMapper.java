package com.sj.cardemo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.sj.cardemo.bean.CarMenu;

import org.springframework.stereotype.Repository;

@Repository
public interface CarMenuMapper  {

}

//public interface CarMenuMapper extends JpaRepository<CarMenu,Integer> {
//        public Page<CarMenu> findAllByAble(Pageable pageable,Integer able);
//
//        public Page<CarMenu> findByCategoryTypeAndAble(Integer index,Pageable pageable,Integer able);
//
//        //模糊查询
//        public List<CarMenu> findByCarNameContaining(String carName);
//
//        public CarMenu findAllByCarId(Integer id);
//
//        @Query(value="select * from car_menu where able=?3 limit ?1,?2",nativeQuery=true)
//        public List<CarMenu> findAllByAble(Integer index,Integer limit,Integer able);
//        public int countByAble(Integer able);
//
//        //创建订单修改汽车able=0
//        @Transactional
//        @Rollback(value=false)
//        @Modifying(clearAutomatically = true)
//        @Query(value="update car_menu set able=0 where car_id=?1",nativeQuery=true)
//        public void updateByCarId(Integer carId);
//
//        //管理员拒绝订单，汽车able=1
//        @Transactional
//        @Rollback(value=false)
//        @Modifying(clearAutomatically = true)
//        @Query(value="update car_menu set able=1 where car_id=?1",nativeQuery=true)
//        public void updateCar(Integer carId);
//
//        //走马灯图片
//        @Query(value="select car_id,src from car_menu where able=1",nativeQuery=true)
//        public List<Integer> getAllCarId();
//
//        @Query(value="select * from car_menu where car_id=?1 and able=1",nativeQuery=true)
//        public List<CarMenu> findSrc(Integer carId);
//
//
//
//}
