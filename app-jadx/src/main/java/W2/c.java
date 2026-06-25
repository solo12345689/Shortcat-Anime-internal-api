package W2;

import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20667d;

    private c(int i10, int i11, int i12, int i13) {
        this.f20664a = i10;
        this.f20665b = i11;
        this.f20666c = i12;
        this.f20667d = i13;
    }

    public static c b(C6609I c6609i) {
        int iZ = c6609i.z();
        c6609i.c0(8);
        int iZ2 = c6609i.z();
        int iZ3 = c6609i.z();
        c6609i.c0(4);
        int iZ4 = c6609i.z();
        c6609i.c0(12);
        return new c(iZ, iZ2, iZ3, iZ4);
    }

    public boolean a() {
        return (this.f20665b & 16) == 16;
    }

    @Override // W2.a
    public int getType() {
        return 1751742049;
    }
}
