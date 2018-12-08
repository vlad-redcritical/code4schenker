package org.code4schener.route.web;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.code4schener.route.domain.LocationLog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = LocationLogsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = LocationLog.class, type = ControllerType.ITEM)
@RooThymeleaf
public class LocationLogsItemThymeleafController implements ConcurrencyManager<LocationLog> {
}
