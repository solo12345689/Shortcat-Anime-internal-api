package com.margelo.nitro.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteBuffer b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.nativeOrder());
        byteBufferDuplicate.clear();
        AbstractC5504s.e(byteBufferDuplicate);
        return byteBufferDuplicate;
    }
}
