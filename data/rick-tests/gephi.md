| cut 	| mut 	| mocked 	| tests 	| oo 	| po 	| co 	| passing 	| failing 	| comments 	|
|---	|---	|---	|---	|---	|---	|---	|---	|---	|---	|
| org.gephi.datalab.impl.AttributeColumnsControllerImpl 	| setAttributeValue(Object,Element,Column) 	| Element.setAttribute(Column,Object) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| - 	|
| org.gephi.datalab.impl.AttributeColumnsControllerImpl 	| canClearColumnData(Column) 	| Column.getId(), Column.isReadOnly() 	| 3 	| 1 	| 1 	| 1 	| 0 	| 3 	| NPE 	|
| org.gephi.datalab.impl.AttributeColumnsControllerImpl 	| addAttributeColumn(Table,String,Class) 	| Table.hasColumn(String) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.gephi.datalab.impl.AttributeColumnsControllerImpl 	| canConvertColumnToDynamic(Column) 	| Column.isReadOnly(), Column.getTitle() 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| - 	|
| org.gephi.datalab.impl.GraphElementsControllerImpl 	| createEdge(String,Node,Node,boolean,Object,Graph) 	| Graph.addEdge(Edge) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.datalab.impl.GraphElementsControllerImpl 	| createNode(String,Graph) 	| Graph.addNode(Node) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.datalab.impl.GraphElementsControllerImpl 	| mergeNodes(Graph,Node[],Node,Column[],AttributeRowsMergeStrategy[],boolean) 	| NodeProperties.x(), NodeProperties.y(), NodeProperties.z(), NodeProperties.size(), ElementProperties.r(), ElementProperties.g(), ElementProperties.b(), ElementProperties.alpha() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.datalab.impl.SearchReplaceControllerImpl 	| replaceAll(SearchOptions,String) 	| SearchReplaceController$SearchOptions.resetStatus() 	| 3 	| 1 	| 1 	| 1 	| 0 	| 3 	| NPE 	|
| org.gephi.datalab.plugin.manipulators.columns.merge.AttributeColumnsMergeStrategiesControllerImpl 	| mergeDateColumnsToTimeInterval(Table,Column,Column,SimpleDateFormat,String,String) 	| Column.getIndex(), DateFormat.setTimeZone(TimeZone) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.datalab.plugin.manipulators.columns.merge.AttributeColumnsMergeStrategiesControllerImpl 	| mergeNumericColumnsToTimeInterval(Table,Column,Column,double,double) 	| Column.getIndex() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.importer.impl.NodeDraft 	| addInterval(double,double) 	| TimeSet.add(Object) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.gephi.importer.impl.ImportContainerImpl 	| addEdge(EdgeDraft) 	| Object2IntMap.containsKey(Object), List.add(java.lang.Object), Object2IntFunction.put(Object,int), ElementDraft.getId() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| Class cast exception 	|
| org.gephi.importer.impl.ImportContainerImpl 	| addEdgeColumn(String,Class,boolean) 	| Object2ObjectMap.size(), Class.getSimpleName() 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.gephi.importer.impl.ImportContainerImpl 	| addNode(NodeDraft) 	| Object2IntMap.containsKey(Object), List.add(Object), Object2IntFunction.put(Object,int) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| wanted but not invoked 	|
| org.gephi.importer.impl.ImportContainerImpl 	| addNodeColumn(String,Class,boolean) 	| Object2ObjectMap.size(), Class.getSimpleName() 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.gephi.importer.impl.ImportContainerImpl 	| getNode(String) 	| Object2IntFunction.getInt(Object) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.gephi.importer.impl.ImportContainerImpl 	| nodeExists(String) 	| Object2IntMap.containsKey(Object) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| - 	|
| org.gephi.importer.impl.ImportContainerImpl 	| verify() 	| Class.getSimpleName(), Object2IntMap.size() 	| 3 	| 1 	| 1 	| 1 	| 0 	| 3 	| array index out of bounds 	|
| org.gephi.io.importer.impl.ImportControllerImpl 	| process(Container[],Processor,Workspace) 	| Processor.setContainers(ContainerUnloader[]), Processor.setWorkspace(Workspace), Processor.process() 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.gephi.io.importer.impl.ImportControllerImpl 	| importFile(Reader,FileImporter,File) 	| Reader.close(), FileImporter.setReader(Reader), Importer.execute(ContainerLoader) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| wanted but not invoked 	|
| org.gephi.layout.plugin.force.quadtree.QuadTree.FirstAdd 	| addNode(Node) 	| Node.x(), Node.y() 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| - 	|
| org.gephi.layout.plugin.force.yifanHu.YifanHuLayout.ElectricalForce 	| calculateForce(Node,Node,float) 	| Node.x(), Node.y() 	| 2 	| - 	| 1 	| 1 	| PO 	| CO 	| 1 extra invocation 	|
| org.gephi.layout.plugin.force.yifanHu.YifanHuLayout.SpringForce 	| calculateForce(Node,Node,float) 	| Node.x(), Node.y() 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.gephi.layout.plugin.force.ProportionalDisplacement 	| moveNode(Node,ForceVector) 	| Node.setX(float), Node.setY(float) 	| 2 	| - 	| 1 	| 1 	| CO 	| PO 	| different args expected 	|
| org.gephi.layout.plugin.force.StepDisplacement 	| moveNode(Node,ForceVector) 	| Node.setX(float), Node.setY(float) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.gephi.layout.plugin.forceatlas.ForceAtlasLayout 	| goAlgo() 	| Graph.getDegree(Node) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| wanted but not invoked 	|
| org.gephi.layout.plugin.forceatlas2.ForceAtlas2 	| initAlgo() 	| Graph.getDegree(Node) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| wanted but not invoked 	|
| org.gephi.layout.plugin.forceatlas2.ForceAtlas2 	| goAlgo() 	| Graph.getDegree(Node) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.layout.plugin.forceatlas2.ForceAtlas2 	| endAlgo() 	| ExecutorService.shutdown() 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.gephi.layout.plugin.forceatlas2.NodesThread 	| run() 	| ForceFactory$RepulsionForce.apply(Node,Node), ForceFactory$RepulsionForce.apply(Node,double) 	| 4 	| - 	| 2 	| 2 	| 2PO 	| 2CO 	| wanted x times but was y times 	|
| org.gephi.layout.plugin.openord.OpenOrdLayout 	| initAlgo() 	| Graph.getNodeCount(), Control.initParams(Params,int), Control.initWorker(Worker) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| wanted but not invoked 	|
| org.gephi.layout.plugin.scale.ExpandLayout 	| goAlgo() 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| wanted but not invoked 	|
| org.gephi.layout.plugin.scale.ContractLayout 	| goAlgo() 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| wanted but not invoked 	|
| org.gephi.preview.plugin.builders.EdgeBuilder 	| getItems(Graph) 	| Graph.getEdgeCount(), Graph.isDirected(Edge) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.preview.plugin.builders.NodeBuilder 	| getItems(Graph) 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.preview.plugin.renderers.NodeRenderer 	| getCanvasSize(Item,PreviewProperties) 	| PreviewProperties.getFloatValue(String) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.gephi.preview.plugin.renderers.NodeRenderer 	| renderPDF(Item,PDFTarget,PreviewProperties) 	| PreviewProperties.getFloatValue(String), PreviewProperties.getBooleanValue(String) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.preview.types.EdgeColor 	| getColor(Color,Color,Color) 	| Color.getRed(), Color.getGreen(), Color.getBlue(), Color.getAlpha() 	| 2 	| - 	| 1 	| 1 	| PO 	| CO 	| wanted but not invoked 	|
| org.gephi.preview.PreviewControllerImpl 	| getModel(Workspace) 	| Workspace.add(Object) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.preview.SVGRenderTargetBuilder 	| toHexString(Color) 	| Color.getRGB() 	| 3 	| 1 	| 1 	| 1 	| 2 	| CO 	| wanted 5 times but was one time 	|
| org.gephi.statistics.plugin.ClusteringCoefficient 	| initStartValues(Graph) 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.gephi.statistics.plugin.ConnectedComponents 	| computeWeaklyConnectedComponents(Graph,HashMap) 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.statistics.plugin.ConnectedComponents 	| top_tarjans(DirectedGraph,HashMap) 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.statistics.plugin.Degree 	| execute(Graph) 	| Graph.isDirected(), Graph.setAttribute(String,Object) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.statistics.plugin.EigenvectorCentrality 	| calculateEigenvectorCentrality(Graph,double[],HashMap,HashMap,boolean,int) 	| Graph.getNodeCount() 	| 3 	| 1 	| 1 	| 1 	| 0 	| 3 	| NPE 	|
| org.gephi.statistics.plugin.EigenvectorCentrality 	| execute(Graph) 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.statistics.plugin.GraphDensity 	| calculateDensity(Graph,boolean) 	| Graph.getEdgeCount(), Graph.getNodeCount() 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| - 	|
| org.gephi.statistics.plugin.GraphDistance 	| calculateDistanceMetrics(Graph,HashMap,boolean,boolean) 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.statistics.plugin.GraphDistance 	| execute(Graph) 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.statistics.plugin.Hits 	| calculateHits(Graph,double[],double[],Map,boolean,double) 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.statistics.plugin.Hits 	| execute(Graph) 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.statistics.plugin.Modularity 	| execute(Graph) 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.statistics.plugin.StatisticalInferenceClustering 	| execute(Graph) 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.statistics.plugin.WeightedDegree 	| calculateAverageWeightedDegree(Graph,boolean,boolean) 	| Graph.getNodeCount() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.gephi.statistics.plugin.WeightedDegree 	| execute(Graph) 	| Graph.isDirected() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
