package app.controllers;

import app.persistence.WordleMapper;
import io.javalin.http.Context;

public class WordleController {
    private final WordleMapper wordleMapper;

    public WordleController(WordleMapper wordleMapper) {
        this.wordleMapper = wordleMapper;
    }

    public void getAll(Context ctx){
        ctx.result("Hilsen fra Wordle");
    }


}
