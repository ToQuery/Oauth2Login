package com.toquery.oauth2.model.sys.web.controller;

import com.sun.net.httpserver.Authenticator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by heima on 2016/7/7.
 */
@Controller
@RequestMapping("/taobao")
public class TaoBaoTestController {

    static String host = "http://toquery.ittun.com/Oauth2Login/taobao/";
    static String initHost = host + "init";
    static String dataHost = host + "data";
    static String tbLoginHost = "https://login.m.taobao.com/login.html";
    static String applyNo = "1001";

    public static void main(String[] a) throws UnsupportedEncodingException {

        String url = initHost + "?r=" + System.currentTimeMillis() +
                "&loginUrl=" + URLEncoder.encode(tbLoginHost, "utf-8") +
                "&loginSuccessUrl=" + URLEncoder.encode(dataHost, "utf-8") +
                "&applyNo=" + applyNo;
        System.out.println(url);
    }

    @RequestMapping("/init")
    public ModelAndView initHtml() throws UnsupportedEncodingException {
        /*
        https://login.m.taobao.com/login.htm?tpl_redirect_url=https%3A%2F%2Fh5.m.taobao.com%2Fmlapp%2Fmytaobao.html%23mlapp-mytaobao
        */
        System.out.println("初始化");
        Map<String, String> map = new HashMap<>();
        String rdvurl = tbLoginHost + "?loginSuccessUrl=" + URLEncoder.encode(dataHost, "utf-8") + "&applyNo=" + applyNo;
//redirect
//        forward
        ModelAndView mav = new ModelAndView("taobao/init", "rdvurl", rdvurl);
        return mav;
    }

    @RequestMapping("/data")
    public ModelAndView initData(HttpServletRequest request) {
        System.out.println("回调数据！");
        ModelAndView mav = new ModelAndView("taobao/data");
        return mav;
    }
}
