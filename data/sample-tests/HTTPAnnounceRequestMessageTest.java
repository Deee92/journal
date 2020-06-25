package com.turn.ttorrent.common.protocol.http;

import com.thoughtworks.xstream.XStream;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HTTPAnnounceRequestMessageTest {
    static HTTPAnnounceRequestMessage httpAnnounceRequestMessage;
    static XStream xStream = new XStream();
    static final String xml = "" +
            "<com.turn.ttorrent.common.protocol.http.HTTPAnnounceRequestMessage>\n" +
            "  <type>ANNOUNCE_REQUEST</type>\n" +
            "  <data class=\"java.nio.HeapByteBuffer\">\n" +
            "    <mark>-1</mark>\n" +
            "    <position>0</position>\n" +
            "    <limit>185</limit>\n" +
            "    <capacity>185</capacity>\n" +
            "    <address>16</address>\n" +
            "    <hb>ZDc6Y29tcGFjdGkxZTEwOmRvd25sb2FkZWRpMGU1OmV2ZW50NzpzdGFydGVkOTppbmZvX2hhc2gyMDoIHpIp07il7GVDSPCcqaKUPOzikzI6aXA5OjEyNy4wLjEuMTQ6bGVmdGk2NzEwODg2NDBlMTA6bm9fcGVlcl9pZGkwZTc6cGVlcl9pZDIwOi1UTzAwNDItODhkNTJkMGViOTFiNDpwb3J0aTY4ODFlODp1cGxvYWRlZGkwZWU=</hb>\n" +
            "    <offset>0</offset>\n" +
            "    <isReadOnly>false</isReadOnly>\n" +
            "    <bigEndian>true</bigEndian>\n" +
            "    <nativeByteOrder>false</nativeByteOrder>\n" +
            "  </data>\n" +
            "  <infoHash>CB6SKdO4pexlQ0jwnKmilDzs4pM=</infoHash>\n" +
            "  <peer>\n" +
            "    <address serialization=\"custom\">\n" +
            "      <java.net.InetSocketAddress>\n" +
            "        <default>\n" +
            "          <addr class=\"java.net.Inet4Address\" resolves-to=\"java.net.InetAddress\" serialization=\"custom\">\n" +
            "            <java.net.InetAddress>\n" +
            "              <default>\n" +
            "                <address>2130706689</address>\n" +
            "                <family>2</family>\n" +
            "              </default>\n" +
            "            </java.net.InetAddress>\n" +
            "          </addr>\n" +
            "          <port>6881</port>\n" +
            "        </default>\n" +
            "      </java.net.InetSocketAddress>\n" +
            "    </address>\n" +
            "    <hostId>/127.0.1.1:6881</hostId>\n" +
            "    <peerId class=\"java.nio.HeapByteBuffer\">\n" +
            "      <mark>-1</mark>\n" +
            "      <position>0</position>\n" +
            "      <limit>20</limit>\n" +
            "      <capacity>20</capacity>\n" +
            "      <address>16</address>\n" +
            "      <hb>LVRPMDA0Mi04OGQ1MmQwZWI5MWI=</hb>\n" +
            "      <offset>0</offset>\n" +
            "      <isReadOnly>false</isReadOnly>\n" +
            "      <bigEndian>true</bigEndian>\n" +
            "      <nativeByteOrder>false</nativeByteOrder>\n" +
            "    </peerId>\n" +
            "    <hexPeerId>2D544F303034322D383864353264306562393162</hexPeerId>\n" +
            "  </peer>\n" +
            "  <uploaded>0</uploaded>\n" +
            "  <downloaded>0</downloaded>\n" +
            "  <left>671088640</left>\n" +
            "  <compact>true</compact>\n" +
            "  <noPeerId>false</noPeerId>\n" +
            "  <event>STARTED</event>\n" +
            "  <numWant>50</numWant>\n" +
            "</com.turn.ttorrent.common.protocol.http.HTTPAnnounceRequestMessage>";

    @Test
    public void testOmitPeerId() {
        httpAnnounceRequestMessage = (HTTPAnnounceRequestMessage) xStream.fromXML(xml);
        assertFalse(httpAnnounceRequestMessage.canOmitPeerId(), "should be false for this object");
    }
}
