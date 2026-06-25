package wg;

import java.nio.charset.Charset;
import vg.AbstractC6868a;

/* JADX INFO: renamed from: wg.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6977a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f63204a = AbstractC6868a.f62316f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f63205b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f63206c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] a(byte[] bArr) {
        return b(bArr, true);
    }

    public static char[] b(byte[] bArr, boolean z10) {
        return c(bArr, z10 ? f63205b : f63206c);
    }

    protected static char[] c(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 & 240) >>> 4];
            i10 += 2;
            cArr2[i11] = cArr[b10 & 15];
        }
        return cArr2;
    }
}
