package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value="/")
	public ModelAndView indexPost(ModelAndView mv){
		ArrayList<String[]> customers= new ArrayList<String[]>();
		customers.add(new String[]{"佐藤HTML太郎","35歳","男性","東京"});
		customers.add(new String[]{"鈴木Java五郎","24歳","男性","埼玉"});
		customers.add(new String[]{"高橋CSS子","29歳","男性","滋賀"});
		customers.add(new String[]{"石田jafu百合子","45歳","女性","東京"});
		customers.add(new String[]{"須田CSS正樹","30歳","男性","京都"});
		mv.addObject("customers",customers);
		mv.setViewName("index");
		return mv;
	}
}

	
	

