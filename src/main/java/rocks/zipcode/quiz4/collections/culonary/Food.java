package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spices = new ArrayList();


    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Spice spice = spices.get(0);
        SpiceType type = (SpiceType) spice.getClass();
        Integer count = spices.size();
        HashMap<SpiceType,Integer> map = new HashMap<>();
        map.put(type,count);
        return map;
    }

    public void applySpice(Spice spice) { spices.add(spice); }
}
