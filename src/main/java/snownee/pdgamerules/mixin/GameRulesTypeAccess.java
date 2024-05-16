package snownee.pdgamerules.mixin;

import java.util.function.Supplier;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import com.mojang.brigadier.arguments.ArgumentType;

import net.minecraft.world.level.GameRules;

@Mixin(GameRules.Type.class)
public interface GameRulesTypeAccess<T extends GameRules.Value<T>> {
	@Accessor
	Supplier<ArgumentType<?>> getArgument();

}
