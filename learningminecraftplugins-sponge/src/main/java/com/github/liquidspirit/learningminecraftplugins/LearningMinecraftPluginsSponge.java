package com.github.liquidspirit.learningminecraftplugins;

import com.github.liquidspirit.learningminecraftplugins.Commands.foo;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.command.CommandManager;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartingServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "learningminecraftplugins",
        name = "LearningMinecraftPlugins",
        description = "Learning Minecraft Plugins",
        url = "https://github.com/LiquidSpirit",
        authors = {
                "LiquidSpirit"
        },
        version = "1.0.0"
)
public class LearningMinecraftPluginsSponge {

    @Inject
    private Logger logger;
    private Game game;
    private CommandManager cmdManager;

}
