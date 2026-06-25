package m0;

import K0.AbstractC1796k;
import R0.C2092a;
import Td.C2160k;
import U0.C2197e;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import q0.InterfaceC6061g;
import t.C6541G;
import t.C6546L;
import t.W;

/* JADX INFO: renamed from: m0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5608f extends G implements R0.p, InterfaceC6061g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private M f52935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R0.v f52936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f52937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S0.b f52938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f52939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f52940f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AutofillId f52941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C6541G f52942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f52943i;

    /* JADX INFO: renamed from: m0.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements ie.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f52945b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(4);
            this.f52945b = i10;
        }

        public final void a(int i10, int i11, int i12, int i13) {
            C5608f.this.d().d(C5608f.this.f52937c, this.f52945b, new Rect(i10, i11, i12, i13));
        }

        @Override // ie.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return Td.L.f17438a;
        }
    }

    public C5608f(M m10, R0.v vVar, View view, S0.b bVar, String str) {
        this.f52935a = m10;
        this.f52936b = vVar;
        this.f52937c = view;
        this.f52938d = bVar;
        this.f52939e = str;
        view.setImportantForAutofill(1);
        N0.b bVarA = N0.e.a(view);
        AutofillId autofillIdA = bVarA != null ? bVarA.a() : null;
        if (autofillIdA == null) {
            H0.a.c("Required value was null.");
            throw new C2160k();
        }
        this.f52941g = autofillIdA;
        this.f52942h = new C6541G(0, 1, null);
    }

    @Override // R0.p
    public void a(R0.n nVar, SemanticsConfiguration semanticsConfiguration) {
        C2197e c2197e;
        C2197e c2197e2;
        SemanticsConfiguration semanticsConfigurationE = nVar.e();
        int iY = nVar.y();
        String strJ = null;
        String strJ2 = (semanticsConfiguration == null || (c2197e2 = (C2197e) R0.m.a(semanticsConfiguration, R0.x.f15043a.o())) == null) ? null : c2197e2.j();
        if (semanticsConfigurationE != null && (c2197e = (C2197e) R0.m.a(semanticsConfigurationE, R0.x.f15043a.o())) != null) {
            strJ = c2197e.j();
        }
        boolean z10 = false;
        if (strJ2 != strJ) {
            if (strJ2 == null) {
                this.f52935a.c(this.f52937c, iY, true);
            } else if (strJ == null) {
                this.f52935a.c(this.f52937c, iY, false);
            } else if (AbstractC5504s.c((I) R0.m.a(semanticsConfigurationE, R0.x.f15043a.c()), I.f52883a.a())) {
                this.f52935a.a(this.f52937c, iY, x.f52948a.b(strJ.toString()));
            }
        }
        boolean z11 = semanticsConfiguration != null && AbstractC5609g.e(semanticsConfiguration);
        if (semanticsConfigurationE != null && AbstractC5609g.e(semanticsConfigurationE)) {
            z10 = true;
        }
        if (z11 != z10) {
            if (z10) {
                this.f52942h.g(iY);
            } else {
                this.f52942h.r(iY);
            }
        }
    }

    @Override // q0.InterfaceC6061g
    public void b(androidx.compose.ui.focus.o oVar, androidx.compose.ui.focus.o oVar2) {
        R0.n nVarP;
        SemanticsConfiguration semanticsConfigurationE;
        R0.n nVarP2;
        SemanticsConfiguration semanticsConfigurationE2;
        if (oVar != null && (nVarP2 = AbstractC1796k.p(oVar)) != null && (semanticsConfigurationE2 = nVarP2.e()) != null && AbstractC5609g.d(semanticsConfigurationE2)) {
            this.f52935a.b(this.f52937c, nVarP2.y());
        }
        if (oVar2 == null || (nVarP = AbstractC1796k.p(oVar2)) == null || (semanticsConfigurationE = nVarP.e()) == null || !AbstractC5609g.d(semanticsConfigurationE)) {
            return;
        }
        int iY = nVarP.y();
        this.f52938d.d().l(iY, new a(iY));
    }

    public final M d() {
        return this.f52935a;
    }

    public final void e(R0.n nVar) {
        if (this.f52942h.r(nVar.y())) {
            this.f52935a.c(this.f52937c, nVar.y(), false);
        }
    }

    public final void f() {
        if (this.f52942h.c() && this.f52943i) {
            this.f52935a.commit();
            this.f52943i = false;
        }
        if (this.f52942h.d()) {
            this.f52943i = true;
        }
    }

    public final void g(R0.n nVar) {
        if (this.f52942h.r(nVar.y())) {
            this.f52935a.c(this.f52937c, nVar.y(), false);
        }
    }

    public final void h(R0.n nVar) {
        SemanticsConfiguration semanticsConfigurationE = nVar.e();
        if (semanticsConfigurationE == null || !AbstractC5609g.e(semanticsConfigurationE)) {
            return;
        }
        this.f52942h.g(nVar.y());
        this.f52935a.c(this.f52937c, nVar.y(), true);
    }

    public final void i(R0.n nVar, int i10) {
        if (this.f52942h.r(i10)) {
            this.f52935a.c(this.f52937c, i10, false);
        }
        SemanticsConfiguration semanticsConfigurationE = nVar.e();
        if (semanticsConfigurationE == null || !AbstractC5609g.e(semanticsConfigurationE)) {
            return;
        }
        this.f52942h.g(nVar.y());
        this.f52935a.c(this.f52937c, nVar.y(), true);
    }

    public final void j(SparseArray sparseArray) {
        SemanticsConfiguration semanticsConfigurationE;
        C2092a c2092a;
        Function1 function1;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValueA = AbstractC5607e.a(sparseArray.get(iKeyAt));
            x xVar = x.f52948a;
            if (xVar.e(autofillValueA)) {
                R0.n nVarA = this.f52936b.a(iKeyAt);
                if (nVarA != null && (semanticsConfigurationE = nVarA.e()) != null && (c2092a = (C2092a) R0.m.a(semanticsConfigurationE, R0.l.f14981a.k())) != null && (function1 = (Function1) c2092a.a()) != null) {
                }
            } else if (xVar.c(autofillValueA)) {
                Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (xVar.d(autofillValueA)) {
                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (xVar.f(autofillValueA)) {
                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }

    public final void k(ViewStructure viewStructure) {
        x xVar = x.f52948a;
        R0.n nVarC = this.f52936b.c();
        T.a(viewStructure, nVarC, this.f52941g, this.f52939e, this.f52938d);
        C6546L c6546lD = W.d(nVarC, viewStructure);
        while (c6546lD.g()) {
            Object objR = c6546lD.r(c6546lD.f60007b - 1);
            AbstractC5504s.f(objR, "null cannot be cast to non-null type android.view.ViewStructure");
            ViewStructure viewStructure2 = (ViewStructure) objR;
            Object objR2 = c6546lD.r(c6546lD.f60007b - 1);
            AbstractC5504s.f(objR2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
            List listN = ((R0.n) objR2).n();
            int size = listN.size();
            for (int i10 = 0; i10 < size; i10++) {
                R0.n nVar = (R0.n) listN.get(i10);
                if (!nVar.z() && nVar.b() && nVar.p()) {
                    SemanticsConfiguration semanticsConfigurationE = nVar.e();
                    if (semanticsConfigurationE == null || !AbstractC5609g.f(semanticsConfigurationE)) {
                        c6546lD.k(nVar);
                        c6546lD.k(viewStructure2);
                    } else {
                        ViewStructure viewStructureG = xVar.g(viewStructure2, xVar.a(viewStructure2, 1));
                        T.a(viewStructureG, nVar, this.f52941g, this.f52939e, this.f52938d);
                        c6546lD.k(nVar);
                        c6546lD.k(viewStructureG);
                    }
                }
            }
        }
    }
}
