package F8;

import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzft;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static List f6564h = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Set f6566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6567g;

    public b(zzbv zzbvVar) {
        super(zzbvVar);
        this.f6566f = new HashSet();
    }

    public static void c() {
        synchronized (b.class) {
            try {
                List list = f6564h;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    f6564h = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(boolean z10) {
        this.f6567g = z10;
    }

    public final void d() {
        zzft zzftVarZzq = a().zzq();
        zzftVarZzq.zzf();
        if (zzftVarZzq.zze()) {
            b(zzftVarZzq.zzc());
        }
        zzftVarZzq.zzf();
        this.f6565e = true;
    }
}
