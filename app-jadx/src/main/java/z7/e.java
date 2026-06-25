package Z7;

import a8.C2585a;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f23210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f23211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f23212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f23213d;

    e() {
    }

    static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    void c(C2585a c2585a) throws IOException {
        int iAvailable = c2585a.available();
        b(c2585a);
        int iAvailable2 = iAvailable - c2585a.available();
        int i10 = this.f23210a;
        if (iAvailable2 > i10) {
            throw new IOException("Out of chunk area");
        }
        if (iAvailable2 < i10) {
            c2585a.skip(i10 - iAvailable2);
        }
    }

    void b(C2585a c2585a) {
    }
}
