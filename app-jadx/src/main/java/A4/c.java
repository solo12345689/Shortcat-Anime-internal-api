package A4;

import A4.i;
import java.nio.ByteBuffer;
import tg.C6683h;
import v4.InterfaceC6845d;
import x4.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G4.m f274b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements i.a {
        @Override // A4.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(ByteBuffer byteBuffer, G4.m mVar, InterfaceC6845d interfaceC6845d) {
            return new c(byteBuffer, mVar);
        }
    }

    public c(ByteBuffer byteBuffer, G4.m mVar) {
        this.f273a = byteBuffer;
        this.f274b = mVar;
    }

    @Override // A4.i
    public Object a(Zd.e eVar) {
        try {
            C6683h c6683h = new C6683h();
            c6683h.write(this.f273a);
            this.f273a.position(0);
            return new m(q.a(c6683h, this.f274b.g()), null, x4.f.MEMORY);
        } catch (Throwable th2) {
            this.f273a.position(0);
            throw th2;
        }
    }
}
