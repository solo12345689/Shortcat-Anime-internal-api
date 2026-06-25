package G2;

import B2.K1;
import B3.C1084b;
import B3.C1087e;
import B3.C1090h;
import B3.C1092j;
import B3.K;
import P9.AbstractC2011u;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import q2.AbstractC6079K;
import q2.AbstractC6104s;
import q2.C6078J;
import q2.C6109x;
import r3.r;
import t2.AbstractC6614a;
import t2.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f6997f = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r.a f6999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7002e;

    public c() {
        this(0, true);
    }

    private static void f(int i10, List list) {
        if (S9.f.k(f6997f, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    private InterfaceC2255p h(int i10, C6109x c6109x, List list, O o10) {
        if (i10 == 0) {
            return new C1084b();
        }
        if (i10 == 1) {
            return new C1087e();
        }
        if (i10 == 2) {
            return new C1090h();
        }
        if (i10 == 7) {
            return new n3.f(0, 0L);
        }
        if (i10 == 8) {
            return i(this.f6999b, this.f7000c, o10, c6109x, list, this.f7001d);
        }
        if (i10 == 11) {
            return j(this.f6998a, this.f7002e, c6109x, list, o10, this.f6999b, this.f7000c);
        }
        if (i10 != 13) {
            return null;
        }
        return new k(c6109x.f57011d, o10, this.f6999b, this.f7000c);
    }

    private static o3.h i(r.a aVar, boolean z10, O o10, C6109x c6109x, List list, int i10) {
        int i11 = m(c6109x) ? 4 : 0;
        if (!z10) {
            aVar = r.a.f58521a;
            i11 |= 32;
        }
        r.a aVar2 = aVar;
        int iK = i11 | o3.h.k(i10);
        if (list == null) {
            list = AbstractC2011u.A();
        }
        return new o3.h(aVar2, iK, o10, null, list, null);
    }

    private static K j(int i10, boolean z10, C6109x c6109x, List list, O o10, r.a aVar, boolean z11) {
        int i11;
        int i12 = i10 | 16;
        if (list != null) {
            i12 = i10 | 48;
        } else {
            list = z10 ? Collections.singletonList(new C6109x.b().y0("application/cea-608").P()) : Collections.EMPTY_LIST;
        }
        String str = c6109x.f57018k;
        if (!TextUtils.isEmpty(str)) {
            if (!AbstractC6079K.b(str, "audio/mp4a-latm")) {
                i12 |= 2;
            }
            if (!AbstractC6079K.b(str, "video/avc")) {
                i12 |= 4;
            }
        }
        if (z11) {
            i11 = 0;
        } else {
            aVar = r.a.f58521a;
            i11 = 1;
        }
        return new K(2, i11, aVar, o10, new C1092j(i12, list), 112800);
    }

    private static boolean m(C6109x c6109x) {
        C6078J c6078j = c6109x.f57019l;
        if (c6078j == null) {
            return false;
        }
        for (int i10 = 0; i10 < c6078j.e(); i10++) {
            if (c6078j.d(i10) instanceof h) {
                return !((h) r2).f7006c.isEmpty();
            }
        }
        return false;
    }

    private static boolean o(InterfaceC2255p interfaceC2255p, InterfaceC2256q interfaceC2256q) {
        try {
            boolean zF = interfaceC2255p.f(interfaceC2256q);
            interfaceC2256q.g();
            return zF;
        } catch (EOFException unused) {
            interfaceC2256q.g();
            return false;
        } catch (Throwable th2) {
            interfaceC2256q.g();
            throw th2;
        }
    }

    @Override // G2.e
    public C6109x d(C6109x c6109x) {
        String str;
        if (!this.f7000c || !this.f6999b.b(c6109x)) {
            return c6109x;
        }
        C6109x.b bVarY = c6109x.b().y0("application/x-media3-cues").Y(this.f6999b.c(c6109x));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c6109x.f57022o);
        if (c6109x.f57018k != null) {
            str = " " + c6109x.f57018k;
        } else {
            str = "";
        }
        sb2.append(str);
        return bVarY.U(sb2.toString()).C0(Long.MAX_VALUE).P();
    }

    @Override // G2.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a e(Uri uri, C6109x c6109x, List list, O o10, Map map, InterfaceC2256q interfaceC2256q, K1 k12) {
        int iA = AbstractC6104s.a(c6109x.f57022o);
        int iB = AbstractC6104s.b(map);
        int iC = AbstractC6104s.c(uri);
        int[] iArr = f6997f;
        ArrayList arrayList = new ArrayList(iArr.length);
        f(iA, arrayList);
        f(iB, arrayList);
        f(iC, arrayList);
        for (int i10 : iArr) {
            f(i10, arrayList);
        }
        interfaceC2256q.g();
        InterfaceC2255p interfaceC2255p = null;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int iIntValue = ((Integer) arrayList.get(i11)).intValue();
            InterfaceC2255p interfaceC2255p2 = (InterfaceC2255p) AbstractC6614a.e(h(iIntValue, c6109x, list, o10));
            if (o(interfaceC2255p2, interfaceC2256q)) {
                return new a(interfaceC2255p2, c6109x, o10, this.f6999b, this.f7000c);
            }
            if (interfaceC2255p == null && (iIntValue == iA || iIntValue == iB || iIntValue == iC || iIntValue == 11)) {
                interfaceC2255p = interfaceC2255p2;
            }
        }
        return new a((InterfaceC2255p) AbstractC6614a.e(interfaceC2255p), c6109x, o10, this.f6999b, this.f7000c);
    }

    @Override // G2.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c c(boolean z10) {
        this.f7000c = z10;
        return this;
    }

    @Override // G2.e
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c b(int i10) {
        this.f7001d = i10;
        return this;
    }

    @Override // G2.e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public c a(r.a aVar) {
        this.f6999b = aVar;
        return this;
    }

    public c(int i10, boolean z10) {
        this.f6998a = i10;
        this.f7002e = z10;
        this.f6999b = new r3.g();
    }
}
