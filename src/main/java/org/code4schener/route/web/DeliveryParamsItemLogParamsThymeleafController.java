package org.code4schener.route.web;
import org.code4schener.route.domain.DeliveryParam;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = DeliveryParamsItemLogParamsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = DeliveryParam.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "logParams", views = { "list", "show" })
@RooThymeleaf
public class DeliveryParamsItemLogParamsThymeleafController {
}
