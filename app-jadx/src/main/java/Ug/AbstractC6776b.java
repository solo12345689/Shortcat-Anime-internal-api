package ug;

import kotlin.jvm.internal.AbstractC5504s;
import tg.C6683h;
import tg.C6686k;

/* JADX INFO: renamed from: ug.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6776b {

    /* JADX INFO: renamed from: a */
    private static final char[] f61523a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Code restructure failed: missing block: B:278:0x005d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x009d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x010c, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x018d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x01ac, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(byte[] r18, int r19) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.AbstractC6776b.c(byte[], int):int");
    }

    public static final void d(C6686k c6686k, C6683h buffer, int i10, int i11) {
        AbstractC5504s.h(c6686k, "<this>");
        AbstractC5504s.h(buffer, "buffer");
        buffer.write(c6686k.p(), i10, i11);
    }

    public static final int e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static final char[] f() {
        return f61523a;
    }
}
