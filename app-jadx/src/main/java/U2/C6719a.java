package u2;

import t2.C6609I;

/* JADX INFO: renamed from: u2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6719a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61220c;

    private C6719a(int i10, int i11, String str) {
        this.f61218a = i10;
        this.f61219b = i11;
        this.f61220c = str;
    }

    public static C6719a a(C6609I c6609i) {
        String str;
        c6609i.c0(2);
        int iM = c6609i.M();
        int i10 = iM >> 1;
        int iM2 = ((c6609i.M() >> 3) & 31) | ((iM & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10 < 10 ? ".0" : ".");
        sb2.append(i10);
        sb2.append(iM2 < 10 ? ".0" : ".");
        sb2.append(iM2);
        return new C6719a(i10, iM2, sb2.toString());
    }
}
