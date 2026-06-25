package W2;

import t2.AbstractC6635w;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20674g;

    private d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f20668a = i10;
        this.f20669b = i11;
        this.f20670c = i12;
        this.f20671d = i13;
        this.f20672e = i14;
        this.f20673f = i15;
        this.f20674g = i16;
    }

    public static d c(C6609I c6609i) {
        int iZ = c6609i.z();
        c6609i.c0(12);
        int iZ2 = c6609i.z();
        int iZ3 = c6609i.z();
        int iZ4 = c6609i.z();
        c6609i.c0(4);
        int iZ5 = c6609i.z();
        int iZ6 = c6609i.z();
        c6609i.c0(4);
        return new d(iZ, iZ2, iZ3, iZ4, iZ5, iZ6, c6609i.z());
    }

    public long a() {
        return a0.m1(this.f20672e, ((long) this.f20670c) * 1000000, this.f20671d);
    }

    public int b() {
        int i10 = this.f20668a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        AbstractC6635w.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f20668a));
        return -1;
    }

    @Override // W2.a
    public int getType() {
        return 1752331379;
    }
}
