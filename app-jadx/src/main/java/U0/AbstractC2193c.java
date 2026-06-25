package U0;

import U0.N0;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import g1.C4825e;
import g1.C4826f;
import g1.C4830j;
import i1.AbstractC5030w;
import i1.C5029v;

/* JADX INFO: renamed from: U0.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2193c {
    public static final CharSequence j(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!V0.U.a(spannableString, X0.c.class)) {
            e1.d.x(spannableString, new X0.c(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    public static final int k(V0.o0 o0Var, int i10) {
        int iM = o0Var.m();
        for (int i11 = 0; i11 < iM; i11++) {
            if (o0Var.l(i11) > i10) {
                return i11;
            }
        }
        return o0Var.m();
    }

    public static final boolean l(Y0 y02, boolean z10) {
        if (z10 && !C5029v.e(y02.s(), AbstractC5030w.f(0)) && !C5029v.e(y02.s(), C5029v.f48578b.a())) {
            int iB = y02.B();
            C4830j.a aVar = C4830j.f47278b;
            if (!C4830j.k(iB, aVar.g()) && !C4830j.k(y02.B(), aVar.f()) && !C4830j.k(y02.B(), aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public static final int m(int i10) {
        C4830j.a aVar = C4830j.f47278b;
        if (C4830j.k(i10, aVar.d())) {
            return 3;
        }
        if (C4830j.k(i10, aVar.e())) {
            return 4;
        }
        if (C4830j.k(i10, aVar.a())) {
            return 2;
        }
        return (!C4830j.k(i10, aVar.f()) && C4830j.k(i10, aVar.b())) ? 1 : 0;
    }

    public static final int n(int i10) {
        C4826f.b.a aVar = C4826f.b.f47238a;
        if (C4826f.b.e(i10, aVar.c())) {
            return 0;
        }
        if (C4826f.b.e(i10, aVar.b())) {
            return 1;
        }
        return C4826f.b.e(i10, aVar.a()) ? 2 : 0;
    }

    public static final int o(int i10) {
        C4825e.a aVar = C4825e.f47227b;
        if (C4825e.g(i10, aVar.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        C4825e.g(i10, aVar.b());
        return 0;
    }

    public static final int p(int i10) {
        C4826f.c.a aVar = C4826f.c.f47243a;
        if (C4826f.c.f(i10, aVar.a())) {
            return 0;
        }
        if (C4826f.c.f(i10, aVar.b())) {
            return 1;
        }
        if (C4826f.c.f(i10, aVar.c())) {
            return 2;
        }
        return C4826f.c.f(i10, aVar.d()) ? 3 : 0;
    }

    public static final int q(int i10) {
        C4826f.d.a aVar = C4826f.d.f47249a;
        return (!C4826f.d.d(i10, aVar.a()) && C4826f.d.d(i10, aVar.b())) ? 1 : 0;
    }

    public static final int r(int i10) {
        N0.a aVar = N0.f18754a;
        return (!N0.d(i10, aVar.a()) && N0.d(i10, aVar.b())) ? 1 : 0;
    }
}
