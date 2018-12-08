package org.code4schener.route.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.code4schener.route.domain.LocationLog;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = LocationLogService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = LocationLog.class)
public interface LocationLogService extends EntityResolver<LocationLog, Long>, ValidatorService<LocationLog> {
}
