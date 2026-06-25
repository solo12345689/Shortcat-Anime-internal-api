package Cd;

import java.util.Date;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cd.f f3038a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends e {
        public a() {
            super(Cd.f.f3047d, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends e {
        public b() {
            super(Cd.f.f3048e, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Date f3039b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Date commitTime) {
            super(Cd.f.f3049f, null);
            AbstractC5504s.h(commitTime, "commitTime");
            this.f3039b = commitTime;
        }

        public final Date b() {
            return this.f3039b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSONObject f3040b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONObject manifest) {
            super(Cd.f.f3049f, null);
            AbstractC5504s.h(manifest, "manifest");
            this.f3040b = manifest;
        }

        public final JSONObject b() {
            return this.f3040b;
        }
    }

    /* JADX INFO: renamed from: Cd.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0035e extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f3041b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0035e(String errorMessage) {
            super(Cd.f.f3050g, null);
            AbstractC5504s.h(errorMessage, "errorMessage");
            this.f3041b = errorMessage;
        }

        public final Cd.d b() {
            return new Cd.d(this.f3041b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends e {
        public f() {
            super(Cd.f.f3051h, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends e {
        public g() {
            super(Cd.f.f3053j, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends e {
        public h() {
            super(Cd.f.f3053j, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSONObject f3042b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(JSONObject manifest) {
            super(Cd.f.f3053j, null);
            AbstractC5504s.h(manifest, "manifest");
            this.f3042b = manifest;
        }

        public final JSONObject b() {
            return this.f3042b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f3043b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String errorMessage) {
            super(Cd.f.f3054k, null);
            AbstractC5504s.h(errorMessage, "errorMessage");
            this.f3043b = errorMessage;
        }

        public final Cd.d b() {
            return new Cd.d(this.f3043b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f3044b;

        public k(double d10) {
            super(Cd.f.f3052i, null);
            this.f3044b = d10;
        }

        public final double b() {
            return this.f3044b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l extends e {
        public l() {
            super(Cd.f.f3046c, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m extends e {
        public m() {
            super(Cd.f.f3055l, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n extends e {
        public n() {
            super(Cd.f.f3045b, null);
        }
    }

    public /* synthetic */ e(Cd.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    public final Cd.f a() {
        return this.f3038a;
    }

    private e(Cd.f fVar) {
        this.f3038a = fVar;
    }
}
