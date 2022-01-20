package regalk.test.commands;

import org.bukkit.ChatColor;
import regalk.test.main;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import regalk.test.utils.utils;

public class CommandTest implements CommandExecutor {
    private final main plugin;

    public CommandTest(main plugin){
        this.plugin = plugin;
        plugin.getCommand("test").setExecutor(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            utils.tell(p, "&cCommand Working...");
            p.setHealth(20);
        }else{
            utils.tell(sender, "&cCommand working correctly [CONSOLE]");
        }
        return false;
    }

}
