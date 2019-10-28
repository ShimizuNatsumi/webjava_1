package jp.co.systena.tigerscave.shopping.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.shopping.model.Item;
import jp.co.systena.tigerscave.shopping.service.ListService;

@Controller  // Viewあり。Viewを返却するアノテーション
public class ShoppingController {

  @Autowired
  HttpSession session;                  // セッション管理

  @Autowired
  ListService listService;

  @RequestMapping(value="/shoppinglist", method = RequestMethod.GET)    // URLとのマッピング
  public ModelAndView index(ModelAndView mav) {

    Map<Integer,Item> item = listService.getItemList();
    mav.addObject("items", item);
    mav.setViewName("ListView");
    return mav;
  }

  @RequestMapping(value="/shoppingcart", method = RequestMethod.POST)  // URLとのマッピング
  public ModelAndView addItem(ModelAndView mav) {

//    Map<Integer,Item> item = listService.getItemList();
//    mav.addObject("items", item);
    
    List<Integer> itemList = (List<Integer>)session.getAttribute("itemid");
    if( itemList == null) {
        itemList = new ArrayList<User>();
        session.setAttribute("userList", users);
    }
    mav.setViewName("ListView");
    return mav;
  }
}
