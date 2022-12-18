package me.ryxenoptical.kingdomsutilitiesrewritten.commands;

import me.ryxenoptical.kingdomsutilitiesrewritten.items.WarpStick;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GiveWarpStick implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {

        if (!(sender instanceof Player))
        {

            sender.sendMessage("Only players can use that command!");
            return true;

        }

        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("givewarpstick"))
        {

            player.getInventory().addItem(WarpStick.warpstick);
            return true;

        }

        return true;

    }

}
