package org.code4schener.route.web;
import org.code4schener.route.domain.Transit;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = TransitsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Transit.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class TransitsItemJsonController {
}
