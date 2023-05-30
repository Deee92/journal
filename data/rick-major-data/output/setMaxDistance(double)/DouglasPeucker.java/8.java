/* LittleDarwin generated order-1 mutant
mutant type: RemoveMethod
----> before:     int subSimplify(PointList points, int fromIndex, int lastIndex) {
----> after:     int subSimplify(PointList points, int fromIndex, int lastIndex) {
----> line number in original file: 118
----> mutated node: 146

*/

/*
 *  Licensed to GraphHopper GmbH under one or more contributor
 *  license agreements. See the NOTICE file distributed with this work for
 *  additional information regarding copyright ownership.
 *
 *  GraphHopper GmbH licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except in
 *  compliance with the License. You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.graphhopper.util;

/**
 * Simplifies a list of 2D points which are not too far away.
 * http://en.wikipedia.org/wiki/Ramer%E2%80%93Douglas%E2%80%93Peucker_algorithm
 * <p>
 * Calling simplify is thread safe.
 * <p>
 *
 * @author Peter Karich
 */
public class DouglasPeucker {
    private double normedMaxDist;
    private double elevationMaxDistance;
    private double maxDistance;
    private DistanceCalc calc;
    private boolean approx;

    public DouglasPeucker() {
        setApproximation(true);
        // 1m
        setMaxDistance(1);
        // elevation ignored by default
        setElevationMaxDistance(Double.MAX_VALUE);
    }

    public void setApproximation(boolean a) {
        approx = a;
        if (approx)
            calc = DistancePlaneProjection.DIST_PLANE;
        else
            calc = DistanceCalcEarth.DIST_EARTH;
    }

    /**
     * maximum distance of discrepancy (from the normal way) in meter
     */
    public DouglasPeucker setMaxDistance(double dist) {
        this.normedMaxDist = calc.calcNormalizedDist(dist);
        this.maxDistance = dist;
        return this;
    }

    /**
     * maximum elevation distance of discrepancy (from the normal way) in meters
     */
    public DouglasPeucker setElevationMaxDistance(double dist) {
        this.elevationMaxDistance = dist;
        return this;
    }

    /**
     * Simplifies the <code>points</code>, from index 0 to size-1.
     * <p>
     * It is a wrapper method for {@link DouglasPeucker#simplify(PointList, int, int)}.
     *
     * @return The number removed points
     */
    public int simplify(PointList points) {
        return simplify(points, 0, points.size() - 1);
    }

    public int simplify(PointList points, int fromIndex, int lastIndex) {
        return simplify(points, fromIndex, lastIndex, true);
    }

    /**
     * Simplifies a part of the <code>points</code>. The <code>fromIndex</code> and <code>lastIndex</code>
     * are guaranteed to be kept.
     *
     * @param points    The PointList to simplify
     * @param fromIndex Start index to simplify, should be <= <code>lastIndex</code>
     * @param lastIndex Simplify up to this index
     * @param compress  Whether or not the <code>points</code> shall be compressed or not, if set to false no points
     *                  are actually removed, but instead their lat/lon/ele is only set to NaN
     * @return The number of removed points
     */
    public int simplify(PointList points, int fromIndex, int lastIndex, boolean compress) {
        int removed = 0;
        int size = lastIndex - fromIndex;
        if (approx) {
            int delta = 500;
            int segments = size / delta + 1;
            int start = fromIndex;
            for (int i = 0; i < segments; i++) {
                // start of next is end of last segment, except for the last
                removed += subSimplify(points, start, Math.min(lastIndex, start + delta));
                start += delta;
            }
        } else {
            removed = subSimplify(points, fromIndex, lastIndex);
        }

        if (removed > 0 && compress)
            removeNaN(points);

        return removed;
    }

    // keep the points of fromIndex and lastIndex
    int subSimplify(PointList points, int fromIndex, int lastIndex) {
    return 1;
}


    /**
     * Fills all entries of the point list that are NaN with the subsequent values (and therefore shortens the list)
     */
    static void removeNaN(PointList pointList) {
        int curr = 0;
        for (int i = 0; i < pointList.size(); i++) {
            if (!Double.isNaN(pointList.getLat(i))) {
                pointList.set(curr, pointList.getLat(i), pointList.getLon(i), pointList.getEle(i));
                curr++;
            }
        }
        pointList.trimToSize(curr);
    }

}
