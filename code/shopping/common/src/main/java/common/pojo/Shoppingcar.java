package common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shoppingcar {
    private int shoppingcar_key;
    private int goods_id;
    private int user_id;
    private int shopping_goodsnumber;
    private Double shopping_needmoney;
    private Goods goods;
}
