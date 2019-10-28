package jp.co.systena.tigerscave.shopping.model;

public class Item {

  // 名前
  private String name;

  public String getName() {
    return this.name;
  }

  // setter
  public void setName(String name) {
    this.name = name;
  }

  private int itemId;

  public int getItemid() {
    return this.itemId;
  }

  public void setItemid(int itemid) {
    this.itemId = itemid;
  }

  private int price;

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }


}

