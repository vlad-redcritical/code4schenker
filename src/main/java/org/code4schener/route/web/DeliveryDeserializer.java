package org.code4schener.route.web;
import org.code4schener.route.domain.Delivery;
import org.code4schener.route.service.api.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = DeliveryDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Delivery.class)
public class DeliveryDeserializer extends JsonObjectDeserializer<Delivery> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private DeliveryService deliveryService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param deliveryService
     * @param conversionService
     */
    @Autowired
    public DeliveryDeserializer(@Lazy DeliveryService deliveryService, ConversionService conversionService) {
        this.deliveryService = deliveryService;
        this.conversionService = conversionService;
    }
}
