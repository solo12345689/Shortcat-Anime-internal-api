package oc;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface j {
    int d();

    int getLength();

    ByteBuffer toDirectBuffer();

    void write(byte[] bArr, int i10, int i11);
}
