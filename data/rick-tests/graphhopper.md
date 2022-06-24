| cut 	| mut 	| mocked 	| tests 	| oo 	| po 	| co 	| passing 	| failing 	| comments 	| category 	|
|---	|---	|---	|---	|---	|---	|---	|---	|---	|---	|---	|
| com.graphhopper.application.GraphHopperApplication 	| initialize(Bootstrap) 	| Bootstrap.addBundle(ConfiguredBundle), Bootstrap.addCommand(ConfiguredCommand) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	| domain 	|
| om.graphhopper.http.GraphHopperBundle 	| initialize(Bootstrap) 	| Bootstrap.setObjectMapper(ObjectMapper) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	| - 	|
| com.graphhopper.routing.ev.SimpleBooleanEncodedValue 	| init(EncodedValue.InitializerConfig) 	| EncodedValue$InitializerConfig.next(int) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| - 	|  	|
| com.graphhopper.routing.querygraph.VirtualEdgeIteratorState 	| get(BooleanEncodedValue) 	| BooleanEncodedValue.getBool(boolean,IntsRef) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| - 	|  	|
| com.graphhopper.routing.querygraph.VirtualEdgeIteratorState 	| getReverse(BooleanEncodedValue) 	| BooleanEncodedValue.getBool(boolean,IntsRef) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| - 	|  	|
| com.graphhopper.routing.util.EncodingManager.Builder 	| add(EncodedValue) 	| EncodedValue.getName() 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|  	|
| com.graphhopper.routing.util.EncodingManager.Builder 	| build() 	| EncodingManager.addEncodedValue(EncodedValue,boolean), EncodingManager.addEncoder(AbstractFlagEncoder) 	| 2 	| - 	| 1 	| 1 	| - 	| - 	| same invocation signature 	|  	|
| com.graphhopper.search.StringIndex 	| close() 	| DataAccess.close() 	| 2 	| - 	| 1 	| 1 	| - 	| - 	| same invocation signature 	|  	|
| com.graphhopper.search.StringIndex 	| get(long,String) 	| DataAccess.getByte(long), DataAccess.getShort(long), DataAccess.getBytes(long,byte[],int) 	| 3 	| 1 	| 1 	| 1 	| 2 	| 1 	| output unequal 	|  	|
| com.graphhopper.search.StringIndex 	| loadExisting() 	| DataAccess.loadExisting(), DataAccess.getHeader(int), DataAccess.getName(), DataAccess.getShort(long), DataAccess.getBytes(long,byte[],int), Map.size(), List.add(Object) 	| 3 	| 1 	| 1 	| 1 	| - 	| - 	| same invocation signature 	|  	|
| com.graphhopper.storage.index.LineIntIndex 	| loadExisting() 	| DataAccess.loadExisting(), DataAccess.getHeader(int) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	|  	|  	|
| com.graphhopper.storage.BaseGraphNodesAndEdges 	| loadExisting() 	| DataAccess.loadExisting(), DataAccess.getHeader(int) 	| 3 	| 1 	| 1 	| 1 	| - 	| - 	| same invocation signature 	|  	|
| com.graphhopper.storage.CHStorage 	| loadExisting() 	| DataAccess.loadExisting(), DataAccess.getHeader(int), DataAccess.getName() 	| 3 	| 1 	| 1 	| 1 	| - 	| - 	| same invocation signature 	|  	|
| com.graphhopper.storage.GraphHopperStorage 	| loadExisting() 	| StorableProperties.loadExisting(), StorableProperties.get(String), EncodingManager.toFlagEncodersAsString(), Directory.getLocation(), EncodingManager.toEncodedValuesAsString(), BaseGraph.loadExisting() 	| 3 	| 1 	| 1 	| 1 	| 0 	| 3 	| IllegalStateException 	|  	|
| com.graphhopper.storage.StorableProperties 	| loadExisting() 	| DataAccess.loadExisting(), DataAccess.getCapacity(), DataAccess.getBytes(long,byte[],int) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| - 	|  	|
| com.graphhopper.util.DistancePlaneProjection 	| calcDistance(PointList) 	| PointList.getLat(int), PointList.getLon(int), PointList.getEle(int) 	| 3 	| 1 	| 1 	| 1 	| 0 	| 3 	| invocation order, not invoked, unequal output 	|  	|
| com.graphhopper.util.DouglasPeucker 	| setMaxDistance(double) 	| DistanceCalc.calcNormalizedDist(double) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	|  	|  	|
| com.graphhopper.util.FinishInstruction 	| getTurnDescription(Translation) 	| Translation.tr(String,Object[]) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	|  	|  	|
| com.graphhopper.util.Instruction 	| getTurnDescription(Translation) 	| Translation.tr(String,Object[]) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	|  	|  	|
| com.graphhopper.util.RoundaboutInstruction 	| getTurnDescription(Translation) 	| Translation.tr(String,Object[]) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	|  	|  	|
| com.graphhopper.util.ViaInstruction 	| getTurnDescription(Translation) 	| Translation.tr(String,Object[]) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	|  	|  	|
| com.graphhopper.GraphHopper 	| init() 	| HashMap.put(Object,Object), CHPreparationHandler.init(GraphHopperConfig), LMPreparationHandler.init(GraphHopperConfig) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| IllegalArgumentException 	|  	|
| com.graphhopper.GraphHopper 	| load 	| EncodingManager.needsTurnCostsSupport(), LockFactory.setLockDir(File), GraphHopperStorage.loadExisting() 	| 3 	| 1 	| 1 	| 1 	| 0 	| 3 	| IllegalArgumentException 	|  	|
| com.graphhopper.ResponsePath 	| calcBBox2D() 	| PointList.getLon(int), PointList.getLat(int) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| wanted but not invoked 	|  	|
