package a4;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.O;

/* JADX INFO: renamed from: a4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2570e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2570e f23774a = new C2570e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f23775b = O.b(C2570e.class).v();

    private C2570e() {
    }

    public final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (C2568c.f23766a.a() != EnumC2575j.LOG) {
                return 0;
            }
            Log.d(f23775b, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (C2568c.f23766a.a() != EnumC2575j.LOG) {
                return 0;
            }
            Log.d(f23775b, "Stub Extension");
            return 0;
        }
    }
}
