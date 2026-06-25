package x3;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import s2.AbstractC6412j;
import s2.C6409g;
import s2.C6411i;
import s2.C6413k;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class f {
    public static void a(Spannable spannable, int i10, int i11, g gVar, C7051c c7051c, Map map, int i12) {
        C7051c c7051cE;
        g gVarF;
        int i13;
        if (gVar.n() != -1) {
            spannable.setSpan(new StyleSpan(gVar.n()), i10, i11, 33);
        }
        if (gVar.u()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.v()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.s()) {
            AbstractC6412j.b(spannable, new ForegroundColorSpan(gVar.d()), i10, i11, 33);
        }
        if (gVar.r()) {
            AbstractC6412j.b(spannable, new BackgroundColorSpan(gVar.b()), i10, i11, 33);
        }
        if (gVar.e() != null) {
            AbstractC6412j.b(spannable, new TypefaceSpan(gVar.e()), i10, i11, 33);
        }
        if (gVar.q() != null) {
            C7050b c7050b = (C7050b) AbstractC6614a.e(gVar.q());
            int i14 = c7050b.f63809a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = c7050b.f63810b;
            }
            int i15 = c7050b.f63811c;
            if (i15 == -2) {
                i15 = 1;
            }
            AbstractC6412j.b(spannable, new C6413k(i14, i13, i15), i10, i11, 33);
        }
        int iL = gVar.l();
        if (iL == 2) {
            C7051c c7051cD = d(c7051c, map);
            if (c7051cD != null && (c7051cE = e(c7051cD, map)) != null) {
                if (c7051cE.g() != 1 || c7051cE.f(0).f63813b == null) {
                    AbstractC6635w.g("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) a0.l(c7051cE.f(0).f63813b);
                    g gVarF2 = f(c7051cE.f63817f, c7051cE.l(), map);
                    int iK = gVarF2 != null ? gVarF2.k() : -1;
                    if (iK == -1 && (gVarF = f(c7051cD.f63817f, c7051cD.l(), map)) != null) {
                        iK = gVarF.k();
                    }
                    spannable.setSpan(new C6411i(str, iK), i10, i11, 33);
                }
            }
        } else if (iL == 3 || iL == 4) {
            spannable.setSpan(new C7049a(), i10, i11, 33);
        }
        if (gVar.p()) {
            AbstractC6412j.b(spannable, new C6409g(), i10, i11, 33);
        }
        int iG = gVar.g();
        if (iG == 1) {
            AbstractC6412j.b(spannable, new AbsoluteSizeSpan((int) gVar.f(), true), i10, i11, 33);
        } else if (iG == 2) {
            AbstractC6412j.b(spannable, new RelativeSizeSpan(gVar.f()), i10, i11, 33);
        } else {
            if (iG != 3) {
                return;
            }
            AbstractC6412j.a(spannable, gVar.f() / 100.0f, i10, i11, 33);
        }
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static C7051c d(C7051c c7051c, Map map) {
        while (c7051c != null) {
            g gVarF = f(c7051c.f63817f, c7051c.l(), map);
            if (gVarF != null && gVarF.l() == 1) {
                return c7051c;
            }
            c7051c = c7051c.f63821j;
        }
        return null;
    }

    private static C7051c e(C7051c c7051c, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c7051c);
        while (!arrayDeque.isEmpty()) {
            C7051c c7051c2 = (C7051c) arrayDeque.pop();
            g gVarF = f(c7051c2.f63817f, c7051c2.l(), map);
            if (gVarF != null && gVarF.l() == 3) {
                return c7051c2;
            }
            for (int iG = c7051c2.g() - 1; iG >= 0; iG--) {
                arrayDeque.push(c7051c2.f(iG));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a((g) map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a((g) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a((g) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }
}
