package jp.co.systena.tigerscave.shopping.service;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import jp.co.systena.tigerscave.shopping.model.Item;

@Service
public class ListService {
  public Map<Integer,Item> getItemList() {
    // インスタンスを作る
    Item onigiri = new Item();
    onigiri.setName("おにぎり");
    onigiri.setItemid(1);
    onigiri.setPrice(2000);

    Item tamagoyaki = new Item();
    tamagoyaki.setName("卵焼き");
    tamagoyaki.setItemid(2);
    tamagoyaki.setPrice(1000);

    Item karaage = new Item();
    karaage.setName("唐揚げ");
    karaage.setItemid(3);
    karaage.setPrice(10000);

    // つくった商品をMapにつめる
    Map<Integer, Item> map = new HashMap<Integer, Item>();
    map.put(1, onigiri);
    map.put(2, tamagoyaki);
    map.put(3, karaage);

    // Mapを返す（ほかのクラスで使えるようにしてる）
    return map;
  }



  public Item getItem(int id) {




    return null;
  }
}