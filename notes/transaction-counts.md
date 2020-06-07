### For [current configuration](https://github.com/Deee92/journal/blob/master/notes/ttorrent.plugin.json):

#### Case 1

Command:

` java -javaagent:/home/user/glowroot/glowroot.jar -jar cli/build/ttorrent-cli-1.2-shaded.jar -o ~/Downloads/ ~/Downloads/debian-10.4.0-amd64-xfce-CD-1.iso.torrent`


method name    | RUN 1           | RUN 2           | RUN 3           | RUN 4           | RUN 5
-------------- | --------------- | --------------- | --------------- | --------------- | --------------- 
isValid        | 352525 (50.63%) | 340813 (50.93%) | 329758 (50.72%) | 348539 (50.65%) | 358744 (50.58%)
getIndex       | 335801 (48.22%) | 320338 (47.87%) | 282174 (43.40%) | 326664 (47.47%) | 316025 (44.56%)
available      | 7864 (0.01%)    | 7918 (0.01%)    | 38134 (0.05%)   | 12779 (0.01%)   | 34311 (0.04%)
getTorrentHash | 60              | 60              | 65              | 67              | 63
getBindPort    | 1               | 1               | 1               | 1               | 1
__Total__      | 696251          | 669130          | 650132          | 688050          | 709144

#### Case 2

Same command, torrent file already exists

method name    | RUN 1 | RUN 2
-------------- | ----- | ----
getTorrentHash | 3     | 3
getBindPort    | 1     | 1
__Total__      | 4     | 4

