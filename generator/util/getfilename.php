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

$root = 'http://fontawesome.io/';

include('simple_html_dom.php');

// get Fontawesome Top page
$html = file_get_html($root);
preg_match('/\/(font.*\.zip)/', $html->find('.actions', 0)->find('a', 0)->href, $match);
echo preg_replace("/\.zip/", "", $match[1])."\n";
?>