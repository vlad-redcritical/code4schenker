package org.code4schener.route.web;
import org.code4schener.route.domain.LocationLog;
import org.code4schener.route.service.api.LocationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = LocationLogDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = LocationLog.class)
public class LocationLogDeserializer extends JsonObjectDeserializer<LocationLog> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private LocationLogService locationLogService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param locationLogService
     * @param conversionService
     */
    @Autowired
    public LocationLogDeserializer(@Lazy LocationLogService locationLogService, ConversionService conversionService) {
        this.locationLogService = locationLogService;
        this.conversionService = conversionService;
    }
}
