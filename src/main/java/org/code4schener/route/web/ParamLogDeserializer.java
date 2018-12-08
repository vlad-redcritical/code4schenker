package org.code4schener.route.web;
import org.code4schener.route.domain.ParamLog;
import org.code4schener.route.service.api.ParamLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ParamLogDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ParamLog.class)
public class ParamLogDeserializer extends JsonObjectDeserializer<ParamLog> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ParamLogService paramLogService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param paramLogService
     * @param conversionService
     */
    @Autowired
    public ParamLogDeserializer(@Lazy ParamLogService paramLogService, ConversionService conversionService) {
        this.paramLogService = paramLogService;
        this.conversionService = conversionService;
    }
}
