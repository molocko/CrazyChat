package io.BM;

import dev.EX.Funcs;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hiCMD implements CommandExecutor {

    public static String name = "";

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(name.isBlank()){
            commandSender.sendMessage("Последний игрок не найден");
            return true;
        }
        if(commandSender instanceof Player){
            if(name.equals(commandSender.getName())){
                Funcs.sendAllPlus(Main.getInstance(),"Игрок "+ commandSender.getName()+" приветствует &bсам себя");
//                Main.getInstance().log.info("Игрок "+ commandSender.getName()+" приветствует сам себя");
                return true;
            }
            Funcs.sendAllPlus(Main.getInstance(), "Игрок "+ commandSender.getName()+" приветствует игрока &b"+name);
//            Main.getInstance().log.info("Игрок "+ commandSender.getName()+" приветствует игрока "+name);
            return true;
        }
        Funcs.sendAllPlus(Main.getInstance(), "{Console} приветствует игрока &b"+name);
//        Main.getInstance().log.info("{Console} приветствует игрока "+name);



        return true;
    }
}
