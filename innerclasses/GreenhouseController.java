package innerclasses;

import innerclasses.controller.Event;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();

        gc.addEvent(gc.new Bell(900));

        Event[] eventList = {
                gc.new LightOn(200),
                gc.new LightOff(400)
        };

        gc.addEvent(gc.new Restart(2000, eventList));

        gc.addEvent(new GreenhouseControls.Terminate(5000));
        gc.run();
    }
}