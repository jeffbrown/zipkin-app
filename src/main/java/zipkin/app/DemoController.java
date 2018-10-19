package zipkin.app;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.micronaut.tracing.annotation.NewSpan;

@Controller("/demo")
public class DemoController {

    @Get("/")
    @NewSpan("some-span")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}