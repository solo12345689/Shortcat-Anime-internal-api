package n3;

import U2.C2248i;
import U2.F;

/* JADX INFO: renamed from: n3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5721a extends C2248i implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f53842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f53843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f53844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f53845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f53846l;

    public C5721a(long j10, long j11, F.a aVar, boolean z10) {
        this(j10, j11, aVar.f18915f, aVar.f18912c, z10);
    }

    @Override // n3.g
    public long d(long j10) {
        return b(j10);
    }

    @Override // n3.g
    public long e() {
        return this.f53842h;
    }

    public C5721a f(long j10) {
        return new C5721a(j10, this.f53842h, this.f53843i, this.f53844j, this.f53845k);
    }

    @Override // n3.g
    public long j() {
        return this.f53846l;
    }

    @Override // n3.g
    public int m() {
        return this.f53843i;
    }

    public C5721a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        long j12 = j10;
        this.f53842h = j11;
        this.f53843i = i10;
        this.f53844j = i11;
        this.f53845k = z10;
        this.f53846l = j12 == -1 ? -1L : j12;
    }
}
