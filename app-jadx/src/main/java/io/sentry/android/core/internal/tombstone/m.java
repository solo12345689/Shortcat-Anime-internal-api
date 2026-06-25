package io.sentry.android.core.internal.tombstone;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import xa.AbstractC7090p;
import xa.AbstractC7091q;
import xa.C7096w;
import xa.C7097x;
import xa.InterfaceC7071E;
import xa.L;
import xa.e0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends AbstractC7090p implements InterfaceC7071E {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final m f49835v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static volatile L f49836w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49837e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f49841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f49842j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private k f49845m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C7097x f49849q = C7097x.f();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C7097x f49850r = C7097x.f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f49838f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f49839g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f49840h = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f49843k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AbstractC7091q.b f49844l = AbstractC7090p.l();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f49846n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AbstractC7091q.b f49847o = AbstractC7090p.l();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AbstractC7091q.b f49848p = AbstractC7090p.l();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AbstractC7091q.b f49851s = AbstractC7090p.l();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AbstractC7091q.b f49852t = AbstractC7090p.l();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AbstractC7091q.b f49853u = AbstractC7090p.l();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC7090p.a implements InterfaceC7071E {
        /* synthetic */ a(io.sentry.android.core.internal.tombstone.b bVar) {
            this();
        }

        private a() {
            super(m.f49835v);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C7096w f49854a = C7096w.b(e0.b.f64187o, 0, e0.b.f64185m, l.H());
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C7096w f49855a = C7096w.b(e0.b.f64187o, 0, e0.b.f64185m, l.H());
    }

    static {
        m mVar = new m();
        f49835v = mVar;
        AbstractC7090p.C(m.class, mVar);
    }

    private m() {
    }

    private C7097x O() {
        return this.f49849q;
    }

    public static m P(InputStream inputStream) {
        return (m) AbstractC7090p.A(f49835v, inputStream);
    }

    public String G() {
        return this.f49846n;
    }

    public List H() {
        return this.f49844l;
    }

    public List I() {
        return this.f49851s;
    }

    public int J() {
        return this.f49841i;
    }

    public k K() {
        k kVar = this.f49845m;
        return kVar == null ? k.I() : kVar;
    }

    public Map L() {
        return Collections.unmodifiableMap(O());
    }

    public int M() {
        return this.f49842j;
    }

    public boolean N() {
        return (this.f49837e & 1) != 0;
    }

    @Override // xa.AbstractC7090p
    protected final Object k(AbstractC7090p.d dVar, Object obj, Object obj2) {
        L bVar;
        io.sentry.android.core.internal.tombstone.b bVar2 = null;
        switch (io.sentry.android.core.internal.tombstone.b.f49819a[dVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new a(bVar2);
            case 3:
                return AbstractC7090p.y(f49835v, "\u0000\u0017\u0000\u0001\u0001\u001a\u0017\u0002\u0006\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\u000b\u0007\u000b\bȈ\tȚ\nဉ\u0000\u000eȈ\u000f\u001b\u00102\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u000b\u0015\u001b\u0016\u000b\u0017\u0007\u0018\f\u00192\u001aဉ\u0001", new Object[]{"bitField0_", "arch_", "buildFingerprint_", "revision_", "timestamp_", "pid_", "tid_", "uid_", "selinuxLabel_", "commandLine_", "signalInfo_", "abortMessage_", "causes_", d.class, "threads_", c.f49855a, "memoryMappings_", i.class, "logBuffers_", g.class, "openFds_", f.class, "processUptime_", "crashDetails_", e.class, "pageSize_", "hasBeen16KbMode_", "guestArch_", "guestThreads_", b.f49854a, "stackHistoryBuffer_"});
            case 4:
                return f49835v;
            case 5:
                L l10 = f49836w;
                if (l10 != null) {
                    return l10;
                }
                synchronized (m.class) {
                    try {
                        bVar = f49836w;
                        if (bVar == null) {
                            bVar = new AbstractC7090p.b(f49835v);
                            f49836w = bVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
