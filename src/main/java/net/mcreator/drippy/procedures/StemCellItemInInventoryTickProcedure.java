package net.mcreator.drippy.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.TextComponent;

public class StemCellItemInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).setHoverName(new TextComponent(("Stem Cell (" + (itemstack.getOrCreateTag().getString("dna_type") + ")"))));
	}
}
