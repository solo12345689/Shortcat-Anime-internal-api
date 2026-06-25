package d1;

import U0.C2205i;
import U0.E;
import U0.G;
import U0.Y0;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import g1.C4828h;
import g1.C4831k;
import i1.C5029v;
import i1.InterfaceC5011d;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f44939a = new a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.emoji2.text.e] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final CharSequence a(String str, float f10, Y0 y02, List list, List list2, InterfaceC5011d interfaceC5011d, ie.p pVar, boolean z10) {
        String str2;
        CharSequence charSequenceU;
        float f11;
        InterfaceC5011d interfaceC5011d2;
        E eA;
        if (z10 && androidx.emoji2.text.e.k()) {
            G gY = y02.y();
            C2205i c2205iD = (gY == null || (eA = gY.a()) == null) ? null : C2205i.d(eA.b());
            str2 = str;
            charSequenceU = androidx.emoji2.text.e.c().u(str2, 0, str.length(), Integer.MAX_VALUE, c2205iD == null ? 0 : C2205i.g(c2205iD.j(), C2205i.f18836b.a()));
            AbstractC5504s.e(charSequenceU);
        } else {
            str2 = str;
            charSequenceU = str2;
        }
        if (list.isEmpty() && list2.isEmpty() && AbstractC5504s.c(y02.F(), g1.s.f47309c.a()) && C5029v.f(y02.u()) == 0) {
            return charSequenceU;
        }
        Spannable spannableString = charSequenceU instanceof Spannable ? (Spannable) charSequenceU : new SpannableString(charSequenceU);
        if (AbstractC5504s.c(y02.C(), C4831k.f47287b.d())) {
            e1.d.x(spannableString, f44939a, 0, str2.length());
        }
        if (b(y02) && y02.v() == null) {
            e1.d.u(spannableString, y02.u(), f10, interfaceC5011d);
            f11 = f10;
            interfaceC5011d2 = interfaceC5011d;
        } else {
            C4828h c4828hV = y02.v();
            if (c4828hV == null) {
                c4828hV = C4828h.f47253d.a();
            }
            f11 = f10;
            interfaceC5011d2 = interfaceC5011d;
            e1.d.t(spannableString, y02.u(), f11, interfaceC5011d2, c4828hV);
        }
        e1.d.B(spannableString, y02.F(), f11, interfaceC5011d2);
        e1.d.z(spannableString, y02, list, interfaceC5011d2, pVar);
        e1.d.l(spannableString, list, f11, interfaceC5011d2, y02.F());
        e1.b.b(spannableString, list2, interfaceC5011d2);
        return spannableString;
    }

    public static final boolean b(Y0 y02) {
        E eA;
        G gY = y02.y();
        if (gY == null || (eA = gY.a()) == null) {
            return false;
        }
        return eA.c();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }
}
