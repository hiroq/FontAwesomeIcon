<?php

//Copyright 2014 team-hiroq.com
//
//Licensed under the Apache License, Version 2.0 (the \"License\");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an \"AS IS\" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.


include('simple_html_dom.php');

// get Fontawesome cheatsheet
$html = file_get_html('http://fontawesome.io/cheatsheet/');

// get Fontawesome version
preg_match("/[0-9]+\.[0-9]+.[0-9]+/", $html->find('.page-header', 0)->plaintext, $match);
$ver = $match[0];

echo "/**
Copyright 2014 team-hiroq.com

Licensed under the Apache License, Version 2.0 (the \"License\");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an \"AS IS\" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.teamhiroq.libs.fontawesomeicon;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author team-hiroq
 * @version FontAwesome $ver
 * @see <a href=\"http://fontawesome.io/cheatsheet/\">FontAwesome</a>
 */
public final class FontAwesome {
    private static final Map<String, String> mIcons = new HashMap<String, String>();

    static{
";


foreach($html->find('.col-md-4') as $e){
    $values = preg_split("/[\s]+/", $e->plaintext, -1, PREG_SPLIT_NO_EMPTY);
    echo "        mIcons.put(\"".$values[1]."\", \"".preg_replace("/&#x/", "\u", $values[0])."\");\n";
}

echo "    }

    /**
     *
     * @param name
     * @return unicode value. If name is not defined, return null.
     */
    public static String getCode(final String name){
        if(mIcons.containsKey(name)){
            return mIcons.get(name);
        }else{
            return null;
        }
    }

    /**
     * @return Map<String, String>. The key is name and the value is unicode.
     */
    public static Map<String, String> getMap(){
        return Collections.unmodifiableMap(mIcons);
    }
}\n";
?>
