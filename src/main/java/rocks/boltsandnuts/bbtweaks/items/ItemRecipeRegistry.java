package rocks.boltsandnuts.bbtweaks.items;

/*
 * General place to do all your item related recipe things'n'stuff.
 */

import cpw.mods.fml.common.registry.GameRegistry;
import rocks.boltsandnuts.bbtweaks.blocks.BlockRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;


    

@SuppressWarnings("unused")
public class ItemRecipeRegistry {

    // Self explanatory. Continue these how you wish. EG: registerSmeltingRecipes
    private static void registerShapedRecipes() {
    	ItemStack invar = new ItemStack(ItemRegistry.breakbit_invar,1);
    	ItemStack electrum = new ItemStack(ItemRegistry.breakbit_electrum,1);
    	ItemStack enderium = new ItemStack(ItemRegistry.breakbit_enderium,1);
    	
    	GameRegistry.addRecipe(new ShapedOreRecipe(electrum, new Object[]{"XXX", "XXX", "XXX", 'X', invar}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(enderium, new Object[]{"XXX", "XXX", "XXX", 'X', electrum}));

    
    }

    private static void registerShapelessRecipes() {
    	ItemStack invar = new ItemStack(ItemRegistry.breakbit_invar,1);
    	ItemStack electrum = new ItemStack(ItemRegistry.breakbit_electrum,1);
    	ItemStack enderium = new ItemStack(ItemRegistry.breakbit_enderium,1);
    	ItemStack breakers = new ItemStack(ItemRegistry.breakbit_worldbreaker, 32);
    	ItemStack invars = new ItemStack(ItemRegistry.breakbit_invar, 9);
    	ItemStack electrums = new ItemStack(ItemRegistry.breakbit_electrum, 9);
    	
    	GameRegistry.addShapelessRecipe(breakers, invar );
        GameRegistry.addShapelessRecipe(invars, electrum);
        GameRegistry.addShapelessRecipe(electrums, enderium);

    
        

    }
    public static void registerItemRecipes() {
        registerShapedRecipes();
        registerShapelessRecipes();
    }
    
    

    private static void registerArcaneShapeless(){
        
    }
    
}


