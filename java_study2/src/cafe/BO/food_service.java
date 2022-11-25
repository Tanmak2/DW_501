package cafe.BO;

import cafe.DAO.food_DAO;

public class food_service {
	private food_DAO fdao = new food_DAO();

	public void order_food(int seq) {
		fdao.food_list();
	}
}
