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

package com.teamhiroq.libs.fontawesomeicon.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.teamhiroq.libs.fontawesomeicon.FaIcon;
import com.teamhiroq.libs.fontawesomeicon.FontAwesome;


/**
 * @author team-hiroq
 * @version 1.0.0
 */
public class IconAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mKeys = FontAwesome.getMap().keySet().toArray(new String[0]);

    public IconAdapter(Context context) {
        mContext = context.getApplicationContext();
    }

    @Override
    public int getCount() {
        return mKeys.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View layout = convertView == null ? View.inflate(mContext, R.layout.awesome_icon, null) : convertView;
        FaIcon icon = (FaIcon) layout.findViewById(R.id.icon);
        TextView name = (TextView) layout.findViewById(R.id.name);

        icon.setIcon(mKeys[position]);
        name.setText(mKeys[position]);
        return layout;
    }
}
