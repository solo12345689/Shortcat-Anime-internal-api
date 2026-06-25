package d1;

import U0.AbstractC2207j;
import U0.C2197e;
import U0.I0;
import U0.a1;
import U0.b1;
import Y0.AbstractC2474i;
import Y0.AbstractC2485u;
import Y0.H;
import Y0.I;
import Y0.L;
import Y0.P;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import g1.C4831k;
import i1.InterfaceC5011d;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: d1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4555a {
    private static final void a(SpannableString spannableString, I0 i02, int i10, int i11, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar) {
        e1.d.m(spannableString, i02.g(), i10, i11);
        e1.d.r(spannableString, i02.k(), interfaceC5011d, i10, i11);
        if (i02.n() != null || i02.l() != null) {
            L lN = i02.n();
            if (lN == null) {
                lN = L.f22613b.g();
            }
            H hL = i02.l();
            spannableString.setSpan(new StyleSpan(AbstractC2474i.c(lN, hL != null ? hL.i() : H.f22594b.b())), i10, i11, 33);
        }
        if (i02.i() != null) {
            if (i02.i() instanceof P) {
                spannableString.setSpan(new TypefaceSpan(((P) i02.i()).l()), i10, i11, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                AbstractC2485u abstractC2485uI = i02.i();
                I iM = i02.m();
                Object value = AbstractC2485u.b.a(bVar, abstractC2485uI, null, 0, iM != null ? iM.m() : I.f22598b.a(), 6, null).getValue();
                AbstractC5504s.f(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(m.f44965a.a((Typeface) value), i10, i11, 33);
            }
        }
        if (i02.s() != null) {
            C4831k c4831kS = i02.s();
            C4831k.a aVar = C4831k.f47287b;
            if (c4831kS.d(aVar.d())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (i02.s().d(aVar.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (i02.u() != null) {
            spannableString.setSpan(new ScaleXSpan(i02.u().b()), i10, i11, 33);
        }
        e1.d.v(spannableString, i02.p(), i10, i11);
        e1.d.i(spannableString, i02.d(), i10, i11);
    }

    public static final SpannableString b(C2197e c2197e, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, w wVar) {
        SpannableString spannableString = new SpannableString(c2197e.j());
        List listH = c2197e.h();
        if (listH != null) {
            int size = listH.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2197e.d dVar = (C2197e.d) listH.get(i10);
                a(spannableString, I0.b((I0) dVar.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), dVar.b(), dVar.c(), interfaceC5011d, bVar);
            }
        }
        List listK = c2197e.k(0, c2197e.length());
        int size2 = listK.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C2197e.d dVar2 = (C2197e.d) listK.get(i11);
            spannableString.setSpan(e1.f.a((a1) dVar2.a()), dVar2.b(), dVar2.c(), 33);
        }
        List listL = c2197e.l(0, c2197e.length());
        int size3 = listL.size();
        for (int i12 = 0; i12 < size3; i12++) {
            C2197e.d dVar3 = (C2197e.d) listL.get(i12);
            spannableString.setSpan(wVar.c((b1) dVar3.a()), dVar3.b(), dVar3.c(), 33);
        }
        List listD = c2197e.d(0, c2197e.length());
        int size4 = listD.size();
        for (int i13 = 0; i13 < size4; i13++) {
            C2197e.d dVar4 = (C2197e.d) listD.get(i13);
            if (dVar4.h() != dVar4.f()) {
                AbstractC2207j abstractC2207j = (AbstractC2207j) dVar4.g();
                if (abstractC2207j instanceof AbstractC2207j.b) {
                    ((AbstractC2207j.b) abstractC2207j).a();
                    spannableString.setSpan(wVar.b(c(dVar4)), dVar4.h(), dVar4.f(), 33);
                } else {
                    spannableString.setSpan(wVar.a(dVar4), dVar4.h(), dVar4.f(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final C2197e.d c(C2197e.d dVar) {
        Object objG = dVar.g();
        AbstractC5504s.f(objG, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new C2197e.d((AbstractC2207j.b) objG, dVar.h(), dVar.f());
    }
}
