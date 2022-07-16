package surreal.conduits.client;

import net.minecraft.item.Item;
import surreal.conduits.common.CommonProxy;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderers(Item item, int meta, String variant) {
        super.registerItemRenderers(item, meta, variant);
    }
}
