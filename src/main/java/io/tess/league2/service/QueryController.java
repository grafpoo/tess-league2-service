package io.tess.league2.service;

import io.tess.league2.domain.Thing;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
public class QueryController {

    @PostMapping("/num99")
    public Integer getANumber99() {
        return 3;
    }

    @GetMapping("/num0")
    public Integer getANumber0() {
        return 3;
    }

    @ResponseStatus( HttpStatus.OK )
    @GetMapping("/num1")
    public Integer getANumber1() {
        return 3;
    }

    @RequestMapping(value = "/num2", method = RequestMethod.GET)
    public Integer getANumber2() { return 3; }

    @ResponseStatus( HttpStatus.OK )
    @RequestMapping("/num3")
    public Integer getANumber3() { return 3; }

    @RequestMapping( path="/num4", produces="application/json" )
    public Integer getANumber4() { return 3; }

    @RequestMapping( path="/num5", produces="application/json" )
    public ResponseEntity<Integer> getANumber5() {
        return ResponseEntity.ok().body(3);
    }

    @GetMapping( path="/num6", produces="application/xml" )
    public ResponseEntity<Integer> getANumber6() {
        return ResponseEntity.ok().body(3);
    }

    @GetMapping("/thing0")
    public Thing getAThing0() {
        return null;
    }

    @GetMapping("/thing1")
    public Thing getAThing1() {
        return Thing.DEFAULT_THING;
    }

    @GetMapping(value = "/thing2", produces="application/json")
    public Thing getAThing2() {
        return Thing.DEFAULT_THING;
    }

    @GetMapping(value = "/thing3", produces="application/xml")
    public @ResponseBody Thing getAThing3() {
        return Thing.DEFAULT_THING;
    }

    @GetMapping(value = "/thing4", produces="application/json")
    @ResponseStatus(HttpStatus.FOUND)
    public Thing getAThing4() {
        return Thing.DEFAULT_THING;
    }

    @GetMapping(value = "/thing5", produces="application/json")
    @ResponseStatus(HttpStatus.OK)
    public Thing getAThing5() {
        return Thing.DEFAULT_THING;
    }

    @GetMapping(value = "/thing6")
    public Thing getAThing6() {
        throw new NullPointerException();
    }


}
