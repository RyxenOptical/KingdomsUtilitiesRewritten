package me.ryxenoptical.kingdomsutilitiesrewritten.listeners;

//Imports
import me.ryxenoptical.kingdomsutilitiesrewritten.items.WarpStick;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import java.util.Objects;

// Warp Stick Class
public class StickClickListener implements Listener
{

    @EventHandler
    public void onPlayerRightClick(PlayerInteractEvent event) // Called on a player action
    {

        var item = Objects.requireNonNull(event).getItem();
        var action = event.getAction();

        if(Objects.requireNonNull(action).equals(Action.RIGHT_CLICK_AIR)  // If clicked on air with a stick named Warp Stick
        && Objects.requireNonNull(item).getItemMeta().hasCustomModelData())
        {

            if(item.getItemMeta().getCustomModelData() == WarpStick.warpstick.getItemMeta().getCustomModelData())
            {

                event.getPlayer().sendMessage("SUCCESS");

            }

        }

    }

}