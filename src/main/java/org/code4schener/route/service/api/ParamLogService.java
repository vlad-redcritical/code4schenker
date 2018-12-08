package org.code4schener.route.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.code4schener.route.domain.ParamLog;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ParamLogService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ParamLog.class)
public interface ParamLogService extends EntityResolver<ParamLog, Long>, ValidatorService<ParamLog> {
}
