
## Comparison of pankti results

All applications have
- methods that are public, private, protected, abstract, or static
- methods that throw exeptions
- methods that invoke other methods
- methods that call constructors
- methods that assign to fields

### All methods

\# | application | processing time (average of 5, ms) | synchronized | empty | deprecated | annotation types
-- | ----------- | -------------------- | ------------ | ----- | ---------- | ----------------
1 | [commons-math v3.6.1](https://github.com/apache/commons-math/tree/MATH_3_6_1) | 1428 | x | x | x | 
2 | [commons-collections v4.1](https://github.com/apache/commons-collections/tree/collections-4.1) | 587 | x | x | x | 
3 | [commons-cli v1.4](https://github.com/apache/commons-cli/tree/cli-1.4) | 226 | | | x | 
4 | [ttorrent v2.0](https://github.com/mpetazzoni/ttorrent/tree/ttorrent-2.0)| 281 | x | x | x | 
5 | [jitsi-videobridge v2.1](https://github.com/jitsi/jitsi-videobridge/tree/v2.1) | 340 | x | x | | x
6 | [hedwig v0.7](https://sourceforge.net/projects/hwmail/files/0.7/) | 481 | x | x | | 
___

### Candidate methods

\# | application | % | returns a value | returns a primitive | ifs | loops | conditional operators | parameters | switch statements | local variables | multiple statements
-- | ----------- | - | -------------- | ------------------ | --- | ----- | --------------------- | ---------- | ----------------- | --------------- | -------------------
1 | [commons-math v3.6.1](https://github.com/apache/commons-math/tree/MATH_3_6_1) | 15.6% (1023 / 6542) | true, false | true, false | true, false | true, false | true, false | true, false | true, false | true, false | true, false
2 | [commons-collections v4.1](https://github.com/apache/commons-collections/tree/collections-4.1) | 10% (281 / 2730) | true, false | true, false | true, false | false | true, false | true, false | false | true, false | true, false
3 | [commons-cli v1.4](https://github.com/apache/commons-cli/tree/cli-1.4) | 16.8% (37 / 220) | true | true, false | false | false | true, false | true, false | true, false | false | true, false
4 | [ttorrent v2.0](https://github.com/mpetazzoni/ttorrent/tree/ttorrent-2.0)| 20% (172 / 856) | true | true, false | true, false | false | true, false | true, false | false | true, false | true, false
5 | [jitsi-videobridge v2.1](https://github.com/jitsi/jitsi-videobridge/tree/v2.1) | 11.7% (105 / 893) | true | true, false | true, false | false | true, false | true, false | true, false | true, false | true, false
6 | [hedwig v0.7](https://sourceforge.net/projects/hwmail/files/0.7/) | 18.3% (386 / 2108) | true, false | true, false | true, false | true, false | false | true, false | true, false | true, false | true, false

