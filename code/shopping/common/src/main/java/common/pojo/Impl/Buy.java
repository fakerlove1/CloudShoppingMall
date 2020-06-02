package common.pojo.Impl;

import common.pojo.BuyGood;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Buy {

    BuyGood[] buyGoods;
    Integer user_id;

}
