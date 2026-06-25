package O5;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements D6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f12999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D6.a f13000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D6.a f13001c;

    public a(Resources resources, D6.a aVar, D6.a aVar2) {
        this.f12999a = resources;
        this.f13000b = aVar;
        this.f13001c = aVar2;
    }

    private static boolean c(E6.f fVar) {
        return (fVar.U0() == 1 || fVar.U0() == 0) ? false : true;
    }

    private static boolean d(E6.f fVar) {
        return (fVar.h1() == 0 || fVar.h1() == -1) ? false : true;
    }

    @Override // D6.a
    public boolean a(E6.e eVar) {
        return true;
    }

    @Override // D6.a
    public Drawable b(E6.e eVar) {
        try {
            if (L6.b.d()) {
                L6.b.a("DefaultDrawableFactory#createDrawable");
            }
            if (eVar instanceof E6.f) {
                E6.f fVar = (E6.f) eVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f12999a, fVar.G1());
                if (!d(fVar) && !c(fVar)) {
                    if (L6.b.d()) {
                        L6.b.b();
                    }
                    return bitmapDrawable;
                }
                V5.h hVar = new V5.h(bitmapDrawable, fVar.h1(), fVar.U0());
                if (L6.b.d()) {
                    L6.b.b();
                }
                return hVar;
            }
            D6.a aVar = this.f13000b;
            if (aVar != null && aVar.a(eVar)) {
                Drawable drawableB = this.f13000b.b(eVar);
                if (L6.b.d()) {
                    L6.b.b();
                }
                return drawableB;
            }
            D6.a aVar2 = this.f13001c;
            if (aVar2 == null || !aVar2.a(eVar)) {
                if (L6.b.d()) {
                    L6.b.b();
                }
                return null;
            }
            Drawable drawableB2 = this.f13001c.b(eVar);
            if (L6.b.d()) {
                L6.b.b();
            }
            return drawableB2;
        } catch (Throwable th2) {
            if (L6.b.d()) {
                L6.b.b();
            }
            throw th2;
        }
    }
}
