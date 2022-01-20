package regalk.test.commands;

import org.bukkit.ChatColor;
import regalk.test.main;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTest implements CommandExecutor {
    private final main plugin;

    public CommandTest(main plugin){
        this.plugin = plugin;
        plugin.getCommand(name="test").setExecutor(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            p.sendMessage(ChatColor.BLUE + "Command working correctly")
            p.setHealth(20);
        }else{
            sender.sendMessage("Command working correctly [CONSOLE]");
        }
        return false;
    }

}