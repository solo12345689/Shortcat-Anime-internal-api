package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.List;
import t.AbstractC6565o;
import t.C6541G;

/* JADX INFO: renamed from: androidx.compose.ui.platform.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2715l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SemanticsConfiguration f27482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6541G f27483b;

    public C2715l1(R0.s sVar, AbstractC6565o abstractC6565o) {
        this.f27482a = sVar.y();
        this.f27483b = new C6541G(sVar.v().size());
        List listV = sVar.v();
        int size = listV.size();
        for (int i10 = 0; i10 < size; i10++) {
            R0.s sVar2 = (R0.s) listV.get(i10);
            if (abstractC6565o.b(sVar2.q())) {
                this.f27483b.g(sVar2.q());
            }
        }
    }

    public final C6541G a() {
        return this.f27483b;
    }

    public final SemanticsConfiguration b() {
        return this.f27482a;
    }
}
