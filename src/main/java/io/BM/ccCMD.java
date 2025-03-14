package io.BM;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ccCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender.isOp()){
            if (args.length == 1 && args[0].equalsIgnoreCase("reload")){
                Main.getInstance().reloadConfig();
                sender.sendMessage(system.prefix+ ChatColor.translateAlternateColorCodes('&', "&x&F&F&E&2&5&9К&x&F&F&D&F&5&9о&x&F&F&D&C&5&8н&x&F&F&D&A&5&8ф&x&F&F&D&7&5&7и&x&F&F&D&4&5&7г &x&F&F&D&1&5&7б&x&F&F&C&E&5&6ы&x&F&F&C&C&5&6л &x&F&F&C&9&5&6п&x&F&F&C&6&5&5е&x&F&F&C&3&5&5р&x&F&F&C&0&5&4е&x&F&F&B&D&5&4з&x&F&F&B&B&5&4а&x&F&F&B&8&5&3г&x&F&F&B&5&5&3р&x&F&F&B&2&5&3у&x&F&F&A&F&5&2ж&x&F&F&A&D&5&2е&x&F&F&A&A&5&1н&x&F&F&A&7&5&1!"));
            }
        }


        return true;
    }
}
