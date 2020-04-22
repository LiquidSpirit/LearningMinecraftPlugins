package com.github.liquidspirit.learningminecraftplugins.Commands;

import com.github.liquidspirit.learningminecraftplugins.LearningMinecraftPlugins;
import org.spongepowered.api.Game;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.text.Text;

public class CommandManager {
    public static CommandSpec foo;
    private final Game game;
    private final LearningMinecraftPlugins p;

    public CommandManager(Game game, LearningMinecraftPlugins p) {
        this.game = game;
        this.p = p;
        registerCommands();
    }

    public void registerCommands() {

        foo = CommandSpec.builder()
                .description(Text.of("Plugin"))
                .executor(new foo()).build();


        Sponge.getCommandManager().register(p, foo, "foo");
    }
}
