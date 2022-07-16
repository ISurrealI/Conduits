package surreal.conduits;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import surreal.conduits.common.CommonProxy;
import surreal.conduits.common.block.ModBlocks;
import surreal.conduits.common.item.ModItems;

@Mod.EventBusSubscriber(modid = Conduits.MODID)
@Mod(modid = Conduits.MODID, name = Conduits.NAME, version = Conduits.VERSION)
public class Conduits {
    public static final String MODID = "conduits";
    public static final String NAME = "Conduits";
    public static final String VERSION = "1.0";

    @SidedProxy(serverSide = "surreal.conduits.common.CommonProxy", clientSide = "surreal.conduits.client.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        ModBlocks.BLOCKS.forEach(registry::register);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        ModItems.ITEMS.forEach(registry::register);
    }
}
