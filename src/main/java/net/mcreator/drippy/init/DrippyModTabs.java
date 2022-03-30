
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.drippy.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DrippyModTabs {
	public static CreativeModeTab TAB_GENETICS;

	public static void load() {
		TAB_GENETICS = new CreativeModeTab("tabgenetics") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DrippyModItems.FULL_SYRINGE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
