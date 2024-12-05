package com.github.nxkoo.cnpcnxaddon.mixin.impl;

import com.github.nxkoo.nxlib.api.NxAbstractAPI;
import com.github.nxkoo.nxlib.api.NxLoopType;
import com.github.nxkoo.nxlib.core.api.NxAnimation;
import net.minecraft.entity.player.ServerPlayerEntity;
import noppes.npcs.api.wrapper.PlayerWrapper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import software.bernie.geckolib3.core.builder.Animation;

import java.util.List;

@Mixin(PlayerWrapper.class)
public abstract class MixinPlayerWrapper {

    private final NxAbstractAPI nxAPI = NxAbstractAPI.api();

    @Shadow public abstract ServerPlayerEntity getMCEntity();

    @Unique
    public NxAnimation registerAnimation(String animationName, int duration, boolean separateLeftAndRight, boolean lockHeldItemMainHand, String loopType) {
        return new NxAnimation(animationName, duration, separateLeftAndRight, lockHeldItemMainHand, NxLoopType.getLoopType(loopType));
    }

    @Unique
    public void startAnimation(NxAnimation animation) {
        nxAPI.startAnimation(this.getMCEntity(), animation);
    }

    @Unique
    public void stopAnimation() {
        nxAPI.stopAnimation(this.getMCEntity());
    }

    @Unique
    public List<Animation> getFirstPersonAnimations() {
        return nxAPI.getFirstPersonAnimations();
    }

    @Unique
    public List<Animation> getThirdPersonAnimations() {
        return nxAPI.getThirdPersonAnimations();
    }

    @Unique
    public List<Animation> getAllAnimations() {
        return nxAPI.getAllAnimations();
    }
}
