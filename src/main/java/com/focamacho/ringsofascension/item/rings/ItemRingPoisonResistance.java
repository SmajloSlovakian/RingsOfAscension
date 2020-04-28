package com.focamacho.ringsofascension.item.rings;

import com.focamacho.ringsofascension.item.ItemRingBase;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effects;

public class ItemRingPoisonResistance extends ItemRingBase {

    public ItemRingPoisonResistance(Properties properties, String name) {
        super(properties, name);
    }

    @Override
    public void tickCurio(String identifier, int index, LivingEntity livingEntity) {
        if(livingEntity.isPotionActive(Effects.POISON)) {
            livingEntity.removeActivePotionEffect(Effects.POISON);
        }
    }

}