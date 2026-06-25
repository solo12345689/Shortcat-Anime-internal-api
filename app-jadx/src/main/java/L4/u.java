package L4;

import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5502p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f11303a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static InterfaceC5082a f11304b = a.f11305a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11305a = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    private u() {
    }

    public final long a() {
        return ((Number) f11304b.invoke()).longValue();
    }
}
