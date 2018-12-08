package org.code4schener.route.web;
import org.code4schener.route.domain.LocationLog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = LocationLogsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = LocationLog.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class LocationLogsCollectionJsonController {
}
