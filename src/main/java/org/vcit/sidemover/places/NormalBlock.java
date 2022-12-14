package org.vcit.sidemover.places;

import org.vcit.sidemover.cards.BlockCard;
import org.vcit.sidemover.coordinate.Vector2;
import org.vcit.sidemover.interfaces.IDestroyable;

public class NormalBlock extends Block implements IDestroyable {

    public NormalBlock(BlockCard card, Vector2 position) {
        super(card, position);
    }

    @Override
    public int hit(int damage) {
        card.hitPoint -= damage;
        return card.hitPoint;
    }

    @Override
    public boolean isDead() {
        return (card.hitPoint <= 0);
    }
}
