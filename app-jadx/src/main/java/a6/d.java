package A6;

import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends A6.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f317j = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final I5.c a(d0 producer, l0 settableProducerContext, G6.d listener) {
            AbstractC5504s.h(producer, "producer");
            AbstractC5504s.h(settableProducerContext, "settableProducerContext");
            AbstractC5504s.h(listener, "listener");
            return new d(producer, settableProducerContext, listener, null);
        }

        private a() {
        }
    }

    public /* synthetic */ d(d0 d0Var, l0 l0Var, G6.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, l0Var, dVar);
    }

    private d(d0 d0Var, l0 l0Var, G6.d dVar) {
        super(d0Var, l0Var, dVar);
    }
}
