package me.ryxenoptical.kingdomsutilitiesrewritten.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;
import java.util.List;

public class WarpStick
{

    public static ItemStack warpstick;

    public static void StickInit()
    {

        createWarpStick();

    }

    private static void createWarpStick()
    {

        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§dWarp Stick");
        List<String> lore = new ArrayList<>();
        lore.add("§8Warp the world around you!");
        meta.setLore(lore);
        meta.setCustomModelData(5);
        item.setItemMeta(meta);
        warpstick = item;

    }


}
