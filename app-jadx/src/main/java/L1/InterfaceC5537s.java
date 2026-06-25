package l1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: l1.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5537s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f52510a = b.f52511a;

    /* JADX INFO: renamed from: l1.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a extends InterfaceC5537s {
    }

    /* JADX INFO: renamed from: l1.s$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f52511a = new b();

        private b() {
        }

        public final a a() {
            return new C5538t("spread");
        }

        public final a b() {
            return new C5538t("preferWrap");
        }

        public final InterfaceC5537s c() {
            return new C5538t("wrap");
        }

        public final InterfaceC5537s d(float f10) {
            return new C5538t(f10, (DefaultConstructorMarker) null);
        }
    }
}
