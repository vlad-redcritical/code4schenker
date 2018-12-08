package org.code4schener.route.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.code4schener.route.domain.DeliveryParam;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = DeliveryParamService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = DeliveryParam.class)
public interface DeliveryParamService extends EntityResolver<DeliveryParam, Long>, ValidatorService<DeliveryParam> {
}
