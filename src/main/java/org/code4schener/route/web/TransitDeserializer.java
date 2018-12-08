package org.code4schener.route.web;
import org.code4schener.route.domain.Transit;
import org.code4schener.route.service.api.TransitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TransitDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Transit.class)
public class TransitDeserializer extends JsonObjectDeserializer<Transit> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TransitService transitService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param transitService
     * @param conversionService
     */
    @Autowired
    public TransitDeserializer(@Lazy TransitService transitService, ConversionService conversionService) {
        this.transitService = transitService;
        this.conversionService = conversionService;
    }
}
