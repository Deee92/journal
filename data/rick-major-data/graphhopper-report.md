| MUT\# | MUT | CUT | valid mutants | killed baseline | killed oo | killed po | killed co | killed all |
|---|---|---|---|---|---|---|---|---|
| 3 | initialize(Bootstrap) | GraphhopperApplication | 7 | 0 | - | 1 | 1 | 1 |
| 4 | setMaxDistance(double) | DouglasPeucker | 1 | 0 | - | 1 | 1 | 1 |
| 5 | init(EncodedValue.InitializerConfig) | EncodedValue.InitializerConfig | 4 | 0 | 1 | 2 | 2 | 2 |
| 6 | loadExisting() | StorableProperties | 4 | 0 | 2 | 3 | 3 | 3 |
| 7 | add(EncodedValue) | EncodingManager.Builder | 3 | 0 | - | 1 | 1 | 1 |
| 8 | loadExisting() | LineIntIndex | 6 | 0 | 2 | 5 | 3 | 5 |
| 12 | get(BooleanEncodedValue) | VirtualEdgeIteratorState | 3 | 0 | 2 | 3 | 3 | 3 |
| 13 | getReverse(BooleanEncodedValue) | VirtualEdgeIteratorState | 4 | 0 | 3 | 4 | 3 | 4 |
| 15 | getTurnDescription(Translation) | FinishInstruction | 4 | 0 | 3 | 3 | 3 | 3 |
| 16 | getTurnDescription(Translation) | Instruction | 10 | 0 | 4 | 3 | 2 | 4 |
| 17 | getTurnDescription(Translation) | RoundaboutInstruction | 6 | 0 | 4 | 3 | 2 | 4 |
| 18 | getTurnDescription(Translation) | ViaInstruction | 4 | 0 | 3 | 3 | 3 | 3 |
| 19 | init(GraphHopperConfig) | GraphHopper | 19 | 0 | - | 1 | 1 | 1 |
| 22 | get(long,String) | StringIndex | 32 | 0 | - | 14 | 12 | 14 |
| TOTAL | 14 MUTs |  | 107 | 0 / 107 | 24 / 45 (53.3%) | 47 / 107 (44%) | 40 / 107 (37.4%) | 49 / 107 (45.8%) |
