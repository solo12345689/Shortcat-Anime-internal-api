package androidx.compose.ui.platform;

import R0.C2092a;
import R0.C2098g;
import R0.C2099h;
import U0.C2197e;
import Ud.AbstractC2279u;
import android.content.res.Resources;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import i1.EnumC5027t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;
import oe.InterfaceC5866b;
import t.AbstractC6565o;
import t.C6538D;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2744z {

    /* JADX INFO: renamed from: androidx.compose.ui.platform.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27638a;

        static {
            int[] iArr = new int[T0.a.values().length];
            try {
                iArr[T0.a.f16755a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T0.a.f16756b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[T0.a.f16757c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27638a = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.z$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27639a = new b();

        b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(K0.J r3) {
            /*
                r2 = this;
                androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.e()
                if (r3 == 0) goto L1a
                boolean r0 = r3.v()
                r1 = 1
                if (r0 != r1) goto L1a
                R0.x r0 = R0.x.f15043a
                R0.B r0 = r0.g()
                boolean r3 = r3.e(r0)
                if (r3 == 0) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AbstractC2744z.b.invoke(K0.J):java.lang.Boolean");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.z$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6565o f27640a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC6565o abstractC6565o) {
            super(1);
            this.f27640a = abstractC6565o;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(R0.s sVar) {
            return Boolean.valueOf(this.f27640a.b(sVar.q()));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.z$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Resources f27641a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Resources resources) {
            super(1);
            this.f27641a = resources;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(R0.s sVar) {
            return Boolean.valueOf(AbstractC2744z.u(sVar, this.f27641a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(C2092a c2092a, Object obj) {
        if (c2092a == obj) {
            return true;
        }
        if (!(obj instanceof C2092a)) {
            return false;
        }
        C2092a c2092a2 = (C2092a) obj;
        if (!AbstractC5504s.c(c2092a.b(), c2092a2.b())) {
            return false;
        }
        if (c2092a.a() != null || c2092a2.a() == null) {
            return c2092a.a() == null || c2092a2.a() != null;
        }
        return false;
    }

    private static final String m(R0.s sVar, Resources resources) {
        SemanticsConfiguration semanticsConfigurationP = sVar.b().p();
        R0.x xVar = R0.x.f15043a;
        Collection collection = (Collection) R0.m.a(semanticsConfigurationP, xVar.d());
        if (collection != null && !collection.isEmpty()) {
            return null;
        }
        Collection collection2 = (Collection) R0.m.a(semanticsConfigurationP, xVar.J());
        if (collection2 != null && !collection2.isEmpty()) {
            return null;
        }
        CharSequence charSequence = (CharSequence) R0.m.a(semanticsConfigurationP, xVar.g());
        if (charSequence == null || charSequence.length() == 0) {
            return resources.getString(l0.m.f52393h);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(R0.s sVar) {
        return !sVar.p().e(R0.x.f15043a.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(R0.s sVar) {
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        R0.x xVar = R0.x.f15043a;
        if (semanticsConfigurationY.e(xVar.g()) && !AbstractC5504s.c(R0.m.a(sVar.y(), xVar.i()), Boolean.TRUE)) {
            return true;
        }
        K0.J jP = p(sVar.s(), b.f27639a);
        if (jP != null) {
            SemanticsConfiguration semanticsConfigurationE = jP.e();
            if (!(semanticsConfigurationE != null ? AbstractC5504s.c(R0.m.a(semanticsConfigurationE, xVar.i()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K0.J p(K0.J j10, Function1 function1) {
        for (K0.J jA0 = j10.A0(); jA0 != null; jA0 = jA0.A0()) {
            if (((Boolean) function1.invoke(jA0)).booleanValue()) {
                return jA0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(R0.s sVar) {
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        R0.x xVar = R0.x.f15043a;
        T0.a aVar = (T0.a) R0.m.a(semanticsConfigurationY, xVar.M());
        C2099h c2099h = (C2099h) R0.m.a(sVar.y(), xVar.D());
        boolean z10 = aVar != null;
        if (((Boolean) R0.m.a(sVar.y(), xVar.F())) != null) {
            if (!(c2099h != null ? C2099h.m(c2099h.p(), C2099h.f14960b.h()) : false)) {
                return true;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(R0.s sVar, Resources resources) {
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        R0.x xVar = R0.x.f15043a;
        Object objA = R0.m.a(semanticsConfigurationY, xVar.H());
        T0.a aVar = (T0.a) R0.m.a(sVar.y(), xVar.M());
        C2099h c2099h = (C2099h) R0.m.a(sVar.y(), xVar.D());
        if (aVar != null) {
            int i10 = a.f27638a[aVar.ordinal()];
            if (i10 == 1) {
                if ((c2099h == null ? false : C2099h.m(c2099h.p(), C2099h.f14960b.g())) && objA == null) {
                    objA = resources.getString(l0.m.f52395j);
                }
            } else if (i10 == 2) {
                if ((c2099h == null ? false : C2099h.m(c2099h.p(), C2099h.f14960b.g())) && objA == null) {
                    objA = resources.getString(l0.m.f52394i);
                }
            } else {
                if (i10 != 3) {
                    throw new Td.r();
                }
                if (objA == null) {
                    objA = resources.getString(l0.m.f52390e);
                }
            }
        }
        Boolean bool = (Boolean) R0.m.a(sVar.y(), xVar.F());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(c2099h == null ? false : C2099h.m(c2099h.p(), C2099h.f14960b.h())) && objA == null) {
                objA = zBooleanValue ? resources.getString(l0.m.f52392g) : resources.getString(l0.m.f52391f);
            }
        }
        C2098g c2098g = (C2098g) R0.m.a(sVar.y(), xVar.C());
        if (c2098g != null) {
            if (c2098g != C2098g.f14955d.a()) {
                if (objA == null) {
                    InterfaceC5866b interfaceC5866bC = c2098g.c();
                    float fB = ((((Number) interfaceC5866bC.e()).floatValue() - ((Number) interfaceC5866bC.b()).floatValue()) > 0.0f ? 1 : ((((Number) interfaceC5866bC.e()).floatValue() - ((Number) interfaceC5866bC.b()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (c2098g.b() - ((Number) interfaceC5866bC.b()).floatValue()) / (((Number) interfaceC5866bC.e()).floatValue() - ((Number) interfaceC5866bC.b()).floatValue());
                    if (fB < 0.0f) {
                        fB = 0.0f;
                    }
                    if (fB > 1.0f) {
                        fB = 1.0f;
                    }
                    if (!(fB == 0.0f)) {
                        iM = (fB == 1.0f ? 1 : 0) != 0 ? 100 : AbstractC5874j.m(Math.round(fB * 100), 1, 99);
                    }
                    objA = resources.getString(l0.m.f52398m, Integer.valueOf(iM));
                }
            } else if (objA == null) {
                objA = resources.getString(l0.m.f52389d);
            }
        }
        if (sVar.y().e(xVar.g())) {
            objA = m(sVar, resources);
        }
        return (String) objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2197e s(R0.s sVar) {
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        R0.x xVar = R0.x.f15043a;
        C2197e c2197e = (C2197e) R0.m.a(semanticsConfigurationY, xVar.g());
        List list = (List) R0.m.a(sVar.y(), xVar.J());
        return c2197e == null ? list != null ? (C2197e) AbstractC2279u.o0(list) : null : c2197e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(R0.s sVar) {
        return sVar.r().getLayoutDirection() == EnumC5027t.f48574b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(R0.s sVar, Resources resources) {
        List list = (List) R0.m.a(sVar.y(), R0.x.f15043a.d());
        return !R0.w.c(sVar) && (sVar.y().v() || (sVar.C() && ((list != null ? (String) AbstractC2279u.o0(list) : null) != null || s(sVar) != null || r(sVar, resources) != null || q(sVar))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(R0.s sVar, SemanticsConfiguration semanticsConfiguration) {
        Iterator it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!sVar.p().e((R0.B) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(AbstractC6565o abstractC6565o, C6538D c6538d, C6538D c6538d2, Resources resources) {
        c6538d.i();
        c6538d2.i();
        R0.u uVar = (R0.u) abstractC6565o.c(-1);
        R0.s sVarB = uVar != null ? uVar.b() : null;
        AbstractC5504s.e(sVarB);
        List listF = R0.G.f(sVarB, new c(abstractC6565o), new d(resources), AbstractC2279u.e(sVarB));
        int iO = AbstractC2279u.o(listF);
        int i10 = 1;
        if (1 > iO) {
            return;
        }
        while (true) {
            int iQ = ((R0.s) listF.get(i10 - 1)).q();
            int iQ2 = ((R0.s) listF.get(i10)).q();
            c6538d.r(iQ, iQ2);
            c6538d2.r(iQ2, iQ);
            if (i10 == iO) {
                return;
            } else {
                i10++;
            }
        }
    }
}
