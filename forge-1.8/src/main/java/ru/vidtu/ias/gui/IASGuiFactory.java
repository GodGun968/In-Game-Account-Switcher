package ru.vidtu.ias.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

import java.util.Collections;
import java.util.Set;

public class IASGuiFactory implements IModGuiFactory {
    @Override
    public void initialize(Minecraft minecraft) {}

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return IASConfigScreen.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return Collections.emptySet();
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }
}
