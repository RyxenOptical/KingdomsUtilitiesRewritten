package me.ryxenoptical.kingdomsutilitiesrewritten;

import org.bukkit.plugin.java.JavaPlugin;

public final class KingdomsUtilitiesRewritten extends JavaPlugin {

    @Override
    public void onEnable() // Plugin startup logic
    {

        getLogger().info("Hello There!");
        getServer().getPluginManager().registerEvents(new StickClickListener(), this); // Register Warp Stick Event

    }

    @Override
    public void onDisable() // Plugin shutdown logic
    {



    }

}
