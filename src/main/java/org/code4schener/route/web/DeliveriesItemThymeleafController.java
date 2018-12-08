package org.code4schener.route.web;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.code4schener.route.domain.Delivery;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = DeliveriesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Delivery.class, type = ControllerType.ITEM)
@RooThymeleaf
public class DeliveriesItemThymeleafController implements ConcurrencyManager<Delivery> {
}
