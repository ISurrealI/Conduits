package surreal.conduits.common.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import surreal.conduits.Conduits;
import surreal.conduits.common.item.ModItems;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static List<Block> BLOCKS = new ArrayList<>();

    public static Block register(Block block, String name) {
        block.setRegistryName(Conduits.MODID, name).setUnlocalizedName(Conduits.MODID + "." + name).setCreativeTab(CreativeTabs.SEARCH);
        ModItems.ITEMS.add(new ItemBlock(block).setRegistryName(block.getRegistryName()).setUnlocalizedName(block.getUnlocalizedName()));
        BLOCKS.add(block);
        return block;
    }
}
