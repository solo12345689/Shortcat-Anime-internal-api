package tg;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class Q implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6685j f60971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6683h f60972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U f60973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f60974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f60975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f60976f;

    public Q(InterfaceC6685j upstream) {
        AbstractC5504s.h(upstream, "upstream");
        this.f60971a = upstream;
        C6683h c6683hS = upstream.s();
        this.f60972b = c6683hS;
        U u10 = c6683hS.f61033a;
        this.f60973c = u10;
        this.f60974d = u10 != null ? u10.f60987b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.f60987b) goto L15;
     */
    @Override // tg.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long N0(tg.C6683h r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.AbstractC5504s.h(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L74
            boolean r3 = r8.f60975e
            if (r3 != 0) goto L6c
            tg.U r3 = r8.f60973c
            if (r3 == 0) goto L2b
            tg.h r4 = r8.f60972b
            tg.U r4 = r4.f61033a
            if (r3 != r4) goto L23
            int r3 = r8.f60974d
            kotlin.jvm.internal.AbstractC5504s.e(r4)
            int r4 = r4.f60987b
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            tg.j r0 = r8.f60971a
            long r1 = r8.f60976f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.y0(r1)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            tg.U r0 = r8.f60973c
            if (r0 != 0) goto L51
            tg.h r0 = r8.f60972b
            tg.U r0 = r0.f61033a
            if (r0 == 0) goto L51
            r8.f60973c = r0
            kotlin.jvm.internal.AbstractC5504s.e(r0)
            int r0 = r0.f60987b
            r8.f60974d = r0
        L51:
            tg.h r0 = r8.f60972b
            long r0 = r0.size()
            long r2 = r8.f60976f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            tg.h r2 = r8.f60972b
            long r4 = r8.f60976f
            r3 = r9
            r2.m(r3, r4, r6)
            long r9 = r8.f60976f
            long r9 = r9 + r6
            r8.f60976f = r9
            return r6
        L6c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L74:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.Q.N0(tg.h, long):long");
    }

    @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f60975e = true;
    }

    @Override // tg.Z
    public a0 t() {
        return this.f60971a.t();
    }
}
