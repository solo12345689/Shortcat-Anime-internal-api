package qf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jf.C5400x;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import rf.AbstractC6317g;
import ye.InterfaceC7230h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class Q implements v0, uf.h {

    /* JADX INFO: renamed from: a */
    private S f58010a;

    /* JADX INFO: renamed from: b */
    private final LinkedHashSet f58011b;

    /* JADX INFO: renamed from: c */
    private final int f58012c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f58013a;

        public a(Function1 function1) {
            this.f58013a = function1;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            S s10 = (S) obj;
            Function1 function1 = this.f58013a;
            AbstractC5504s.e(s10);
            String string = function1.invoke(s10).toString();
            S s11 = (S) obj2;
            Function1 function12 = this.f58013a;
            AbstractC5504s.e(s11);
            return Xd.a.d(string, function12.invoke(s11).toString());
        }
    }

    public Q(Collection typesToIntersect) {
        AbstractC5504s.h(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f58011b = linkedHashSet;
        this.f58012c = linkedHashSet.hashCode();
    }

    public static final AbstractC6183d0 g(Q q10, AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return q10.o(kotlinTypeRefiner).f();
    }

    public static /* synthetic */ String j(Q q10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = O.f58008a;
        }
        return q10.i(function1);
    }

    public static final String l(S it) {
        AbstractC5504s.h(it, "it");
        return it.toString();
    }

    public static final CharSequence m(Function1 function1, S s10) {
        AbstractC5504s.e(s10);
        return function1.invoke(s10).toString();
    }

    public final InterfaceC5387k e() {
        return C5400x.f51818d.a("member scope for intersection type", this.f58011b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q) {
            return AbstractC5504s.c(this.f58011b, ((Q) obj).f58011b);
        }
        return false;
    }

    public final AbstractC6183d0 f() {
        return V.n(r0.f58089b.k(), this, AbstractC2279u.m(), false, e(), new P(this));
    }

    @Override // qf.v0
    public List getParameters() {
        return AbstractC2279u.m();
    }

    public final S h() {
        return this.f58010a;
    }

    public int hashCode() {
        return this.f58012c;
    }

    public final String i(Function1 getProperTypeRelatedToStringify) {
        AbstractC5504s.h(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return AbstractC2279u.w0(AbstractC2279u.R0(this.f58011b, new a(getProperTypeRelatedToStringify)), " & ", "{", "}", 0, null, new N(getProperTypeRelatedToStringify), 24, null);
    }

    @Override // qf.v0
    public Collection k() {
        return this.f58011b;
    }

    @Override // qf.v0
    public ve.i n() {
        ve.i iVarN = ((S) this.f58011b.iterator().next()).N0().n();
        AbstractC5504s.g(iVarN, "getBuiltIns(...)");
        return iVarN;
    }

    @Override // qf.v0
    public InterfaceC7230h p() {
        return null;
    }

    @Override // qf.v0
    public boolean q() {
        return false;
    }

    @Override // qf.v0
    /* JADX INFO: renamed from: r */
    public Q o(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection collectionK = k();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collectionK, 10));
        Iterator it = collectionK.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((S) it.next()).X0(kotlinTypeRefiner));
            z10 = true;
        }
        Q qS = null;
        if (z10) {
            S sH = h();
            qS = new Q(arrayList).s(sH != null ? sH.X0(kotlinTypeRefiner) : null);
        }
        return qS == null ? this : qS;
    }

    public final Q s(S s10) {
        return new Q(this.f58011b, s10);
    }

    public String toString() {
        return j(this, null, 1, null);
    }

    private Q(Collection collection, S s10) {
        this(collection);
        this.f58010a = s10;
    }
}
