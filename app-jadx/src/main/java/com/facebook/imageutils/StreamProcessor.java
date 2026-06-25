package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/imageutils/StreamProcessor;", "", "<init>", "()V", "readPackedInt", "", "stream", "Ljava/io/InputStream;", "numBytes", "isLittleEndian", "", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StreamProcessor {
    public static final StreamProcessor INSTANCE = new StreamProcessor();

    private StreamProcessor() {
    }

    public static final int readPackedInt(InputStream stream, int numBytes, boolean isLittleEndian) throws IOException {
        int i10;
        AbstractC5504s.h(stream, "stream");
        int i11 = 0;
        for (int i12 = 0; i12 < numBytes; i12++) {
            int i13 = stream.read();
            if (i13 == -1) {
                throw new IOException("no more bytes");
            }
            if (isLittleEndian) {
                i10 = (i13 & 255) << (i12 * 8);
            } else {
                i11 <<= 8;
                i10 = i13 & 255;
            }
            i11 |= i10;
        }
        return i11;
    }
}
