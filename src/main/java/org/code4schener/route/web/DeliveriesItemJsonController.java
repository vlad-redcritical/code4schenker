package org.code4schener.route.web;
import org.code4schener.route.domain.Delivery;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = DeliveriesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Delivery.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class DeliveriesItemJsonController {
}
