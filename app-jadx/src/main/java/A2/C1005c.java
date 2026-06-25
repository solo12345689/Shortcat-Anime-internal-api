package A2;

import q2.C6109x;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: A2.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1005c {

    /* JADX INFO: renamed from: a */
    public final String f193a;

    /* JADX INFO: renamed from: b */
    public final C6109x f194b;

    /* JADX INFO: renamed from: c */
    public final C6109x f195c;

    /* JADX INFO: renamed from: d */
    public final int f196d;

    /* JADX INFO: renamed from: e */
    public final int f197e;

    public C1005c(String str, C6109x c6109x, C6109x c6109x2, int i10, int i11) {
        AbstractC6614a.a(i10 == 0 || i11 == 0);
        this.f193a = AbstractC6614a.d(str);
        this.f194b = (C6109x) AbstractC6614a.e(c6109x);
        this.f195c = (C6109x) AbstractC6614a.e(c6109x2);
        this.f196d = i10;
        this.f197e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1005c.class == obj.getClass()) {
            C1005c c1005c = (C1005c) obj;
            if (this.f196d == c1005c.f196d && this.f197e == c1005c.f197e && this.f193a.equals(c1005c.f193a) && this.f194b.equals(c1005c.f194b) && this.f195c.equals(c1005c.f195c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f196d) * 31) + this.f197e) * 31) + this.f193a.hashCode()) * 31) + this.f194b.hashCode()) * 31) + this.f195c.hashCode();
    }
}
