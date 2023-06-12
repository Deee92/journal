| MUT\# | MUT | CUT | total mutants in MUT | mutants not raising errors | killed by baseline | killed by oo | killed by po | killed by co | killed by (oo +) po + co |
|---|---|---|---|---|---|---|---|---|---|
| 3 | addAttributeColumn(Table, String, Class) | AttributeColumnsControllerImpl | 10 | 9 | 0 | - | 3 | 3 | 3 |
| 5 | canConvertColumnToDynamic(Column) | AttributeColumnsControllerImpl | 6 | 4 | 0 | 1 | 2 | 2 | 2 |
| 6 | setAttributeValue(Object, Element, Column) | AttributeColumnsControllerImpl | 16 | 15 | 0 | 3 | 6 | 6 | 6 |
| 7 | moveNode(Node, ForceVector) | StepDisplacement | 5 | 3 | 0 | - | 3 | 1 | 3 |
| 8 | moveNode(Node, ForceVector) | ProportionalDisplacement | 6 | 3 | 0 | - | - | 1 | 1 |
| 9 | calculateDensity(Graph,boolean) | GraphDensity | 8 | 7 | 0 | 7 | 2 | 2 | 7 |
| 11 | getColor(Color, Color, Color) | EdgeColor | 21 | 18 | 0 | - | 3 | - | 3 |
| 19 | initStartValues(Graph) | ClusteringCoefficient | 2 | 1 | 0 | - | 1 | 1 | 1 |
| 21 | addNode(NodeProperties) | QuadTree.FirstAdd | 6 | 5 | 0 | 1 | 2 | 2 | 2 |
| 24 | addNodeColumn(String, Class, boolean) | ImportContainerImpl | 9 | 5 | 0 | - | 1 | 1 | 1 |
| 26 | nodeExists(String) | ImportContainerImpl | 3 | 2 | 0 | 1 | 2 | 2 | 2 |
| 27 | addEdgeColumn(String,Class,boolean) | ImportContainerImpl | 9 | 5 | 0 | - | 1 | 1 | 1 |
| 29 | addInterval(double, double) | NodeDraft | 8 | 8 | 0 | - | 4 | 3 | 4 |
| 32 | getNode(String) | ImportContainerImpl | 7 | 6 | 0 | - | 1 | 1 | 1 |
| 33 | toHexString(Color) | SVGRenderTargetBuilder.SVGRenderTargetImpl | 7 | 5 | 0 | 4 | 2 | - | 4 |
| 35 | process(Container[], Processor, Workspace) | ImportControllerImpl | 6 | 4 | 0 | - | 2 | 1 | 2 |
| 45 | endAlgo() | ForceAtlas2 | 1 | 1 | 0 | - | 1 | 1 | 1 |
| 49 | run() | NodesThread | 10 | 7 | 0 | - | 3 | 3 | 3 |
| 54 | getCanvasSize(Item, PreviewProperties) | NodeRenderer | 9 | 9 | 0 | - | 3 | 3 | 3 |
| 55 | calculateForce(Node, Node, float) | YifanHuLayout.ElectricalForce | 14 | 11 | 0 | - | 1 | - | 1 |
| 56 | calculateForce(Node, Node, float) | YifanHuLayout.SpringForce | 8 | 5 | 0 | - | 1 | 1 | 1 |
| TOTAL | 21 MUTs |  | 171 | 133 | 0 | 17 / 133 | 44 / 133 | 35 / 99 | 52/133 (39.1%) |
