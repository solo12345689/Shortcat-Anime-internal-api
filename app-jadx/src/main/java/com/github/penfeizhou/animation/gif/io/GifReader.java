package com.github.penfeizhou.animation.gif.io;

import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class GifReader extends c {
    private static ThreadLocal<byte[]> __intBytes = new ThreadLocal<>();

    public GifReader(Reader reader) {
        super(reader);
    }

    private static byte[] ensureBytes() {
        byte[] bArr = __intBytes.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        __intBytes.set(bArr2);
        return bArr2;
    }

    public int readUInt16() {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 2);
        return ((bArrEnsureBytes[1] & 255) << 8) | (bArrEnsureBytes[0] & 255);
    }
}
