/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.journalkeeper.utils.threads;

import io.journalkeeper.utils.state.StateServer;

/**
 * 一组线程的抽象
 * @author LiYue
 * Date: 2019-06-21
 */
public interface Threads extends StateServer {
    void createThread(AsyncLoopThread asyncThread);

    void wakeupThread(String name);

    void stopThread(String name);

    void startThread(String name);

    void removeThread(String name);

    ServerState getTreadState(String name);

    boolean exists(String name);
}
