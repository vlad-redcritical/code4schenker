package org.code4schener.route.web;
import org.code4schener.route.domain.LocationLog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = LocationLogsItemParamsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = LocationLog.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "params", views = { "list", "show" })
@RooThymeleaf
public class LocationLogsItemParamsThymeleafController {
}
