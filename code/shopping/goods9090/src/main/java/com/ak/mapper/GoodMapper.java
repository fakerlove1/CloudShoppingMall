package com.ak.mapper;

import com.ak.Goods;
import com.ak.Impl.GoodsPerson;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 返回商品
 */
@Mapper
@Repository
public interface GoodMapper {

    List<GoodsPerson> FindGoodOne();
    /**
     * 首页竖排信息
     * @return
     */
    List<GoodsPerson> FindGoodTwo();

    /**
     * 排行榜信息
     * @return
     */
    List<GoodsPerson> FindGoodRank();

    /**
     * 添加商品
     * @param goods
     * @return
     */
    int AddGoods(Goods goods);

    /**
     * 查询商品
     * @return
     */
    GoodsPerson FindGoodsPersonById(int goods_id);

    /**
     * 修改商品
     * @param goods
     * @return
     */
    int ModifyGoods(Goods goods);

    Goods FindGoodsById(int goods_id);

    int DeleteGoodsById(int goods_id);

    List<Goods> FindGoodsBySellId(int seller_id);

}
