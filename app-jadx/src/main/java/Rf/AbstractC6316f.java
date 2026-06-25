package rf;

import Ud.AbstractC2279u;
import cf.C3101c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.AbstractC6207q;
import qf.B0;
import qf.I;
import qf.L0;
import qf.M0;
import qf.N0;
import qf.Q;
import qf.S;
import qf.V;
import qf.v0;
import uf.EnumC6770b;
import vf.AbstractC6867d;

/* JADX INFO: renamed from: rf.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6316f extends AbstractC6207q {

    /* JADX INFO: renamed from: rf.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC6316f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58774a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: rf.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements Function1 {
        b(Object obj) {
            super(1, obj, AbstractC6316f.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final M0 invoke(uf.i p02) {
            AbstractC5504s.h(p02, "p0");
            return ((AbstractC6316f) this.receiver).a(p02);
        }
    }

    private final AbstractC6183d0 c(AbstractC6183d0 abstractC6183d0) {
        S type;
        v0 v0VarN0 = abstractC6183d0.N0();
        Q qS = null;
        m0Q0 = null;
        M0 m0Q0 = null;
        if (!(v0VarN0 instanceof C3101c)) {
            if (!(v0VarN0 instanceof Q) || !abstractC6183d0.O0()) {
                return abstractC6183d0;
            }
            Q q10 = (Q) v0VarN0;
            Collection collectionK = q10.k();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(collectionK, 10));
            Iterator it = collectionK.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                arrayList.add(AbstractC6867d.B((S) it.next()));
                z10 = true;
            }
            if (z10) {
                S sH = q10.h();
                qS = new Q(arrayList).s(sH != null ? AbstractC6867d.B(sH) : null);
            }
            if (qS != null) {
                q10 = qS;
            }
            return q10.f();
        }
        C3101c c3101c = (C3101c) v0VarN0;
        B0 b0A = c3101c.a();
        if (b0A.b() != N0.f58000f) {
            b0A = null;
        }
        if (b0A != null && (type = b0A.getType()) != null) {
            m0Q0 = type.Q0();
        }
        M0 m02 = m0Q0;
        if (c3101c.c() == null) {
            B0 b0A2 = c3101c.a();
            Collection collectionK2 = c3101c.k();
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(collectionK2, 10));
            Iterator it2 = collectionK2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((S) it2.next()).Q0());
            }
            c3101c.e(new n(b0A2, arrayList2, null, 4, null));
        }
        EnumC6770b enumC6770b = EnumC6770b.f61510a;
        n nVarC = c3101c.c();
        AbstractC5504s.e(nVarC);
        return new C6319i(enumC6770b, nVarC, m02, abstractC6183d0.M0(), abstractC6183d0.O0(), false, 32, null);
    }

    @Override // qf.AbstractC6207q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M0 a(uf.i type) {
        M0 m0E;
        AbstractC5504s.h(type, "type");
        if (!(type instanceof S)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        M0 m0Q0 = ((S) type).Q0();
        if (m0Q0 instanceof AbstractC6183d0) {
            m0E = c((AbstractC6183d0) m0Q0);
        } else {
            if (!(m0Q0 instanceof I)) {
                throw new Td.r();
            }
            I i10 = (I) m0Q0;
            AbstractC6183d0 abstractC6183d0C = c(i10.V0());
            AbstractC6183d0 abstractC6183d0C2 = c(i10.W0());
            m0E = (abstractC6183d0C == i10.V0() && abstractC6183d0C2 == i10.W0()) ? m0Q0 : V.e(abstractC6183d0C, abstractC6183d0C2);
        }
        return L0.c(m0E, m0Q0, new b(this));
    }
}
