package m0;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import t.C6550P;

/* JADX INFO: renamed from: m0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5609g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.t().b(R0.l.f14981a.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.t().b(R0.x.f15043a.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.t().b(R0.l.f14981a.k())) {
            return true;
        }
        C6550P c6550pT = semanticsConfiguration.t();
        R0.x xVar = R0.x.f15043a;
        return c6550pT.b(xVar.e()) || semanticsConfiguration.t().b(xVar.c());
    }
}
