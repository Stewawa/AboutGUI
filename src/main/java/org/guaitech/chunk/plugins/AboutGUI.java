package org.guaitech.chunk.plugins;

import org.bukkit.plugin.java.JavaPlugin;
import org.guaitech.chunk.plugins.commands.HelpInterface;
import org.guaitech.chunk.plugins.events.ClickGUI;

public final class AboutGUI extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("AboutGUI 已加载。");
        getLogger().info("by GuaiTech | Tech Inspires.");

        getServer().getPluginManager().registerEvents(new ClickGUI(), this);

        getCommand("about").setExecutor(new HelpInterface());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("AboutGUI 已卸载。");
    }
}
