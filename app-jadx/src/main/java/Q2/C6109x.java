package q2;

import P9.AbstractC2011u;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import t2.AbstractC6614a;
import t2.AbstractC6622i;

/* JADX INFO: renamed from: q2.x */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6109x {

    /* JADX INFO: renamed from: A */
    public final int f56991A;

    /* JADX INFO: renamed from: B */
    public final float f56992B;

    /* JADX INFO: renamed from: C */
    public final byte[] f56993C;

    /* JADX INFO: renamed from: D */
    public final int f56994D;

    /* JADX INFO: renamed from: E */
    public final C6097l f56995E;

    /* JADX INFO: renamed from: F */
    public final int f56996F;

    /* JADX INFO: renamed from: G */
    public final int f56997G;

    /* JADX INFO: renamed from: H */
    public final int f56998H;

    /* JADX INFO: renamed from: I */
    public final int f56999I;

    /* JADX INFO: renamed from: J */
    public final int f57000J;

    /* JADX INFO: renamed from: K */
    public final int f57001K;

    /* JADX INFO: renamed from: L */
    public final int f57002L;

    /* JADX INFO: renamed from: M */
    public final int f57003M;

    /* JADX INFO: renamed from: N */
    public final int f57004N;

    /* JADX INFO: renamed from: O */
    public final int f57005O;

    /* JADX INFO: renamed from: P */
    public final int f57006P;

    /* JADX INFO: renamed from: Q */
    private int f57007Q;

    /* JADX INFO: renamed from: a */
    public final String f57008a;

    /* JADX INFO: renamed from: b */
    public final String f57009b;

    /* JADX INFO: renamed from: c */
    public final List f57010c;

    /* JADX INFO: renamed from: d */
    public final String f57011d;

    /* JADX INFO: renamed from: e */
    public final int f57012e;

    /* JADX INFO: renamed from: f */
    public final int f57013f;

    /* JADX INFO: renamed from: g */
    public final int f57014g;

    /* JADX INFO: renamed from: h */
    public final int f57015h;

    /* JADX INFO: renamed from: i */
    public final int f57016i;

    /* JADX INFO: renamed from: j */
    public final int f57017j;

    /* JADX INFO: renamed from: k */
    public final String f57018k;

    /* JADX INFO: renamed from: l */
    public final C6078J f57019l;

    /* JADX INFO: renamed from: m */
    public final Object f57020m;

    /* JADX INFO: renamed from: n */
    public final String f57021n;

    /* JADX INFO: renamed from: o */
    public final String f57022o;

    /* JADX INFO: renamed from: p */
    public final int f57023p;

    /* JADX INFO: renamed from: q */
    public final int f57024q;

    /* JADX INFO: renamed from: r */
    public final List f57025r;

    /* JADX INFO: renamed from: s */
    public final C6102q f57026s;

    /* JADX INFO: renamed from: t */
    public final long f57027t;

    /* JADX INFO: renamed from: u */
    public final boolean f57028u;

    /* JADX INFO: renamed from: v */
    public final int f57029v;

    /* JADX INFO: renamed from: w */
    public final int f57030w;

    /* JADX INFO: renamed from: x */
    public final int f57031x;

    /* JADX INFO: renamed from: y */
    public final int f57032y;

    /* JADX INFO: renamed from: z */
    public final float f57033z;

    /* JADX INFO: renamed from: R */
    private static final C6109x f56956R = new b().P();

    /* JADX INFO: renamed from: S */
    private static final String f56957S = t2.a0.H0(0);

    /* JADX INFO: renamed from: T */
    private static final String f56958T = t2.a0.H0(1);

    /* JADX INFO: renamed from: U */
    private static final String f56959U = t2.a0.H0(2);

    /* JADX INFO: renamed from: V */
    private static final String f56960V = t2.a0.H0(3);

    /* JADX INFO: renamed from: W */
    private static final String f56961W = t2.a0.H0(4);

    /* JADX INFO: renamed from: X */
    private static final String f56962X = t2.a0.H0(5);

    /* JADX INFO: renamed from: Y */
    private static final String f56963Y = t2.a0.H0(6);

    /* JADX INFO: renamed from: Z */
    private static final String f56964Z = t2.a0.H0(7);

    /* JADX INFO: renamed from: a0 */
    private static final String f56965a0 = t2.a0.H0(8);

    /* JADX INFO: renamed from: b0 */
    private static final String f56966b0 = t2.a0.H0(9);

    /* JADX INFO: renamed from: c0 */
    private static final String f56967c0 = t2.a0.H0(10);

    /* JADX INFO: renamed from: d0 */
    private static final String f56968d0 = t2.a0.H0(11);

    /* JADX INFO: renamed from: e0 */
    private static final String f56969e0 = t2.a0.H0(12);

    /* JADX INFO: renamed from: f0 */
    private static final String f56970f0 = t2.a0.H0(13);

    /* JADX INFO: renamed from: g0 */
    private static final String f56971g0 = t2.a0.H0(14);

    /* JADX INFO: renamed from: h0 */
    private static final String f56972h0 = t2.a0.H0(15);

    /* JADX INFO: renamed from: i0 */
    private static final String f56973i0 = t2.a0.H0(16);

    /* JADX INFO: renamed from: j0 */
    private static final String f56974j0 = t2.a0.H0(17);

    /* JADX INFO: renamed from: k0 */
    private static final String f56975k0 = t2.a0.H0(18);

    /* JADX INFO: renamed from: l0 */
    private static final String f56976l0 = t2.a0.H0(19);

    /* JADX INFO: renamed from: m0 */
    private static final String f56977m0 = t2.a0.H0(20);

    /* JADX INFO: renamed from: n0 */
    private static final String f56978n0 = t2.a0.H0(21);

    /* JADX INFO: renamed from: o0 */
    private static final String f56979o0 = t2.a0.H0(22);

    /* JADX INFO: renamed from: p0 */
    private static final String f56980p0 = t2.a0.H0(23);

    /* JADX INFO: renamed from: q0 */
    private static final String f56981q0 = t2.a0.H0(24);

    /* JADX INFO: renamed from: r0 */
    private static final String f56982r0 = t2.a0.H0(25);

    /* JADX INFO: renamed from: s0 */
    private static final String f56983s0 = t2.a0.H0(26);

    /* JADX INFO: renamed from: t0 */
    private static final String f56984t0 = t2.a0.H0(27);

    /* JADX INFO: renamed from: u0 */
    private static final String f56985u0 = t2.a0.H0(28);

    /* JADX INFO: renamed from: v0 */
    private static final String f56986v0 = t2.a0.H0(29);

    /* JADX INFO: renamed from: w0 */
    private static final String f56987w0 = t2.a0.H0(30);

    /* JADX INFO: renamed from: x0 */
    private static final String f56988x0 = t2.a0.H0(31);

    /* JADX INFO: renamed from: y0 */
    private static final String f56989y0 = t2.a0.H0(32);

    /* JADX INFO: renamed from: z0 */
    private static final String f56990z0 = t2.a0.H0(33);

    /* JADX INFO: renamed from: A0 */
    private static final String f56953A0 = t2.a0.H0(34);

    /* JADX INFO: renamed from: B0 */
    private static final String f56954B0 = t2.a0.H0(35);

    /* JADX INFO: renamed from: C0 */
    private static final String f56955C0 = t2.a0.H0(36);

    /* JADX INFO: renamed from: q2.x$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: A */
        private float f57034A;

        /* JADX INFO: renamed from: B */
        private byte[] f57035B;

        /* JADX INFO: renamed from: C */
        private int f57036C;

        /* JADX INFO: renamed from: D */
        private C6097l f57037D;

        /* JADX INFO: renamed from: E */
        private int f57038E;

        /* JADX INFO: renamed from: F */
        private int f57039F;

        /* JADX INFO: renamed from: G */
        private int f57040G;

        /* JADX INFO: renamed from: H */
        private int f57041H;

        /* JADX INFO: renamed from: I */
        private int f57042I;

        /* JADX INFO: renamed from: J */
        private int f57043J;

        /* JADX INFO: renamed from: K */
        private int f57044K;

        /* JADX INFO: renamed from: L */
        private int f57045L;

        /* JADX INFO: renamed from: M */
        private int f57046M;

        /* JADX INFO: renamed from: N */
        private int f57047N;

        /* JADX INFO: renamed from: O */
        private int f57048O;

        /* JADX INFO: renamed from: a */
        private String f57049a;

        /* JADX INFO: renamed from: b */
        private String f57050b;

        /* JADX INFO: renamed from: c */
        private List f57051c;

        /* JADX INFO: renamed from: d */
        private String f57052d;

        /* JADX INFO: renamed from: e */
        private int f57053e;

        /* JADX INFO: renamed from: f */
        private int f57054f;

        /* JADX INFO: renamed from: g */
        private int f57055g;

        /* JADX INFO: renamed from: h */
        private int f57056h;

        /* JADX INFO: renamed from: i */
        private int f57057i;

        /* JADX INFO: renamed from: j */
        private String f57058j;

        /* JADX INFO: renamed from: k */
        private C6078J f57059k;

        /* JADX INFO: renamed from: l */
        private Object f57060l;

        /* JADX INFO: renamed from: m */
        private String f57061m;

        /* JADX INFO: renamed from: n */
        private String f57062n;

        /* JADX INFO: renamed from: o */
        private int f57063o;

        /* JADX INFO: renamed from: p */
        private int f57064p;

        /* JADX INFO: renamed from: q */
        private List f57065q;

        /* JADX INFO: renamed from: r */
        private C6102q f57066r;

        /* JADX INFO: renamed from: s */
        private long f57067s;

        /* JADX INFO: renamed from: t */
        private boolean f57068t;

        /* JADX INFO: renamed from: u */
        private int f57069u;

        /* JADX INFO: renamed from: v */
        private int f57070v;

        /* JADX INFO: renamed from: w */
        private int f57071w;

        /* JADX INFO: renamed from: x */
        private int f57072x;

        /* JADX INFO: renamed from: y */
        private float f57073y;

        /* JADX INFO: renamed from: z */
        private int f57074z;

        /* synthetic */ b(C6109x c6109x, a aVar) {
            this(c6109x);
        }

        public b A0(int i10) {
            this.f57053e = i10;
            return this;
        }

        public b B0(int i10) {
            this.f57036C = i10;
            return this;
        }

        public b C0(long j10) {
            this.f57067s = j10;
            return this;
        }

        public b D0(int i10) {
            this.f57046M = i10;
            return this;
        }

        public b E0(int i10) {
            this.f57047N = i10;
            return this;
        }

        public b F0(int i10) {
            this.f57069u = i10;
            return this;
        }

        public C6109x P() {
            return new C6109x(this);
        }

        public b Q(int i10) {
            this.f57044K = i10;
            return this;
        }

        public b R(int i10) {
            this.f57055g = i10;
            return this;
        }

        public b S(int i10) {
            this.f57056h = i10;
            return this;
        }

        public b T(int i10) {
            this.f57039F = i10;
            return this;
        }

        public b U(String str) {
            this.f57058j = str;
            return this;
        }

        public b V(C6097l c6097l) {
            this.f57037D = c6097l;
            return this;
        }

        public b W(String str) {
            this.f57061m = AbstractC6079K.u(str);
            return this;
        }

        public b X(int i10) {
            this.f57048O = i10;
            return this;
        }

        public b Y(int i10) {
            this.f57045L = i10;
            return this;
        }

        public b Z(Object obj) {
            this.f57060l = obj;
            return this;
        }

        public b a0(int i10) {
            this.f57072x = i10;
            return this;
        }

        public b b0(int i10) {
            this.f57071w = i10;
            return this;
        }

        public b c0(C6102q c6102q) {
            this.f57066r = c6102q;
            return this;
        }

        public b d0(int i10) {
            this.f57042I = i10;
            return this;
        }

        public b e0(int i10) {
            this.f57043J = i10;
            return this;
        }

        public b f0(float f10) {
            this.f57073y = f10;
            return this;
        }

        public b g0(boolean z10) {
            this.f57068t = z10;
            return this;
        }

        public b h0(int i10) {
            this.f57070v = i10;
            return this;
        }

        public b i0(int i10) {
            this.f57049a = Integer.toString(i10);
            return this;
        }

        public b j0(String str) {
            this.f57049a = str;
            return this;
        }

        public b k0(List list) {
            this.f57065q = list;
            return this;
        }

        public b l0(String str) {
            this.f57050b = str;
            return this;
        }

        public b m0(List list) {
            this.f57051c = AbstractC2011u.w(list);
            return this;
        }

        public b n0(String str) {
            this.f57052d = str;
            return this;
        }

        public b o0(int i10) {
            this.f57063o = i10;
            return this;
        }

        public b p0(int i10) {
            this.f57064p = i10;
            return this;
        }

        public b q0(int i10) {
            this.f57038E = i10;
            return this;
        }

        public b r0(C6078J c6078j) {
            this.f57059k = c6078j;
            return this;
        }

        public b s0(int i10) {
            this.f57041H = i10;
            return this;
        }

        public b t0(int i10) {
            this.f57057i = i10;
            return this;
        }

        public b u0(float f10) {
            this.f57034A = f10;
            return this;
        }

        public b v0(byte[] bArr) {
            this.f57035B = bArr;
            return this;
        }

        public b w0(int i10) {
            this.f57054f = i10;
            return this;
        }

        public b x0(int i10) {
            this.f57074z = i10;
            return this;
        }

        public b y0(String str) {
            this.f57062n = AbstractC6079K.u(str);
            return this;
        }

        public b z0(int i10) {
            this.f57040G = i10;
            return this;
        }

        public b() {
            this.f57051c = AbstractC2011u.A();
            this.f57056h = -1;
            this.f57057i = -1;
            this.f57063o = -1;
            this.f57064p = -1;
            this.f57067s = Long.MAX_VALUE;
            this.f57069u = -1;
            this.f57070v = -1;
            this.f57071w = -1;
            this.f57072x = -1;
            this.f57073y = -1.0f;
            this.f57034A = 1.0f;
            this.f57036C = -1;
            this.f57038E = -1;
            this.f57039F = -1;
            this.f57040G = -1;
            this.f57041H = -1;
            this.f57044K = -1;
            this.f57045L = 1;
            this.f57046M = -1;
            this.f57047N = -1;
            this.f57048O = 0;
            this.f57055g = 0;
        }

        private b(C6109x c6109x) {
            this.f57049a = c6109x.f57008a;
            this.f57050b = c6109x.f57009b;
            this.f57051c = c6109x.f57010c;
            this.f57052d = c6109x.f57011d;
            this.f57053e = c6109x.f57012e;
            this.f57054f = c6109x.f57013f;
            this.f57056h = c6109x.f57015h;
            this.f57057i = c6109x.f57016i;
            this.f57058j = c6109x.f57018k;
            this.f57059k = c6109x.f57019l;
            this.f57060l = c6109x.f57020m;
            this.f57061m = c6109x.f57021n;
            this.f57062n = c6109x.f57022o;
            this.f57063o = c6109x.f57023p;
            this.f57064p = c6109x.f57024q;
            this.f57065q = c6109x.f57025r;
            this.f57066r = c6109x.f57026s;
            this.f57067s = c6109x.f57027t;
            this.f57068t = c6109x.f57028u;
            this.f57069u = c6109x.f57029v;
            this.f57070v = c6109x.f57030w;
            this.f57071w = c6109x.f57031x;
            this.f57072x = c6109x.f57032y;
            this.f57073y = c6109x.f57033z;
            this.f57074z = c6109x.f56991A;
            this.f57034A = c6109x.f56992B;
            this.f57035B = c6109x.f56993C;
            this.f57036C = c6109x.f56994D;
            this.f57037D = c6109x.f56995E;
            this.f57038E = c6109x.f56996F;
            this.f57039F = c6109x.f56997G;
            this.f57040G = c6109x.f56998H;
            this.f57041H = c6109x.f56999I;
            this.f57042I = c6109x.f57000J;
            this.f57043J = c6109x.f57001K;
            this.f57044K = c6109x.f57002L;
            this.f57045L = c6109x.f57003M;
            this.f57046M = c6109x.f57004N;
            this.f57047N = c6109x.f57005O;
            this.f57048O = c6109x.f57006P;
        }
    }

    /* synthetic */ C6109x(b bVar, a aVar) {
        this(bVar);
    }

    public static /* synthetic */ String a(C6070B c6070b) {
        return c6070b.f56318a + ": " + c6070b.f56319b;
    }

    private static Object d(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    public static C6109x e(Bundle bundle) {
        b bVar = new b();
        AbstractC6622i.c(bundle);
        String string = bundle.getString(f56957S);
        C6109x c6109x = f56956R;
        bVar.j0((String) d(string, c6109x.f57008a)).l0((String) d(bundle.getString(f56958T), c6109x.f57009b));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f56989y0);
        bVar.m0(parcelableArrayList == null ? AbstractC2011u.A() : AbstractC6622i.d(new O9.f() { // from class: q2.w
            @Override // O9.f
            public final Object apply(Object obj) {
                return C6070B.a((Bundle) obj);
            }
        }, parcelableArrayList)).n0((String) d(bundle.getString(f56959U), c6109x.f57011d)).A0(bundle.getInt(f56960V, c6109x.f57012e)).w0(bundle.getInt(f56961W, c6109x.f57013f)).R(bundle.getInt(f56990z0, c6109x.f57014g)).S(bundle.getInt(f56962X, c6109x.f57015h)).t0(bundle.getInt(f56963Y, c6109x.f57016i)).U((String) d(bundle.getString(f56964Z), c6109x.f57018k)).W((String) d(bundle.getString(f56966b0), c6109x.f57021n)).y0((String) d(bundle.getString(f56967c0), c6109x.f57022o)).o0(bundle.getInt(f56968d0, c6109x.f57023p));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(j(i10));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i10++;
        }
        b bVarC0 = bVar.k0(arrayList).c0((C6102q) bundle.getParcelable(f56970f0));
        String str = f56971g0;
        C6109x c6109x2 = f56956R;
        bVarC0.C0(bundle.getLong(str, c6109x2.f57027t)).F0(bundle.getInt(f56972h0, c6109x2.f57029v)).h0(bundle.getInt(f56973i0, c6109x2.f57030w)).b0(bundle.getInt(f56954B0, c6109x2.f57031x)).a0(bundle.getInt(f56955C0, c6109x2.f57032y)).f0(bundle.getFloat(f56974j0, c6109x2.f57033z)).x0(bundle.getInt(f56975k0, c6109x2.f56991A)).u0(bundle.getFloat(f56976l0, c6109x2.f56992B)).v0(bundle.getByteArray(f56977m0)).B0(bundle.getInt(f56978n0, c6109x2.f56994D)).q0(bundle.getInt(f56953A0, c6109x2.f56996F));
        Bundle bundle2 = bundle.getBundle(f56979o0);
        if (bundle2 != null) {
            bVar.V(C6097l.f(bundle2));
        }
        bVar.T(bundle.getInt(f56980p0, c6109x2.f56997G)).z0(bundle.getInt(f56981q0, c6109x2.f56998H)).s0(bundle.getInt(f56982r0, c6109x2.f56999I)).d0(bundle.getInt(f56983s0, c6109x2.f57000J)).e0(bundle.getInt(f56984t0, c6109x2.f57001K)).Q(bundle.getInt(f56985u0, c6109x2.f57002L)).D0(bundle.getInt(f56987w0, c6109x2.f57004N)).E0(bundle.getInt(f56988x0, c6109x2.f57005O)).X(bundle.getInt(f56986v0, c6109x2.f57006P));
        return bVar.P();
    }

    private static String f(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6070B c6070b = (C6070B) it.next();
            if (TextUtils.equals(c6070b.f56318a, str)) {
                return c6070b.f56319b;
            }
        }
        return ((C6070B) list.get(0)).f56319b;
    }

    private static boolean i(b bVar) {
        if (bVar.f57051c.isEmpty() && bVar.f57050b == null) {
            return true;
        }
        for (int i10 = 0; i10 < bVar.f57051c.size(); i10++) {
            if (((C6070B) bVar.f57051c.get(i10)).f56319b.equals(bVar.f57050b)) {
                return true;
            }
        }
        return false;
    }

    private static String j(int i10) {
        return f56969e0 + "_" + Integer.toString(i10, 36);
    }

    public static String l(C6109x c6109x) {
        if (c6109x == null) {
            return "null";
        }
        O9.g gVarF = O9.g.f(',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(c6109x.f57008a);
        sb2.append(", mimeType=");
        sb2.append(c6109x.f57022o);
        if (c6109x.f57021n != null) {
            sb2.append(", container=");
            sb2.append(c6109x.f57021n);
        }
        if (c6109x.f57017j != -1) {
            sb2.append(", bitrate=");
            sb2.append(c6109x.f57017j);
        }
        if (c6109x.f57018k != null) {
            sb2.append(", codecs=");
            sb2.append(c6109x.f57018k);
        }
        if (c6109x.f57026s != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                C6102q c6102q = c6109x.f57026s;
                if (i10 >= c6102q.f56944d) {
                    break;
                }
                UUID uuid = c6102q.e(i10).f56946b;
                if (uuid.equals(AbstractC6096k.f56894b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC6096k.f56895c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC6096k.f56897e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC6096k.f56896d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(AbstractC6096k.f56893a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i10++;
            }
            sb2.append(", drm=[");
            gVarF.b(sb2, linkedHashSet);
            sb2.append(']');
        }
        if (c6109x.f57029v != -1 && c6109x.f57030w != -1) {
            sb2.append(", res=");
            sb2.append(c6109x.f57029v);
            sb2.append("x");
            sb2.append(c6109x.f57030w);
        }
        if (c6109x.f57031x != -1 && c6109x.f57032y != -1) {
            sb2.append(", decRes=");
            sb2.append(c6109x.f57031x);
            sb2.append("x");
            sb2.append(c6109x.f57032y);
        }
        if (!R9.b.a(c6109x.f56992B, 1.0d, 0.001d)) {
            sb2.append(", par=");
            sb2.append(t2.a0.I("%.3f", Float.valueOf(c6109x.f56992B)));
        }
        C6097l c6097l = c6109x.f56995E;
        if (c6097l != null && c6097l.j()) {
            sb2.append(", color=");
            sb2.append(c6109x.f56995E.o());
        }
        if (c6109x.f57033z != -1.0f) {
            sb2.append(", fps=");
            sb2.append(c6109x.f57033z);
        }
        if (c6109x.f56996F != -1) {
            sb2.append(", maxSubLayers=");
            sb2.append(c6109x.f56996F);
        }
        if (c6109x.f56997G != -1) {
            sb2.append(", channels=");
            sb2.append(c6109x.f56997G);
        }
        if (c6109x.f56998H != -1) {
            sb2.append(", sample_rate=");
            sb2.append(c6109x.f56998H);
        }
        if (c6109x.f57011d != null) {
            sb2.append(", language=");
            sb2.append(c6109x.f57011d);
        }
        if (!c6109x.f57010c.isEmpty()) {
            sb2.append(", labels=[");
            gVarF.b(sb2, P9.A.k(c6109x.f57010c, new O9.f() { // from class: q2.u
                @Override // O9.f
                public final Object apply(Object obj) {
                    return C6109x.a((C6070B) obj);
                }
            }));
            sb2.append("]");
        }
        if (c6109x.f57012e != 0) {
            sb2.append(", selectionFlags=[");
            gVarF.b(sb2, t2.a0.r0(c6109x.f57012e));
            sb2.append("]");
        }
        if (c6109x.f57013f != 0) {
            sb2.append(", roleFlags=[");
            gVarF.b(sb2, t2.a0.q0(c6109x.f57013f));
            sb2.append("]");
        }
        if (c6109x.f57020m != null) {
            sb2.append(", customData=");
            sb2.append(c6109x.f57020m);
        }
        if ((c6109x.f57013f & 32768) != 0) {
            sb2.append(", auxiliaryTrackType=");
            sb2.append(t2.a0.P(c6109x.f57014g));
        }
        return sb2.toString();
    }

    public b b() {
        return new b();
    }

    public C6109x c(int i10) {
        return b().X(i10).P();
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && C6109x.class == obj.getClass()) {
            C6109x c6109x = (C6109x) obj;
            int i11 = this.f57007Q;
            if ((i11 == 0 || (i10 = c6109x.f57007Q) == 0 || i11 == i10) && this.f57012e == c6109x.f57012e && this.f57013f == c6109x.f57013f && this.f57014g == c6109x.f57014g && this.f57015h == c6109x.f57015h && this.f57016i == c6109x.f57016i && this.f57023p == c6109x.f57023p && this.f57027t == c6109x.f57027t && this.f57029v == c6109x.f57029v && this.f57030w == c6109x.f57030w && this.f57031x == c6109x.f57031x && this.f57032y == c6109x.f57032y && this.f56991A == c6109x.f56991A && this.f56994D == c6109x.f56994D && this.f56996F == c6109x.f56996F && this.f56997G == c6109x.f56997G && this.f56998H == c6109x.f56998H && this.f56999I == c6109x.f56999I && this.f57000J == c6109x.f57000J && this.f57001K == c6109x.f57001K && this.f57002L == c6109x.f57002L && this.f57004N == c6109x.f57004N && this.f57005O == c6109x.f57005O && this.f57006P == c6109x.f57006P && Float.compare(this.f57033z, c6109x.f57033z) == 0 && Float.compare(this.f56992B, c6109x.f56992B) == 0 && Objects.equals(this.f57008a, c6109x.f57008a) && Objects.equals(this.f57009b, c6109x.f57009b) && this.f57010c.equals(c6109x.f57010c) && Objects.equals(this.f57018k, c6109x.f57018k) && Objects.equals(this.f57021n, c6109x.f57021n) && Objects.equals(this.f57022o, c6109x.f57022o) && Objects.equals(this.f57011d, c6109x.f57011d) && Arrays.equals(this.f56993C, c6109x.f56993C) && Objects.equals(this.f57019l, c6109x.f57019l) && Objects.equals(this.f56995E, c6109x.f56995E) && Objects.equals(this.f57026s, c6109x.f57026s) && h(c6109x) && Objects.equals(this.f57020m, c6109x.f57020m)) {
                return true;
            }
        }
        return false;
    }

    public int g() {
        int i10;
        int i11 = this.f57029v;
        if (i11 == -1 || (i10 = this.f57030w) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean h(C6109x c6109x) {
        if (this.f57025r.size() != c6109x.f57025r.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f57025r.size(); i10++) {
            if (!Arrays.equals((byte[]) this.f57025r.get(i10), (byte[]) c6109x.f57025r.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.f57007Q == 0) {
            String str = this.f57008a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f57009b;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f57010c.hashCode()) * 31;
            String str3 = this.f57011d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f57012e) * 31) + this.f57013f) * 31) + this.f57014g) * 31) + this.f57015h) * 31) + this.f57016i) * 31;
            String str4 = this.f57018k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C6078J c6078j = this.f57019l;
            int iHashCode5 = (iHashCode4 + (c6078j == null ? 0 : c6078j.hashCode())) * 31;
            Object obj = this.f57020m;
            int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.f57021n;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f57022o;
            this.f57007Q = ((((((((((((((((((((((((((((((((((((((((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f57023p) * 31) + ((int) this.f57027t)) * 31) + this.f57029v) * 31) + this.f57030w) * 31) + this.f57031x) * 31) + this.f57032y) * 31) + Float.floatToIntBits(this.f57033z)) * 31) + this.f56991A) * 31) + Float.floatToIntBits(this.f56992B)) * 31) + this.f56994D) * 31) + this.f56996F) * 31) + this.f56997G) * 31) + this.f56998H) * 31) + this.f56999I) * 31) + this.f57000J) * 31) + this.f57001K) * 31) + this.f57002L) * 31) + this.f57004N) * 31) + this.f57005O) * 31) + this.f57006P;
        }
        return this.f57007Q;
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putString(f56957S, this.f57008a);
        bundle.putString(f56958T, this.f57009b);
        bundle.putParcelableArrayList(f56989y0, AbstractC6622i.h(this.f57010c, new O9.f() { // from class: q2.v
            @Override // O9.f
            public final Object apply(Object obj) {
                return ((C6070B) obj).b();
            }
        }));
        bundle.putString(f56959U, this.f57011d);
        bundle.putInt(f56960V, this.f57012e);
        bundle.putInt(f56961W, this.f57013f);
        int i10 = this.f57014g;
        if (i10 != f56956R.f57014g) {
            bundle.putInt(f56990z0, i10);
        }
        bundle.putInt(f56962X, this.f57015h);
        bundle.putInt(f56963Y, this.f57016i);
        bundle.putString(f56964Z, this.f57018k);
        bundle.putString(f56966b0, this.f57021n);
        bundle.putString(f56967c0, this.f57022o);
        bundle.putInt(f56968d0, this.f57023p);
        for (int i11 = 0; i11 < this.f57025r.size(); i11++) {
            bundle.putByteArray(j(i11), (byte[]) this.f57025r.get(i11));
        }
        bundle.putParcelable(f56970f0, this.f57026s);
        bundle.putLong(f56971g0, this.f57027t);
        bundle.putInt(f56972h0, this.f57029v);
        bundle.putInt(f56973i0, this.f57030w);
        bundle.putInt(f56954B0, this.f57031x);
        bundle.putInt(f56955C0, this.f57032y);
        bundle.putFloat(f56974j0, this.f57033z);
        bundle.putInt(f56975k0, this.f56991A);
        bundle.putFloat(f56976l0, this.f56992B);
        bundle.putByteArray(f56977m0, this.f56993C);
        bundle.putInt(f56978n0, this.f56994D);
        C6097l c6097l = this.f56995E;
        if (c6097l != null) {
            bundle.putBundle(f56979o0, c6097l.n());
        }
        bundle.putInt(f56953A0, this.f56996F);
        bundle.putInt(f56980p0, this.f56997G);
        bundle.putInt(f56981q0, this.f56998H);
        bundle.putInt(f56982r0, this.f56999I);
        bundle.putInt(f56983s0, this.f57000J);
        bundle.putInt(f56984t0, this.f57001K);
        bundle.putInt(f56985u0, this.f57002L);
        bundle.putInt(f56987w0, this.f57004N);
        bundle.putInt(f56988x0, this.f57005O);
        bundle.putInt(f56986v0, this.f57006P);
        return bundle;
    }

    public C6109x m(C6109x c6109x) {
        String str;
        if (this == c6109x) {
            return this;
        }
        int iK = AbstractC6079K.k(this.f57022o);
        String str2 = c6109x.f57008a;
        int i10 = c6109x.f57004N;
        int i11 = c6109x.f57005O;
        String str3 = c6109x.f57009b;
        if (str3 == null) {
            str3 = this.f57009b;
        }
        List list = !c6109x.f57010c.isEmpty() ? c6109x.f57010c : this.f57010c;
        String str4 = this.f57011d;
        if ((iK == 3 || iK == 1) && (str = c6109x.f57011d) != null) {
            str4 = str;
        }
        int i12 = this.f57015h;
        if (i12 == -1) {
            i12 = c6109x.f57015h;
        }
        int i13 = this.f57016i;
        if (i13 == -1) {
            i13 = c6109x.f57016i;
        }
        String str5 = this.f57018k;
        if (str5 == null) {
            String strU = t2.a0.U(c6109x.f57018k, iK);
            if (t2.a0.x1(strU).length == 1) {
                str5 = strU;
            }
        }
        C6078J c6078j = this.f57019l;
        C6078J c6078jB = c6078j == null ? c6109x.f57019l : c6078j.b(c6109x.f57019l);
        float f10 = this.f57033z;
        if (f10 == -1.0f && iK == 2) {
            f10 = c6109x.f57033z;
        }
        return b().j0(str2).l0(str3).m0(list).n0(str4).A0(this.f57012e | c6109x.f57012e).w0(this.f57013f | c6109x.f57013f).S(i12).t0(i13).U(str5).r0(c6078jB).c0(C6102q.d(c6109x.f57026s, this.f57026s)).f0(f10).D0(i10).E0(i11).P();
    }

    public String toString() {
        return "Format(" + this.f57008a + ", " + this.f57009b + ", " + this.f57021n + ", " + this.f57022o + ", " + this.f57018k + ", " + this.f57017j + ", " + this.f57011d + ", [" + this.f57029v + ", " + this.f57030w + ", " + this.f57033z + ", " + this.f56995E + "], [" + this.f56997G + ", " + this.f56998H + "])";
    }

    private C6109x(b bVar) {
        this.f57008a = bVar.f57049a;
        String strY0 = t2.a0.Y0(bVar.f57052d);
        this.f57011d = strY0;
        if (bVar.f57051c.isEmpty() && bVar.f57050b != null) {
            this.f57010c = AbstractC2011u.B(new C6070B(strY0, bVar.f57050b));
            this.f57009b = bVar.f57050b;
        } else if (bVar.f57051c.isEmpty() || bVar.f57050b != null) {
            AbstractC6614a.g(i(bVar));
            this.f57010c = bVar.f57051c;
            this.f57009b = bVar.f57050b;
        } else {
            this.f57010c = bVar.f57051c;
            this.f57009b = f(bVar.f57051c, strY0);
        }
        this.f57012e = bVar.f57053e;
        AbstractC6614a.h(bVar.f57055g == 0 || (bVar.f57054f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f57013f = bVar.f57054f;
        this.f57014g = bVar.f57055g;
        int i10 = bVar.f57056h;
        this.f57015h = i10;
        int i11 = bVar.f57057i;
        this.f57016i = i11;
        this.f57017j = i11 != -1 ? i11 : i10;
        this.f57018k = bVar.f57058j;
        this.f57019l = bVar.f57059k;
        this.f57020m = bVar.f57060l;
        this.f57021n = bVar.f57061m;
        this.f57022o = bVar.f57062n;
        this.f57023p = bVar.f57063o;
        this.f57024q = bVar.f57064p;
        this.f57025r = bVar.f57065q == null ? Collections.EMPTY_LIST : bVar.f57065q;
        C6102q c6102q = bVar.f57066r;
        this.f57026s = c6102q;
        this.f57027t = bVar.f57067s;
        this.f57028u = bVar.f57068t;
        this.f57029v = bVar.f57069u;
        this.f57030w = bVar.f57070v;
        this.f57031x = bVar.f57071w;
        this.f57032y = bVar.f57072x;
        this.f57033z = bVar.f57073y;
        this.f56991A = bVar.f57074z == -1 ? 0 : bVar.f57074z;
        this.f56992B = bVar.f57034A == -1.0f ? 1.0f : bVar.f57034A;
        this.f56993C = bVar.f57035B;
        this.f56994D = bVar.f57036C;
        this.f56995E = bVar.f57037D;
        this.f56996F = bVar.f57038E;
        this.f56997G = bVar.f57039F;
        this.f56998H = bVar.f57040G;
        this.f56999I = bVar.f57041H;
        this.f57000J = bVar.f57042I == -1 ? 0 : bVar.f57042I;
        this.f57001K = bVar.f57043J != -1 ? bVar.f57043J : 0;
        this.f57002L = bVar.f57044K;
        this.f57003M = bVar.f57045L;
        this.f57004N = bVar.f57046M;
        this.f57005O = bVar.f57047N;
        if (bVar.f57048O != 0 || c6102q == null) {
            this.f57006P = bVar.f57048O;
        } else {
            this.f57006P = 1;
        }
    }
}
