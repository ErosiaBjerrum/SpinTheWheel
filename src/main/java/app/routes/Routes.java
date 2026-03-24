package app.routes;

import io.javalin.apibuilder.EndpointGroup;

import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.path;

public class Routes {

    private final SpinTheWheelRoutes spinTheWheelRoutes;

    public Routes(SpinTheWheelRoutes spinTheWheelRoutes) {
        this.spinTheWheelRoutes = spinTheWheelRoutes;
    }

    /*public EndpointGroup getRoutes() {
        return () -> {
            get("/", ctx -> ctx.render("index.html"));
            path("/spinthewheel", spinTheWheelRoutes.getRoutes());
        };
    }*/
}