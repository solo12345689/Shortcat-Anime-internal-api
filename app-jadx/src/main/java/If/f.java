package If;

import Gf.InterfaceC1623n;
import Lf.E;
import Lf.H;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import pe.InterfaceC6018h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f9139a = new m(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9140b = H.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f9141c = H.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", ColorExtractionConstants.MAX_PIXEL_SAMPLES, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f9142d = new E("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final E f9143e = new E("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final E f9144f = new E("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final E f9145g = new E("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final E f9146h = new E("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final E f9147i = new E("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final E f9148j = new E("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final E f9149k = new E("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final E f9150l = new E("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final E f9151m = new E("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final E f9152n = new E("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final E f9153o = new E("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final E f9154p = new E("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final E f9155q = new E("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final E f9156r = new E("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final E f9157s = new E("NO_CLOSE_CAUSE");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9158a = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).longValue(), (m) obj2);
        }

        public final m j(long j10, m mVar) {
            return f.x(j10, mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC1623n interfaceC1623n, Object obj, InterfaceC5096o interfaceC5096o) {
        Object objV = interfaceC1623n.V(obj, null, interfaceC5096o);
        if (objV == null) {
            return false;
        }
        interfaceC1623n.U(objV);
        return true;
    }

    static /* synthetic */ boolean C(InterfaceC1623n interfaceC1623n, Object obj, InterfaceC5096o interfaceC5096o, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC5096o = null;
        }
        return B(interfaceC1623n, obj, interfaceC5096o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m x(long j10, m mVar) {
        return new m(j10, mVar, mVar.y(), 0);
    }

    public static final InterfaceC6018h y() {
        return a.f9158a;
    }

    public static final E z() {
        return f9150l;
    }
}
