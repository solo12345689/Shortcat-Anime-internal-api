package u2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q2.C6078J;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: u2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6721c implements C6078J.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f61222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61224d;

    public C6721c(String str, byte[] bArr, int i10, int i11) {
        f(str, bArr, i11);
        this.f61221a = str;
        this.f61222b = bArr;
        this.f61223c = i10;
        this.f61224d = i11;
    }

    private static String e(List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        O9.g.f(',').b(sb2, list);
        return sb2.toString();
    }

    private static void f(String str, byte[] bArr, int i10) {
        boolean z10;
        byte b10;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i10 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                AbstractC6614a.a(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                AbstractC6614a.a(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i10 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                AbstractC6614a.a(z10);
                break;
            case "auxiliary.tracks.map":
                AbstractC6614a.a(i10 == 0);
                break;
        }
    }

    public List d() {
        AbstractC6614a.h(this.f61221a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b10 = this.f61222b[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(this.f61222b[i10 + 2]));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6721c.class == obj.getClass()) {
            C6721c c6721c = (C6721c) obj;
            if (this.f61221a.equals(c6721c.f61221a) && Arrays.equals(this.f61222b, c6721c.f61222b) && this.f61223c == c6721c.f61223c && this.f61224d == c6721c.f61224d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f61221a.hashCode()) * 31) + Arrays.hashCode(this.f61222b)) * 31) + this.f61223c) * 31) + this.f61224d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            int r0 = r3.f61224d
            if (r0 == 0) goto L57
            r1 = 1
            if (r0 == r1) goto L50
            r1 = 23
            if (r0 == r1) goto L41
            r1 = 67
            if (r0 == r1) goto L36
            r1 = 75
            if (r0 == r1) goto L28
            r1 = 78
            if (r0 == r1) goto L18
            goto L6a
        L18:
            t2.I r0 = new t2.I
            byte[] r1 = r3.f61222b
            r0.<init>(r1)
            long r0 = r0.T()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L28:
            byte[] r0 = r3.f61222b
            r1 = 0
            r0 = r0[r1]
            int r0 = u2.AbstractC6720b.a(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L36:
            byte[] r0 = r3.f61222b
            int r0 = S9.f.h(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L41:
            byte[] r0 = r3.f61222b
            int r0 = S9.f.h(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L50:
            byte[] r0 = r3.f61222b
            java.lang.String r0 = t2.a0.J(r0)
            goto L70
        L57:
            java.lang.String r0 = r3.f61221a
            java.lang.String r1 = "auxiliary.tracks.map"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6a
            java.util.List r0 = r3.d()
            java.lang.String r0 = e(r0)
            goto L70
        L6a:
            byte[] r0 = r3.f61222b
            java.lang.String r0 = t2.a0.A1(r0)
        L70:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mdta: key="
            r1.append(r2)
            java.lang.String r2 = r3.f61221a
            r1.append(r2)
            java.lang.String r2 = ", value="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C6721c.toString():java.lang.String");
    }
}
