/**
 Copyright 2014 team-hiroq.com

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.teamhiroq.libs.fontawesomeicon;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @author team-hiroq
 * @version 1.0.0
 */
public class FaIcon extends TextView {
    private static final int DEFAULT_COLOR = Color.rgb(0, 0, 0);

    private static final String PATH_TO_FONT = "fontawesome-webfont.ttf";

    private static final String ALTERNATIVE_EDIT_MODE = "\u2605";

    private static Typeface mFont = null;

    /**
     * @param context
     */
    public FaIcon(Context context) {
        super(context);
        init();
    }

    /**
     * @param context
     * @param attrs
     */
    public FaIcon(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

        // Load configurations from XML
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.FaIcon);
        final int color = ta.getColor(R.styleable.FaIcon_faColor, DEFAULT_COLOR);
        final String icon = ta.getString(R.styleable.FaIcon_faIcon);
        final float size = ta.getDimension(R.styleable.FaIcon_faSize, -1);
        ta.recycle();

        // refrect configurations to FaIcon
        setColor(color);
        setIcon(icon);
        if (size > 0) {
            setSize(size);
        }
    }

    /**
     * init FaIcon
     */
    private synchronized void init() {
        if (!isInEditMode()) {
            if (mFont == null) {
                mFont = Typeface.createFromAsset(getContext().getAssets(), PATH_TO_FONT);
            }

            if (mFont != null) {
                setTypeface(mFont);
            }
        } else {
            // In EditMode, a start is shown as an alternative icon.
            setText(ALTERNATIVE_EDIT_MODE);
        }
    }

    /**
     * set icon using a FontAwesome text name
     *
     * @param name
     */
    public void setIcon(final String name) {
        final String icon = FontAwesome.getCode(name);
        setText(icon != null ? icon : ALTERNATIVE_EDIT_MODE);
    }

    /**
     * set icon color
     *
     * @param color
     */
    public void setColor(final int color) {
        setTextColor(color);
    }

    /**
     * set icon size(dp, sp and float values)
     *
     * @param size
     */
    public void setSize(final float size) {
        setTextSize(size);
    }
}