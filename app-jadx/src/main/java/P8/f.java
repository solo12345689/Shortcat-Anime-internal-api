package P8;

import Q8.InterfaceC2056d;
import Q8.InterfaceC2064l;
import Q8.InterfaceC2067o;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f13569a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a extends InterfaceC2056d {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b extends InterfaceC2064l {
    }

    public static Set c() {
        Set set = f13569a;
        synchronized (set) {
        }
        return set;
    }

    public abstract com.google.android.gms.common.api.internal.a a(com.google.android.gms.common.api.internal.a aVar);

    public abstract com.google.android.gms.common.api.internal.a b(com.google.android.gms.common.api.internal.a aVar);

    public abstract Looper d();

    public boolean e(InterfaceC2067o interfaceC2067o) {
        throw new UnsupportedOperationException();
    }

    public void f() {
        throw new UnsupportedOperationException();
    }
}
