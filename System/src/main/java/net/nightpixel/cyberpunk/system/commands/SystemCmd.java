package net.nightpixel.cyberpunk.system.commands;

import net.nightpixel.cyberpunk.system.strings.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SystemCmd implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(sender instanceof Player){
            Player p = (Player) sender;
            if(!p.hasPermission("cyberpunk.command.system")){
                p.sendMessage(Strings.getInstance().getMessage(p, "NoPerms"));
            }else{
                if(args.length == 0){
                    p.sendMessage(Strings.getInstance().getMessage(p, "command.system.info"));
                }else if(args.length == 1){
                    if(args[0].equalsIgnoreCase("help")){
                        Strings.getInstance().getMessageLines(p, "command.system.help").forEach(p::sendMessage);
                    }
                }
            }
        }

        return false;
    }
}
