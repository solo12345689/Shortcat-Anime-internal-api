package com.github.penfeizhou.animation.io;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface Reader {
    int available();

    void close();

    byte peek();

    int position();

    int read(byte[] bArr, int i10, int i11);

    void reset();

    long skip(long j10);

    InputStream toInputStream();
}
