package y3;

import P9.AbstractC2011u;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import r3.d;
import r3.r;
import s2.C6403a;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.InterfaceC6627n;
import t2.a0;

/* JADX INFO: renamed from: y3.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7198a implements r {

    /* JADX INFO: renamed from: a */
    private final C6609I f64757a = new C6609I();

    /* JADX INFO: renamed from: b */
    private final boolean f64758b;

    /* JADX INFO: renamed from: c */
    private final int f64759c;

    /* JADX INFO: renamed from: d */
    private final int f64760d;

    /* JADX INFO: renamed from: e */
    private final String f64761e;

    /* JADX INFO: renamed from: f */
    private final float f64762f;

    /* JADX INFO: renamed from: g */
    private final int f64763g;

    public C7198a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f64759c = 0;
            this.f64760d = -1;
            this.f64761e = "sans-serif";
            this.f64758b = false;
            this.f64762f = 0.85f;
            this.f64763g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f64759c = bArr[24];
        this.f64760d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f64761e = "Serif".equals(a0.K(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f64763g = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f64758b = z10;
        if (z10) {
            this.f64762f = a0.q(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f64762f = 0.85f;
        }
    }

    private void d(C6609I c6609i, SpannableStringBuilder spannableStringBuilder) {
        AbstractC6614a.a(c6609i.a() >= 12);
        int iU = c6609i.U();
        int iU2 = c6609i.U();
        c6609i.c0(2);
        int iM = c6609i.M();
        c6609i.c0(1);
        int iV = c6609i.v();
        if (iU2 > spannableStringBuilder.length()) {
            AbstractC6635w.i("Tx3gParser", "Truncating styl end (" + iU2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iU2 = spannableStringBuilder.length();
        }
        int i10 = iU2;
        if (iU < i10) {
            f(spannableStringBuilder, iM, this.f64759c, iU, i10, 0);
            e(spannableStringBuilder, iV, this.f64760d, iU, i10, 0);
            return;
        }
        AbstractC6635w.i("Tx3gParser", "Ignoring styl with start (" + iU + ") >= end (" + i10 + ").");
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    private static void g(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String h(C6609I c6609i) {
        AbstractC6614a.a(c6609i.a() >= 2);
        int iU = c6609i.U();
        if (iU == 0) {
            return "";
        }
        int iG = c6609i.g();
        Charset charsetW = c6609i.W();
        int iG2 = iU - (c6609i.g() - iG);
        if (charsetW == null) {
            charsetW = StandardCharsets.UTF_8;
        }
        return c6609i.K(iG2, charsetW);
    }

    @Override // r3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC6627n interfaceC6627n) {
        this.f64757a.Z(bArr, i11 + i10);
        this.f64757a.b0(i10);
        String strH = h(this.f64757a);
        if (strH.isEmpty()) {
            interfaceC6627n.accept(new d(AbstractC2011u.A(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strH);
        f(spannableStringBuilder, this.f64759c, 0, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder, this.f64760d, -1, 0, spannableStringBuilder.length(), 16711680);
        g(spannableStringBuilder, this.f64761e, 0, spannableStringBuilder.length());
        float fQ = this.f64762f;
        while (this.f64757a.a() >= 8) {
            int iG = this.f64757a.g();
            int iV = this.f64757a.v();
            int iV2 = this.f64757a.v();
            if (iV2 == 1937013100) {
                AbstractC6614a.a(this.f64757a.a() >= 2);
                int iU = this.f64757a.U();
                for (int i12 = 0; i12 < iU; i12++) {
                    d(this.f64757a, spannableStringBuilder);
                }
            } else if (iV2 == 1952608120 && this.f64758b) {
                AbstractC6614a.a(this.f64757a.a() >= 2);
                fQ = a0.q(this.f64757a.U() / this.f64763g, 0.0f, 0.95f);
            }
            this.f64757a.b0(iG + iV);
        }
        interfaceC6627n.accept(new d(AbstractC2011u.B(new C6403a.b().o(spannableStringBuilder).h(fQ, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // r3.r
    public int c() {
        return 2;
    }
}
