/*
 * Copyright (c) 2016 Sixlab. All rights reserved.
 *
 * Under the GPLv3(AKA GNU GENERAL PUBLIC LICENSE Version 3).
 * see http://www.gnu.org/licenses/gpl-3.0-standalone.html
 *
 * For more information, please see
 * http://sixlab.cn/
 * 
 * @author 六楼的雨/loki
 * @since 1.0.0(2016/4/2)
 */
package cn.sixlab.web.mvc.tool;

import cn.sixlab.web.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 六楼的雨/loki
 * @since 1.0.0(2016/4/2)
 */
@Controller
@RequestMapping(value = "/tool/show")
public class ShowController extends BaseController {
    //private static Logger logger = LoggerFactory.getLogger(ShowController.class);
    
    @Autowired
    private ShowService service;
    
    /**
     * 作者：曹林伟
     * 创建时间：2016/4/2 20:20
     * 功能描述：
     */
    @RequestMapping(value = {"", "/", "/index"})
    public String index(ModelMap modelMap) {
        
        return "tool/show/index";
    }
}
