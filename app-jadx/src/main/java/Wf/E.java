package Wf;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"LWf/E;", "LWf/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "d", "()Z", "isString", "b", "content", "Companion", "a", "LWf/v;", "LWf/z;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class E extends i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: Wf.E$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        private Companion() {
        }

        public final Rf.b serializer() {
            return F.f20888a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ E(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String b();

    public abstract boolean d();

    public String toString() {
        return b();
    }

    private E() {
        super(null);
    }
}
