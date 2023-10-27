package ru.appline.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.appline.logic.Compass;
import ru.appline.logic.CompassModel;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Controller {
    private static final CompassModel compassModel = CompassModel.getInstance();

    @PostMapping(value = "/createCompass", consumes = "application/json")
    public void createCompass(@RequestBody String side, Compass compass) {
        compassModel.add(compass, side);
    }

    @GetMapping(value = "/getAll", produces = "application/json")
    public Map<String, Compass> getAll() {
        return compassModel.getAll();
    }


    @GetMapping(value = "/getSide", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> degree(@RequestParam(value="Degree") Integer Degree) {

        Compass side1 = compassModel.get("North");
        String po1 = "North";
        String one = side1.pars;
        String[] parts1 = one.split("-");
        int number1 = Integer.parseInt(parts1[parts1 .length-2]);
        int number2 = Integer.parseInt(parts1[parts1 .length-1]);

        Compass side2 = compassModel.get("NorthEast");
        String po2 = "NorthEast";
        String two = side2.pars;
        String[] parts2 = two.split("-");
        int number3 = Integer.parseInt(parts2[parts2 .length-2]);
        int number4 = Integer.parseInt(parts2[parts2 .length-1]);

        Compass side3 = compassModel.get("East");
        String po3 = "East";
        String three = side3.pars;
        String[] parts3 = three.split("-");
        int number5 = Integer.parseInt(parts3[parts3 .length-2]);
        int number6 = Integer.parseInt(parts3[parts3 .length-1]);

        Compass side4 = compassModel.get("SouthEast");
        String po4 = "SouthEast";
        String four = side4.pars;
        String[] parts4 = four.split("-");
        int number7 = Integer.parseInt(parts4[parts4 .length-2]);
        int number8 = Integer.parseInt(parts4[parts4 .length-1]);

        Compass side5 = compassModel.get("South");
        String po5 = "South";
        String five = side5.pars;
        String[] parts5 = five.split("-");
        int number9 = Integer.parseInt(parts5[parts5 .length-2]);
        int number10 = Integer.parseInt(parts5[parts5 .length-1]);

        Compass side6 = compassModel.get("SouthWest");
        String po6 = "SouthWest";
        String six = side6.pars;
        String[] parts6 = six.split("-");
        int number11 = Integer.parseInt(parts6[parts6 .length-2]);
        int number12 = Integer.parseInt(parts6[parts6 .length-1]);

        Compass side7 = compassModel.get("West");
        String po7 = "West";
        String seven = side7.pars;
        String[] parts7 = seven.split("-");
        int number13 = Integer.parseInt(parts7[parts7 .length-2]);
        int number14 = Integer.parseInt(parts7[parts7 .length-1]);

        Compass side8 = compassModel.get("NorthWest");
        String po8 = "NorthWest";
        String eight = side8.pars;
        String[] parts8 = eight.split("-");
        int number15 = Integer.parseInt(parts8[parts8 .length-2]);
        int number16 = Integer.parseInt(parts8[parts8 .length-1]);


            if (Degree > number1 && Degree < number2) {
                return new ResponseEntity<String>("{\"Side\":" +
                        "\"" +
                        po1 +
                        "\"}", HttpStatus.OK);
            } else if (Degree > number3 && Degree < number4) {
                return new ResponseEntity<String>("{\"Side\":" +
                        "\"" +
                        po2 +
                        "\"}", HttpStatus.OK);
            } else if (Degree > number5 && Degree < number6) {
                return new ResponseEntity<String>("{\"Side\":" +
                        "\"" +
                        po3 +
                        "\"}", HttpStatus.OK);
            } else if (Degree > number7 || Degree < number8) {
                return new ResponseEntity<String>("{\"Side\":" +
                        "\"" +
                        po4 +
                        "\"}", HttpStatus.OK);
            } else if (Degree > number9 && Degree < number10) {
                return new ResponseEntity<String>("{\"Side\":" +
                        "\"" +
                        po5 +
                        "\"}", HttpStatus.OK);
            } else if (Degree > number11 && Degree < number12) {
                return new ResponseEntity<String>("{\"Side\":" +
                        "\"" +
                        po6 +
                        "\"}", HttpStatus.OK);
            } else if (Degree > number13 || Degree < number14) {
                return new ResponseEntity<String>("{\"Side\":" +
                        "\"" +
                        po7 +
                        "\"}", HttpStatus.OK);
            } else if (Degree > number15 && Degree < number16) {
                return new ResponseEntity<String>("{\"Side\":" +
                        "\"" +
                        po8 +
                        "\"}", HttpStatus.OK);
            }

        return new ResponseEntity<String>("{\"text\":\"FAILED\"}", HttpStatus.OK);
    }
}
