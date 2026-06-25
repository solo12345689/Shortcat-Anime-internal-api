package o3;

import q2.C6109x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f54411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f54412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f54413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f54414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C6109x f54415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f54416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f54417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long[] f54418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f54419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u[] f54420l;

    public t(int i10, int i11, long j10, long j11, long j12, long j13, C6109x c6109x, int i12, u[] uVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f54409a = i10;
        this.f54410b = i11;
        this.f54411c = j10;
        this.f54412d = j11;
        this.f54413e = j12;
        this.f54414f = j13;
        this.f54415g = c6109x;
        this.f54416h = i12;
        this.f54420l = uVarArr;
        this.f54419k = i13;
        this.f54417i = jArr;
        this.f54418j = jArr2;
    }

    public t a(C6109x c6109x) {
        return new t(this.f54409a, this.f54410b, this.f54411c, this.f54412d, this.f54413e, this.f54414f, c6109x, this.f54416h, this.f54420l, this.f54419k, this.f54417i, this.f54418j);
    }

    public u b(int i10) {
        u[] uVarArr = this.f54420l;
        if (uVarArr == null) {
            return null;
        }
        return uVarArr[i10];
    }
}
