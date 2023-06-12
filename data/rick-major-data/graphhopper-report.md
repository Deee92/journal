| MUT\# | MUT | CUT | total mutants in MUT | mutants not raising errors | killed by baseline | killed by oo | killed by po | killed by co | killed by (oo +) po + co |
|---|---|---|---|---|---|---|---|---|---|
| 3 | initialize(Bootstrap) | GraphhopperApplication | 8 | 7 | 0 | - | 1 | 1 | 1 |
| 4 | setMaxDistance(double) | DouglasPeucker | 2 | 1 | 0 | - | 1 | 1 | 1 |
| 5 | init(EncodedValue.InitializerConfig) | EncodedValue.InitializerConfig | 5 | 4 | 0 | 1 | 2 | 2 | 2 |
| 6 | loadExisting() | StorableProperties | 6 | 4 | 0 | 2 | 3 | 3 | 3 |
| 7 | add(EncodedValue) | EncodingManager.Builder | 4 | 3 | 0 | - | 1 | 1 | 1 |
| 8 | loadExisting() | LineIntIndex | 6 | 6 | 0 | 2 | 5 | 3 | 5 |
| 12 | get(BooleanEncodedValue) | VirtualEdgeIteratorState | 4 | 3 | 0 | 2 | 3 | 3 | 3 |
| 13 | getReverse(BooleanEncodedValue) | VirtualEdgeIteratorState | 5 | 4 | 0 | 3 | 4 | 3 | 4 |
| 15 | getTurnDescription(Translation) | FinishInstruction | 5 | 4 | 0 | 3 | 3 | 3 | 3 |
| 16 | getTurnDescription(Translation) | Instruction | 11 | 10 | 0 | 4 | 3 | 2 | 4 |
| 17 | getTurnDescription(Translation) | RoundaboutInstruction | 8 | 6 | 0 | 4 | 3 | 2 | 4 |
| 18 | getTurnDescription(Translation) | ViaInstruction | 5 | 4 | 0 | 3 | 3 | 3 | 3 |
| 19 | init(GraphHopperConfig) | GraphHopper | 26 | 19 | 0 | - | 1 | 1 | 1 |
| 22 | get(long,String) | StringIndex | 33 | 32 | 0 | - | 14 | 12 | 14 |
| TOTAL | 14 MUTs |  | 128 | 107 | 0 / 107 | 24 / 107 | 47 / 107 | 40 / 107 | 49 / 107 (45.8%) |
