package Y0;

import Y0.AbstractC2485u;
import Y0.H;
import Y0.K;
import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class c0 implements a0 {
    private final Typeface d(String str, L l10, int i10) {
        H.a aVar = H.f22594b;
        if (H.f(i10, aVar.b()) && AbstractC5504s.c(l10, L.f22613b.g()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), l10.v(), H.f(i10, aVar.a()));
    }

    private final Typeface e(String str, L l10, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceD = d(str, l10, i10);
        if (AbstractC5504s.c(typefaceD, p0.f22710a.a(Typeface.DEFAULT, l10.v(), H.f(i10, H.f22594b.a()))) || AbstractC5504s.c(typefaceD, d(null, l10, i10))) {
            return null;
        }
        return typefaceD;
    }

    @Override // Y0.a0
    public Typeface a(String str, L l10, int i10, K.d dVar, Context context) {
        AbstractC2485u.a aVar = AbstractC2485u.f22726b;
        return e0.c(AbstractC5504s.c(str, aVar.d().l()) ? b(aVar.d(), l10, i10) : AbstractC5504s.c(str, aVar.e().l()) ? b(aVar.e(), l10, i10) : AbstractC5504s.c(str, aVar.c().l()) ? b(aVar.c(), l10, i10) : AbstractC5504s.c(str, aVar.a().l()) ? b(aVar.a(), l10, i10) : e(str, l10, i10), dVar, context);
    }

    @Override // Y0.a0
    public Typeface b(P p10, L l10, int i10) {
        return d(p10.l(), l10, i10);
    }

    @Override // Y0.a0
    public Typeface c(L l10, int i10) {
        return d(null, l10, i10);
    }
}
