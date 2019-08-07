package jp_co.good_works.lesson.Controller;

import java.sql.SQLException;
import java.util.ArrayList;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp_co.good_works.lesson.Dao.DeleteDao;
import jp_co.good_works.lesson.Dao.SearchDao;
import jp_co.good_works.lesson.Form.SearchForm;

@Controller
@Scope("session")
public class DeleteController {
	

	//search.jsp����alert�ɂ��J��
	@RequestMapping(value = "/delete",params = "delete",method = RequestMethod.GET)
	public String searchInfo(Model model , SearchForm searchForm,@RequestParam("dalete") int user_id) throws SQLException {
		System.out.println("----------------------------");

		/*�f���[�g�����s��A���[�U�[�ꗗ���ēx�\��
		 * DareteDao��SearchDao�̃C���X�^���X���A
		 * DareteDao��derete���\�b�h���s
		 * SearchDao��allSearch���\�b�h���s?
		 */
		
		DeleteDao dd = new DeleteDao();
		dd.darete(user_id);
		
		SearchDao sd = new SearchDao();
		ArrayList<SearchForm> searchList = sd.allSearch();
		model.addAttribute("searchList",searchList);
		model.addAttribute("searchForm",searchForm);

		return "search.jsp";

	}


}
