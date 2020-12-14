package com.idontpaytowin.concreteessenstials.items;

import com.idontpaytowin.concreteessenstials.ConcreteEssentials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Materials extends Item {
    public Materials() {
        super(new Item.Properties()
                .group(ConcreteEssentials.TAB)

        );
    }
}
