/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.physics.bullet;

/** @author xoppa */
//public class DebugDrawer extends btIDebugDraw implements Disposable {
//
//	private ShapeRenderer shapeRenderer = new ShapeRenderer();
//	private SpriteBatch spriteBatch;
//	private BitmapFont font;
//
//	private boolean ownsShapeRenderer = true, ownsSpriteBatch = true, ownsFont = true;
//
//	private Camera camera;
//	private Viewport viewport;
//	private int debugMode = btIDebugDraw.DebugDrawModes.DBG_NoDebug;
//
//
//	@Override
//	public void drawLine (Vector3f from, Vector3f to, Vector3f color) {
//		shapeRenderer.setColor(color.x, color.y, color.z, 1f);
//		shapeRenderer.line(new Vector3(from.x,from.y,from.z), new Vector3(to.x,to.y,to.z));
//	}
//
//	@Override
//	public void drawContactPoint (Vector3f pointOnB, Vector3f normalOnB, float distance, int lifeTime, Vector3f color) {
//		shapeRenderer.setColor(color.x, color.y, color.z, 1f);
//		shapeRenderer.point(pointOnB.x, pointOnB.y, pointOnB.z);
//
//		Vector3f temp = normalOnB.scale(distance).add(pointOnB);
//		shapeRenderer.line(new Vector3(pointOnB.x,pointOnB.y,pointOnB.z), new Vector3(temp.x,temp.y,temp.z));
//	}
//
//	@Override
//	public void drawTriangle (Vector3f v0, Vector3f v1, Vector3f v2, Vector3f color, float arg4) {
//		shapeRenderer.setColor(color.x, color.y, color.z, arg4);
//		Vector3 v0f = new Vector3(v0.x,v0.y,v0.z);
//		Vector3 v1f = new Vector3(v1.x,v1.y,v1.z);
//		Vector3 v2f = new Vector3(v2.x,v2.y,v2.z);
//
//		shapeRenderer.line(v0f, v1f);
//		shapeRenderer.line(v1f, v2f);
//		shapeRenderer.line(v2f, v0f);
//	}
//
//	@Override
//	public void reportErrorWarning (String warningString) {
//		Gdx.app.error("Bullet", warningString);
//	}
//
//	@Override
//	public void draw3dText (Vector3f location, String textString) {
//		if (spriteBatch == null) {
//			spriteBatch = new SpriteBatch();
//		}
//		if (font == null) {
//			font = new BitmapFont();
//		}
//
//		Vector3 loc = new Vector3(location.x,location.y,location.z);
//
//		// this check is necessary to avoid "mirrored" instances of the text
//		if (camera.frustum.pointInFrustum(loc )) {
//			if (viewport != null) {
//				camera.project(loc , viewport.getScreenX(), viewport.getScreenY(), viewport.getScreenWidth(),
//					viewport.getScreenHeight());
//			} else {
//				camera.project(loc );
//			}
//
//			shapeRenderer.end();
//			spriteBatch.begin();
//
//			// the text will be centered on the position
//			font.draw(spriteBatch, textString, location.x, location.y, 0, textString.length(), 0, Align.center, false);
//
//			spriteBatch.end();
//			shapeRenderer.begin(ShapeType.Line);
//		}
//	}
//
//	@Override
//	public void setDebugMode (int debugMode) {
//		this.debugMode = debugMode;
//	}
//
//	@Override
//	public int getDebugMode () {
//		return debugMode;
//	}
//
//	/** Use this in case no {@code glViewport} is in use. Otherwise please supply the used {@link Viewport} to
//	 * {@link #begin(Viewport)}.
//	 * @param camera The (perspective) camera to be used when doing the debug rendering. */
//	public void begin (Camera camera) {
//		this.camera = camera;
//
//		shapeRenderer.setProjectionMatrix(camera.combined);
//		shapeRenderer.begin(ShapeType.Line);
//	}
//
//	/** This has to be used in case the camera to be used is managed via a {@link Viewport}.
//	 * @param viewport The currently used viewport with its managed (perspective) camera. */
//	public void begin (Viewport viewport) {
//		this.viewport = viewport;
//		begin(viewport.getCamera());
//	}
//
//	/** Ends the debug rendering process and leads to a flush. */
//	public void end () {
//		shapeRenderer.end();
//	}
//
//	public ShapeRenderer getShapeRenderer () {
//		return shapeRenderer;
//	}
//
//	/** Switches the {@link ShapeRenderer}. The given shape renderer won't be disposed when {@link #dispose()} is called. */
//	public void setShapeRenderer (ShapeRenderer shapeRenderer) {
//		if (ownsShapeRenderer) {
//			this.shapeRenderer.dispose();
//		}
//		this.shapeRenderer = shapeRenderer;
//		ownsShapeRenderer = false;
//	}
//
//	public SpriteBatch getSpriteBatch () {
//		return spriteBatch;
//	}
//
//	/** Switches the {@link SpriteBatch}. The given sprite batch won't be disposed when {@link #dispose()} is called. */
//	public void setSpriteBatch (SpriteBatch spriteBatch) {
//		if (ownsSpriteBatch && this.spriteBatch != null) {
//			this.spriteBatch.dispose();
//		}
//		this.spriteBatch = spriteBatch;
//		ownsSpriteBatch = false;
//	}
//
//	public BitmapFont getFont () {
//		return font;
//	}
//
//	/** Switches the {@link BitmapFont}. The given font won't be disposed when {@link #dispose()} is called. */
//	public void setFont (BitmapFont font) {
//		if (ownsFont && this.font != null) {
//			this.font.dispose();
//		}
//		this.font = font;
//		ownsFont = false;
//	}
//
//	@Override
//	public void dispose () {
//		super.dispose();
//		if (ownsShapeRenderer) {
//			shapeRenderer.dispose();
//		}
//		if (ownsSpriteBatch && spriteBatch != null) {
//			spriteBatch.dispose();
//		}
//		if (ownsFont && font != null) {
//			font.dispose();
//		}
//	}
//
//}
