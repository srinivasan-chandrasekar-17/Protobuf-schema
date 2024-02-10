package Common;

import example.maps.Maps;

import java.util.Map;

public class MapsMain {

    private static Maps.IdWrapper newIds(int id) {
        return Maps.IdWrapper.newBuilder().setId(id).build();
    }

    public static void main(String[] args) {
        Maps.MapExample message = Maps.MapExample.newBuilder()
                .putIds("first_map", newIds(77))
                .putIds("second_map", newIds(33))
                .putIds("third_map", newIds(999))
                .putAllIds(Map.of(
                      "one", newIds(1),
                        "two", newIds(2),
                        "three", newIds(3)
                )).build();

        System.out.println(message);
    }
}
