package wd;

import Td.AbstractC2163n;
import dg.F;
import dg.x;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6683h;
import tg.InterfaceC6685j;
import tg.K;
import tg.Z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class d extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f62958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6964b f62959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f62960d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends tg.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f62961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f62962c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z z10, d dVar) {
            super(z10);
            this.f62962c = dVar;
        }

        @Override // tg.r, tg.Z
        public long N0(C6683h sink, long j10) {
            AbstractC5504s.h(sink, "sink");
            long jN0 = super.N0(sink, j10);
            this.f62961b += jN0 != -1 ? jN0 : 0L;
            this.f62962c.f62959c.a(this.f62961b, this.f62962c.f62958b.h());
            return jN0;
        }
    }

    public d(F responseBody, InterfaceC6964b progressListener) {
        AbstractC5504s.h(responseBody, "responseBody");
        AbstractC5504s.h(progressListener, "progressListener");
        this.f62958b = responseBody;
        this.f62959c = progressListener;
        this.f62960d = AbstractC2163n.b(new InterfaceC5082a() { // from class: wd.c
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return d.w(this.f62957a);
            }
        });
    }

    private final Z C(Z z10) {
        return new a(z10, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6685j w(d dVar) {
        return K.d(dVar.C(dVar.f62958b.k()));
    }

    private final InterfaceC6685j z() {
        return (InterfaceC6685j) this.f62960d.getValue();
    }

    @Override // dg.F
    public long h() {
        return this.f62958b.h();
    }

    @Override // dg.F
    public x j() {
        return this.f62958b.j();
    }

    @Override // dg.F
    public InterfaceC6685j k() {
        return z();
    }
}
