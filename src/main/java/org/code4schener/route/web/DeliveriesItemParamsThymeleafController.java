package org.code4schener.route.web;
import org.code4schener.route.domain.Delivery;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = DeliveriesItemParamsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Delivery.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "params", views = { "list", "show" })
@RooThymeleaf
public class DeliveriesItemParamsThymeleafController {
}
