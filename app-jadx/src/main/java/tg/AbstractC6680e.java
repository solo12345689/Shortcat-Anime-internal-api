package tg;

import kotlin.jvm.internal.AbstractC5504s;
import tg.C6683h;
import ug.AbstractC6776b;

/* JADX INFO: renamed from: tg.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6680e {

    /* JADX INFO: renamed from: a */
    private static final C6683h.a f61018a = new C6683h.a();

    /* JADX INFO: renamed from: b */
    private static final int f61019b = -1234567890;

    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        AbstractC5504s.h(a10, "a");
        AbstractC5504s.h(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f61019b;
    }

    public static final C6683h.a d() {
        return f61018a;
    }

    public static final int e(C6686k c6686k, int i10) {
        AbstractC5504s.h(c6686k, "<this>");
        return i10 == f61019b ? c6686k.K() : i10;
    }

    public static final int f(byte[] bArr, int i10) {
        AbstractC5504s.h(bArr, "<this>");
        return i10 == f61019b ? bArr.length : i10;
    }

    public static final C6683h.a g(C6683h.a unsafeCursor) {
        AbstractC5504s.h(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f61018a ? new C6683h.a() : unsafeCursor;
    }

    public static final int h(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long i(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short j(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String k(byte b10) {
        return Df.r.v(new char[]{AbstractC6776b.f()[(b10 >> 4) & 15], AbstractC6776b.f()[b10 & 15]});
    }

    public static final String l(int i10) {
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {AbstractC6776b.f()[(i10 >> 28) & 15], AbstractC6776b.f()[(i10 >> 24) & 15], AbstractC6776b.f()[(i10 >> 20) & 15], AbstractC6776b.f()[(i10 >> 16) & 15], AbstractC6776b.f()[(i10 >> 12) & 15], AbstractC6776b.f()[(i10 >> 8) & 15], AbstractC6776b.f()[(i10 >> 4) & 15], AbstractC6776b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return Df.r.w(cArr, i11, 8);
    }
}
