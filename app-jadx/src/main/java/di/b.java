package di;

import java.lang.reflect.InvocationTargetException;
import org.greenrobot.eventbus.android.AndroidComponentsImpl;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static boolean a() {
        try {
            int i10 = AndroidComponentsImpl.f55650d;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static a b() {
        try {
            int i10 = AndroidComponentsImpl.f55650d;
            return (a) AndroidComponentsImpl.class.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean c() {
        try {
            return Class.forName("android.os.Looper").getDeclaredMethod("getMainLooper", null).invoke(null, null) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}
