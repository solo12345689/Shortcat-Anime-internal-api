package g5;

import S4.h;
import U4.v;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b5.C3005g;
import f5.C4776c;

/* JADX INFO: renamed from: g5.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4852c implements InterfaceC4854e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V4.d f47347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4854e f47348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4854e f47349c;

    public C4852c(V4.d dVar, InterfaceC4854e interfaceC4854e, InterfaceC4854e interfaceC4854e2) {
        this.f47347a = dVar;
        this.f47348b = interfaceC4854e;
        this.f47349c = interfaceC4854e2;
    }

    @Override // g5.InterfaceC4854e
    public v a(v vVar, h hVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f47348b.a(C3005g.c(((BitmapDrawable) drawable).getBitmap(), this.f47347a), hVar);
        }
        if (drawable instanceof C4776c) {
            return this.f47349c.a(b(vVar), hVar);
        }
        return null;
    }

    private static v b(v vVar) {
        return vVar;
    }
}
