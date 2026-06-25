package i4;

import androidx.work.OverwritingInputMerger;
import i4.u;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends u {

    /* JADX INFO: renamed from: e */
    public static final b f48677e = new b(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(Class workerClass) {
            AbstractC5504s.h(workerClass, "workerClass");
            return (k) new a(workerClass).b();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a builder) {
        super(builder.e(), builder.h(), builder.f());
        AbstractC5504s.h(builder, "builder");
    }

    public static final k e(Class cls) {
        return f48677e.a(cls);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends u.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class workerClass) {
            super(workerClass);
            AbstractC5504s.h(workerClass, "workerClass");
            h().f53946d = OverwritingInputMerger.class.getName();
        }

        @Override // i4.u.a
        /* JADX INFO: renamed from: l */
        public k c() {
            if (d() && h().f53952j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new k(this);
        }

        @Override // i4.u.a
        /* JADX INFO: renamed from: m */
        public a g() {
            return this;
        }
    }
}
