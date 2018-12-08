package org.code4schener.route.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.code4schener.route.domain.Delivery;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = DeliveryService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Delivery.class)
public interface DeliveryService extends EntityResolver<Delivery, Long>, ValidatorService<Delivery> {
}
