package rocks.boltsandnuts.bbtweaks.client.gui;

//Creates your creative tab.

import rocks.boltsandnuts.bbtweaks.ModInformation;
import rocks.boltsandnuts.bbtweaks.items.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabBaseMod extends CreativeTabs {

    public CreativeTabBaseMod(String tabLabel) {
        super(tabLabel);
        setBackgroundImageName(ModInformation.ID + ".png"); // Automagically has tab_ applied to it. Make sure you change the texture name.
    }

    public boolean hasSearchBar() {
        return true;
    }

    //The tab icon is what you return here
    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(ItemRegistry.inertCore);
    }

    @Override
    public Item getTabIconItem() {
        return new Item();
    }
}
