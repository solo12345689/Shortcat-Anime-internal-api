package b5;

import android.content.res.Resources;

/* JADX INFO: renamed from: b5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2999a implements S4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S4.j f33144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f33145b;

    public C2999a(Resources resources, S4.j jVar) {
        this.f33145b = (Resources) o5.k.e(resources);
        this.f33144a = (S4.j) o5.k.e(jVar);
    }

    @Override // S4.j
    public U4.v a(Object obj, int i10, int i11, S4.h hVar) {
        return T.c(this.f33145b, this.f33144a.a(obj, i10, i11, hVar));
    }

    @Override // S4.j
    public boolean b(Object obj, S4.h hVar) {
        return this.f33144a.b(obj, hVar);
    }
}
