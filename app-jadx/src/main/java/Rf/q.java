package rf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.C6188g;
import qf.M0;
import qf.S;
import qf.u0;
import rf.AbstractC6316f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class q implements p {

    /* JADX INFO: renamed from: c */
    private final AbstractC6317g f58796c;

    /* JADX INFO: renamed from: d */
    private final AbstractC6316f f58797d;

    /* JADX INFO: renamed from: e */
    private final bf.o f58798e;

    public q(AbstractC6317g kotlinTypeRefiner, AbstractC6316f kotlinTypePreparator) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC5504s.h(kotlinTypePreparator, "kotlinTypePreparator");
        this.f58796c = kotlinTypeRefiner;
        this.f58797d = kotlinTypePreparator;
        bf.o oVarM = bf.o.m(d());
        AbstractC5504s.g(oVarM, "createWithTypeRefiner(...)");
        this.f58798e = oVarM;
    }

    @Override // rf.InterfaceC6315e
    public boolean a(S subtype, S supertype) {
        AbstractC5504s.h(subtype, "subtype");
        AbstractC5504s.h(supertype, "supertype");
        return g(AbstractC6311a.b(true, false, null, f(), d(), 6, null), subtype.Q0(), supertype.Q0());
    }

    @Override // rf.p
    public bf.o b() {
        return this.f58798e;
    }

    @Override // rf.InterfaceC6315e
    public boolean c(S a10, S b10) {
        AbstractC5504s.h(a10, "a");
        AbstractC5504s.h(b10, "b");
        return e(AbstractC6311a.b(false, false, null, f(), d(), 6, null), a10.Q0(), b10.Q0());
    }

    @Override // rf.p
    public AbstractC6317g d() {
        return this.f58796c;
    }

    public final boolean e(u0 u0Var, M0 a10, M0 b10) {
        AbstractC5504s.h(u0Var, "<this>");
        AbstractC5504s.h(a10, "a");
        AbstractC5504s.h(b10, "b");
        return C6188g.f58052a.m(u0Var, a10, b10);
    }

    public AbstractC6316f f() {
        return this.f58797d;
    }

    public final boolean g(u0 u0Var, M0 subType, M0 superType) {
        AbstractC5504s.h(u0Var, "<this>");
        AbstractC5504s.h(subType, "subType");
        AbstractC5504s.h(superType, "superType");
        return C6188g.v(C6188g.f58052a, u0Var, subType, superType, false, 8, null);
    }

    public /* synthetic */ q(AbstractC6317g abstractC6317g, AbstractC6316f abstractC6316f, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6317g, (i10 & 2) != 0 ? AbstractC6316f.a.f58774a : abstractC6316f);
    }
}
