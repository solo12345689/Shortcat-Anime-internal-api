package L4;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x4.l f11292e;

    public o(boolean z10, boolean z11, boolean z12, int i10, x4.l lVar) {
        this.f11288a = z10;
        this.f11289b = z11;
        this.f11290c = z12;
        this.f11291d = i10;
        this.f11292e = lVar;
    }

    public final boolean a() {
        return this.f11288a;
    }

    public final x4.l b() {
        return this.f11292e;
    }

    public final int c() {
        return this.f11291d;
    }

    public final boolean d() {
        return this.f11289b;
    }

    public final boolean e() {
        return this.f11290c;
    }

    public /* synthetic */ o(boolean z10, boolean z11, boolean z12, int i10, x4.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? 4 : i10, (i11 & 16) != 0 ? x4.l.RESPECT_PERFORMANCE : lVar);
    }
}
