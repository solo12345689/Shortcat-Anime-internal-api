package l8;

import m8.C5647a;

/* JADX INFO: renamed from: l8.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5569k extends C5563e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f52698g = C5563e.a("VP8X");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    byte f52699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52701f;

    @Override // l8.C5563e
    void b(C5647a c5647a) {
        this.f52699d = c5647a.peek();
        c5647a.skip(3L);
        this.f52700e = c5647a.a();
        this.f52701f = c5647a.a();
    }

    boolean d() {
        return (this.f52699d & 16) == 16;
    }

    boolean e() {
        return (this.f52699d & 2) == 2;
    }
}
