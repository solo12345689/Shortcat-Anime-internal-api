package com.github.penfeizhou.animation.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends FilterInputStream implements Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38796a;

    public d(InputStream inputStream) {
        super(inputStream);
        try {
            inputStream.reset();
        } catch (IOException unused) {
        }
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public byte peek() {
        byte b10 = (byte) read();
        this.f38796a++;
        return b10;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int position() {
        return this.f38796a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.io.Reader
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        this.f38796a += Math.max(0, i12);
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.io.Reader
    public synchronized void reset() {
        super.reset();
        this.f38796a = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.io.Reader
    public long skip(long j10) throws IOException {
        long j11 = j10;
        while (j11 > 0) {
            long jSkip = super.skip(j11);
            if (jSkip > 0) {
                j11 -= jSkip;
            } else {
                if (super.read() == -1) {
                    break;
                }
                j11--;
            }
        }
        long j12 = j10 - j11;
        this.f38796a = (int) (((long) this.f38796a) + j12);
        return j12;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public InputStream toInputStream() {
        return this;
    }
}
