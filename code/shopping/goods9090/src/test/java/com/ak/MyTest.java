package com.ak;

import goodsprovider.goods9090Application;
import goodsprovider.mapper.GoodMapper;
import goodsprovider.mapper.OrderAllMapper;

import goodsprovider.mapper.PersonMapper;
import goodsprovider.mapper.ShoppingCarMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = goods9090Application.class)
public class MyTest {

    @Autowired
    private OrderAllMapper orderAllMapper;

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private ShoppingCarMapper shoppingCarMapper;

    @Test
    public void kk(){
//        List<OrderAll> list=orderAllMapper.FindOrder(1);
//
//        for(OrderAll orderAll:list){
//            System.out.println(orderAll);
//        }

//        Order order=new Order();
//        order.setAll_money(100.0);
//        order.setOrder_id("21");
//        order.setOrder_time(new Date(System.currentTimeMillis()));
//        order.setUser_id(1);
//        System.out.println(orderAllMapper.AddOrder(order));;

//        Orderitem orderitem=new Orderitem();
//        orderitem.setGoods_id(1);
//        orderitem.setBuy_number(12);
//        orderitem.setOrder_id("21");
//        orderitem.setSeller_id(1);
//        orderitem.setItem_money(20.0);
//       System.out.println(orderAllMapper.AddOrderItem(orderitem));
//
//       List<GoodsPerson> goodsPeople=goodMapper.FindGoodOne();
//       for(GoodsPerson goodsPerson:goodsPeople){
//           System.out.println(goodsPerson);
//       }
//
//      Goods goodsPerson= goodMapper.FindGoodsById(1);
//      System.out.println(goodsPerson);

//      GoodsPerson goodsPerson=  goodMapper.FindGoodsPersonById(1);
//       System.out.println(goodsPeople);

//        System.out.println(personMapper.AddMoney(10.0,1));

//        System.out.println(shoppingCarMapper.SelectShoppingCar(1));

//        Shoppingcar shoppingcar=new Shoppingcar();
//        shoppingcar.setGoods_id(1);
//        shoppingcar.setShopping_goodsnumber(12);
//        shoppingcar.setShopping_needmoney(20.0);
//        shoppingcar.setUser_id(1);
//        System.out.println(shoppingCarMapper.AddShoppingCar(shoppingcar));;
//       Shoppingcar shoppingcar= shoppingCarMapper.SeletShoppingCarByGoodsID(1,1);
//        System.out.println(shoppingcar);
//       shoppingCarMapper.ModifyShoppingCar(shoppingcar);
    }

}
