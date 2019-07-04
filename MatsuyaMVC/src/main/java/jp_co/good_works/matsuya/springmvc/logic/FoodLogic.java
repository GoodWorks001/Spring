package jp_co.good_works.matsuya.springmvc.logic;

import java.sql.SQLException;

import jp_co.good_works.matsuya.springmvc.dao.FoodDao;

public class FoodLogic {
	
	FoodDao fd  = new FoodDao();
	private FoodInfo foodInfo=null;
	FoodInfo form =new FoodInfo();
	
	public void food(String food_type)throws Exception,SQLException,ClassNotFoundException{
		foodInfo= fd.select(food_type);
		if(this.foodInfo==null) {
			throw new Exception("好きな料理を入力してください");
		}else {
			System.out.println("検索単語は"+foodInfo+"です。");
		}
	}
	
	public boolean isLive() {
		if(this.foodInfo!=null) {
			return true;
		}
		return false;
	}

}
