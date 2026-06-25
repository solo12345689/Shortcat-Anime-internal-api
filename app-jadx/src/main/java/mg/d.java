package mg;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import com.adjust.sdk.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import fg.AbstractC4807e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.C6683h;
import tg.C6686k;
import tg.InterfaceC6685j;
import tg.K;
import tg.Z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f53514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c[] f53515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f53516c;

    static {
        d dVar = new d();
        f53514a = dVar;
        c cVar = new c(c.f53510j, "");
        C6686k c6686k = c.f53507g;
        c cVar2 = new c(c6686k, "GET");
        c cVar3 = new c(c6686k, "POST");
        C6686k c6686k2 = c.f53508h;
        c cVar4 = new c(c6686k2, "/");
        c cVar5 = new c(c6686k2, "/index.html");
        C6686k c6686k3 = c.f53509i;
        c cVar6 = new c(c6686k3, "http");
        c cVar7 = new c(c6686k3, Constants.SCHEME);
        C6686k c6686k4 = c.f53506f;
        f53515b = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(c6686k4, "200"), new c(c6686k4, "204"), new c(c6686k4, "206"), new c(c6686k4, "304"), new c(c6686k4, "400"), new c(c6686k4, "404"), new c(c6686k4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c(DiagnosticsTracker.HOST_KEY, ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f53516c = dVar.d();
    }

    private d() {
    }

    private final Map d() {
        c[] cVarArr = f53515b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c[] cVarArr2 = f53515b;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f53511a)) {
                linkedHashMap.put(cVarArr2[i10].f53511a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC5504s.g(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final C6686k a(C6686k name) throws IOException {
        AbstractC5504s.h(name, "name");
        int iK = name.K();
        for (int i10 = 0; i10 < iK; i10++) {
            byte bM = name.m(i10);
            if (65 <= bM && bM < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.Q());
            }
        }
        return name;
    }

    public final Map b() {
        return f53516c;
    }

    public final c[] c() {
        return f53515b;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f53517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f53518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f53519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC6685j f53520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c[] f53521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f53522f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f53523g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f53524h;

        public a(Z source, int i10, int i11) {
            AbstractC5504s.h(source, "source");
            this.f53517a = i10;
            this.f53518b = i11;
            this.f53519c = new ArrayList();
            this.f53520d = K.d(source);
            this.f53521e = new c[8];
            this.f53522f = r2.length - 1;
        }

        private final void a() {
            int i10 = this.f53518b;
            int i11 = this.f53524h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            AbstractC2273n.z(this.f53521e, null, 0, 0, 6, null);
            this.f53522f = this.f53521e.length - 1;
            this.f53523g = 0;
            this.f53524h = 0;
        }

        private final int c(int i10) {
            return this.f53522f + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f53521e.length;
                while (true) {
                    length--;
                    i11 = this.f53522f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f53521e[length];
                    AbstractC5504s.e(cVar);
                    int i13 = cVar.f53513c;
                    i10 -= i13;
                    this.f53524h -= i13;
                    this.f53523g--;
                    i12++;
                }
                c[] cVarArr = this.f53521e;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f53523g);
                this.f53522f += i12;
            }
            return i12;
        }

        private final C6686k f(int i10) throws IOException {
            if (h(i10)) {
                return d.f53514a.c()[i10].f53511a;
            }
            int iC = c(i10 - d.f53514a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f53521e;
                if (iC < cVarArr.length) {
                    c cVar = cVarArr[iC];
                    AbstractC5504s.e(cVar);
                    return cVar.f53511a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void g(int i10, c cVar) {
            this.f53519c.add(cVar);
            int i11 = cVar.f53513c;
            if (i10 != -1) {
                c cVar2 = this.f53521e[c(i10)];
                AbstractC5504s.e(cVar2);
                i11 -= cVar2.f53513c;
            }
            int i12 = this.f53518b;
            if (i11 > i12) {
                b();
                return;
            }
            int iD = d((this.f53524h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f53523g + 1;
                c[] cVarArr = this.f53521e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f53522f = this.f53521e.length - 1;
                    this.f53521e = cVarArr2;
                }
                int i14 = this.f53522f;
                this.f53522f = i14 - 1;
                this.f53521e[i14] = cVar;
                this.f53523g++;
            } else {
                this.f53521e[i10 + c(i10) + iD] = cVar;
            }
            this.f53524h += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f53514a.c().length - 1;
        }

        private final int i() {
            return AbstractC4807e.d(this.f53520d.readByte(), 255);
        }

        private final void l(int i10) throws IOException {
            if (h(i10)) {
                this.f53519c.add(d.f53514a.c()[i10]);
                return;
            }
            int iC = c(i10 - d.f53514a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f53521e;
                if (iC < cVarArr.length) {
                    List list = this.f53519c;
                    c cVar = cVarArr[iC];
                    AbstractC5504s.e(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void n(int i10) {
            g(-1, new c(f(i10), j()));
        }

        private final void o() {
            g(-1, new c(d.f53514a.a(j()), j()));
        }

        private final void p(int i10) throws IOException {
            this.f53519c.add(new c(f(i10), j()));
        }

        private final void q() throws IOException {
            this.f53519c.add(new c(d.f53514a.a(j()), j()));
        }

        public final List e() {
            List listB1 = AbstractC2279u.b1(this.f53519c);
            this.f53519c.clear();
            return listB1;
        }

        public final C6686k j() {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long jM = m(i10, 127);
            if (!z10) {
                return this.f53520d.Y0(jM);
            }
            C6683h c6683h = new C6683h();
            k.f53674a.b(this.f53520d, jM, c6683h);
            return c6683h.p0();
        }

        public final void k() throws IOException {
            while (!this.f53520d.f1()) {
                int iD = AbstractC4807e.d(this.f53520d.readByte(), 255);
                if (iD == 128) {
                    throw new IOException("index == 0");
                }
                if ((iD & 128) == 128) {
                    l(m(iD, 127) - 1);
                } else if (iD == 64) {
                    o();
                } else if ((iD & 64) == 64) {
                    n(m(iD, 63) - 1);
                } else if ((iD & 32) == 32) {
                    int iM = m(iD, 31);
                    this.f53518b = iM;
                    if (iM < 0 || iM > this.f53517a) {
                        throw new IOException("Invalid dynamic table size update " + this.f53518b);
                    }
                    a();
                } else if (iD == 16 || iD == 0) {
                    q();
                } else {
                    p(m(iD, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        public /* synthetic */ a(Z z10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f53525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f53526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C6683h f53527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f53528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f53529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f53530f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c[] f53531g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f53532h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f53533i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f53534j;

        public b(int i10, boolean z10, C6683h out) {
            AbstractC5504s.h(out, "out");
            this.f53525a = i10;
            this.f53526b = z10;
            this.f53527c = out;
            this.f53528d = Integer.MAX_VALUE;
            this.f53530f = i10;
            this.f53531g = new c[8];
            this.f53532h = r2.length - 1;
        }

        private final void a() {
            int i10 = this.f53530f;
            int i11 = this.f53534j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            AbstractC2273n.z(this.f53531g, null, 0, 0, 6, null);
            this.f53532h = this.f53531g.length - 1;
            this.f53533i = 0;
            this.f53534j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f53531g.length;
                while (true) {
                    length--;
                    i11 = this.f53532h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f53531g[length];
                    AbstractC5504s.e(cVar);
                    i10 -= cVar.f53513c;
                    int i13 = this.f53534j;
                    c cVar2 = this.f53531g[length];
                    AbstractC5504s.e(cVar2);
                    this.f53534j = i13 - cVar2.f53513c;
                    this.f53533i--;
                    i12++;
                }
                c[] cVarArr = this.f53531g;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f53533i);
                c[] cVarArr2 = this.f53531g;
                int i14 = this.f53532h;
                Arrays.fill(cVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f53532h += i12;
            }
            return i12;
        }

        private final void d(c cVar) {
            int i10 = cVar.f53513c;
            int i11 = this.f53530f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f53534j + i10) - i11);
            int i12 = this.f53533i + 1;
            c[] cVarArr = this.f53531g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f53532h = this.f53531g.length - 1;
                this.f53531g = cVarArr2;
            }
            int i13 = this.f53532h;
            this.f53532h = i13 - 1;
            this.f53531g[i13] = cVar;
            this.f53533i++;
            this.f53534j += i10;
        }

        public final void e(int i10) {
            this.f53525a = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f53530f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f53528d = Math.min(this.f53528d, iMin);
            }
            this.f53529e = true;
            this.f53530f = iMin;
            a();
        }

        public final void f(C6686k data) {
            AbstractC5504s.h(data, "data");
            if (this.f53526b) {
                k kVar = k.f53674a;
                if (kVar.d(data) < data.K()) {
                    C6683h c6683h = new C6683h();
                    kVar.c(data, c6683h);
                    C6686k c6686kP0 = c6683h.p0();
                    h(c6686kP0.K(), 127, 128);
                    this.f53527c.A0(c6686kP0);
                    return;
                }
            }
            h(data.K(), 127, 0);
            this.f53527c.A0(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(java.util.List r13) {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.d.b.g(java.util.List):void");
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f53527c.writeByte(i10 | i12);
                return;
            }
            this.f53527c.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f53527c.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f53527c.writeByte(i13);
        }

        public /* synthetic */ b(int i10, boolean z10, C6683h c6683h, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, c6683h);
        }
    }
}
