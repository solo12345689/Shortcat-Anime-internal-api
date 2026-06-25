package T1;

import Gf.InterfaceC1642x;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function2 f17010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC1642x f17011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final D f17012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Zd.i f17013d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 transform, InterfaceC1642x ack, D d10, Zd.i callerContext) {
            super(null);
            AbstractC5504s.h(transform, "transform");
            AbstractC5504s.h(ack, "ack");
            AbstractC5504s.h(callerContext, "callerContext");
            this.f17010a = transform;
            this.f17011b = ack;
            this.f17012c = d10;
            this.f17013d = callerContext;
        }

        public final InterfaceC1642x a() {
            return this.f17011b;
        }

        public final Zd.i b() {
            return this.f17013d;
        }

        public D c() {
            return this.f17012c;
        }

        public final Function2 d() {
            return this.f17010a;
        }
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w() {
    }
}
