package hg;

import Df.p;
import Td.C2160k;
import Td.L;
import fg.AbstractC4807e;
import ig.AbstractC5097a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.InterfaceC5790a;
import og.j;
import tg.InterfaceC6684i;
import tg.InterfaceC6685j;
import tg.K;
import tg.X;
import tg.Z;
import tg.r;

/* JADX INFO: renamed from: hg.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4952d implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5790a f47888a;

    /* JADX INFO: renamed from: b */
    private final File f47889b;

    /* JADX INFO: renamed from: c */
    private final int f47890c;

    /* JADX INFO: renamed from: d */
    private final int f47891d;

    /* JADX INFO: renamed from: e */
    private long f47892e;

    /* JADX INFO: renamed from: f */
    private final File f47893f;

    /* JADX INFO: renamed from: g */
    private final File f47894g;

    /* JADX INFO: renamed from: h */
    private final File f47895h;

    /* JADX INFO: renamed from: i */
    private long f47896i;

    /* JADX INFO: renamed from: j */
    private InterfaceC6684i f47897j;

    /* JADX INFO: renamed from: k */
    private final LinkedHashMap f47898k;

    /* JADX INFO: renamed from: l */
    private int f47899l;

    /* JADX INFO: renamed from: m */
    private boolean f47900m;

    /* JADX INFO: renamed from: n */
    private boolean f47901n;

    /* JADX INFO: renamed from: o */
    private boolean f47902o;

    /* JADX INFO: renamed from: p */
    private boolean f47903p;

    /* JADX INFO: renamed from: q */
    private boolean f47904q;

    /* JADX INFO: renamed from: r */
    private boolean f47905r;

    /* JADX INFO: renamed from: s */
    private long f47906s;

    /* JADX INFO: renamed from: t */
    private final ig.d f47907t;

    /* JADX INFO: renamed from: u */
    private final e f47908u;

    /* JADX INFO: renamed from: v */
    public static final a f47883v = new a(null);

    /* JADX INFO: renamed from: w */
    public static final String f47884w = "journal";

    /* JADX INFO: renamed from: x */
    public static final String f47885x = "journal.tmp";

    /* JADX INFO: renamed from: y */
    public static final String f47886y = "journal.bkp";

    /* JADX INFO: renamed from: z */
    public static final String f47887z = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: A */
    public static final String f47876A = "1";

    /* JADX INFO: renamed from: B */
    public static final long f47877B = -1;

    /* JADX INFO: renamed from: C */
    public static final p f47878C = new p("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: D */
    public static final String f47879D = "CLEAN";

    /* JADX INFO: renamed from: E */
    public static final String f47880E = "DIRTY";

    /* JADX INFO: renamed from: F */
    public static final String f47881F = "REMOVE";

    /* JADX INFO: renamed from: G */
    public static final String f47882G = "READ";

    /* JADX INFO: renamed from: hg.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: hg.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class b {

        /* JADX INFO: renamed from: a */
        private final c f47909a;

        /* JADX INFO: renamed from: b */
        private final boolean[] f47910b;

        /* JADX INFO: renamed from: c */
        private boolean f47911c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C4952d f47912d;

        /* JADX INFO: renamed from: hg.d$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C4952d f47913a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ b f47914b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4952d c4952d, b bVar) {
                super(1);
                this.f47913a = c4952d;
                this.f47914b = bVar;
            }

            public final void a(IOException it) {
                AbstractC5504s.h(it, "it");
                C4952d c4952d = this.f47913a;
                b bVar = this.f47914b;
                synchronized (c4952d) {
                    bVar.c();
                    L l10 = L.f17438a;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((IOException) obj);
                return L.f17438a;
            }
        }

        public b(C4952d c4952d, c entry) {
            AbstractC5504s.h(entry, "entry");
            this.f47912d = c4952d;
            this.f47909a = entry;
            this.f47910b = entry.g() ? null : new boolean[c4952d.O()];
        }

        public final void a() {
            C4952d c4952d = this.f47912d;
            synchronized (c4952d) {
                try {
                    if (this.f47911c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC5504s.c(this.f47909a.b(), this)) {
                        c4952d.q(this, false);
                    }
                    this.f47911c = true;
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b() {
            C4952d c4952d = this.f47912d;
            synchronized (c4952d) {
                try {
                    if (this.f47911c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC5504s.c(this.f47909a.b(), this)) {
                        c4952d.q(this, true);
                    }
                    this.f47911c = true;
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() {
            if (AbstractC5504s.c(this.f47909a.b(), this)) {
                if (this.f47912d.f47901n) {
                    this.f47912d.q(this, false);
                } else {
                    this.f47909a.q(true);
                }
            }
        }

        public final c d() {
            return this.f47909a;
        }

        public final boolean[] e() {
            return this.f47910b;
        }

        public final X f(int i10) {
            C4952d c4952d = this.f47912d;
            synchronized (c4952d) {
                if (this.f47911c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!AbstractC5504s.c(this.f47909a.b(), this)) {
                    return K.b();
                }
                if (!this.f47909a.g()) {
                    boolean[] zArr = this.f47910b;
                    AbstractC5504s.e(zArr);
                    zArr[i10] = true;
                }
                try {
                    return new C4953e(c4952d.J().f((File) this.f47909a.c().get(i10)), new a(c4952d, this));
                } catch (FileNotFoundException unused) {
                    return K.b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: hg.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class c {

        /* JADX INFO: renamed from: a */
        private final String f47915a;

        /* JADX INFO: renamed from: b */
        private final long[] f47916b;

        /* JADX INFO: renamed from: c */
        private final List f47917c;

        /* JADX INFO: renamed from: d */
        private final List f47918d;

        /* JADX INFO: renamed from: e */
        private boolean f47919e;

        /* JADX INFO: renamed from: f */
        private boolean f47920f;

        /* JADX INFO: renamed from: g */
        private b f47921g;

        /* JADX INFO: renamed from: h */
        private int f47922h;

        /* JADX INFO: renamed from: i */
        private long f47923i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ C4952d f47924j;

        /* JADX INFO: renamed from: hg.d$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends r {

            /* JADX INFO: renamed from: b */
            private boolean f47925b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C4952d f47926c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ c f47927d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z z10, C4952d c4952d, c cVar) {
                super(z10);
                this.f47926c = c4952d;
                this.f47927d = cVar;
            }

            @Override // tg.r, tg.Z, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.f47925b) {
                    return;
                }
                this.f47925b = true;
                C4952d c4952d = this.f47926c;
                c cVar = this.f47927d;
                synchronized (c4952d) {
                    try {
                        cVar.n(cVar.f() - 1);
                        if (cVar.f() == 0 && cVar.i()) {
                            c4952d.M0(cVar);
                        }
                        L l10 = L.f17438a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public c(C4952d c4952d, String key) {
            AbstractC5504s.h(key, "key");
            this.f47924j = c4952d;
            this.f47915a = key;
            this.f47916b = new long[c4952d.O()];
            this.f47917c = new ArrayList();
            this.f47918d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
            int length = sb2.length();
            int iO = c4952d.O();
            for (int i10 = 0; i10 < iO; i10++) {
                sb2.append(i10);
                this.f47917c.add(new File(this.f47924j.H(), sb2.toString()));
                sb2.append(".tmp");
                this.f47918d.add(new File(this.f47924j.H(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void j(List list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final Z k(int i10) {
            Z zE = this.f47924j.J().e((File) this.f47917c.get(i10));
            if (this.f47924j.f47901n) {
                return zE;
            }
            this.f47922h++;
            return new a(zE, this.f47924j, this);
        }

        public final List a() {
            return this.f47917c;
        }

        public final b b() {
            return this.f47921g;
        }

        public final List c() {
            return this.f47918d;
        }

        public final String d() {
            return this.f47915a;
        }

        public final long[] e() {
            return this.f47916b;
        }

        public final int f() {
            return this.f47922h;
        }

        public final boolean g() {
            return this.f47919e;
        }

        public final long h() {
            return this.f47923i;
        }

        public final boolean i() {
            return this.f47920f;
        }

        public final void l(b bVar) {
            this.f47921g = bVar;
        }

        public final void m(List strings) throws IOException {
            AbstractC5504s.h(strings, "strings");
            if (strings.size() != this.f47924j.O()) {
                j(strings);
                throw new C2160k();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f47916b[i10] = Long.parseLong((String) strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new C2160k();
            }
        }

        public final void n(int i10) {
            this.f47922h = i10;
        }

        public final void o(boolean z10) {
            this.f47919e = z10;
        }

        public final void p(long j10) {
            this.f47923i = j10;
        }

        public final void q(boolean z10) {
            this.f47920f = z10;
        }

        public final C0769d r() {
            C4952d c4952d = this.f47924j;
            if (AbstractC4807e.f47069h && !Thread.holdsLock(c4952d)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c4952d);
            }
            if (!this.f47919e) {
                return null;
            }
            if (!this.f47924j.f47901n && (this.f47921g != null || this.f47920f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f47916b.clone();
            try {
                int iO = this.f47924j.O();
                for (int i10 = 0; i10 < iO; i10++) {
                    arrayList.add(k(i10));
                }
                return new C0769d(this.f47924j, this.f47915a, this.f47923i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC4807e.m((Z) it.next());
                }
                try {
                    this.f47924j.M0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(InterfaceC6684i writer) {
            AbstractC5504s.h(writer, "writer");
            for (long j10 : this.f47916b) {
                writer.writeByte(32).S0(j10);
            }
        }
    }

    /* JADX INFO: renamed from: hg.d$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class C0769d implements Closeable {

        /* JADX INFO: renamed from: a */
        private final String f47928a;

        /* JADX INFO: renamed from: b */
        private final long f47929b;

        /* JADX INFO: renamed from: c */
        private final List f47930c;

        /* JADX INFO: renamed from: d */
        private final long[] f47931d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C4952d f47932e;

        public C0769d(C4952d c4952d, String key, long j10, List sources, long[] lengths) {
            AbstractC5504s.h(key, "key");
            AbstractC5504s.h(sources, "sources");
            AbstractC5504s.h(lengths, "lengths");
            this.f47932e = c4952d;
            this.f47928a = key;
            this.f47929b = j10;
            this.f47930c = sources;
            this.f47931d = lengths;
        }

        public final b a() {
            return this.f47932e.z(this.f47928a, this.f47929b);
        }

        public final Z b(int i10) {
            return (Z) this.f47930c.get(i10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f47930c.iterator();
            while (it.hasNext()) {
                AbstractC4807e.m((Z) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: hg.d$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends AbstractC5097a {
        e(String str) {
            super(str, false, 2, null);
        }

        @Override // ig.AbstractC5097a
        public long f() {
            C4952d c4952d = C4952d.this;
            synchronized (c4952d) {
                if (!c4952d.f47902o || c4952d.E()) {
                    return -1L;
                }
                try {
                    c4952d.q1();
                } catch (IOException unused) {
                    c4952d.f47904q = true;
                }
                try {
                    if (c4952d.Y()) {
                        c4952d.F0();
                        c4952d.f47899l = 0;
                    }
                } catch (IOException unused2) {
                    c4952d.f47905r = true;
                    c4952d.f47897j = K.c(K.b());
                }
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: hg.d$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function1 {
        f() {
            super(1);
        }

        public final void a(IOException it) {
            AbstractC5504s.h(it, "it");
            C4952d c4952d = C4952d.this;
            if (!AbstractC4807e.f47069h || Thread.holdsLock(c4952d)) {
                C4952d.this.f47900m = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c4952d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((IOException) obj);
            return L.f17438a;
        }
    }

    public C4952d(InterfaceC5790a fileSystem, File directory, int i10, int i11, long j10, ig.e taskRunner) {
        AbstractC5504s.h(fileSystem, "fileSystem");
        AbstractC5504s.h(directory, "directory");
        AbstractC5504s.h(taskRunner, "taskRunner");
        this.f47888a = fileSystem;
        this.f47889b = directory;
        this.f47890c = i10;
        this.f47891d = i11;
        this.f47892e = j10;
        this.f47898k = new LinkedHashMap(0, 0.75f, true);
        this.f47907t = taskRunner.i();
        this.f47908u = new e(AbstractC4807e.f47070i + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f47893f = new File(directory, f47884w);
        this.f47894g = new File(directory, f47885x);
        this.f47895h = new File(directory, f47886y);
    }

    private final void B0(String str) throws IOException {
        String strSubstring;
        int iI0 = Df.r.i0(str, ' ', 0, false, 6, null);
        if (iI0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iI0 + 1;
        int iI02 = Df.r.i0(str, ' ', i10, false, 4, null);
        if (iI02 == -1) {
            strSubstring = str.substring(i10);
            AbstractC5504s.g(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = f47881F;
            if (iI0 == str2.length() && Df.r.Q(str, str2, false, 2, null)) {
                this.f47898k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iI02);
            AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        c cVar = (c) this.f47898k.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.f47898k.put(strSubstring, cVar);
        }
        if (iI02 != -1) {
            String str3 = f47879D;
            if (iI0 == str3.length() && Df.r.Q(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iI02 + 1);
                AbstractC5504s.g(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listM0 = Df.r.M0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listM0);
                return;
            }
        }
        if (iI02 == -1) {
            String str4 = f47880E;
            if (iI0 == str4.length() && Df.r.Q(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iI02 == -1) {
            String str5 = f47882G;
            if (iI0 == str5.length() && Df.r.Q(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public static /* synthetic */ b C(C4952d c4952d, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = f47877B;
        }
        return c4952d.z(str, j10);
    }

    public final boolean Y() {
        int i10 = this.f47899l;
        return i10 >= 2000 && i10 >= this.f47898k.size();
    }

    private final boolean a1() {
        for (c toEvict : this.f47898k.values()) {
            if (!toEvict.i()) {
                AbstractC5504s.g(toEvict, "toEvict");
                M0(toEvict);
                return true;
            }
        }
        return false;
    }

    private final InterfaceC6684i h0() {
        return K.c(new C4953e(this.f47888a.c(this.f47893f), new f()));
    }

    private final void k0() {
        this.f47888a.h(this.f47894g);
        Iterator it = this.f47898k.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC5504s.g(next, "i.next()");
            c cVar = (c) next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f47891d;
                while (i10 < i11) {
                    this.f47896i += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.f47891d;
                while (i10 < i12) {
                    this.f47888a.h((File) cVar.a().get(i10));
                    this.f47888a.h((File) cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final synchronized void o() {
        if (this.f47903p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final void p0() throws IOException {
        InterfaceC6685j interfaceC6685jD = K.d(this.f47888a.e(this.f47893f));
        try {
            String strD0 = interfaceC6685jD.D0();
            String strD02 = interfaceC6685jD.D0();
            String strD03 = interfaceC6685jD.D0();
            String strD04 = interfaceC6685jD.D0();
            String strD05 = interfaceC6685jD.D0();
            if (!AbstractC5504s.c(f47887z, strD0) || !AbstractC5504s.c(f47876A, strD02) || !AbstractC5504s.c(String.valueOf(this.f47890c), strD03) || !AbstractC5504s.c(String.valueOf(this.f47891d), strD04) || strD05.length() > 0) {
                throw new IOException("unexpected journal header: [" + strD0 + ", " + strD02 + ", " + strD04 + ", " + strD05 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    B0(interfaceC6685jD.D0());
                    i10++;
                } catch (EOFException unused) {
                    this.f47899l = i10 - this.f47898k.size();
                    if (interfaceC6685jD.f1()) {
                        this.f47897j = h0();
                    } else {
                        F0();
                    }
                    L l10 = L.f17438a;
                    fe.c.a(interfaceC6685jD, null);
                    return;
                }
            }
        } finally {
        }
    }

    private final void t1(String str) {
        if (f47878C.h(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final synchronized C0769d D(String key) {
        AbstractC5504s.h(key, "key");
        S();
        o();
        t1(key);
        c cVar = (c) this.f47898k.get(key);
        if (cVar == null) {
            return null;
        }
        C0769d c0769dR = cVar.r();
        if (c0769dR == null) {
            return null;
        }
        this.f47899l++;
        InterfaceC6684i interfaceC6684i = this.f47897j;
        AbstractC5504s.e(interfaceC6684i);
        interfaceC6684i.s0(f47882G).writeByte(32).s0(key).writeByte(10);
        if (Y()) {
            ig.d.j(this.f47907t, this.f47908u, 0L, 2, null);
        }
        return c0769dR;
    }

    public final boolean E() {
        return this.f47903p;
    }

    public final synchronized void F0() {
        try {
            InterfaceC6684i interfaceC6684i = this.f47897j;
            if (interfaceC6684i != null) {
                interfaceC6684i.close();
            }
            InterfaceC6684i interfaceC6684iC = K.c(this.f47888a.f(this.f47894g));
            try {
                interfaceC6684iC.s0(f47887z).writeByte(10);
                interfaceC6684iC.s0(f47876A).writeByte(10);
                interfaceC6684iC.S0(this.f47890c).writeByte(10);
                interfaceC6684iC.S0(this.f47891d).writeByte(10);
                interfaceC6684iC.writeByte(10);
                for (c cVar : this.f47898k.values()) {
                    if (cVar.b() != null) {
                        interfaceC6684iC.s0(f47880E).writeByte(32);
                        interfaceC6684iC.s0(cVar.d());
                        interfaceC6684iC.writeByte(10);
                    } else {
                        interfaceC6684iC.s0(f47879D).writeByte(32);
                        interfaceC6684iC.s0(cVar.d());
                        cVar.s(interfaceC6684iC);
                        interfaceC6684iC.writeByte(10);
                    }
                }
                L l10 = L.f17438a;
                fe.c.a(interfaceC6684iC, null);
                if (this.f47888a.b(this.f47893f)) {
                    this.f47888a.g(this.f47893f, this.f47895h);
                }
                this.f47888a.g(this.f47894g, this.f47893f);
                this.f47888a.h(this.f47895h);
                this.f47897j = h0();
                this.f47900m = false;
                this.f47905r = false;
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean G0(String key) {
        AbstractC5504s.h(key, "key");
        S();
        o();
        t1(key);
        c cVar = (c) this.f47898k.get(key);
        if (cVar == null) {
            return false;
        }
        boolean zM0 = M0(cVar);
        if (zM0 && this.f47896i <= this.f47892e) {
            this.f47904q = false;
        }
        return zM0;
    }

    public final File H() {
        return this.f47889b;
    }

    public final InterfaceC5790a J() {
        return this.f47888a;
    }

    public final boolean M0(c entry) {
        InterfaceC6684i interfaceC6684i;
        AbstractC5504s.h(entry, "entry");
        if (!this.f47901n) {
            if (entry.f() > 0 && (interfaceC6684i = this.f47897j) != null) {
                interfaceC6684i.s0(f47880E);
                interfaceC6684i.writeByte(32);
                interfaceC6684i.s0(entry.d());
                interfaceC6684i.writeByte(10);
                interfaceC6684i.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        b bVarB = entry.b();
        if (bVarB != null) {
            bVarB.c();
        }
        int i10 = this.f47891d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f47888a.h((File) entry.a().get(i11));
            this.f47896i -= entry.e()[i11];
            entry.e()[i11] = 0;
        }
        this.f47899l++;
        InterfaceC6684i interfaceC6684i2 = this.f47897j;
        if (interfaceC6684i2 != null) {
            interfaceC6684i2.s0(f47881F);
            interfaceC6684i2.writeByte(32);
            interfaceC6684i2.s0(entry.d());
            interfaceC6684i2.writeByte(10);
        }
        this.f47898k.remove(entry.d());
        if (Y()) {
            ig.d.j(this.f47907t, this.f47908u, 0L, 2, null);
        }
        return true;
    }

    public final int O() {
        return this.f47891d;
    }

    public final synchronized void S() {
        try {
            if (AbstractC4807e.f47069h && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.f47902o) {
                return;
            }
            if (this.f47888a.b(this.f47895h)) {
                if (this.f47888a.b(this.f47893f)) {
                    this.f47888a.h(this.f47895h);
                } else {
                    this.f47888a.g(this.f47895h, this.f47893f);
                }
            }
            this.f47901n = AbstractC4807e.F(this.f47888a, this.f47895h);
            if (this.f47888a.b(this.f47893f)) {
                try {
                    p0();
                    k0();
                    this.f47902o = true;
                    return;
                } catch (IOException e10) {
                    j.f55583a.g().k("DiskLruCache " + this.f47889b + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        w();
                        this.f47903p = false;
                        F0();
                        this.f47902o = true;
                    } catch (Throwable th2) {
                        this.f47903p = false;
                        throw th2;
                    }
                }
            }
            F0();
            this.f47902o = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b bVarB;
        try {
            if (this.f47902o && !this.f47903p) {
                Collection collectionValues = this.f47898k.values();
                AbstractC5504s.g(collectionValues, "lruEntries.values");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    if (cVar.b() != null && (bVarB = cVar.b()) != null) {
                        bVarB.c();
                    }
                }
                q1();
                InterfaceC6684i interfaceC6684i = this.f47897j;
                AbstractC5504s.e(interfaceC6684i);
                interfaceC6684i.close();
                this.f47897j = null;
                this.f47903p = true;
                return;
            }
            this.f47903p = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f47902o) {
            o();
            q1();
            InterfaceC6684i interfaceC6684i = this.f47897j;
            AbstractC5504s.e(interfaceC6684i);
            interfaceC6684i.flush();
        }
    }

    public final synchronized void q(b editor, boolean z10) {
        AbstractC5504s.h(editor, "editor");
        c cVarD = editor.d();
        if (!AbstractC5504s.c(cVarD.b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z10 && !cVarD.g()) {
            int i10 = this.f47891d;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] zArrE = editor.e();
                AbstractC5504s.e(zArrE);
                if (!zArrE[i11]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.f47888a.b((File) cVarD.c().get(i11))) {
                    editor.a();
                    return;
                }
            }
        }
        int i12 = this.f47891d;
        for (int i13 = 0; i13 < i12; i13++) {
            File file = (File) cVarD.c().get(i13);
            if (!z10 || cVarD.i()) {
                this.f47888a.h(file);
            } else if (this.f47888a.b(file)) {
                File file2 = (File) cVarD.a().get(i13);
                this.f47888a.g(file, file2);
                long j10 = cVarD.e()[i13];
                long jD = this.f47888a.d(file2);
                cVarD.e()[i13] = jD;
                this.f47896i = (this.f47896i - j10) + jD;
            }
        }
        cVarD.l(null);
        if (cVarD.i()) {
            M0(cVarD);
            return;
        }
        this.f47899l++;
        InterfaceC6684i interfaceC6684i = this.f47897j;
        AbstractC5504s.e(interfaceC6684i);
        if (cVarD.g() || z10) {
            cVarD.o(true);
            interfaceC6684i.s0(f47879D).writeByte(32);
            interfaceC6684i.s0(cVarD.d());
            cVarD.s(interfaceC6684i);
            interfaceC6684i.writeByte(10);
            if (z10) {
                long j11 = this.f47906s;
                this.f47906s = 1 + j11;
                cVarD.p(j11);
            }
        } else {
            this.f47898k.remove(cVarD.d());
            interfaceC6684i.s0(f47881F).writeByte(32);
            interfaceC6684i.s0(cVarD.d());
            interfaceC6684i.writeByte(10);
        }
        interfaceC6684i.flush();
        if (this.f47896i > this.f47892e || Y()) {
            ig.d.j(this.f47907t, this.f47908u, 0L, 2, null);
        }
    }

    public final void q1() {
        while (this.f47896i > this.f47892e) {
            if (!a1()) {
                return;
            }
        }
        this.f47904q = false;
    }

    public final void w() {
        close();
        this.f47888a.a(this.f47889b);
    }

    public final synchronized b z(String key, long j10) {
        AbstractC5504s.h(key, "key");
        S();
        o();
        t1(key);
        c cVar = (c) this.f47898k.get(key);
        if (j10 != f47877B && (cVar == null || cVar.h() != j10)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f47904q && !this.f47905r) {
            InterfaceC6684i interfaceC6684i = this.f47897j;
            AbstractC5504s.e(interfaceC6684i);
            interfaceC6684i.s0(f47880E).writeByte(32).s0(key).writeByte(10);
            interfaceC6684i.flush();
            if (this.f47900m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.f47898k.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        ig.d.j(this.f47907t, this.f47908u, 0L, 2, null);
        return null;
    }
}
