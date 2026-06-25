package V0;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class V implements k0 {
    @Override // V0.k0
    public StaticLayout a(l0 l0Var) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(l0Var.r(), l0Var.q(), l0Var.e(), l0Var.o(), l0Var.u());
        builderObtain.setTextDirection(l0Var.s());
        builderObtain.setAlignment(l0Var.a());
        builderObtain.setMaxLines(l0Var.n());
        builderObtain.setEllipsize(l0Var.c());
        builderObtain.setEllipsizedWidth(l0Var.d());
        builderObtain.setLineSpacing(l0Var.l(), l0Var.m());
        builderObtain.setIncludePad(l0Var.g());
        builderObtain.setBreakStrategy(l0Var.b());
        builderObtain.setHyphenationFrequency(l0Var.f());
        builderObtain.setIndents(l0Var.i(), l0Var.p());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            X.a(builderObtain, l0Var.h());
        }
        if (i10 >= 28) {
            Z.a(builderObtain, l0Var.t());
        }
        if (i10 >= 33) {
            g0.b(builderObtain, l0Var.j(), l0Var.k());
        }
        if (i10 >= 35) {
            i0.a(builderObtain);
        }
        return builderObtain.build();
    }

    @Override // V0.k0
    public boolean b(StaticLayout staticLayout, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return g0.a(staticLayout);
        }
        if (i10 >= 28) {
            return z10;
        }
        return false;
    }
}
