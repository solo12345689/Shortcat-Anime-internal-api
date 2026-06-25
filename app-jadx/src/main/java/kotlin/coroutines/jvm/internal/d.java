package kotlin.coroutines.jvm.internal;

import Zd.i;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends a {
    private final Zd.i _context;
    private transient Zd.e intercepted;

    public d(Zd.e eVar, Zd.i iVar) {
        super(eVar);
        this._context = iVar;
    }

    @Override // Zd.e
    public Zd.i getContext() {
        Zd.i iVar = this._context;
        AbstractC5504s.e(iVar);
        return iVar;
    }

    public final Zd.e intercepted() {
        Zd.e eVarU1 = this.intercepted;
        if (eVarU1 == null) {
            Zd.f fVar = (Zd.f) getContext().l(Zd.f.f23273S);
            if (fVar == null || (eVarU1 = fVar.u1(this)) == null) {
                eVarU1 = this;
            }
            this.intercepted = eVarU1;
        }
        return eVarU1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        Zd.e eVar = this.intercepted;
        if (eVar != null && eVar != this) {
            i.b bVarL = getContext().l(Zd.f.f23273S);
            AbstractC5504s.e(bVarL);
            ((Zd.f) bVarL).k0(eVar);
        }
        this.intercepted = c.f52245a;
    }

    public d(Zd.e eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }
}
