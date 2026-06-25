package l1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: l1.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5518F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f52416b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C5518F f52417c = new C5518F("visible");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C5518F f52418d = new C5518F("invisible");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C5518F f52419e = new C5518F("gone");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f52420a;

    /* JADX INFO: renamed from: l1.F$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5518F a() {
            return C5518F.f52417c;
        }

        private a() {
        }
    }

    public C5518F(String str) {
        this.f52420a = str;
    }

    public final String b() {
        return this.f52420a;
    }
}
