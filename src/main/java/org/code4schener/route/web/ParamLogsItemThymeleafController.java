package org.code4schener.route.web;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.code4schener.route.domain.ParamLog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ParamLogsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ParamLog.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ParamLogsItemThymeleafController implements ConcurrencyManager<ParamLog> {
}
