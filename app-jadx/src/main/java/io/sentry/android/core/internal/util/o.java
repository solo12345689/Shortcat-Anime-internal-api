package io.sentry.android.core.internal.util;

import io.sentry.InterfaceC5192e0;
import io.sentry.util.AbstractC5296i;
import io.sentry.util.C5288a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o f49908c = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5288a f49909a = new C5288a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f49910b = new ArrayList();

    private o() {
    }

    public static o a() {
        return f49908c;
    }

    String b() {
        return "/sys/devices/system/cpu";
    }

    public List c() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49909a.a();
        try {
            if (!this.f49910b.isEmpty()) {
                List list = this.f49910b;
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return list;
            }
            File[] fileArrListFiles = new File(b()).listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList = new ArrayList();
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return arrayList;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String strC = AbstractC5296i.c(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (strC != null) {
                            this.f49910b.add(Integer.valueOf((int) (Long.parseLong(strC.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            List list2 = this.f49910b;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return list2;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
