package goodsprovider.service;

import common.pojo.Goods;
import common.pojo.Impl.GoodsPerson;

import java.util.List;

public interface GoodService {

    /**
     * 首页横排信息
     * @return
     */
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

    int AddGoods(Goods goods);

    GoodsPerson FindGoodsById(int goods_id);

    int ModifyGoods(Goods goods);

}
