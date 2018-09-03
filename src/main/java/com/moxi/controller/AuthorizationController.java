package com.moxi.controller;

import com.moxi.model.News;
import com.moxi.model.NewsCategory;
import com.moxi.model.ResObject;
import com.moxi.service.NewsCategoryService;
import com.moxi.service.NewsService;
import com.moxi.util.Constant;
import com.moxi.util.PageUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
public class AuthorizationController {

	@Autowired
	private NewsService newsService;

	@Autowired
	private NewsCategoryService newsCategoryService;


	@RequestMapping("/admin/authorization")
	public String newsManage() {
		System.out.println("jinru ");
		return "users/authorization";
	}



}
