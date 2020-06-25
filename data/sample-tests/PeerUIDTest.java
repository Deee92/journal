package com.turn.ttorrent.common;

import com.thoughtworks.xstream.XStream;
import org.testng.annotations.Test;

import java.net.InetSocketAddress;

import static org.testng.Assert.assertEquals;

public class PeerUIDTest {
    static PeerUID peerUID;
    static XStream xStream = new XStream();
    static final String xml = "" +
            "<com.turn.ttorrent.common.PeerUID>\n" +
            "  <myAddress serialization=\"custom\">\n" +
            "    <java.net.InetSocketAddress>\n" +
            "      <default>\n" +
            "        <addr class=\"java.net.Inet4Address\" resolves-to=\"java.net.InetAddress\" serialization=\"custom\">\n" +
            "          <java.net.InetAddress>\n" +
            "            <default>\n" +
            "              <address>633016927</address>\n" +
            "              <family>2</family>\n" +
            "            </default>\n" +
            "          </java.net.InetAddress>\n" +
            "        </addr>\n" +
            "        <port>26950</port>\n" +
            "      </default>\n" +
            "    </java.net.InetSocketAddress>\n" +
            "  </myAddress>\n" +
            "  <myTorrentHash>081E9229D3B8A5EC654348F09CA9A2943CECE293</myTorrentHash>\n" +
            "</com.turn.ttorrent.common.PeerUID>";

    @Test
    public void testTorrentHash() {
        peerUID = (PeerUID) xStream.fromXML(xml);
        System.out.println(peerUID.toString());
        assertEquals(peerUID.getTorrentHash(), "081E9229D3B8A5EC654348F09CA9A2943CECE293");
    }
}
