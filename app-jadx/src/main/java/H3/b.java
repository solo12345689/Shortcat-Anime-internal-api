package H3;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7905a = new b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7906a = new a();

        private a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* JADX INFO: renamed from: H3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0101b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0101b f7907a = new C0101b();

        private C0101b() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private b() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C0101b.f7907a.a();
        }
        return 0;
    }

    public final int b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return a.f7906a.a();
        }
        return 0;
    }
}
