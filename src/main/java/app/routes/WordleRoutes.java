package app.routes;

import app.controllers.WordleController;
import io.javalin.apibuilder.EndpointGroup;
import static io.javalin.apibuilder.ApiBuilder.get;

public class WordleRoutes {
    private final WordleController wordleController;

    public WordleRoutes(WordleController wordleController) {
        this.wordleController = wordleController;
    }

    protected EndpointGroup getRoutes() {

        return () -> {
            get("/", wordleController::getAll);
            // TODO: Add more routes when needed here
        };
    }

}
