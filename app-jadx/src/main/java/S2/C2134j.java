package S2;

import android.view.Surface;

/* JADX INFO: renamed from: S2.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2134j extends J2.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15695e;

    public C2134j(Throwable th2, J2.t tVar, Surface surface) {
        super(th2, tVar);
        this.f15694d = System.identityHashCode(surface);
        this.f15695e = surface == null || surface.isValid();
    }
}
