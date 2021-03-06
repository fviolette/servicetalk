/*
 * Copyright © 2018 Apple Inc. and the ServiceTalk project authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.servicetalk.buffer.netty;

import io.servicetalk.buffer.api.Buffer;

import org.junit.Test;

import static io.servicetalk.buffer.api.EmptyBuffer.EMPTY_BUFFER;
import static io.servicetalk.buffer.netty.BufferUtils.toByteBufNoThrow;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

public class BufferUtilTest {

    @Test
    public void toByteBufNoThrowWrapped() {
        Buffer buffer = mock(Buffer.class);
        WrappedBuffer wrapped = new WrappedBuffer(buffer);
        assertNull(toByteBufNoThrow(wrapped));
    }

    @Test
    public void emptyBufferCanBeConvertedToByteBuf() {
        assertNotNull(toByteBufNoThrow(EMPTY_BUFFER));
    }
}
