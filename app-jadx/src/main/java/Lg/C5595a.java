package lg;

import dg.t;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.InterfaceC6685j;

/* JADX INFO: renamed from: lg.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5595a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0824a f52774c = new C0824a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6685j f52775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f52776b;

    /* JADX INFO: renamed from: lg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0824a {
        public /* synthetic */ C0824a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0824a() {
        }
    }

    public C5595a(InterfaceC6685j source) {
        AbstractC5504s.h(source, "source");
        this.f52775a = source;
        this.f52776b = 262144L;
    }

    public final t a() {
        t.a aVar = new t.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.e();
            }
            aVar.b(strB);
        }
    }

    public final String b() {
        String strI0 = this.f52775a.i0(this.f52776b);
        this.f52776b -= (long) strI0.length();
        return strI0;
    }
}
