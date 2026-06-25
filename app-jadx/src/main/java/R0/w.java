package R0;

import I0.InterfaceC1693t;
import android.os.Trace;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import i1.AbstractC5024q;
import i1.C5023p;
import java.util.List;
import r0.C6226h;
import t.AbstractC6565o;
import t.AbstractC6566p;
import t.C6540F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6226h f15025a = new C6226h(0.0f, 0.0f, 10.0f, 10.0f);

    public static final AbstractC6565o a(v vVar, int i10) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            s sVarD = vVar.d();
            if (sVarD.s().p() && sVarD.s().b()) {
                C6540F c6540f = new C6540F(48);
                D dA = E.a();
                dA.b(AbstractC5024q.b(sVarD.k()));
                b(dA, sVarD, i10, c6540f, sVarD, E.a());
                return c6540f;
            }
            return AbstractC6566p.a();
        } finally {
            Trace.endSection();
        }
    }

    private static final void b(D d10, s sVar, int i10, C6540F c6540f, s sVar2, D d11) {
        InterfaceC1693t interfaceC1693tR;
        D d12;
        s sVar3;
        int i11;
        C6540F c6540f2;
        D d13;
        boolean z10 = (sVar2.s().p() && sVar2.s().b()) ? false : true;
        if (!d10.isEmpty() || sVar2.q() == sVar.q()) {
            if (!z10 || sVar2.z()) {
                C5023p c5023pB = AbstractC5024q.b(sVar2.x());
                d11.b(c5023pB);
                int iQ = sVar2.q() == sVar.q() ? i10 : sVar2.q();
                if (!d11.c(d10)) {
                    if (sVar2.z()) {
                        s sVarT = sVar2.t();
                        c6540f.s(iQ, new u(sVar2, AbstractC5024q.b((sVarT == null || (interfaceC1693tR = sVarT.r()) == null || !interfaceC1693tR.p()) ? f15025a : sVarT.k())));
                        return;
                    } else {
                        if (iQ == i10) {
                            c6540f.s(iQ, new u(sVar2, d11.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                c6540f.s(iQ, new u(sVar2, d11.getBounds()));
                List listV = sVar2.v();
                int size = listV.size() - 1;
                while (-1 < size) {
                    if (((s) listV.get(size)).p().e(x.f15043a.x())) {
                        d12 = d10;
                        sVar3 = sVar;
                        i11 = i10;
                        c6540f2 = c6540f;
                        d13 = d11;
                    } else {
                        d12 = d10;
                        sVar3 = sVar;
                        i11 = i10;
                        c6540f2 = c6540f;
                        d13 = d11;
                        b(d12, sVar3, i11, c6540f2, (s) listV.get(size), d13);
                    }
                    size--;
                    d10 = d12;
                    sVar = sVar3;
                    i10 = i11;
                    c6540f = c6540f2;
                    d11 = d13;
                }
                D d14 = d10;
                if (d(sVar2)) {
                    d14.a(c5023pB);
                }
            }
        }
    }

    public static final boolean c(s sVar) {
        if (sVar.B()) {
            return true;
        }
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        x xVar = x.f15043a;
        return semanticsConfigurationY.e(xVar.k()) || sVar.y().e(xVar.p());
    }

    public static final boolean d(s sVar) {
        if (c(sVar)) {
            return false;
        }
        return sVar.y().v() || sVar.y().f();
    }
}
