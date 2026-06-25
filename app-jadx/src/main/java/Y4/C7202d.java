package y4;

import Gf.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.AbstractC6690o;
import tg.C6686k;
import tg.P;
import y4.C7200b;
import y4.InterfaceC7199a;

/* JADX INFO: renamed from: y4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7202d implements InterfaceC7199a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f64812e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f64813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P f64814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC6690o f64815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C7200b f64816d;

    /* JADX INFO: renamed from: y4.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: y4.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements InterfaceC7199a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C7200b.C0979b f64817a;

        public b(C7200b.C0979b c0979b) {
            this.f64817a = c0979b;
        }

        @Override // y4.InterfaceC7199a.b
        public void a() {
            this.f64817a.a();
        }

        @Override // y4.InterfaceC7199a.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b() {
            C7200b.d dVarC = this.f64817a.c();
            if (dVarC != null) {
                return new c(dVarC);
            }
            return null;
        }

        @Override // y4.InterfaceC7199a.b
        public P e() {
            return this.f64817a.f(1);
        }

        @Override // y4.InterfaceC7199a.b
        public P getMetadata() {
            return this.f64817a.f(0);
        }
    }

    /* JADX INFO: renamed from: y4.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements InterfaceC7199a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C7200b.d f64818a;

        public c(C7200b.d dVar) {
            this.f64818a = dVar;
        }

        @Override // y4.InterfaceC7199a.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b o1() {
            C7200b.C0979b c0979bA = this.f64818a.a();
            if (c0979bA != null) {
                return new b(c0979bA);
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f64818a.close();
        }

        @Override // y4.InterfaceC7199a.c
        public P e() {
            return this.f64818a.b(1);
        }

        @Override // y4.InterfaceC7199a.c
        public P getMetadata() {
            return this.f64818a.b(0);
        }
    }

    public C7202d(long j10, P p10, AbstractC6690o abstractC6690o, K k10) {
        this.f64813a = j10;
        this.f64814b = p10;
        this.f64815c = abstractC6690o;
        this.f64816d = new C7200b(getFileSystem(), c(), k10, d(), 1, 2);
    }

    private final String e(String str) {
        return C6686k.f61044d.g(str).J().u();
    }

    @Override // y4.InterfaceC7199a
    public InterfaceC7199a.b a(String str) {
        C7200b.C0979b c0979bO = this.f64816d.O(e(str));
        if (c0979bO != null) {
            return new b(c0979bO);
        }
        return null;
    }

    @Override // y4.InterfaceC7199a
    public InterfaceC7199a.c b(String str) {
        C7200b.d dVarS = this.f64816d.S(e(str));
        if (dVarS != null) {
            return new c(dVarS);
        }
        return null;
    }

    public P c() {
        return this.f64814b;
    }

    public long d() {
        return this.f64813a;
    }

    @Override // y4.InterfaceC7199a
    public AbstractC6690o getFileSystem() {
        return this.f64815c;
    }
}
