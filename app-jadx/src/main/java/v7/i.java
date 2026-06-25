package v7;

import dg.F;
import dg.x;
import kotlin.jvm.internal.AbstractC5504s;
import tg.AbstractC6678c;
import tg.C6683h;
import tg.InterfaceC6685j;
import tg.Z;
import tg.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f61996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f61997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC6685j f61998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f61999e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f62000b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z z10, i iVar) {
            super(z10);
            this.f62000b = iVar;
        }

        @Override // tg.r, tg.Z
        public long N0(C6683h sink, long j10) {
            AbstractC5504s.h(sink, "sink");
            long jN0 = super.N0(sink, j10);
            i iVar = this.f62000b;
            if (jN0 != -1) {
                iVar.f61999e += jN0;
            }
            iVar.f61997c.a(iVar.f61999e, iVar.f61996b.h(), jN0 == -1);
            return jN0;
        }
    }

    public i(F responseBody, g progressListener) {
        AbstractC5504s.h(responseBody, "responseBody");
        AbstractC5504s.h(progressListener, "progressListener");
        this.f61996b = responseBody;
        this.f61997c = progressListener;
    }

    private final Z z(Z z10) {
        return new a(z10, this);
    }

    public final long C() {
        return this.f61999e;
    }

    @Override // dg.F
    public long h() {
        return this.f61996b.h();
    }

    @Override // dg.F
    public x j() {
        return this.f61996b.j();
    }

    @Override // dg.F
    public InterfaceC6685j k() {
        if (this.f61998d == null) {
            this.f61998d = AbstractC6678c.a().b(z(this.f61996b.k()));
        }
        InterfaceC6685j interfaceC6685j = this.f61998d;
        if (interfaceC6685j != null) {
            return interfaceC6685j;
        }
        AbstractC5504s.u("bufferedSource");
        return null;
    }
}
