package me.bluedyaishela.hephaestusforge.init;

import me.bluedyaishela.hephaestusforge.entities.SwordEntity;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

import java.util.HashMap;
import java.util.Map;

public class SwordInit {
    public Map<Integer, SwordEntity> swordLevels = new HashMap<>();

    public SwordInit()
    {
        swordLevels.put(1, new SwordEntity("Epée en bois", 10, Material.WOOD_SWORD, null));
        swordLevels.put(2, new SwordEntity("Epée en bois 2", 15, Material.WOOD_SWORD, new HashMap<Enchantment, Integer>(){{
            put(Enchantment.DAMAGE_ALL, 1);
        }}));
        swordLevels.put(3, new SwordEntity("Epée en bois 3", 20, Material.WOOD_SWORD, new HashMap<Enchantment, Integer>(){{
            put(Enchantment.DAMAGE_ALL, 1);
            put(Enchantment.FIRE_ASPECT, 1);
        }}));
        swordLevels.put(4, new SwordEntity("Epée en bois 4", 30, Material.WOOD_SWORD, null));
        swordLevels.put(5, new SwordEntity("Epée en bois 5", 50, Material.WOOD_SWORD, null));
    }
}
