package me.bluedyaishela.hephaestusforge.entities;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

import java.util.List;
import java.util.Map;

public class SwordEntity {
    private final String name;
    private final int upgradeThreshold;
    private final Material material;
    private final Map<Enchantment, Integer> enchantments;

    public SwordEntity(String name, int upgradeThreshold, Material material, Map<Enchantment, Integer> enchantments) {
        this.name = name;
        this.upgradeThreshold = upgradeThreshold;
        this.material = material;
        this.enchantments = enchantments;
    }

    public String getName() {
        return name;
    }

    public int getUpgradeThreshold() {
        return upgradeThreshold;
    }

    public Material getMaterial() {
        return material;
    }

    public Map<Enchantment, Integer> getEnchantments() {
        return enchantments;
    }
}
