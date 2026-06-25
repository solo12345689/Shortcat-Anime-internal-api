package Ya;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22874c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Wa.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Wa.b
        public String a() {
            return "onDidDisappear";
        }

        @Override // Wa.b
        public String getEventName() {
            return "topDidDisappear";
        }

        private a() {
        }
    }

    public b(int i10, int i11) {
        super(i10, i11, "topDidDisappear", "onDidDisappear");
    }
}
