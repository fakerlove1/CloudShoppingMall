package goodsprovider.service;

import common.pojo.Goods;
import common.pojo.Impl.GoodsPerson;
import common.pojo.Person;

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

    GoodsPerson FindGoodsById(int goods_id);

    List<Goods> FindGoodsBySellId(int seller_id);

}
