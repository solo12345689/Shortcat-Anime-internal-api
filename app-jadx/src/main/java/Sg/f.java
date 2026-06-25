package sg;

import kotlin.jvm.internal.AbstractC5504s;
import tg.C6683h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f59788a = new f();

    private f() {
    }

    public final String a(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return "Code must be in range [1000,5000): " + i10;
        }
        if ((1004 > i10 || i10 >= 1007) && (1015 > i10 || i10 >= 3000)) {
            return null;
        }
        return "Code " + i10 + " is reserved and may not be used.";
    }

    public final void b(C6683h.a cursor, byte[] key) {
        AbstractC5504s.h(cursor, "cursor");
        AbstractC5504s.h(key, "key");
        int length = key.length;
        int i10 = 0;
        do {
            byte[] bArr = cursor.f61039e;
            int i11 = cursor.f61040f;
            int i12 = cursor.f61041g;
            if (bArr != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr[i11] = (byte) (bArr[i11] ^ key[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
        } while (cursor.b() != -1);
    }

    public final void c(int i10) {
        String strA = a(i10);
        if (strA == null) {
            return;
        }
        AbstractC5504s.e(strA);
        throw new IllegalArgumentException(strA.toString());
    }
}
