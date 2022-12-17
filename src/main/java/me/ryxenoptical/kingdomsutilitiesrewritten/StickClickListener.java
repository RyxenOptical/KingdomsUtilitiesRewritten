package me.ryxenoptical.kingdomsutilitiesrewritten;

//Imports
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

// Warp Stick Class
public class StickClickListener implements Listener {

    @EventHandler
    public void onPlayerRightClick(PlayerInteractEvent event) // Called on a player action
    {

        var item = event.getItem();
        var action = event.getAction();
        var wanditem = Material.STICK; //not used rn
        var wandname = "Warp Stick"; //not used rn

        event.getPlayer().sendMessage(item.getItemMeta().toString());

        if(action.equals(Action.RIGHT_CLICK_AIR)  // If clicked on air with a stick named Warp Stick
        && item.getType().equals(Material.STICK)
        && item.getItemMeta().getCustomModelData() == 1)
        {

            event.getPlayer().sendMessage("SUCCESS");

        }

    }

}