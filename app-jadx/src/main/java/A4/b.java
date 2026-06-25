package A4;

import A4.i;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import v4.InterfaceC6845d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G4.m f272b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements i.a {
        @Override // A4.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Bitmap bitmap, G4.m mVar, InterfaceC6845d interfaceC6845d) {
            return new b(bitmap, mVar);
        }
    }

    public b(Bitmap bitmap, G4.m mVar) {
        this.f271a = bitmap;
        this.f272b = mVar;
    }

    @Override // A4.i
    public Object a(Zd.e eVar) {
        return new g(new BitmapDrawable(this.f272b.g().getResources(), this.f271a), false, x4.f.MEMORY);
    }
}
