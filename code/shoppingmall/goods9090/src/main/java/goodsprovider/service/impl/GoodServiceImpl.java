package goodsprovider.service.impl;

import common.pojo.Goods;
import common.pojo.Impl.GoodsPerson;
import goodsprovider.mapper.GoodMapper;
import goodsprovider.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
    public int AddGoods(Goods goods) {
        return goodMapper.AddGoods(goods);
    }

    @Override
    public GoodsPerson FindGoodsById(int goods_id) {
        return goodMapper.FindGoodsPersonById(goods_id);
    }

    @Override
    public int ModifyGoods(Goods goods) {
        return goodMapper.ModifyGoods(goods);
    }
}
