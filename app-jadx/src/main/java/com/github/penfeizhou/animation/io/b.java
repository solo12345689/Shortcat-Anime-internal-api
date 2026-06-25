package com.github.penfeizhou.animation.io;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ByteBuffer f38795a;

    public b() {
        d(10240);
    }

    public int a() {
        return this.f38795a.position();
    }

    public void b(byte b10) {
        this.f38795a.put(b10);
    }

    public void c(byte[] bArr) {
        this.f38795a.put(bArr);
    }

    public void d(int i10) {
        ByteBuffer byteBuffer = this.f38795a;
        if (byteBuffer == null || i10 > byteBuffer.capacity()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
            this.f38795a = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f38795a.clear();
    }

    public void e(int i10) {
        this.f38795a.position(i10 + a());
    }

    public byte[] f() {
        return this.f38795a.array();
    }

    @Override // com.github.penfeizhou.animation.io.e
    public void close() {
    }
}
