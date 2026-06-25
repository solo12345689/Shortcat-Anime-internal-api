package Ff;

import Df.AbstractC1273f;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract class c extends b {
    public static final void e(String str, int i10) {
        AbstractC5504s.h(str, "<this>");
        if (str.charAt(i10) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i10 + ", but was '" + str.charAt(i10) + '\'').toString());
    }

    public static final void f(long j10, byte[] dst, int i10, int i11, int i12) {
        AbstractC5504s.h(dst, "dst");
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = AbstractC1273f.k()[(int) ((j10 >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            dst[i10] = (byte) (i15 >> 8);
            i10 += 2;
            dst[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(String str, int i10) {
        if (str.length() <= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        AbstractC5504s.f(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(0, i10);
        AbstractC5504s.g(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append("...");
        return sb2.toString();
    }

    public static final a h(String hexString) {
        AbstractC5504s.h(hexString, "hexString");
        return a.f6658c.a(AbstractC1273f.s(hexString, 0, 16, null, 4, null), AbstractC1273f.s(hexString, 16, 32, null, 4, null));
    }

    public static final a i(String hexDashString) {
        AbstractC5504s.h(hexDashString, "hexDashString");
        long jS = AbstractC1273f.s(hexDashString, 0, 8, null, 4, null);
        e(hexDashString, 8);
        long jS2 = AbstractC1273f.s(hexDashString, 9, 13, null, 4, null);
        e(hexDashString, 13);
        long jS3 = AbstractC1273f.s(hexDashString, 14, 18, null, 4, null);
        e(hexDashString, 18);
        long jS4 = AbstractC1273f.s(hexDashString, 19, 23, null, 4, null);
        e(hexDashString, 23);
        return a.f6658c.a((jS2 << 16) | (jS << 32) | jS3, (jS4 << 48) | AbstractC1273f.s(hexDashString, 24, 36, null, 4, null));
    }
}
