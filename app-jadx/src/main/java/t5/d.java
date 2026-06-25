package t5;

import android.content.Context;
import java.io.File;
import s5.InterfaceC6430a;
import s5.InterfaceC6432c;
import v5.C6849c;
import v5.InterfaceC6848b;
import y5.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f60759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f60760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f60761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f60762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f60763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f60764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC6430a f60765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC6432c f60766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC6848b f60767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f60768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f60769l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements n {
        a() {
        }

        @Override // y5.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public File get() {
            y5.k.g(d.this.f60768k);
            return d.this.f60768k.getApplicationContext().getCacheDir();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f60771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f60772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f60773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f60774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f60775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f60776f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j f60777g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private InterfaceC6430a f60778h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private InterfaceC6432c f60779i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private InterfaceC6848b f60780j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f60781k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Context f60782l;

        public d n() {
            return new d(this);
        }

        private b(Context context) {
            this.f60771a = 1;
            this.f60772b = "image_cache";
            this.f60774d = 41943040L;
            this.f60775e = 10485760L;
            this.f60776f = 2097152L;
            this.f60777g = new c();
            this.f60782l = context;
        }
    }

    protected d(b bVar) {
        Context context = bVar.f60782l;
        this.f60768k = context;
        y5.k.j((bVar.f60773c == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f60773c == null && context != null) {
            bVar.f60773c = new a();
        }
        this.f60758a = bVar.f60771a;
        this.f60759b = (String) y5.k.g(bVar.f60772b);
        this.f60760c = (n) y5.k.g(bVar.f60773c);
        this.f60761d = bVar.f60774d;
        this.f60762e = bVar.f60775e;
        this.f60763f = bVar.f60776f;
        this.f60764g = (j) y5.k.g(bVar.f60777g);
        this.f60765h = bVar.f60778h == null ? s5.g.b() : bVar.f60778h;
        this.f60766i = bVar.f60779i == null ? s5.h.i() : bVar.f60779i;
        this.f60767j = bVar.f60780j == null ? C6849c.b() : bVar.f60780j;
        this.f60769l = bVar.f60781k;
    }

    public static b m(Context context) {
        return new b(context);
    }

    public String b() {
        return this.f60759b;
    }

    public n c() {
        return this.f60760c;
    }

    public InterfaceC6430a d() {
        return this.f60765h;
    }

    public InterfaceC6432c e() {
        return this.f60766i;
    }

    public long f() {
        return this.f60761d;
    }

    public InterfaceC6848b g() {
        return this.f60767j;
    }

    public j h() {
        return this.f60764g;
    }

    public boolean i() {
        return this.f60769l;
    }

    public long j() {
        return this.f60762e;
    }

    public long k() {
        return this.f60763f;
    }

    public int l() {
        return this.f60758a;
    }
}
