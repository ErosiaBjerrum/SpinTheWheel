package app.controllers;

import app.persistence.SpinTheWheelMapper;
import io.javalin.http.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpinTheWheelController {

    private final SpinTheWheelMapper spinTheWheelMapper;

    public SpinTheWheelController(SpinTheWheelMapper spinTheWheelMapper) {
        this.spinTheWheelMapper = spinTheWheelMapper;
    }

    public void getAll(Context ctx) {
        ctx.render("spinthewheel.html");
    }

    public void spin(Context ctx) {
        List<String> valg = ctx.formParams("valg");
        List<String> udfyldteValg = new ArrayList<>();

        for (String v : valg) {
            if (v != null && !v.trim().isEmpty()) {
                udfyldteValg.add(v);
            }
        }

        if (udfyldteValg.size() < 2) {
            ctx.result("Du skal udfylde mindst 2 muligheder");
            return;
        }

        Random random = new Random();
        String vinder = udfyldteValg.get(random.nextInt(udfyldteValg.size()));

        ctx.result("Vinderen er: " + vinder);
    }
}