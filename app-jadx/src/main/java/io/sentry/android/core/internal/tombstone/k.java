package io.sentry.android.core.internal.tombstone;

import xa.AbstractC7090p;
import xa.InterfaceC7071E;
import xa.L;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends AbstractC7090p implements InterfaceC7071E {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final k f49820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile L f49821j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49822e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f49824g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f49823f = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f49825h = "";

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC7090p.a implements InterfaceC7071E {
        /* synthetic */ a(b bVar) {
            this();
        }

        private a() {
            super(k.f49820i);
        }
    }

    static {
        k kVar = new k();
        f49820i = kVar;
        AbstractC7090p.C(k.class, kVar);
    }

    private k() {
    }

    public static k I() {
        return f49820i;
    }

    public int G() {
        return this.f49824g;
    }

    public String H() {
        return this.f49825h;
    }

    public String J() {
        return this.f49823f;
    }

    public int K() {
        return this.f49822e;
    }

    @Override // xa.AbstractC7090p
    protected final Object k(AbstractC7090p.d dVar, Object obj, Object obj2) {
        L bVar;
        b bVar2 = null;
        switch (b.f49819a[dVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new a(bVar2);
            case 3:
                return AbstractC7090p.y(f49820i, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004\b\u0007\t\u0003\nဉ\u0000", new Object[]{"bitField0_", "number_", "name_", "code_", "codeName_", "hasSender_", "senderUid_", "senderPid_", "hasFaultAddress_", "faultAddress_", "faultAdjacentMetadata_"});
            case 4:
                return f49820i;
            case 5:
                L l10 = f49821j;
                if (l10 != null) {
                    return l10;
                }
                synchronized (k.class) {
                    try {
                        bVar = f49821j;
                        if (bVar == null) {
                            bVar = new AbstractC7090p.b(f49820i);
                            f49821j = bVar;
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
