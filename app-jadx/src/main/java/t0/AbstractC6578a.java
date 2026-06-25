package t0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: t0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6578a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f60188b = new d(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC6578a f60189c = new C0904a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC6578a f60190d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC6578a f60191e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f60192a;

    /* JADX INFO: renamed from: t0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0904a extends AbstractC6578a {
        C0904a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* JADX INFO: renamed from: t0.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC6578a {
        b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* JADX INFO: renamed from: t0.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC6578a {
        c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* JADX INFO: renamed from: t0.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC6578a a() {
            return AbstractC6578a.f60189c;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC6578a(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    public final float[] b() {
        return this.f60192a;
    }

    private AbstractC6578a(float[] fArr) {
        this.f60192a = fArr;
    }
}
