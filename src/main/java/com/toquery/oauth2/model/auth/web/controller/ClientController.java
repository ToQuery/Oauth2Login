package com.toquery.oauth2.model.auth.web.controller;

import com.toquery.oauth2.model.sys.entity.po.TbAuthClient;
import com.toquery.oauth2.model.sys.service.IAuthClientService;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IAuthClientService authClientService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView getHtmlList() {
        ModelAndView mav = new ModelAndView("client2/list2");
        return mav;
    }

    @ResponseBody
    @RequestMapping(value = "/list3", method = RequestMethod.GET)
    @ApiOperation(value = "获取所有的账户信息", httpMethod = "GET", response = TbAuthClient.class, notes = "获取所有的账户信息")
    public TbAuthClient getList3() {
        TbAuthClient tbAuthClient = new TbAuthClient();
        tbAuthClient.setClientId("111");
        tbAuthClient.setClientName("111");
        tbAuthClient.setId(1);
        tbAuthClient.setClientSecret("111");
        return tbAuthClient;
    }

    @ResponseBody
    @RequestMapping(value = "/list2", method = RequestMethod.GET)
    public List getList() {
        return authClientService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("clientList", authClientService.getAll());
        return "client/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showCreateForm(Model model) {
        model.addAttribute("client", new TbAuthClient());
        model.addAttribute("op", "新增");
        return "client/edit";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(TbAuthClient client, RedirectAttributes redirectAttributes) {
        authClientService.createClient(client);
        redirectAttributes.addFlashAttribute("msg", "新增成功");
        return "redirect:/client";
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
    public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("client", authClientService.getById(id));
        model.addAttribute("op", "修改");
        return "client/edit";
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.POST)
    public String update(TbAuthClient client, RedirectAttributes redirectAttributes) {
        authClientService.updateClient(client);
        redirectAttributes.addFlashAttribute("msg", "修改成功");
        return "redirect:/client";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public String showDeleteForm(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("client", authClientService.deleteById(id));
        model.addAttribute("op", "删除");
        return "client/edit";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
    public String delete(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
        authClientService.deleteById(id);
        redirectAttributes.addFlashAttribute("msg", "删除成功");
        return "redirect:/client";
    }

}
