
package net.mcreator.drippy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.drippy.init.DrippyModTabs;

public class GeneticFoundationItem extends Item {
	public GeneticFoundationItem() {
		super(new Item.Properties().tab(DrippyModTabs.TAB_GENETICS).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("genetic_foundation");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
