## [jitsi/jitsi-videobridge](https://github.com/jitsi/jitsi-videobridge/tree/v2.1)

### Summary

Number of methods

returning a value | returning a primitive | with parameters | with if conditions | with conditional operators | with loops | with local variables | with switch cases | with multiple statements
------------------| --------------------- | --------------- | ------------------ | -------------------------- | ---------- | -------------------- | ----------------- | ------------------------
105 | 48 | 16 | 4 | 4 | 0 | 2 | 1 | 4

### Methods and tags

1. [org/jitsi/videobridge/cc/vp8/VP8Frame.java][1]
```
int getMaxSequenceNumber() {
  return maxSequenceNumber; 
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

2. [org/jitsi/videobridge/cc/vp8/VP8Frame.java][1]
```
boolean needsKeyframe() {
  return needsKeyframe; 
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

3. [org/jitsi/videobridge/cc/vp8/VP8Frame.java][1]
```
private boolean endingSequenceNumberIsKnown() {
  return endingSequenceNumberIsKnown;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

4. [org/jitsi/videobridge/cc/vp8/VP8Frame.java][1]
```
static int nextTL0PICIDX(int tl0picidx) {
  return (tl0picidx + 1) & DePacketizer.VP8PayloadDescriptor.TL0PICIDX_MASK;
}
```
Tags: {parameters=true, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

5. [org/jitsi/videobridge/cc/vp8/VP8Frame.java][1]
```
boolean matchesSSRC(@NotNull VP8Frame vp8Frame) {
  return ssrc == vp8Frame.ssrc;
}
```
Tags: {parameters=true, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

6. [org/jitsi/videobridge/cc/vp8/VP8Frame.java][1]
```
long getTimestamp() {
  return timestamp;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

7. [org/jitsi/videobridge/cc/vp8/VP8Frame.java][1]
```
boolean isTL0() {
  return isTL0;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

8. [org/jitsi/videobridge/cc/vp8/VP8Frame.java][1]
```
long getSSRCAsLong() {
return ssrc;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

9. [org/jitsi/videobridge/cc/vp8/VP8Frame.java][1]
```
int getStartingSequenceNumber() {
  return startingSequenceNumber;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

10. [org/jitsi/videobridge/cc/vp8/VP8Frame.java][1]
```
boolean isKeyframe() {
  return isKeyframe;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

11. [org/jitsi/videobridge/cc/vp8/VP8Frame.java][1]
```
int getMaxSequenceNumberSeenBeforeFirstPacket() {
  return maxSequenceNumberSeenBeforeFirstPacket;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

12. [org/jitsi/videobridge/Conference.java][2]
```
public String getGid() {
  return gid;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

13. [org/jitsi/videobridge/Conference.java][2]
```
public Logger getLogger() {
  return logger;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

14. [org/jitsi/videobridge/Conference.java][2]
```
public final String getID() {
  return id;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

15. [org/jitsi/videobridge/Conference.java][2]
```
public ConferenceShim getShim() {
return shim;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

16. [org/jitsi/videobridge/Conference.java][2]
```
public ConferenceSpeechActivity getSpeechActivity() {
  return speechActivity;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

17. [org/jitsi/videobridge/Conference.java][2]
```
public final Jid getFocus() {
  return focus;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

18. [org/jitsi/videobridge/Conference.java][2]
```
public Statistics getStatistics() {
  return statistics;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

19. [org/jitsi/videobridge/Conference.java][2]
```
public boolean includeInStatistics() {
  return includeInStatistics;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

20. [org/jitsi/videobridge/Conference.java][2]
```
public Localpart getName() {
  return name;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

21. [org/jitsi/videobridge/Conference.java][2]
```
public boolean isExpired() {
  return expired;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

22. [org/jitsi/videobridge/Conference.java][2]
```
public final Videobridge getVideobridge() {
  return videobridge;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

23. [org/jitsi/videobridge/Conference.java][2]
```
public EventAdmin getEventAdmin() {
  return eventAdmin;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

24. [org/jitsi/videobridge/Conference.java][2]
```
public Jid getLastKnowFocus() {
  return lastKnownFocus;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

25. [org/jitsi/videobridge/Conference.java][2]
```
public AudioLevelListener getAudioLevelListener() {
  return audioLevelListener;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

26. [org/jitsi/videobridge/Conference.java][2]
```
public List<Endpoint> getLocalEndpoints() {
  return endpointsCache;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

27. [org/jitsi/videobridge/Conference$NoOpDiagnosticContext ][2]
```
public Object put(@NotNull String key, @NotNull Object value) {
  return null;
}
```
Tags: {parameters=true, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

28. [org/jitsi/videobridge/Conference$NoOpTimeSeriesPoint][2]
```
public Object put(String key, Object value) {
  return null;
}
```
Tags: {parameters=true, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

29. [org/jitsi/videobridge/cc/vp8/VP8QualityFilter.java][3]
```
boolean needsKeyframe() {
  return needsKeyframe;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

30. [org/jitsi/videobridge/cc/vp8/VP8QualityFilter.java][3]
```
private static int getTemporalLayerId(int index) {
  return index > -1 ? index % 3 : -1;
}
```
Tags: {parameters=true, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=true, loops=false, multiple_statements=false}

31. [org/jitsi/videobridge/cc/vp8/VP8QualityFilter.java][3]
```
private static int getSpatialLayerId(int index) {
  return index > -1 ? index / 3 : -1;
}
```
Tags: {parameters=true, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=true, loops=false, multiple_statements=false}

32. [org/jitsi/videobridge/cc/GenericAdaptiveTrackProjectionContext.java][4]
```
public boolean needsKeyframe() {
  return needsKeyframe;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

33. [org/jitsi/videobridge/cc/GenericAdaptiveTrackProjectionContext.java][4]
```
public boolean rewriteRtcp(@NotNull RtcpSrPacket rtcpSrPacket) {
  return true;
}
```
Tags: {parameters=true, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

34. [org/jitsi/videobridge/cc/GenericAdaptiveTrackProjectionContext.java][4]
```
public PayloadType getPayloadType() {
  return payloadType;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

35. [org/jitsi/videobridge/Videobridge.java][5]
```
public boolean isShutdownInProgress() {
  return shutdownInProgress;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

36. [org/jitsi/videobridge/Videobridge.java][5]
```
public BundleContext getBundleContext() {
  return bundleContext;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

37. [org/jitsi/videobridge/Videobridge.java][5]
```
public Version getVersion() {
  return CurrentVersionImpl.VERSION;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

38. [org/jitsi/videobridge/Videobridge.java][5]
```
public Statistics getStatistics() {
  return statistics;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

39. [org/jitsi/videobridge/IceTransport.java][6]
```
boolean hasIceFailed() {
  return iceFailed;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

40. [org/jitsi/videobridge/IceTransport.java][6]
```
public boolean isConnected() {
  return iceConnected;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

41. [org/jitsi/videobridge/shim/ChannelShim.java][7]
```
public long getCreationTimestampMs() {
  return creationTimestampMs;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

42. [org/jitsi/videobridge/shim/ChannelShim.java][7]
```
public int getExpire() {
  return expire;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

43. [org/jitsi/videobridge/shim/ChannelShim.java][7]
```
Endpoint getEndpoint() {
  return endpoint;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

44. [org/jitsi/videobridge/shim/ChannelShim.java][7]
```
public Collection<SourceGroupPacketExtension> getSourceGroups() {
  return sourceGroups;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

45. [org/jitsi/videobridge/shim/ChannelShim.java][7]
```
String getId() {
  return id;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

46. [org/jitsi/videobridge/shim/ChannelShim.java][7]
```
public Collection<SourcePacketExtension> getSources() {
  return sources;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

47. [org/jitsi/videobridge/shim/ChannelShim.java][7]
```
public boolean isExpired() {
  return expired;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

48. [org/jitsi/videobridge/AbstractEndpoint.java][8]
```
public final String getID() {
  return id;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

49. [org/jitsi/videobridge/AbstractEndpoint.java][8]
```
public String getDisplayName() {
  return displayName;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

50. [org/jitsi/videobridge/AbstractEndpoint.java][8]
```
public String getStatsId() {
  return statsId;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

51. [org/jitsi/videobridge/AbstractEndpoint.java][8]
```
public Conference getConference() {
  return conference;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

52. [org/jitsi/videobridge/AbstractEndpoint.java][8]
```
public long getLastActivity() {
  return 0;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

53. [org/jitsi/videobridge/AbstractEndpoint.java][8]
```
public AbstractEndpointMessageTransport getMessageTransport() {
  return null;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

54. [org/jitsi/videobridge/AbstractEndpoint.java][8]
```
public boolean isExpired() {
  return expired;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

55. [org/jitsi/videobridge/EndpointMessageBuilder.java][9]
```
public static String createServerHelloEvent() {
  return "{\"colibriClass\":\"" + COLIBRI_CLASS_SERVER_HELLO + "\"}";
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

56. [org/jitsi/videobridge/xmpp/ComponentImpl.java][10]
```
protected String discoInfoIdentityCategoryType() {
  return "conference";
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

57. [org/jitsi/videobridge/xmpp/ComponentImpl.java][10]
```
public String getName() {
  return NAME;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

58. [org/jitsi/videobridge/xmpp/ComponentImpl.java][10]
```
public String getDescription() {
  return DESCRIPTION;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

59. [org/jitsi/videobridge/rest/ColibriWebSocketService.java][11]
```
String getServerId() {
  return serverId;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

60. [org/jitsi/videobridge/rest/ColibriWebSocketService.java][11]
```
public String getColibriWebSocketUrl(String conferenceId, String endpointId, String pwd) {
  if (baseUrl == null) {
    return null;
  }
  return baseUrl + conferenceId + "/" + endpointId + "?pwd=" + pwd;
}
```
Tags: {parameters=true, switches=false, returns_primitives=false, ifs=true, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=true}

61. [org/jitsi/videobridge/datachannel/protocol/DataChannelProtocolMessage.java][12]
```
protected int getSizeBytes() {
  return HEADER_SIZE_BYTES;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

62. [org/jitsi/videobridge/stats/StatsManagerBundleActivator.java][13]
```
public static BundleContext getBundleContext() {
  return bundleContext;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

63. [org/jitsi/videobridge/xmpp/XmppCommon.java][14]
```
BundleContext getBundleContext() {
  return bundleContext;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

64. [org/jitsi/videobridge/xmpp/MediaStreamTrackFactory.java][15]
```
private static int qid(int streamIdx, int spatialIdx, int temporalIdx,
                       int spatialLen, int temporalLen) {
  return streamIdx * spatialLen * temporalLen
        + spatialIdx * temporalLen + temporalIdx;
}
```
Tags: {parameters=true, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

65. [org/jitsi/videobridge/util/config/JvbConfig.java][16]
```
public static String[] getCommandLineArgs() {
  return commandLineArgs;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

66. [org/jitsi/videobridge/util/config/JvbConfig.java][16]
```
public static @NotNull Config getConfig() {
  return config;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

67. [org/jitsi/videobridge/util/config/JvbConfig.java][16]
```
public static Config getLegacyConfig() {
  return legacyConfig;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

68. [org/jitsi/videobridge/octo/OctoPacket.java][17]
```
private static boolean verifyMinLength(byte[] buf, int off, int len, int minLen) {
  return buf != null && off >= 0 && len >= minLen && minLen >= 0
            && off + len < buf.length;
}
```
Tags: {parameters=true, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

69. [org/jitsi/videobridge/octo/OctoPacket.java][17]
```
private static int getMediaTypeId(MediaType mediaType) {
  switch (mediaType) {
    case AUDIO:
      return OCTO_MEDIA_TYPE_AUDIO;
    case VIDEO:
      return OCTO_MEDIA_TYPE_VIDEO;
    case DATA:
      return OCTO_MEDIA_TYPE_DATA;
    default:
      return -1;
  }
}
```
Tags: {parameters=true, switches=true, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

70. [org/jitsi/videobridge/cc/vp8/VP8FrameProjection.java][18]
```
private int nextExtendedPictureId() {
  return (extendedPictureId + 1) & DePacketizer.VP8PayloadDescriptor.EXTENDED_PICTURE_ID_MASK;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

71. [org/jitsi/videobridge/cc/vp8/VP8FrameProjection.java][18]
```
public long getSSRC() {
  return ssrc;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

72. [org/jitsi/videobridge/cc/vp8/VP8FrameProjection.java][18]
```
VP8Frame getVP8Frame() {
  return vp8Frame;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

73. [org/jitsi/videobridge/cc/vp8/VP8FrameProjection.java][18]
```
boolean isFullyProjected(long nowMs) {
  return nowMs - createdMs > WAIT_MS;
}
```
Tags: {parameters=true, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

74. [org/jitsi/videobridge/cc/vp8/VP8FrameProjection.java][18]
```
long getTimestamp() {
  return timestamp;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

75. [org/jitsi/videobridge/LastNFilter.java][19]
```
public Integer getLastNValue() {
  return lastNValue;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

76. [org/jitsi/videobridge/cc/BitrateController.java][20]
```
public int getLastN() {
  return lastN;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

77. [org/jitsi/videobridge/cc/BitrateController.java][20]
```
private static boolean changeIsLargerThanThreshold(long previousBwe, long currentBwe) {
  if (previousBwe == -1 || currentBwe == -1) {
    return true;
  }

  long deltaBwe = currentBwe - previousBwe;

  return deltaBwe > 0 ||  deltaBwe < -1 * previousBwe * BWE_CHANGE_THRESHOLD_PCT / 100;
}
```
Tags: {parameters=true, switches=false, returns_primitives=true, ifs=true, local_variables=true, returns=true, conditionals=false, loops=false, multiple_statements=true}

78. [org/jitsi/videobridge/cc/BitrateController.java][20]
```
private long getAvailableBandwidth(long nowMs) {
  boolean trustBwe = this.trustBwe;
  if (trustBwe) {
    if (firstMediaMs == -1 || nowMs - firstMediaMs < 10000) {
      trustBwe = false;
    }
  }

  if (!trustBwe || !supportsRtx) {
    return Long.MAX_VALUE;
  } else {
    return lastBwe;
  }
}
```
Tags: {parameters=true, switches=false, returns_primitives=true, ifs=true, local_variables=true, returns=true, conditionals=false, loops=false, multiple_statements=true}

79. [org/jitsi/videobridge/cc/BitrateController$TrackBitrateAllocation][20]
```
private long getTargetBitrate() {
  return ratedTargetIdx != -1 ? ratedIndices[ratedTargetIdx].bps : 0;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=true, loops=false, multiple_statements=false}

80. [org/jitsi/videobridge/cc/BitrateController$TrackBitrateAllocation][20]
```
private long getIdealBitrate() {
  return idealBitrate;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

81. [org/jitsi/videobridge/cc/BandwidthProbing.java][21]
```
private long getSenderSSRC() {
  return senderSsrc == null ? -1 : senderSsrc;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=true, loops=false, multiple_statements=false}

82. [org/jitsi/videobridge/shim/ContentShim.java][22]
```
public MediaType getMediaType() {
  return mediaType;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

83. [org/jitsi/videobridge/octo/OctoEndpoints.java][23]
```
Conference getConference() {
  return conference;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

84. [org/jitsi/videobridge/octo/OctoTransceiver.java][24]
```
StreamInformationStore getStreamInformationStore() {
  return streamInformationStore;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

85. [org/jitsi/videobridge/shim/ConferenceShim.java][25]
```
public Conference getConference() {
  return conference;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

86. [org/jitsi/videobridge/Endpoint.java][26]
```
public Transceiver getTransceiver() {
  return transceiver;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

87. [org/jitsi/videobridge/Endpoint.java][26]
```
public DtlsTransport getDtlsTransport() {
  return dtlsTransport;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

88. [org/jitsi/videobridge/Endpoint.java][26]
```
public EndpointMessageTransport getMessageTransport() {
  return messageTransport;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

89. [org/jitsi/videobridge/cc/vp8/VP8AdaptiveTrackProjectionContext.java][27]
```
public PayloadType getPayloadType() {
  return payloadType;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

90. [org/jitsi/videobridge/rest/PublicRESTBundleActivator.java][28]
```
protected int getDefaultTlsPort() {
  return -1;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

91. [org/jitsi/videobridge/rest/PublicRESTBundleActivator.java][28]
```
protected int getDefaultPort() {
  return -1;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

92. [org/jitsi/videobridge/rest/ColibriWebSocketServlet.java][29]
```
ColibriWebSocketService getService() {
  return service;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

93. [org/jitsi/videobridge/datachannel/DataChannel.java][30]
```
public boolean isReady() {
  return ready;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

94. [org/jitsi/videobridge/rest/ssi/HttpServletResponseWrapper$ByteArrayServletOutputStream][31]
```
public boolean isReady() {
  return true;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

95. [org/jitsi/videobridge/cc/AdaptiveTrackProjection.java][32]
```
int getIdealIndex() {
  return idealIndex;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

96. [org/jitsi/videobridge/cc/AdaptiveTrackProjection.java][32]
```
int getTargetIndex() {
  return targetIndex;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

97. [org/jitsi/videobridge/cc/AdaptiveTrackProjection.java][32]
```
public long getTargetSsrc() {
  return targetSsrc;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

98. [org/jitsi/videobridge/osgi/BundleConfig.java][33]
```
protected String[][] getBundlesImpl() {
  return BUNDLES;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

99. [org/jitsi/videobridge/octo/OctoEndpointMessageTransport.java][34]
```
protected String getId(Object id) {
  if ((id == null) || (!(id instanceof String))) {
    return null;
  }
  return ((String) (id));
}
```
Tags: {parameters=true, switches=false, returns_primitives=false, ifs=true, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=true}

100. [org/jitsi/videobridge/octo/OctoRelay.java][35]
```
public String getId() {
  return relayId;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

101. [org/jitsi/videobridge/octo/OctoRelayService.java][36]
```
public OctoRelay getRelay() {
  return relay;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

102. [org/jitsi/videobridge/shim/VideobridgeShim.java][37]
```
private static String getOctoChannelId(MediaType mediaType) {
  return "octo-" + mediaType;
}
```
Tags: {parameters=true, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

103. [org/jitsi/videobridge/version/VersionActivator.java][38]
```
protected Version getCurrentVersion() {
  return CurrentVersionImpl.VERSION;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

104. [org/jitsi/videobridge/util/ExpireableImpl.java][39]
```
public boolean shouldExpire() {
  return false;
}
```
Tags: {parameters=false, switches=false, returns_primitives=true, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

105. [org/jitsi/videobridge/rest/root/colibri/debug/DebugFeatures.java][40]
```
public String getValue() {
  return this.value;
}
```
Tags: {parameters=false, switches=false, returns_primitives=false, ifs=false, local_variables=false, returns=true, conditionals=false, loops=false, multiple_statements=false}

[1]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/cc/vp8/VP8Frame.java
[2]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/Conference.java
[3]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/cc/vp8/VP8QualityFilter.java
[4]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/cc/GenericAdaptiveTrackProjectionContext.java
[5]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/Videobridge.java
[6]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/IceTransport.java
[7]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/shim/ChannelShim.java
[8]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/AbstractEndpoint.java
[9]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/EndpointMessageBuilder.java
[10]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/xmpp/ComponentImpl.java
[11]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/rest/ColibriWebSocketService.java
[12]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/datachannel/protocol/DataChannelProtocolMessage.java
[13]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/stats/StatsManagerBundleActivator.java
[14]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/xmpp/XmppCommon.java
[15]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/xmpp/MediaStreamTrackFactory.java
[16]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/util/config/JvbConfig.java
[17]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/octo/OctoPacket.java
[18]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/cc/vp8/VP8FrameProjection.java
[19]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/LastNFilter.java
[20]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/cc/BitrateController.java
[21]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/cc/BandwidthProbing.java
[22]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/shim/ContentShim.java
[23]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/octo/OctoEndpoints.java
[24]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/octo/OctoTransceiver.java
[25]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/shim/ConferenceShim.java
[26]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/Endpoint.java
[27]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/cc/vp8/VP8AdaptiveTrackProjectionContext.java
[28]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/rest/PublicRESTBundleActivator.java
[29]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/rest/ColibriWebSocketServlet.java
[30]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/datachannel/DataChannel.java
[31]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/rest/ssi/HttpServletResponseWrapper.java
[32]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/cc/AdaptiveTrackProjection.java
[33]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/osgi/BundleConfig.java
[34]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/octo/OctoEndpointMessageTransport.java
[35]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/octo/OctoRelay.java
[36]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/octo/OctoRelayService.java
[37]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/shim/VideobridgeShim.java
[38]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/version/VersionActivator.java
[39]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/util/ExpireableImpl.java
[40]: https://github.com/jitsi/jitsi-videobridge/blob/v2.1/src/main/java/org/jitsi/videobridge/rest/root/colibri/debug/DebugFeatures.java

