package L4;

import android.os.SystemClock;
import com.adjust.sdk.Constants;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f11283a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final File f11284b = new File("/proc/self/fd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11285c = 30;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f11286d = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f11287e = true;

    private m() {
    }

    private final boolean a() {
        int i10 = f11285c;
        f11285c = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > f11286d + ((long) Constants.CONNECTION_TIMEOUT_VERIFY);
    }

    public final synchronized boolean b(r rVar) {
        try {
            if (a()) {
                f11285c = 0;
                f11286d = SystemClock.uptimeMillis();
                String[] list = f11284b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z10 = length < 800;
                f11287e = z10;
                if (!z10 && rVar != null && rVar.m() <= 5) {
                    rVar.n("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11287e;
    }
}
