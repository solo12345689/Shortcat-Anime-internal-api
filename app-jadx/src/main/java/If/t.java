package If;

import Gf.M;
import If.w;
import Td.L;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class t extends h implements u {
    public t(Zd.i iVar, g gVar) {
        super(iVar, gVar, true, true);
    }

    @Override // Gf.AbstractC1597a
    protected void R0(Throwable th2, boolean z10) {
        if (U0().i(th2) || z10) {
            return;
        }
        M.a(getContext(), th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Gf.AbstractC1597a
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public void S0(L l10) {
        w.a.a(U0(), null, 1, null);
    }

    @Override // Gf.AbstractC1597a, Gf.I0, Gf.C0
    public boolean b() {
        return super.b();
    }
}
