package org.code4schener.route.web;
import org.code4schener.route.domain.DeliveryParam;
import org.code4schener.route.service.api.DeliveryParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = DeliveryParamDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = DeliveryParam.class)
public class DeliveryParamDeserializer extends JsonObjectDeserializer<DeliveryParam> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private DeliveryParamService deliveryParamService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param deliveryParamService
     * @param conversionService
     */
    @Autowired
    public DeliveryParamDeserializer(@Lazy DeliveryParamService deliveryParamService, ConversionService conversionService) {
        this.deliveryParamService = deliveryParamService;
        this.conversionService = conversionService;
    }
}
