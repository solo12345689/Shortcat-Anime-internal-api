package dg;

import Td.L;
import Ud.AbstractC2279u;
import Ud.a0;
import com.adjust.sdk.Constants;
import dg.C;
import dg.E;
import dg.t;
import fg.AbstractC4807e;
import hg.C4951c;
import hg.C4952d;
import hg.InterfaceC4950b;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kg.C5483f;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import ng.InterfaceC5790a;
import og.j;
import tg.AbstractC6692q;
import tg.C6683h;
import tg.C6686k;
import tg.InterfaceC6684i;
import tg.InterfaceC6685j;
import tg.K;
import tg.X;
import tg.Z;

/* JADX INFO: renamed from: dg.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4622c implements Closeable, Flushable {

    /* JADX INFO: renamed from: g */
    public static final b f45328g = new b(null);

    /* JADX INFO: renamed from: a */
    private final C4952d f45329a;

    /* JADX INFO: renamed from: b */
    private int f45330b;

    /* JADX INFO: renamed from: c */
    private int f45331c;

    /* JADX INFO: renamed from: d */
    private int f45332d;

    /* JADX INFO: renamed from: e */
    private int f45333e;

    /* JADX INFO: renamed from: f */
    private int f45334f;

    /* JADX INFO: renamed from: dg.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends F {

        /* JADX INFO: renamed from: b */
        private final C4952d.C0769d f45335b;

        /* JADX INFO: renamed from: c */
        private final String f45336c;

        /* JADX INFO: renamed from: d */
        private final String f45337d;

        /* JADX INFO: renamed from: e */
        private final InterfaceC6685j f45338e;

        /* JADX INFO: renamed from: dg.c$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0716a extends tg.r {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ a f45339b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0716a(Z z10, a aVar) {
                super(z10);
                this.f45339b = aVar;
            }

            @Override // tg.r, tg.Z, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f45339b.m().close();
                super.close();
            }
        }

        public a(C4952d.C0769d snapshot, String str, String str2) {
            AbstractC5504s.h(snapshot, "snapshot");
            this.f45335b = snapshot;
            this.f45336c = str;
            this.f45337d = str2;
            this.f45338e = K.d(new C0716a(snapshot.b(1), this));
        }

        @Override // dg.F
        public long h() {
            String str = this.f45337d;
            if (str != null) {
                return AbstractC4807e.X(str, -1L);
            }
            return -1L;
        }

        @Override // dg.F
        public x j() {
            String str = this.f45336c;
            if (str != null) {
                return x.f45605e.c(str);
            }
            return null;
        }

        @Override // dg.F
        public InterfaceC6685j k() {
            return this.f45338e;
        }

        public final C4952d.C0769d m() {
            return this.f45335b;
        }
    }

    /* JADX INFO: renamed from: dg.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set d(t tVar) {
            int size = tVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (Df.r.B("Vary", tVar.f(i10), true)) {
                    String strP = tVar.p(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(Df.r.D(U.f52264a));
                    }
                    Iterator it = Df.r.M0(strP, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(Df.r.k1((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? a0.d() : treeSet;
        }

        private final t e(t tVar, t tVar2) {
            Set setD = d(tVar2);
            if (setD.isEmpty()) {
                return AbstractC4807e.f47063b;
            }
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strF = tVar.f(i10);
                if (setD.contains(strF)) {
                    aVar.a(strF, tVar.p(i10));
                }
            }
            return aVar.e();
        }

        public final boolean a(E e10) {
            AbstractC5504s.h(e10, "<this>");
            return d(e10.E()).contains("*");
        }

        public final String b(u url) {
            AbstractC5504s.h(url, "url");
            return C6686k.f61044d.g(url.toString()).D().u();
        }

        public final int c(InterfaceC6685j source) throws IOException {
            AbstractC5504s.h(source, "source");
            try {
                long jJ1 = source.j1();
                String strD0 = source.D0();
                if (jJ1 >= 0 && jJ1 <= 2147483647L && strD0.length() <= 0) {
                    return (int) jJ1;
                }
                throw new IOException("expected an int but was \"" + jJ1 + strD0 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final t f(E e10) {
            AbstractC5504s.h(e10, "<this>");
            E eS = e10.S();
            AbstractC5504s.e(eS);
            return e(eS.F0().i(), e10.E());
        }

        public final boolean g(E cachedResponse, t cachedRequest, C newRequest) {
            AbstractC5504s.h(cachedResponse, "cachedResponse");
            AbstractC5504s.h(cachedRequest, "cachedRequest");
            AbstractC5504s.h(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.E());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!AbstractC5504s.c(cachedRequest.r(str), newRequest.j(str))) {
                    return false;
                }
            }
            return true;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: dg.c$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class d implements InterfaceC4950b {

        /* JADX INFO: renamed from: a */
        private final C4952d.b f45353a;

        /* JADX INFO: renamed from: b */
        private final X f45354b;

        /* JADX INFO: renamed from: c */
        private final X f45355c;

        /* JADX INFO: renamed from: d */
        private boolean f45356d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C4622c f45357e;

        /* JADX INFO: renamed from: dg.c$d$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends AbstractC6692q {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C4622c f45358b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ d f45359c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4622c c4622c, d dVar, X x10) {
                super(x10);
                this.f45358b = c4622c;
                this.f45359c = dVar;
            }

            @Override // tg.AbstractC6692q, tg.X, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                C4622c c4622c = this.f45358b;
                d dVar = this.f45359c;
                synchronized (c4622c) {
                    if (dVar.d()) {
                        return;
                    }
                    dVar.e(true);
                    c4622c.m(c4622c.h() + 1);
                    super.close();
                    this.f45359c.f45353a.b();
                }
            }
        }

        public d(C4622c c4622c, C4952d.b editor) {
            AbstractC5504s.h(editor, "editor");
            this.f45357e = c4622c;
            this.f45353a = editor;
            X xF = editor.f(1);
            this.f45354b = xF;
            this.f45355c = new a(c4622c, this, xF);
        }

        @Override // hg.InterfaceC4950b
        public void a() {
            C4622c c4622c = this.f45357e;
            synchronized (c4622c) {
                if (this.f45356d) {
                    return;
                }
                this.f45356d = true;
                c4622c.l(c4622c.g() + 1);
                AbstractC4807e.m(this.f45354b);
                try {
                    this.f45353a.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // hg.InterfaceC4950b
        public X b() {
            return this.f45355c;
        }

        public final boolean d() {
            return this.f45356d;
        }

        public final void e(boolean z10) {
            this.f45356d = z10;
        }
    }

    public C4622c(File directory, long j10, InterfaceC5790a fileSystem) {
        AbstractC5504s.h(directory, "directory");
        AbstractC5504s.h(fileSystem, "fileSystem");
        this.f45329a = new C4952d(fileSystem, directory, 201105, 2, j10, ig.e.f48893i);
    }

    private final void a(C4952d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final E b(C request) {
        AbstractC5504s.h(request, "request");
        try {
            C4952d.C0769d c0769dD = this.f45329a.D(f45328g.b(request.p()));
            if (c0769dD == null) {
                return null;
            }
            try {
                C0717c c0717c = new C0717c(c0769dD.b(0));
                E eD = c0717c.d(c0769dD);
                if (c0717c.b(request, eD)) {
                    return eD;
                }
                F fJ = eD.j();
                if (fJ != null) {
                    AbstractC4807e.m(fJ);
                }
                return null;
            } catch (IOException unused) {
                AbstractC4807e.m(c0769dD);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f45329a.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f45329a.flush();
    }

    public final int g() {
        return this.f45331c;
    }

    public final int h() {
        return this.f45330b;
    }

    public final InterfaceC4950b j(E response) {
        C4952d.b bVarC;
        AbstractC5504s.h(response, "response");
        String strL = response.F0().l();
        if (C5483f.f52206a.a(response.F0().l())) {
            try {
                k(response.F0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!AbstractC5504s.c(strL, "GET")) {
            return null;
        }
        b bVar = f45328g;
        if (bVar.a(response)) {
            return null;
        }
        C0717c c0717c = new C0717c(response);
        try {
            bVarC = C4952d.C(this.f45329a, bVar.b(response.F0().p()), 0L, 2, null);
            if (bVarC == null) {
                return null;
            }
            try {
                c0717c.f(bVarC);
                return new d(this, bVarC);
            } catch (IOException unused2) {
                a(bVarC);
                return null;
            }
        } catch (IOException unused3) {
            bVarC = null;
        }
    }

    public final void k(C request) {
        AbstractC5504s.h(request, "request");
        this.f45329a.G0(f45328g.b(request.p()));
    }

    public final void l(int i10) {
        this.f45331c = i10;
    }

    public final void m(int i10) {
        this.f45330b = i10;
    }

    public final synchronized void o() {
        this.f45333e++;
    }

    public final synchronized void q(C4951c cacheStrategy) {
        try {
            AbstractC5504s.h(cacheStrategy, "cacheStrategy");
            this.f45334f++;
            if (cacheStrategy.b() != null) {
                this.f45332d++;
            } else if (cacheStrategy.a() != null) {
                this.f45333e++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void w(E cached, E network) {
        C4952d.b bVarA;
        AbstractC5504s.h(cached, "cached");
        AbstractC5504s.h(network, "network");
        C0717c c0717c = new C0717c(network);
        F fJ = cached.j();
        AbstractC5504s.f(fJ, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVarA = ((a) fJ).m().a();
            if (bVarA == null) {
                return;
            }
            try {
                c0717c.f(bVarA);
                bVarA.b();
            } catch (IOException unused) {
                a(bVarA);
            }
        } catch (IOException unused2) {
            bVarA = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4622c(File directory, long j10) {
        this(directory, j10, InterfaceC5790a.f54134b);
        AbstractC5504s.h(directory, "directory");
    }

    /* JADX INFO: renamed from: dg.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0717c {

        /* JADX INFO: renamed from: k */
        public static final a f45340k = new a(null);

        /* JADX INFO: renamed from: l */
        private static final String f45341l;

        /* JADX INFO: renamed from: m */
        private static final String f45342m;

        /* JADX INFO: renamed from: a */
        private final u f45343a;

        /* JADX INFO: renamed from: b */
        private final t f45344b;

        /* JADX INFO: renamed from: c */
        private final String f45345c;

        /* JADX INFO: renamed from: d */
        private final EnumC4619B f45346d;

        /* JADX INFO: renamed from: e */
        private final int f45347e;

        /* JADX INFO: renamed from: f */
        private final String f45348f;

        /* JADX INFO: renamed from: g */
        private final t f45349g;

        /* JADX INFO: renamed from: h */
        private final s f45350h;

        /* JADX INFO: renamed from: i */
        private final long f45351i;

        /* JADX INFO: renamed from: j */
        private final long f45352j;

        /* JADX INFO: renamed from: dg.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        static {
            StringBuilder sb2 = new StringBuilder();
            j.a aVar = og.j.f55583a;
            sb2.append(aVar.g().g());
            sb2.append("-Sent-Millis");
            f45341l = sb2.toString();
            f45342m = aVar.g().g() + "-Received-Millis";
        }

        public C0717c(Z rawSource) throws IOException {
            AbstractC5504s.h(rawSource, "rawSource");
            try {
                InterfaceC6685j interfaceC6685jD = K.d(rawSource);
                String strD0 = interfaceC6685jD.D0();
                u uVarF = u.f45583k.f(strD0);
                if (uVarF == null) {
                    IOException iOException = new IOException("Cache corruption for " + strD0);
                    og.j.f55583a.g().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f45343a = uVarF;
                this.f45345c = interfaceC6685jD.D0();
                t.a aVar = new t.a();
                int iC = C4622c.f45328g.c(interfaceC6685jD);
                for (int i10 = 0; i10 < iC; i10++) {
                    aVar.b(interfaceC6685jD.D0());
                }
                this.f45344b = aVar.e();
                kg.k kVarA = kg.k.f52222d.a(interfaceC6685jD.D0());
                this.f45346d = kVarA.f52223a;
                this.f45347e = kVarA.f52224b;
                this.f45348f = kVarA.f52225c;
                t.a aVar2 = new t.a();
                int iC2 = C4622c.f45328g.c(interfaceC6685jD);
                for (int i11 = 0; i11 < iC2; i11++) {
                    aVar2.b(interfaceC6685jD.D0());
                }
                String str = f45341l;
                String strF = aVar2.f(str);
                String str2 = f45342m;
                String strF2 = aVar2.f(str2);
                aVar2.h(str);
                aVar2.h(str2);
                this.f45351i = strF != null ? Long.parseLong(strF) : 0L;
                this.f45352j = strF2 != null ? Long.parseLong(strF2) : 0L;
                this.f45349g = aVar2.e();
                if (a()) {
                    String strD02 = interfaceC6685jD.D0();
                    if (strD02.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strD02 + '\"');
                    }
                    this.f45350h = s.f45572e.a(!interfaceC6685jD.f1() ? H.f45305b.a(interfaceC6685jD.D0()) : H.SSL_3_0, C4628i.f45448b.b(interfaceC6685jD.D0()), c(interfaceC6685jD), c(interfaceC6685jD));
                } else {
                    this.f45350h = null;
                }
                L l10 = L.f17438a;
                fe.c.a(rawSource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    fe.c.a(rawSource, th2);
                    throw th3;
                }
            }
        }

        private final boolean a() {
            return AbstractC5504s.c(this.f45343a.q(), Constants.SCHEME);
        }

        private final List c(InterfaceC6685j interfaceC6685j) throws IOException {
            int iC = C4622c.f45328g.c(interfaceC6685j);
            if (iC == -1) {
                return AbstractC2279u.m();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String strD0 = interfaceC6685j.D0();
                    C6683h c6683h = new C6683h();
                    C6686k c6686kD = C6686k.f61044d.d(strD0);
                    if (c6686kD == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c6683h.A0(c6686kD);
                    arrayList.add(certificateFactory.generateCertificate(c6683h.L()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(InterfaceC6684i interfaceC6684i, List list) throws IOException {
            try {
                interfaceC6684i.S0(list.size()).writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    C6686k.a aVar = C6686k.f61044d;
                    AbstractC5504s.g(bytes, "bytes");
                    interfaceC6684i.s0(C6686k.a.j(aVar, bytes, 0, 0, 3, null).b()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(C request, E response) {
            AbstractC5504s.h(request, "request");
            AbstractC5504s.h(response, "response");
            return AbstractC5504s.c(this.f45343a, request.p()) && AbstractC5504s.c(this.f45345c, request.l()) && C4622c.f45328g.g(response, this.f45344b, request);
        }

        public final E d(C4952d.C0769d snapshot) {
            AbstractC5504s.h(snapshot, "snapshot");
            String strD = this.f45349g.d("Content-Type");
            String strD2 = this.f45349g.d("Content-Length");
            return new E.a().s(new C.a().l(this.f45343a).g(this.f45345c, null).f(this.f45344b).b()).p(this.f45346d).g(this.f45347e).m(this.f45348f).k(this.f45349g).b(new a(snapshot, strD, strD2)).i(this.f45350h).t(this.f45351i).q(this.f45352j).c();
        }

        public final void f(C4952d.b editor) throws IOException {
            AbstractC5504s.h(editor, "editor");
            InterfaceC6684i interfaceC6684iC = K.c(editor.f(0));
            try {
                interfaceC6684iC.s0(this.f45343a.toString()).writeByte(10);
                interfaceC6684iC.s0(this.f45345c).writeByte(10);
                interfaceC6684iC.S0(this.f45344b.size()).writeByte(10);
                int size = this.f45344b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    interfaceC6684iC.s0(this.f45344b.f(i10)).s0(": ").s0(this.f45344b.p(i10)).writeByte(10);
                }
                interfaceC6684iC.s0(new kg.k(this.f45346d, this.f45347e, this.f45348f).toString()).writeByte(10);
                interfaceC6684iC.S0(this.f45349g.size() + 2).writeByte(10);
                int size2 = this.f45349g.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    interfaceC6684iC.s0(this.f45349g.f(i11)).s0(": ").s0(this.f45349g.p(i11)).writeByte(10);
                }
                interfaceC6684iC.s0(f45341l).s0(": ").S0(this.f45351i).writeByte(10);
                interfaceC6684iC.s0(f45342m).s0(": ").S0(this.f45352j).writeByte(10);
                if (a()) {
                    interfaceC6684iC.writeByte(10);
                    s sVar = this.f45350h;
                    AbstractC5504s.e(sVar);
                    interfaceC6684iC.s0(sVar.a().c()).writeByte(10);
                    e(interfaceC6684iC, this.f45350h.d());
                    e(interfaceC6684iC, this.f45350h.c());
                    interfaceC6684iC.s0(this.f45350h.e().b()).writeByte(10);
                }
                L l10 = L.f17438a;
                fe.c.a(interfaceC6684iC, null);
            } finally {
            }
        }

        public C0717c(E response) {
            AbstractC5504s.h(response, "response");
            this.f45343a = response.F0().p();
            this.f45344b = C4622c.f45328g.f(response);
            this.f45345c = response.F0().l();
            this.f45346d = response.p0();
            this.f45347e = response.o();
            this.f45348f = response.O();
            this.f45349g = response.E();
            this.f45350h = response.w();
            this.f45351i = response.G0();
            this.f45352j = response.B0();
        }
    }
}
