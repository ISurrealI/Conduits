package surreal.conduits;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import surreal.conduits.common.CommonProxy;

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
}
