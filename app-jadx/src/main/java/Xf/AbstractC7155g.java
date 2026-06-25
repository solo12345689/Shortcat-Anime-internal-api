package xf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xf.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7155g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f64477a;

    /* JADX INFO: renamed from: xf.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC7155g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f64478b = new a();

        private a() {
            super(false, null);
        }
    }

    /* JADX INFO: renamed from: xf.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC7155g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f64479b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String error) {
            super(false, null);
            AbstractC5504s.h(error, "error");
            this.f64479b = error;
        }
    }

    /* JADX INFO: renamed from: xf.g$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC7155g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f64480b = new c();

        private c() {
            super(true, null);
        }
    }

    public /* synthetic */ AbstractC7155g(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    public final boolean a() {
        return this.f64477a;
    }

    private AbstractC7155g(boolean z10) {
        this.f64477a = z10;
    }
}
