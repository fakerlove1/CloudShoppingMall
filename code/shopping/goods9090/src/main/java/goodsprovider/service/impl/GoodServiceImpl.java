package goodsprovider.service.impl;

import common.pojo.Goods;
import common.pojo.Impl.GoodsPerson;
import goodsprovider.mapper.GoodMapper;
import goodsprovider.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品的业务
 */
@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    GoodMapper goodMapper;

    @Override
    public List<GoodsPerson> FindGoodOne() {
        return goodMapper.FindGoodOne();
    }

    @Override
    public List<GoodsPerson> FindGoodTwo() {
        return goodMapper.FindGoodTwo();
    }

    @Override
    public List<GoodsPerson> FindGoodRank() {
        return goodMapper.FindGoodRank();
    }


    @Override
    public GoodsPerson FindGoodsById(int goods_id) {
        return goodMapper.FindGoodsPersonById(goods_id);
    }

    @Override
    public List<Goods> FindGoodsBySellId(int seller_id) {
        return goodMapper.FindGoodsBySellId(seller_id);
    }
}
