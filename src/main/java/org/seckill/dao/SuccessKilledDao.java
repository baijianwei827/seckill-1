package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {
    /*
    * 插入购买明细
    * 可过滤重复
    *
    * 插入的行数*/
    int   insertSuccessKilled (@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
    /*
    *
    * 根据
    *
    * */
    SuccessKilled  queryByIdWithSeckill(@Param("seckillId")long seckillId,@Param("userPhone") long userPhone);


}
