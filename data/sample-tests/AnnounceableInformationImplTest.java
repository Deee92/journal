package com.turn.ttorrent.client;

import com.thoughtworks.xstream.XStream;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class AnnounceableInformationImplTest {
    static AnnounceableInformationImpl announceableInformation;
    static List<List<String>> announceList;
    static XStream xStream = new XStream();
    final static String xmlReceiving = "" +
            "<com.turn.ttorrent.client.AnnounceableInformationImpl>\n" +
            "  <uploaded>0</uploaded>\n" +
            "  <downloaded>0</downloaded>\n" +
            "  <left>671088640</left>\n" +
            "  <torrentHash class=\"com.turn.ttorrent.common.ImmutableTorrentHash\">\n" +
            "    <hash>CB6SKdO4pexlQ0jwnKmilDzs4pM=</hash>\n" +
            "    <hexHash>081E9229D3B8A5EC654348F09CA9A2943CECE293</hexHash>\n" +
            "  </torrentHash>\n" +
            "  <announceUrls class=\"singleton-list\">\n" +
            "    <singleton-list>\n" +
            "      <string>http://bttracker.debian.org:6969/announce</string>\n" +
            "    </singleton-list>\n" +
            "  </announceUrls>\n" +
            "  <announce>http://bttracker.debian.org:6969/announce</announce>\n" +
            "</com.turn.ttorrent.client.AnnounceableInformationImpl>";
    final static String xmlReturned = "" +
            "<singleton-list>\n" +
            "  <singleton-list>\n" +
            "    <string>http://bttracker.debian.org:6969/announce</string>\n" +
            "  </singleton-list>\n" +
            "</singleton-list>";

    @Test
    public void testAnnounceList() {
      announceableInformation = (AnnounceableInformationImpl) xStream.fromXML(xmlReceiving);
      announceList = (List<List<String>>) xStream.fromXML(xmlReturned);
      assertEquals(announceableInformation.getAnnounceList(), announceList);
    }
}
