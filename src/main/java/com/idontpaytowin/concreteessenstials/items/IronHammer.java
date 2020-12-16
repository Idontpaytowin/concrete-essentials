package com.idontpaytowin.concreteessenstials.items;

import com.idontpaytowin.concreteessenstials.ConcreteEssentials;
import net.minecraft.item.Item;

public class IronHammer extends Item {
    public IronHammer() {
        super(new Item.Properties()
                .group(ConcreteEssentials.TAB)
                .maxStackSize(1)
        );
    }
}
