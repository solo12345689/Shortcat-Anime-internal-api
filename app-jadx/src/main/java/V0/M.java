package V0;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a */
    private final Layout f19614a;

    /* JADX INFO: renamed from: b */
    private final List f19615b;

    /* JADX INFO: renamed from: c */
    private final List f19616c;

    /* JADX INFO: renamed from: d */
    private final boolean[] f19617d;

    /* JADX INFO: renamed from: e */
    private char[] f19618e;

    /* JADX INFO: renamed from: f */
    private final int f19619f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final int f19620a;

        /* JADX INFO: renamed from: b */
        private final int f19621b;

        /* JADX INFO: renamed from: c */
        private final boolean f19622c;

        public a(int i10, int i11, boolean z10) {
            this.f19620a = i10;
            this.f19621b = i11;
            this.f19622c = z10;
        }

        public final int a() {
            return this.f19621b;
        }

        public final int b() {
            return this.f19620a;
        }

        public final boolean c() {
            return this.f19622c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19620a == aVar.f19620a && this.f19621b == aVar.f19621b && this.f19622c == aVar.f19622c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f19620a) * 31) + Integer.hashCode(this.f19621b)) * 31) + Boolean.hashCode(this.f19622c);
        }

        public String toString() {
            return "BidiRun(start=" + this.f19620a + ", end=" + this.f19621b + ", isRtl=" + this.f19622c + ')';
        }
    }

    public M(Layout layout) {
        this.f19614a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iI0 = Df.r.i0(this.f19614a.getText(), '\n', length, false, 4, null);
            length = iI0 < 0 ? this.f19614a.getText().length() : iI0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f19614a.getText().length());
        this.f19615b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f19616c = arrayList2;
        this.f19617d = new boolean[this.f19615b.size()];
        this.f19619f = this.f19615b.size();
    }

    private final float b(int i10, boolean z10) {
        int i11 = AbstractC5874j.i(i10, this.f19614a.getLineEnd(this.f19614a.getLineForOffset(i10)));
        return z10 ? this.f19614a.getPrimaryHorizontal(i11) : this.f19614a.getSecondaryHorizontal(i11);
    }

    public static /* synthetic */ int g(M m10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return m10.f(i10, z10);
    }

    private final int k(int i10, int i11) {
        while (i10 > i11 && i(this.f19614a.getText().charAt(i10 - 1))) {
            i10--;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi a(int r11) {
        /*
            r10 = this;
            boolean[] r0 = r10.f19617d
            boolean r0 = r0[r11]
            if (r0 == 0) goto Lf
            java.util.List r0 = r10.f19616c
            java.lang.Object r11 = r0.get(r11)
            java.text.Bidi r11 = (java.text.Bidi) r11
            return r11
        Lf:
            r0 = 0
            if (r11 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List r1 = r10.f19615b
            int r2 = r11 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List r2 = r10.f19615b
            java.lang.Object r2 = r2.get(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r10.f19618e
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r4 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r10.f19614a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r4, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r4, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            boolean r9 = r10.j(r11)
            java.text.Bidi r3 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r0 = r3.getRunCount()
            if (r0 != r2) goto L61
        L60:
            r3 = r1
        L61:
            java.util.List r0 = r10.f19616c
            r0.set(r11, r3)
            boolean[] r0 = r10.f19617d
            r0[r11] = r2
            if (r3 == 0) goto L73
            char[] r11 = r10.f19618e
            if (r4 != r11) goto L72
            r4 = r1
            goto L73
        L72:
            r4 = r11
        L73:
            r10.f19618e = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.M.a(int):java.text.Bidi");
    }

    public final float c(int i10, boolean z10, boolean z11) {
        int iK = i10;
        if (!z11) {
            return b(i10, z10);
        }
        int iA = L.a(this.f19614a, iK, z11);
        int lineStart = this.f19614a.getLineStart(iA);
        int lineEnd = this.f19614a.getLineEnd(iA);
        if (iK != lineStart && iK != lineEnd) {
            return b(i10, z10);
        }
        if (iK == 0 || iK == this.f19614a.getText().length()) {
            return b(i10, z10);
        }
        int iF = f(iK, z11);
        boolean zJ = j(iF);
        int iK2 = k(lineEnd, lineStart);
        int iH = h(iF);
        int i11 = lineStart - iH;
        int i12 = iK2 - iH;
        Bidi bidiA = a(iF);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i11, i12) : null;
        boolean z12 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.f19614a.isRtlCharAt(lineStart);
            if (z10 || zJ == zIsRtlCharAt) {
                zJ = !zJ;
            }
            if (iK == lineStart) {
                z12 = zJ;
            } else if (!zJ) {
                z12 = true;
            }
            Layout layout = this.f19614a;
            return z12 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            aVarArr[i13] = new a(bidiCreateLineBidi.getRunStart(i13) + lineStart, bidiCreateLineBidi.getRunLimit(i13) + lineStart, bidiCreateLineBidi.getRunLevel(i13) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i14 = 0; i14 < runCount2; i14++) {
            bArr[i14] = (byte) bidiCreateLineBidi.getRunLevel(i14);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i15 = -1;
        if (iK == lineStart) {
            int i16 = 0;
            while (true) {
                if (i16 >= runCount) {
                    break;
                }
                if (aVarArr[i16].b() == iK) {
                    i15 = i16;
                    break;
                }
                i16++;
            }
            a aVar = aVarArr[i15];
            if (z10 || zJ == aVar.c()) {
                zJ = !zJ;
            }
            return (i15 == 0 && zJ) ? this.f19614a.getLineLeft(iA) : (i15 != AbstractC2273n.f0(aVarArr) || zJ) ? zJ ? this.f19614a.getPrimaryHorizontal(aVarArr[i15 - 1].b()) : this.f19614a.getPrimaryHorizontal(aVarArr[i15 + 1].b()) : this.f19614a.getLineRight(iA);
        }
        if (iK > iK2) {
            iK = k(iK, lineStart);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= runCount) {
                break;
            }
            if (aVarArr[i17].a() == iK) {
                i15 = i17;
                break;
            }
            i17++;
        }
        a aVar2 = aVarArr[i15];
        if (!z10 && zJ != aVar2.c()) {
            zJ = !zJ;
        }
        return (i15 == 0 && zJ) ? this.f19614a.getLineLeft(iA) : (i15 != AbstractC2273n.f0(aVarArr) || zJ) ? zJ ? this.f19614a.getPrimaryHorizontal(aVarArr[i15 - 1].a()) : this.f19614a.getPrimaryHorizontal(aVarArr[i15 + 1].a()) : this.f19614a.getLineRight(iA);
    }

    public final a[] d(int i10) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.f19614a.getLineStart(i10);
        int lineEnd = this.f19614a.getLineEnd(i10);
        int iG = g(this, lineStart, false, 2, null);
        int iH = h(iG);
        int i11 = lineStart - iH;
        int i12 = lineEnd - iH;
        Bidi bidiA = a(iG);
        if (bidiA == null || (bidiCreateLineBidi = bidiA.createLineBidi(i11, i12)) == null) {
            return new a[]{new a(lineStart, lineEnd, this.f19614a.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            int runStart = bidiCreateLineBidi.getRunStart(i13) + lineStart;
            int runLimit = bidiCreateLineBidi.getRunLimit(i13) + lineStart;
            boolean z10 = true;
            if (bidiCreateLineBidi.getRunLevel(i13) % 2 != 1) {
                z10 = false;
            }
            aVarArr[i13] = new a(runStart, runLimit, z10);
        }
        return aVarArr;
    }

    public final int e(int i10) {
        return k(this.f19614a.getLineEnd(i10), this.f19614a.getLineStart(i10));
    }

    public final int f(int i10, boolean z10) {
        int iL = AbstractC2279u.l(this.f19615b, Integer.valueOf(i10), 0, 0, 6, null);
        int i11 = iL < 0 ? -(iL + 1) : iL + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) this.f19615b.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public final int h(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) this.f19615b.get(i10 - 1)).intValue();
    }

    public final boolean i(char c10) {
        if (c10 == ' ' || c10 == '\n' || c10 == 5760) {
            return true;
        }
        return (AbstractC5504s.i(c10, 8192) >= 0 && AbstractC5504s.i(c10, 8202) <= 0 && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    public final boolean j(int i10) {
        return this.f19614a.getParagraphDirection(this.f19614a.getLineForOffset(h(i10))) == -1;
    }
}
