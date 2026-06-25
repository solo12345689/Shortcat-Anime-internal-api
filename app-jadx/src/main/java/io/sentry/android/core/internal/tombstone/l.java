package io.sentry.android.core.internal.tombstone;

import java.util.List;
import xa.AbstractC7090p;
import xa.AbstractC7091q;
import xa.InterfaceC7071E;
import xa.L;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends AbstractC7090p implements InterfaceC7071E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final l f49826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile L f49827m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f49829f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AbstractC7091q.b f49830g = AbstractC7090p.l();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AbstractC7091q.b f49831h = AbstractC7090p.l();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractC7091q.b f49832i = AbstractC7090p.l();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AbstractC7091q.b f49833j = AbstractC7090p.l();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AbstractC7091q.b f49834k = AbstractC7090p.l();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC7090p.a implements InterfaceC7071E {
        /* synthetic */ a(b bVar) {
            this();
        }

        private a() {
            super(l.f49826l);
        }
    }

    static {
        l lVar = new l();
        f49826l = lVar;
        AbstractC7090p.C(l.class, lVar);
    }

    private l() {
    }

    public static l H() {
        return f49826l;
    }

    public List G() {
        return this.f49833j;
    }

    public int I() {
        return this.f49828e;
    }

    public String J() {
        return this.f49829f;
    }

    public List K() {
        return this.f49830g;
    }

    @Override // xa.AbstractC7090p
    protected final Object k(AbstractC7090p.d dVar, Object obj, Object obj2) {
        L bVar;
        b bVar2 = null;
        switch (b.f49819a[dVar.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return new a(bVar2);
            case 3:
                return AbstractC7090p.y(f49826l, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u0004\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u0002\u0007Ț\b\u0002\tȚ", new Object[]{"id_", "name_", "registers_", j.class, "currentBacktrace_", c.class, "memoryDump_", h.class, "taggedAddrCtrl_", "backtraceNote_", "pacEnabledKeys_", "unreadableElfFiles_"});
            case 4:
                return f49826l;
            case 5:
                L l10 = f49827m;
                if (l10 != null) {
                    return l10;
                }
                synchronized (l.class) {
                    try {
                        bVar = f49827m;
                        if (bVar == null) {
                            bVar = new AbstractC7090p.b(f49826l);
                            f49827m = bVar;
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
