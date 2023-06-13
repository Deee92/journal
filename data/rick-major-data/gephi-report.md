| MUT\# | MUT | CUT | total mutants in MUT | mutants not raising errors | killed by baseline | killed by oo | killed by po | killed by co | killed by (oo +) po + co |
|---|---|---|---|---|---|---|---|---|---|
| 3 | addAttributeColumn(Table, String, Class) | AttributeColumnsControllerImpl | 10 | 9 | 0 | - | 3 ```3_101.java, 3_154.java, 3_280.java``` | 3 ```3_101.java, 3_154.java, 3_280.java``` | 3 ```3_101.java, 3_154.java, 3_280.java``` |
| 5 | canConvertColumnToDynamic(Column) | AttributeColumnsControllerImpl | 6 | 4 | 0 | 1 ```5_58.java``` | 2 ```5_58.java, 5_59.java``` | 2 ```5_58.java, 5_59.java``` | 2 ```5_58.java, 5_59.java``` |
| 6 | setAttributeValue(Object, Element, Column) | AttributeColumnsControllerImpl | 16 | 15 | 0 | 3 ```6_103.java, 6_182.java, 6_283.java``` | 6 ```6_102.java, 6_103.java, 6_155.java, 6_182.java, 6_283.java, 6_284.java``` | 6 ```6_102.java, 6_103.java, 6_155.java, 6_182.java, 6_283.java, 6_284.java``` | 6 ```6_102.java, 6_103.java, 6_155.java, 6_182.java, 6_283.java, 6_284.java``` |
| 7 | moveNode(Node, ForceVector) | StepDisplacement | 5 | 3 | 0 | - | 3 ```7_3.java, 7_6.java, 7_7.java``` | 1 ```7_3.java``` | 3 ```7_3.java, 7_6.java, 7_7.java``` |
| 8 | moveNode(Node, ForceVector) | ProportionalDisplacement | 6 | 3 | 0 | - | - | 1 ```8_3.java``` | 1 ```8_3.java``` |
| 9 | calculateDensity(Graph,boolean) | GraphDensity | 8 | 7 | 0 | 7 ```9_7.java, 9_8.java, 9_17.java, 9_18.java, 9_19.java, 9_20.java, 9_21.java``` | 2 ```9_7.java, 9_8.java``` | 2 ```9_7.java, 9_8.java``` | 7 ```9_7.java, 9_8.java, 9_17.java, 9_18.java, 9_19.java, 9_20.java, 9_21.java``` |
| 11 | getColor(Color, Color, Color) | EdgeColor | 21 | 18 | 0 | - | 3 ```11_1.java, 11_18.java, 11_24.java``` | - | 3 ```11_1.java, 11_18.java, 11_24.java``` |
| 19 | initStartValues(Graph) | ClusteringCoefficient | 2 | 1 | 0 | - | 1 ```19_74.java``` | 1 ```19_74.java``` | 1 ```19_74.java``` |
| 21 | addNode(NodeProperties) | QuadTree.FirstAdd | 6 | 5 | 0 | 1 ```21_155.java``` | 2 ```21_154.java, 21_155.java``` | 2 ```21_154.java, 21_155.java``` | 2 ```21_154.java, 21_155.java``` |
| 24 | addNodeColumn(String, Class, boolean) | ImportContainerImpl | 9 | 5 | 0 | - | 1 ```24_116.java``` | 1 ```24_116.java``` | 1 ```24_116.java``` |
| 26 | nodeExists(String) | ImportContainerImpl | 3 | 2 | 0 | 1 ```26_142.java``` | 2 ```26_142.java, 26_143.java``` | 2 ```26_142.java, 26_143.java``` | 2 ```26_142.java, 26_143.java``` |
| 27 | addEdgeColumn(String,Class,boolean) | ImportContainerImpl | 9 | 5 | 0 | - | 1 ```27_114.java``` | 1 ```27_114.java``` | 1 ```27_114.java``` |
| 29 | addInterval(double, double) | NodeDraft | 8 | 8 | 0 | - | 4 ```29_30.java, 29_82.java, 29_115.java, 29_192.java``` | 3 ```29_30.java, 29_82.java, 29_115.java``` | 4 ```29_30.java, 29_82.java, 29_115.java, 29_192.java``` |
| 32 | getNode(String) | ImportContainerImpl | 7 | 6 | 0 | - | 1 ```32_144.java``` | 1 ```32_144.java``` | 1 ```32_144.java``` |
| 33 | toHexString(Color) | SVGRenderTargetBuilder.SVGRenderTargetImpl | 7 | 5 | 0 | 4 ```33_15.java, 33_45.java, 33_46.java, 33_59.java``` | 2 ```33_45.java, 33_46.java``` | - | 4 ```33_15.java, 33_45.java, 33_46.java, 33_59.java``` |
| 35 | process(Container[], Processor, Workspace) | ImportControllerImpl | 6 | 4 | 0 | - | 2 ```35_14.java, 35_53.java``` | 1 ```35_14.java``` | 2 ```35_14.java, 35_53.java``` |
| 45 | endAlgo() | ForceAtlas2 | 1 | 1 | 0 | - | 1 ```45_136.java``` | 1 ```45_136.java``` | 1 ```45_136.java``` |
| 49 | run() | NodesThread | 10 | 7 | 0 | - | 3 ```49_2.java, 49_4.java, 49_5.java``` | 3 ```49_2.java, 49_4.java, 49_5.java``` | 3 ```49_2.java, 49_4.java, 49_5.java``` |
| 54 | getCanvasSize(Item, PreviewProperties) | NodeRenderer | 9 | 9 | 0 | - | 3 ```54_43.java, 54_70.java, 54_71.java``` | 3 ```54_43.java, 54_70.java, 54_71.java``` | 3 ```54_43.java, 54_70.java, 54_71.java``` |
| 55 | calculateForce(Node, Node, float) | YifanHuLayout.ElectricalForce | 14 | 11 | 0 | - | 1 ```55_70.java``` | - | 1 ```55_70.java``` |
| 56 | calculateForce(Node, Node, float) | YifanHuLayout.SpringForce | 8 | 5 | 0 | - | 1 ```56_73.java``` | 1 ```56_73.java``` | 1 ```56_73.java``` |
| TOTAL | 21 MUTs |  | 171 | 133 | 0 | 17 / 133 | 44 / 133 | 35 / 133 | 52 / 133 (39.1%) |
