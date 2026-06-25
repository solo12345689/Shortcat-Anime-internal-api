package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import s2.C6403a;
import s2.InterfaceC6410h;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class F {
    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof InterfaceC6410h);
    }

    public static void c(C6403a.b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            e((Spannable) AbstractC6614a.e(bVar.e()), new O9.o() { // from class: androidx.media3.ui.D
                @Override // O9.o
                public final boolean apply(Object obj) {
                    return F.b(obj);
                }
            });
        }
        d(bVar);
    }

    public static void d(C6403a.b bVar) {
        bVar.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            e((Spannable) AbstractC6614a.e(bVar.e()), new O9.o() { // from class: androidx.media3.ui.E
                @Override // O9.o
                public final boolean apply(Object obj) {
                    return F.a(obj);
                }
            });
        }
    }

    private static void e(Spannable spannable, O9.o oVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (oVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float f(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }
}
