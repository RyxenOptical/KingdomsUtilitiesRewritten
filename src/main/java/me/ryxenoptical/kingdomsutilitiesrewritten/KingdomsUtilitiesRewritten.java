package me.ryxenoptical.kingdomsutilitiesrewritten;

import me.ryxenoptical.kingdomsutilitiesrewritten.commands.GiveWarpStick;
import me.ryxenoptical.kingdomsutilitiesrewritten.listeners.StickClickListener;
import org.bukkit.plugin.java.JavaPlugin;
import me.ryxenoptical.kingdomsutilitiesrewritten.items.WarpStick;

public final class KingdomsUtilitiesRewritten extends JavaPlugin {

    @Override
    public void onEnable() // Plugin startup logic
    {

        getLogger().info("Enabling...");

        WarpStick.StickInit(); // Register Stick Item
        getServer().getPluginManager().registerEvents(new StickClickListener(), this); // Register Warp Stick Event
        getCommand("givewarpstick").setExecutor(new GiveWarpStick());

        getLogger().info("Hello There!");

    }

    @Override
    public void onDisable() // Plugin shutdown logic
    {



    }

}
