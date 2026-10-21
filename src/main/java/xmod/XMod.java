package xmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("xmod")
public class XMod {

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryHandler {

        @SubscribeEvent
        public static void onItemRegister(
                RegistryEvent.Register<Item> event) {

            Item totem = event.getRegistry()
                    .getValue(
                        new net.minecraft.util.ResourceLocation(
                            "minecraft", "totem_of_undying"
                        )
                    );

            if (totem != null) {
                
            }
        }
    }
}
