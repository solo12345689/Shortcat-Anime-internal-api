package y4;

import Df.p;
import Df.r;
import Gf.AbstractC1617k;
import Gf.O;
import Gf.X0;
import Td.AbstractC2156g;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.AbstractC6690o;
import tg.AbstractC6691p;
import tg.InterfaceC6684i;
import tg.InterfaceC6685j;
import tg.K;
import tg.P;
import tg.X;

/* JADX INFO: renamed from: y4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7200b implements Closeable, Flushable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f64771s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final p f64772t = new p("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P f64773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f64774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f64775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f64776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P f64777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P f64778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final P f64779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LinkedHashMap f64780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final O f64781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f64782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f64783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC6684i f64784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f64785m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f64786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f64787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f64788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f64789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final e f64790r;

    /* JADX INFO: renamed from: y4.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: y4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class C0979b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f64791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f64792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean[] f64793c;

        public C0979b(c cVar) {
            this.f64791a = cVar;
            this.f64793c = new boolean[C7200b.this.f64776d];
        }

        private final void d(boolean z10) {
            C7200b c7200b = C7200b.this;
            synchronized (c7200b) {
                try {
                    if (this.f64792b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (AbstractC5504s.c(this.f64791a.b(), this)) {
                        c7200b.H(this, z10);
                    }
                    this.f64792b = true;
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d dVarS;
            C7200b c7200b = C7200b.this;
            synchronized (c7200b) {
                b();
                dVarS = c7200b.S(this.f64791a.d());
            }
            return dVarS;
        }

        public final void e() {
            if (AbstractC5504s.c(this.f64791a.b(), this)) {
                this.f64791a.m(true);
            }
        }

        public final P f(int i10) {
            P p10;
            C7200b c7200b = C7200b.this;
            synchronized (c7200b) {
                if (this.f64792b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f64793c[i10] = true;
                Object obj = this.f64791a.c().get(i10);
                L4.e.a(c7200b.f64790r, (P) obj);
                p10 = (P) obj;
            }
            return p10;
        }

        public final c g() {
            return this.f64791a;
        }

        public final boolean[] h() {
            return this.f64793c;
        }
    }

    /* JADX INFO: renamed from: y4.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f64795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f64796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f64797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayList f64798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f64799e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f64800f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private C0979b f64801g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f64802h;

        public c(String str) {
            this.f64795a = str;
            this.f64796b = new long[C7200b.this.f64776d];
            this.f64797c = new ArrayList(C7200b.this.f64776d);
            this.f64798d = new ArrayList(C7200b.this.f64776d);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
            int length = sb2.length();
            int i10 = C7200b.this.f64776d;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.f64797c.add(C7200b.this.f64773a.q(sb2.toString()));
                sb2.append(".tmp");
                this.f64798d.add(C7200b.this.f64773a.q(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList a() {
            return this.f64797c;
        }

        public final C0979b b() {
            return this.f64801g;
        }

        public final ArrayList c() {
            return this.f64798d;
        }

        public final String d() {
            return this.f64795a;
        }

        public final long[] e() {
            return this.f64796b;
        }

        public final int f() {
            return this.f64802h;
        }

        public final boolean g() {
            return this.f64799e;
        }

        public final boolean h() {
            return this.f64800f;
        }

        public final void i(C0979b c0979b) {
            this.f64801g = c0979b;
        }

        public final void j(List list) throws IOException {
            if (list.size() != C7200b.this.f64776d) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f64796b[i10] = Long.parseLong((String) list.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i10) {
            this.f64802h = i10;
        }

        public final void l(boolean z10) {
            this.f64799e = z10;
        }

        public final void m(boolean z10) {
            this.f64800f = z10;
        }

        public final d n() {
            if (!this.f64799e || this.f64801g != null || this.f64800f) {
                return null;
            }
            ArrayList arrayList = this.f64797c;
            C7200b c7200b = C7200b.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!c7200b.f64790r.j((P) arrayList.get(i10))) {
                    try {
                        c7200b.M0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.f64802h++;
            return C7200b.this.new d(this);
        }

        public final void o(InterfaceC6684i interfaceC6684i) {
            for (long j10 : this.f64796b) {
                interfaceC6684i.writeByte(32).S0(j10);
            }
        }
    }

    /* JADX INFO: renamed from: y4.b$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f64804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f64805b;

        public d(c cVar) {
            this.f64804a = cVar;
        }

        public final C0979b a() {
            C0979b c0979bO;
            C7200b c7200b = C7200b.this;
            synchronized (c7200b) {
                close();
                c0979bO = c7200b.O(this.f64804a.d());
            }
            return c0979bO;
        }

        public final P b(int i10) {
            if (this.f64805b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (P) this.f64804a.a().get(i10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f64805b) {
                return;
            }
            this.f64805b = true;
            C7200b c7200b = C7200b.this;
            synchronized (c7200b) {
                try {
                    this.f64804a.k(r1.f() - 1);
                    if (this.f64804a.f() == 0 && this.f64804a.h()) {
                        c7200b.M0(this.f64804a);
                    }
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: y4.b$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends AbstractC6691p {
        e(AbstractC6690o abstractC6690o) {
            super(abstractC6690o);
        }

        @Override // tg.AbstractC6691p, tg.AbstractC6690o
        public X p(P p10, boolean z10) throws IOException {
            P pN = p10.n();
            if (pN != null) {
                d(pN);
            }
            return super.p(p10, z10);
        }
    }

    /* JADX INFO: renamed from: y4.b$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f64807a;

        f(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C7200b.this.new f(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((f) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f64807a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            C7200b c7200b = C7200b.this;
            synchronized (c7200b) {
                if (!c7200b.f64786n || c7200b.f64787o) {
                    return L.f17438a;
                }
                try {
                    c7200b.q1();
                } catch (IOException unused) {
                    c7200b.f64788p = true;
                }
                try {
                    if (c7200b.h0()) {
                        c7200b.u1();
                    }
                } catch (IOException unused2) {
                    c7200b.f64789q = true;
                    c7200b.f64784l = K.c(K.b());
                }
                return L.f17438a;
            }
        }
    }

    /* JADX INFO: renamed from: y4.b$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function1 {
        g() {
            super(1);
        }

        public final void a(IOException iOException) {
            C7200b.this.f64785m = true;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((IOException) obj);
            return L.f17438a;
        }
    }

    public C7200b(AbstractC6690o abstractC6690o, P p10, Gf.K k10, long j10, int i10, int i11) {
        this.f64773a = p10;
        this.f64774b = j10;
        this.f64775c = i10;
        this.f64776d = i11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f64777e = p10.q("journal");
        this.f64778f = p10.q("journal.tmp");
        this.f64779g = p10.q("journal.bkp");
        this.f64780h = new LinkedHashMap(0, 0.75f, true);
        this.f64781i = Gf.P.a(X0.b(null, 1, null).w(k10.Y1(1)));
        this.f64790r = new e(abstractC6690o);
    }

    private final void B0() {
        Iterator it = this.f64780h.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f64776d;
                while (i10 < i11) {
                    j10 += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.i(null);
                int i12 = this.f64776d;
                while (i10 < i12) {
                    this.f64790r.h((P) cVar.a().get(i10));
                    this.f64790r.h((P) cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f64782j = j10;
    }

    private final void E() {
        if (this.f64787o) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final void F0() throws Throwable {
        L l10;
        InterfaceC6685j interfaceC6685jD = K.d(this.f64790r.q(this.f64777e));
        Throwable th2 = null;
        try {
            String strD0 = interfaceC6685jD.D0();
            String strD02 = interfaceC6685jD.D0();
            String strD03 = interfaceC6685jD.D0();
            String strD04 = interfaceC6685jD.D0();
            String strD05 = interfaceC6685jD.D0();
            if (!AbstractC5504s.c("libcore.io.DiskLruCache", strD0) || !AbstractC5504s.c("1", strD02) || !AbstractC5504s.c(String.valueOf(this.f64775c), strD03) || !AbstractC5504s.c(String.valueOf(this.f64776d), strD04) || strD05.length() > 0) {
                throw new IOException("unexpected journal header: [" + strD0 + ", " + strD02 + ", " + strD03 + ", " + strD04 + ", " + strD05 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    G0(interfaceC6685jD.D0());
                    i10++;
                } catch (EOFException unused) {
                    this.f64783k = i10 - this.f64780h.size();
                    if (interfaceC6685jD.f1()) {
                        this.f64784l = p0();
                    } else {
                        u1();
                    }
                    l10 = L.f17438a;
                    if (interfaceC6685jD != null) {
                        try {
                            interfaceC6685jD.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            if (interfaceC6685jD != null) {
                try {
                    interfaceC6685jD.close();
                } catch (Throwable th5) {
                    AbstractC2156g.a(th4, th5);
                }
            }
            th2 = th4;
            l10 = null;
        }
        if (th2 != null) {
            throw th2;
        }
        AbstractC5504s.e(l10);
    }

    private final void G0(String str) throws IOException {
        String strSubstring;
        int iI0 = r.i0(str, ' ', 0, false, 6, null);
        if (iI0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iI0 + 1;
        int iI02 = r.i0(str, ' ', i10, false, 4, null);
        if (iI02 == -1) {
            strSubstring = str.substring(i10);
            AbstractC5504s.g(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (iI0 == 6 && r.Q(str, "REMOVE", false, 2, null)) {
                this.f64780h.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iI02);
            AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        LinkedHashMap linkedHashMap = this.f64780h;
        Object cVar = linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        c cVar2 = (c) cVar;
        if (iI02 != -1 && iI0 == 5 && r.Q(str, "CLEAN", false, 2, null)) {
            String strSubstring2 = str.substring(iI02 + 1);
            AbstractC5504s.g(strSubstring2, "this as java.lang.String).substring(startIndex)");
            List listM0 = r.M0(strSubstring2, new char[]{' '}, false, 0, 6, null);
            cVar2.l(true);
            cVar2.i(null);
            cVar2.j(listM0);
            return;
        }
        if (iI02 == -1 && iI0 == 5 && r.Q(str, "DIRTY", false, 2, null)) {
            cVar2.i(new C0979b(cVar2));
            return;
        }
        if (iI02 == -1 && iI0 == 4 && r.Q(str, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void H(C0979b c0979b, boolean z10) {
        c cVarG = c0979b.g();
        if (!AbstractC5504s.c(cVarG.b(), c0979b)) {
            throw new IllegalStateException("Check failed.");
        }
        int i10 = 0;
        if (!z10 || cVarG.h()) {
            int i11 = this.f64776d;
            while (i10 < i11) {
                this.f64790r.h((P) cVarG.c().get(i10));
                i10++;
            }
        } else {
            int i12 = this.f64776d;
            for (int i13 = 0; i13 < i12; i13++) {
                if (c0979b.h()[i13] && !this.f64790r.j((P) cVarG.c().get(i13))) {
                    c0979b.a();
                    return;
                }
            }
            int i14 = this.f64776d;
            while (i10 < i14) {
                P p10 = (P) cVarG.c().get(i10);
                P p11 = (P) cVarG.a().get(i10);
                if (this.f64790r.j(p10)) {
                    this.f64790r.c(p10, p11);
                } else {
                    L4.e.a(this.f64790r, (P) cVarG.a().get(i10));
                }
                long j10 = cVarG.e()[i10];
                Long lD = this.f64790r.l(p11).d();
                long jLongValue = lD != null ? lD.longValue() : 0L;
                cVarG.e()[i10] = jLongValue;
                this.f64782j = (this.f64782j - j10) + jLongValue;
                i10++;
            }
        }
        cVarG.i(null);
        if (cVarG.h()) {
            M0(cVarG);
            return;
        }
        this.f64783k++;
        InterfaceC6684i interfaceC6684i = this.f64784l;
        AbstractC5504s.e(interfaceC6684i);
        if (z10 || cVarG.g()) {
            cVarG.l(true);
            interfaceC6684i.s0("CLEAN");
            interfaceC6684i.writeByte(32);
            interfaceC6684i.s0(cVarG.d());
            cVarG.o(interfaceC6684i);
            interfaceC6684i.writeByte(10);
        } else {
            this.f64780h.remove(cVarG.d());
            interfaceC6684i.s0("REMOVE");
            interfaceC6684i.writeByte(32);
            interfaceC6684i.s0(cVarG.d());
            interfaceC6684i.writeByte(10);
        }
        interfaceC6684i.flush();
        if (this.f64782j > this.f64774b || h0()) {
            k0();
        }
    }

    private final void J() throws IOException {
        close();
        L4.e.b(this.f64790r, this.f64773a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M0(c cVar) {
        InterfaceC6684i interfaceC6684i;
        if (cVar.f() > 0 && (interfaceC6684i = this.f64784l) != null) {
            interfaceC6684i.s0("DIRTY");
            interfaceC6684i.writeByte(32);
            interfaceC6684i.s0(cVar.d());
            interfaceC6684i.writeByte(10);
            interfaceC6684i.flush();
        }
        if (cVar.f() > 0 || cVar.b() != null) {
            cVar.m(true);
            return true;
        }
        int i10 = this.f64776d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f64790r.h((P) cVar.a().get(i11));
            this.f64782j -= cVar.e()[i11];
            cVar.e()[i11] = 0;
        }
        this.f64783k++;
        InterfaceC6684i interfaceC6684i2 = this.f64784l;
        if (interfaceC6684i2 != null) {
            interfaceC6684i2.s0("REMOVE");
            interfaceC6684i2.writeByte(32);
            interfaceC6684i2.s0(cVar.d());
            interfaceC6684i2.writeByte(10);
        }
        this.f64780h.remove(cVar.d());
        if (h0()) {
            k0();
        }
        return true;
    }

    private final boolean a1() {
        for (c cVar : this.f64780h.values()) {
            if (!cVar.h()) {
                M0(cVar);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h0() {
        return this.f64783k >= 2000;
    }

    private final void k0() {
        AbstractC1617k.d(this.f64781i, null, null, new f(null), 3, null);
    }

    private final InterfaceC6684i p0() {
        return K.c(new C7201c(this.f64790r.a(this.f64777e), new g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q1() {
        while (this.f64782j > this.f64774b) {
            if (!a1()) {
                return;
            }
        }
        this.f64788p = false;
    }

    private final void t1(String str) {
        if (f64772t.h(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void u1() {
        L l10;
        try {
            InterfaceC6684i interfaceC6684i = this.f64784l;
            if (interfaceC6684i != null) {
                interfaceC6684i.close();
            }
            InterfaceC6684i interfaceC6684iC = K.c(this.f64790r.p(this.f64778f, false));
            Throwable th2 = null;
            try {
                interfaceC6684iC.s0("libcore.io.DiskLruCache").writeByte(10);
                interfaceC6684iC.s0("1").writeByte(10);
                interfaceC6684iC.S0(this.f64775c).writeByte(10);
                interfaceC6684iC.S0(this.f64776d).writeByte(10);
                interfaceC6684iC.writeByte(10);
                for (c cVar : this.f64780h.values()) {
                    if (cVar.b() != null) {
                        interfaceC6684iC.s0("DIRTY");
                        interfaceC6684iC.writeByte(32);
                        interfaceC6684iC.s0(cVar.d());
                        interfaceC6684iC.writeByte(10);
                    } else {
                        interfaceC6684iC.s0("CLEAN");
                        interfaceC6684iC.writeByte(32);
                        interfaceC6684iC.s0(cVar.d());
                        cVar.o(interfaceC6684iC);
                        interfaceC6684iC.writeByte(10);
                    }
                }
                l10 = L.f17438a;
                if (interfaceC6684iC != null) {
                    try {
                        interfaceC6684iC.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
            } catch (Throwable th4) {
                if (interfaceC6684iC != null) {
                    try {
                        interfaceC6684iC.close();
                    } catch (Throwable th5) {
                        AbstractC2156g.a(th4, th5);
                    }
                }
                l10 = null;
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            AbstractC5504s.e(l10);
            if (this.f64790r.j(this.f64777e)) {
                this.f64790r.c(this.f64777e, this.f64779g);
                this.f64790r.c(this.f64778f, this.f64777e);
                this.f64790r.h(this.f64779g);
            } else {
                this.f64790r.c(this.f64778f, this.f64777e);
            }
            this.f64784l = p0();
            this.f64783k = 0;
            this.f64785m = false;
            this.f64789q = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public final synchronized C0979b O(String str) {
        E();
        t1(str);
        Y();
        c cVar = (c) this.f64780h.get(str);
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f64788p && !this.f64789q) {
            InterfaceC6684i interfaceC6684i = this.f64784l;
            AbstractC5504s.e(interfaceC6684i);
            interfaceC6684i.s0("DIRTY");
            interfaceC6684i.writeByte(32);
            interfaceC6684i.s0(str);
            interfaceC6684i.writeByte(10);
            interfaceC6684i.flush();
            if (this.f64785m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(str);
                this.f64780h.put(str, cVar);
            }
            C0979b c0979b = new C0979b(cVar);
            cVar.i(c0979b);
            return c0979b;
        }
        k0();
        return null;
    }

    public final synchronized d S(String str) {
        d dVarN;
        E();
        t1(str);
        Y();
        c cVar = (c) this.f64780h.get(str);
        if (cVar != null && (dVarN = cVar.n()) != null) {
            this.f64783k++;
            InterfaceC6684i interfaceC6684i = this.f64784l;
            AbstractC5504s.e(interfaceC6684i);
            interfaceC6684i.s0("READ");
            interfaceC6684i.writeByte(32);
            interfaceC6684i.s0(str);
            interfaceC6684i.writeByte(10);
            if (h0()) {
                k0();
            }
            return dVarN;
        }
        return null;
    }

    public final synchronized void Y() {
        try {
            if (this.f64786n) {
                return;
            }
            this.f64790r.h(this.f64778f);
            if (this.f64790r.j(this.f64779g)) {
                if (this.f64790r.j(this.f64777e)) {
                    this.f64790r.h(this.f64779g);
                } else {
                    this.f64790r.c(this.f64779g, this.f64777e);
                }
            }
            if (this.f64790r.j(this.f64777e)) {
                try {
                    F0();
                    B0();
                    this.f64786n = true;
                    return;
                } catch (IOException unused) {
                    try {
                        J();
                        this.f64787o = false;
                        u1();
                        this.f64786n = true;
                    } catch (Throwable th2) {
                        this.f64787o = false;
                        throw th2;
                    }
                }
            }
            u1();
            this.f64786n = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f64786n && !this.f64787o) {
                for (c cVar : (c[]) this.f64780h.values().toArray(new c[0])) {
                    C0979b c0979bB = cVar.b();
                    if (c0979bB != null) {
                        c0979bB.e();
                    }
                }
                q1();
                Gf.P.d(this.f64781i, null, 1, null);
                InterfaceC6684i interfaceC6684i = this.f64784l;
                AbstractC5504s.e(interfaceC6684i);
                interfaceC6684i.close();
                this.f64784l = null;
                this.f64787o = true;
                return;
            }
            this.f64787o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f64786n) {
            E();
            q1();
            InterfaceC6684i interfaceC6684i = this.f64784l;
            AbstractC5504s.e(interfaceC6684i);
            interfaceC6684i.flush();
        }
    }
}
