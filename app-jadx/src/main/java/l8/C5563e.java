package l8;

import android.text.TextUtils;
import java.io.IOException;
import m8.C5647a;

/* JADX INFO: renamed from: l8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5563e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52693c;

    public static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    final void c(C5647a c5647a) throws IOException {
        int iAvailable = c5647a.available();
        b(c5647a);
        int iAvailable2 = iAvailable - c5647a.available();
        int i10 = this.f52692b;
        int i11 = i10 + (i10 & 1);
        if (iAvailable2 > i11) {
            throw new IOException("Out of chunk area");
        }
        if (iAvailable2 < i11) {
            c5647a.skip(i11 - iAvailable2);
        }
    }

    void b(C5647a c5647a) {
    }
}
