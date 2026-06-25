package Ya;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0390a f22873c = new C0390a(null);

    /* JADX INFO: renamed from: Ya.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0390a implements Wa.b {
        public /* synthetic */ C0390a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Wa.b
        public String a() {
            return "onDidAppear";
        }

        @Override // Wa.b
        public String getEventName() {
            return "topDidAppear";
        }

        private C0390a() {
        }
    }

    public a(int i10, int i11) {
        super(i10, i11, "topDidAppear", "onDidAppear");
    }
}
