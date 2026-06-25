package R0;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import t.C6546L;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final SemanticsConfiguration a(n nVar) {
        SemanticsConfiguration semanticsConfigurationE = nVar.e();
        if (semanticsConfigurationE != null && semanticsConfigurationE.v() && !semanticsConfigurationE.u()) {
            semanticsConfigurationE = semanticsConfigurationE.i();
            C6546L c6546l = new C6546L(nVar.n().size());
            c6546l.l(nVar.n());
            while (c6546l.g()) {
                n nVar2 = (n) c6546l.r(c6546l.f60007b - 1);
                SemanticsConfiguration semanticsConfigurationE2 = nVar2.e();
                if (semanticsConfigurationE2 != null && !semanticsConfigurationE2.v()) {
                    semanticsConfigurationE.w(semanticsConfigurationE2);
                    if (!semanticsConfigurationE2.u()) {
                        c6546l.l(nVar2.n());
                    }
                }
            }
        }
        return semanticsConfigurationE;
    }
}
