package regalk.test;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import regalk.test.commands.CommandTest;

public class main extends JavaPlugin {

    ConsoleCommandSender console = Bukkit.getConsoleSender();
    @Override
    public void onEnable() {

        new CommandTest(this);

        console.sendMessage("Plugin on testing is enabled.");

    }
    @Override
    public void onDisable() {
        console.sendMessage("Plugin on testing is disabled.");
    }
}
