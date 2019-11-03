/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.journalkeeper.rpc.codec;

import io.journalkeeper.rpc.remoting.transport.command.Type;

import static io.journalkeeper.rpc.codec.RpcTypes.CREATE_TRANSACTION_REQUEST;
import static io.journalkeeper.rpc.codec.RpcTypes.LAST_APPLIED_REQUEST;

/**
 * @author LiYue
 * Date: 2019-04-02
 */
public class CreateTransactionRequestCodec extends VoidPayloadCodec implements Type {
    @Override
    public int type() {
        return CREATE_TRANSACTION_REQUEST;
    }
}
