package Vh;

import Yh.A;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f20396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Wh.l f20397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Wh.l f20398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f20400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f20401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20402g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20403h = false;

    private e(A a10, Wh.l lVar, Wh.l lVar2, e eVar, f fVar, boolean z10) {
        this.f20396a = a10;
        this.f20397b = lVar;
        this.f20398c = lVar2;
        this.f20399d = z10;
        this.f20400e = eVar;
        this.f20401f = fVar;
    }

    public static e a(A a10, Wh.l lVar, Wh.l lVar2, e eVar, f fVar) {
        return new e(a10, lVar, lVar2, eVar, fVar, true);
    }

    public static e b(A a10, Wh.l lVar, Wh.l lVar2, e eVar, f fVar) {
        return new e(a10, lVar, lVar2, eVar, fVar, false);
    }
}
