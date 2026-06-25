package Y9;

import R8.AbstractC2115p;
import X9.e;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C3632z1;
import i9.C5045a;
import ja.C5356a;
import ja.InterfaceC5359d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f22868c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C5045a f22869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f22870b;

    b(C5045a c5045a) {
        AbstractC2115p.l(c5045a);
        this.f22869a = c5045a;
        this.f22870b = new ConcurrentHashMap();
    }

    public static a c(e eVar, Context context, InterfaceC5359d interfaceC5359d) {
        AbstractC2115p.l(eVar);
        AbstractC2115p.l(context);
        AbstractC2115p.l(interfaceC5359d);
        AbstractC2115p.l(context.getApplicationContext());
        if (f22868c == null) {
            synchronized (b.class) {
                try {
                    if (f22868c == null) {
                        Bundle bundle = new Bundle(1);
                        if (eVar.x()) {
                            interfaceC5359d.a(X9.b.class, d.f22872a, c.f22871a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", eVar.w());
                        }
                        f22868c = new b(C3632z1.s(context, bundle).t());
                    }
                } finally {
                }
            }
        }
        return f22868c;
    }

    static /* synthetic */ void d(C5356a c5356a) {
        boolean z10 = ((X9.b) c5356a.a()).f21692a;
        synchronized (b.class) {
            ((b) AbstractC2115p.l(f22868c)).f22869a.c(z10);
        }
    }

    @Override // Y9.a
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.b(str2, bundle) && com.google.firebase.analytics.connector.internal.b.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f22869a.a(str, str2, bundle);
        }
    }

    @Override // Y9.a
    public void b(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.c(str, str2)) {
            this.f22869a.b(str, str2, obj);
        }
    }
}
