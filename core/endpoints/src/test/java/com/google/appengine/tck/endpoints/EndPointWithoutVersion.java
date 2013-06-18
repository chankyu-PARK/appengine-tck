package com.google.appengine.tck.endpoints;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

import static com.google.api.server.spi.config.ApiMethod.HttpMethod;

/**
 * @author <a href="mailto:mluksa@redhat.com">Marko Luksa</a>
 */
@Api(name = EndPointWithoutVersion.NAME)
public class EndPointWithoutVersion {

    public static final String NAME = "endPointWithoutVersion";

    @ApiMethod(httpMethod = HttpMethod.GET)
    public EndPointResponse withoutParameters() {
        return new EndPointResponse("method withoutParameters was invoked");
    }

}