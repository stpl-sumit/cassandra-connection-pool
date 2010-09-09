/* Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.dataforte.cassandra.pool.jmx;

import net.dataforte.cassandra.pool.PoolConfiguration;

public interface ConnectionPoolMBean extends PoolConfiguration  {

    //=================================================================
    //       POOL STATS
    //=================================================================

    public int getSize();

    public int getIdle();

    public int getActive();
    
    public boolean isPoolSweeperEnabled();
    
    public int getNumIdle();
    
    public int getNumActive();
    
    public int getWaitCount();
    
    //=================================================================
    //       POOL OPERATIONS
    //=================================================================
    public void checkIdle();

    public void checkAbandoned();

    public void testIdle();

    //=================================================================
    //       POOL NOTIFICATIONS
    //=================================================================

    
}
