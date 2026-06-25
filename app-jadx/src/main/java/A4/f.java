package A4;

import A4.i;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import v4.InterfaceC6845d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G4.m f278b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements i.a {
        @Override // A4.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Drawable drawable, G4.m mVar, InterfaceC6845d interfaceC6845d) {
            return new f(drawable, mVar);
        }
    }

    public f(Drawable drawable, G4.m mVar) {
        this.f277a = drawable;
        this.f278b = mVar;
    }

    @Override // A4.i
    public Object a(Zd.e eVar) {
        Drawable bitmapDrawable;
        boolean zT = L4.j.t(this.f277a);
        if (zT) {
            bitmapDrawable = new BitmapDrawable(this.f278b.g().getResources(), L4.l.f11282a.a(this.f277a, this.f278b.f(), this.f278b.n(), this.f278b.m(), this.f278b.c()));
        } else {
            bitmapDrawable = this.f277a;
        }
        return new g(bitmapDrawable, zT, x4.f.MEMORY);
    }
}
