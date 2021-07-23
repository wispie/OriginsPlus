package com.github.originsplus.power;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.List;

public class ModifyBehavior extends Power {

	List<EntityType<?>> affectedEntities;
	EntityBehavior desiredBehavior;
	
	public ModifyBehavior(PowerType<?> type, LivingEntity player, EntityBehavior desiredBehavior, List<EntityType<?>> affectedEntities) {
		super(type, player);
		this.affectedEntities = affectedEntities;
		this.desiredBehavior = desiredBehavior;
	}
	
	public boolean checkEntity(EntityType<?> type) {
		return affectedEntities.contains(type);
	}
	
	public EntityBehavior getDesiredBehavior() {
		return this.desiredBehavior;
	}
	
	public static enum EntityBehavior {
		HOSTILE,
		NEUTRAL,
		PASSIVE
	}

}
