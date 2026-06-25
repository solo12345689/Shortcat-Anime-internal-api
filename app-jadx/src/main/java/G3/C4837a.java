package g3;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import q2.AbstractC6079K;
import q2.C6077I;
import q2.C6078J;
import t2.C6609I;

/* JADX INFO: renamed from: g3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4837a implements C6078J.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f47336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f47337h;

    public C4837a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f47330a = i10;
        this.f47331b = str;
        this.f47332c = str2;
        this.f47333d = i11;
        this.f47334e = i12;
        this.f47335f = i13;
        this.f47336g = i14;
        this.f47337h = bArr;
    }

    public static C4837a d(C6609I c6609i) {
        int iV = c6609i.v();
        String strU = AbstractC6079K.u(c6609i.K(c6609i.v(), StandardCharsets.US_ASCII));
        String strJ = c6609i.J(c6609i.v());
        int iV2 = c6609i.v();
        int iV3 = c6609i.v();
        int iV4 = c6609i.v();
        int iV5 = c6609i.v();
        int iV6 = c6609i.v();
        byte[] bArr = new byte[iV6];
        c6609i.q(bArr, 0, iV6);
        return new C4837a(iV, strU, strJ, iV2, iV3, iV4, iV5, bArr);
    }

    @Override // q2.C6078J.a
    public void b(C6077I.b bVar) {
        bVar.K(this.f47337h, this.f47330a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4837a.class == obj.getClass()) {
            C4837a c4837a = (C4837a) obj;
            if (this.f47330a == c4837a.f47330a && this.f47331b.equals(c4837a.f47331b) && this.f47332c.equals(c4837a.f47332c) && this.f47333d == c4837a.f47333d && this.f47334e == c4837a.f47334e && this.f47335f == c4837a.f47335f && this.f47336g == c4837a.f47336g && Arrays.equals(this.f47337h, c4837a.f47337h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f47330a) * 31) + this.f47331b.hashCode()) * 31) + this.f47332c.hashCode()) * 31) + this.f47333d) * 31) + this.f47334e) * 31) + this.f47335f) * 31) + this.f47336g) * 31) + Arrays.hashCode(this.f47337h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f47331b + ", description=" + this.f47332c;
    }
}
