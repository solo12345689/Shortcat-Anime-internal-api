package Xg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f22044d;

    f(int i10) {
        HashMap map = new HashMap();
        this.f22044d = map;
        if (((-65535) & i10) != 1) {
            throw new IllegalArgumentException();
        }
        this.f22041a = i10;
        int i11 = (i10 + 63) >>> 6;
        this.f22042b = i11;
        this.f22043c = i11 * 2;
        b(map, i10);
    }

    private static int a(int i10, int i11, int i12) {
        int i13 = 1;
        while (i12 >= 32) {
            i13 = (int) ((((4294967295L & ((long) (i11 * i13))) * ((long) i10)) + ((long) i13)) >>> 32);
            i12 -= 32;
        }
        if (i12 <= 0) {
            return i13;
        }
        return (int) ((((4294967295L & ((long) ((i11 * i13) & ((-1) >>> (-i12))))) * ((long) i10)) + ((long) i13)) >>> i12);
    }

    private static void b(Map map, int i10) {
        int i11;
        int i12 = i10 - 2;
        int iA = 32 - Oh.e.a(i12);
        int iA2 = Ug.b.a(-i10);
        for (int i13 = 1; i13 < iA; i13++) {
            int i14 = 1 << (i13 - 1);
            if (i14 >= 64 && !map.containsKey(Oh.e.b(i14))) {
                map.put(Oh.e.b(i14), Oh.e.b(a(i10, iA2, i14)));
            }
            int i15 = 1 << i13;
            if ((i12 & i15) != 0 && (i11 = (i15 - 1) & i12) >= 64 && !map.containsKey(Oh.e.b(i11))) {
                map.put(Oh.e.b(i11), Oh.e.b(a(i10, iA2, i11)));
            }
        }
    }
}
