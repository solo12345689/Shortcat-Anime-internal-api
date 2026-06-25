package com.github.penfeizhou.animation.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ByteBuffer f38794a;

    public a(ByteBuffer byteBuffer) {
        this.f38794a = byteBuffer;
        byteBuffer.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int available() {
        return this.f38794a.limit() - this.f38794a.position();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public byte peek() {
        return this.f38794a.get();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int position() {
        return this.f38794a.position();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int read(byte[] bArr, int i10, int i11) {
        this.f38794a.get(bArr, i10, i11);
        return i11;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void reset() {
        this.f38794a.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public long skip(long j10) {
        ByteBuffer byteBuffer = this.f38794a;
        byteBuffer.position((int) (((long) byteBuffer.position()) + j10));
        return j10;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public InputStream toInputStream() {
        return new ByteArrayInputStream(this.f38794a.array());
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void close() {
    }
}
