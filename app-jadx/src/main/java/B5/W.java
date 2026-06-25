package b5;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class W implements S4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d5.l f33132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V4.d f33133b;

    public W(d5.l lVar, V4.d dVar) {
        this.f33132a = lVar;
        this.f33133b = dVar;
    }

    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public U4.v a(Uri uri, int i10, int i11, S4.h hVar) {
        U4.v vVarA = this.f33132a.a(uri, i10, i11, hVar);
        if (vVarA == null) {
            return null;
        }
        return AbstractC3016s.a(this.f33133b, (Drawable) vVarA.get(), i10, i11);
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, S4.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
