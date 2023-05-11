package pl.pijok.ihtfg;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import pl.pijok.ihtfg.gameObject.Player;
import pl.pijok.ihtfg.gameObject.Position;

public class IHTFG extends ApplicationAdapter {
	private SpriteBatch batch;
	private Player player;
	
	@Override
	public void create () {
		Controllers.getTexturesManager().load();
		batch = new SpriteBatch();
		player = new Player("character_left", new Position(100, 100));
	}

	@Override
	public void render () {
		ScreenUtils.clear(25, 173, 227, 1);
		batch.begin();
		player.render(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		Controllers.getTexturesManager().dispose();
	}
}
