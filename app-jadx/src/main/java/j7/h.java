package j7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f51682a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f51683b = new h();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private h() {
    }

    @Override // j7.g
    public boolean a() {
        return false;
    }

    @Override // j7.g
    public int b() {
        throw new IllegalStateException("Should not retrieve delay as canRetry is: " + a());
    }

    @Override // j7.g
    public g c() {
        throw new IllegalStateException("Should not update as canRetry is: " + a());
    }

    @Override // j7.g
    public g copy() {
        return this;
    }
}
