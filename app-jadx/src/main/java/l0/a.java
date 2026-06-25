package L0;

import L1.B;
import R0.C2093b;
import R0.m;
import R0.s;
import R0.x;
import Ud.AbstractC2279u;
import android.support.v4.media.session.b;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import k1.AbstractC5436a;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: L0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0178a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0178a f11186a = new C0178a();

        C0178a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List list) {
        List listM;
        long jU;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            listM = AbstractC2279u.m();
        } else {
            ArrayList arrayList = new ArrayList();
            Object obj = list.get(0);
            int iO = AbstractC2279u.o(list);
            int i10 = 0;
            while (i10 < iO) {
                i10++;
                Object obj2 = list.get(i10);
                s sVar = (s) obj2;
                s sVar2 = (s) obj;
                arrayList.add(C6224f.d(C6224f.e((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (sVar2.k().g() >> 32)) - Float.intBitsToFloat((int) (sVar.k().g() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (sVar2.k().g() & 4294967295L)) - Float.intBitsToFloat((int) (sVar.k().g() & 4294967295L))))) & 4294967295L))));
                obj = obj2;
            }
            listM = arrayList;
        }
        if (listM.size() == 1) {
            jU = ((C6224f) AbstractC2279u.m0(listM)).u();
        } else {
            if (listM.isEmpty()) {
                AbstractC5436a.f("Empty collection can't be reduced.");
            }
            Object objM0 = AbstractC2279u.m0(listM);
            int iO2 = AbstractC2279u.o(listM);
            if (1 <= iO2) {
                int i11 = 1;
                while (true) {
                    objM0 = C6224f.d(C6224f.q(((C6224f) objM0).u(), ((C6224f) listM.get(i11)).u()));
                    if (i11 == iO2) {
                        break;
                    }
                    i11++;
                }
            }
            jU = ((C6224f) objM0).u();
        }
        return Float.intBitsToFloat((int) (4294967295L & jU)) < Float.intBitsToFloat((int) (jU >> 32));
    }

    public static final boolean b(s sVar) {
        SemanticsConfiguration semanticsConfigurationP = sVar.p();
        x xVar = x.f15043a;
        return (m.a(semanticsConfigurationP, xVar.a()) == null && m.a(sVar.p(), xVar.E()) == null) ? false : true;
    }

    private static final boolean c(C2093b c2093b) {
        return c2093b.b() < 0 || c2093b.a() < 0;
    }

    public static final void d(s sVar, B b10) {
        SemanticsConfiguration semanticsConfigurationP = sVar.p();
        x xVar = x.f15043a;
        C2093b c2093b = (C2093b) m.a(semanticsConfigurationP, xVar.a());
        if (c2093b != null) {
            b10.B0(f(c2093b));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (m.a(sVar.p(), xVar.E()) != null) {
            List listV = sVar.v();
            int size = listV.size();
            for (int i10 = 0; i10 < size; i10++) {
                s sVar2 = (s) listV.get(i10);
                if (sVar2.p().e(x.f15043a.F())) {
                    arrayList.add(sVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zA = a(arrayList);
        b10.B0(B.f.b(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
    }

    public static final void e(s sVar, B b10) {
        SemanticsConfiguration semanticsConfigurationP = sVar.p();
        x xVar = x.f15043a;
        b.a(m.a(semanticsConfigurationP, xVar.b()));
        s sVarT = sVar.t();
        if (sVarT == null || m.a(sVarT.p(), xVar.E()) == null) {
            return;
        }
        C2093b c2093b = (C2093b) m.a(sVarT.p(), xVar.a());
        if ((c2093b == null || !c(c2093b)) && sVar.p().e(xVar.F())) {
            ArrayList arrayList = new ArrayList();
            List listV = sVarT.v();
            int size = listV.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                s sVar2 = (s) listV.get(i11);
                if (sVar2.p().e(x.f15043a.F())) {
                    arrayList.add(sVar2);
                    if (sVar2.s().B0() < sVar.s().B0()) {
                        i10++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zA = a(arrayList);
            B.g gVarB = B.g.b(zA ? 0 : i10, 1, zA ? i10 : 0, 1, false, ((Boolean) sVar.p().p(x.f15043a.F(), C0178a.f11186a)).booleanValue());
            if (gVarB != null) {
                b10.C0(gVarB);
            }
        }
    }

    private static final B.f f(C2093b c2093b) {
        return B.f.b(c2093b.b(), c2093b.a(), false, 0);
    }
}
