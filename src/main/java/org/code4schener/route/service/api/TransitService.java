package org.code4schener.route.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.code4schener.route.domain.Transit;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TransitService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Transit.class)
public interface TransitService extends EntityResolver<Transit, Long>, ValidatorService<Transit> {
}
