package pl.pijok.ihtfg.gameObject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import lombok.AllArgsConstructor;
import pl.pijok.ihtfg.Controllers;

@AllArgsConstructor
public abstract class GameObject {

    private String textureID;
    private Position position;

    public void render(SpriteBatch batch) {
        batch.draw(
                Controllers.getTexturesManager().getTexture(textureID),
                position.getX(),
                position.getY()
        );
    }

}
