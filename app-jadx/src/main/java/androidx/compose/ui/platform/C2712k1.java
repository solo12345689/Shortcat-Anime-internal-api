package androidx.compose.ui.platform;

import java.util.List;

/* JADX INFO: renamed from: androidx.compose.ui.platform.k1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2712k1 implements K0.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f27475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Float f27476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Float f27477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private R0.j f27478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private R0.j f27479f;

    public C2712k1(int i10, List list, Float f10, Float f11, R0.j jVar, R0.j jVar2) {
        this.f27474a = i10;
        this.f27475b = list;
        this.f27476c = f10;
        this.f27477d = f11;
        this.f27478e = jVar;
        this.f27479f = jVar2;
    }

    @Override // K0.q0
    public boolean J0() {
        return this.f27475b.contains(this);
    }

    public final R0.j a() {
        return this.f27478e;
    }

    public final Float b() {
        return this.f27476c;
    }

    public final Float c() {
        return this.f27477d;
    }

    public final int d() {
        return this.f27474a;
    }

    public final R0.j e() {
        return this.f27479f;
    }

    public final void f(R0.j jVar) {
        this.f27478e = jVar;
    }

    public final void g(Float f10) {
        this.f27476c = f10;
    }

    public final void h(Float f10) {
        this.f27477d = f10;
    }

    public final void i(R0.j jVar) {
        this.f27479f = jVar;
    }
}
