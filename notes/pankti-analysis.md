
## Comparison of pankti results

All applications have
- methods that are public, private, protected, abstract, or static
- methods that throw exeptions
- methods that invoke other methods
- methods that call constructors
- methods that assign to fields

### All methods

\# | application | processing time (avg of 5, ms) | synchronized | empty | deprecated | annotation types
-- | ----------- | ------------------------------ | ------------ | ----- | ---------- | ----------------
1 | [commons-math v3.6.1][1] | 1428 | 140 | 27 | 552 | 0
2 | [commons-collections v4.1][2] | 587 | 12 | 6 | 43 | 0
3 | [commons-cli v1.4][3] | 226 | 0 | 0 | 43 | 0
4 | [ttorrent v2.0][4] | 281 | 24 | 20 | 11 | 0
5 | [jitsi-videobridge v2.1][5] | 340 | 15 | 19 | 0 | 2
6 | [hedwig v0.7][6] | 481 | 4 | 5 | 0 | 0
___

### Candidate methods

\# | application | % | return a value | return a primitive | ifs | loops | conditional operators | parameters | switch statements | local variables | multiple statements
-- | ----------- | - | -------------- | ------------------ | --- | ----- | --------------------- | ---------- | ----------------- | --------------- | -------------------
1 | [commons-math v3.6.1][1] | 15.6% (1023 / 6542) | 999 | 638 | 51 | 51 | 30 | 170 | 1 | 81 | 90
2 | [commons-collections v4.1][2] | 10% (281 / 2730) | 279 | 117 | 10 | 3 | 11 | 44 | 0 | 3 | 11
3 | [commons-cli v1.4][3] | 16.8% (37 / 220) | 37 | 13 | 0 | 0 | 1 | 2 | 1 | 0 | 1
4 | [ttorrent v2.0][4] | 20% (172 / 856) | 172 | 86 | 1 | 0 | 1 | 8 | 0 | 2 | 2
5 | [jitsi-videobridge v2.1][5] | 11.7% (105 / 893) | 105 | 48 | 4 | 0 | 4 | 16 | 1 | 2 | 4
6 | [hedwig v0.7][6] | 18.3% (386 / 2108) | 385 | 158 | 3 | 4 | 0 | 25 | 1 | 6 | 5

[1]: https://github.com/apache/commons-math/tree/MATH_3_6_1
[2]: https://github.com/apache/commons-collections/tree/collections-4.1
[3]: https://github.com/apache/commons-cli/tree/cli-1.4
[4]: https://github.com/mpetazzoni/ttorrent/tree/ttorrent-2.0
[5]: https://github.com/jitsi/jitsi-videobridge/tree/v2.1
[6]: https://sourceforge.net/projects/hwmail/files/0.7/

