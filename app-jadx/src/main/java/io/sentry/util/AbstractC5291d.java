package io.sentry.util;

import io.sentry.C5205g3;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* JADX INFO: renamed from: io.sentry.util.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5291d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f51421a = "sentry-debug-meta.properties";

    public static void a(C5322z3 c5322z3, List list) {
        if (list != null) {
            f(c5322z3, list);
            b(c5322z3, list);
            d(c5322z3, list);
        }
    }

    private static void b(C5322z3 c5322z3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Properties properties = (Properties) it.next();
            String strG = g(properties);
            if (strG != null) {
                String strH = h(properties);
                if (strH == null) {
                    strH = "unknown";
                }
                c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Build tool found: %s, version %s", strG, strH);
                C5205g3.d().b(strG, strH);
                return;
            }
        }
    }

    private static void c(C5322z3 c5322z3, List list) {
        if (c5322z3.getBundleIds().isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Bundle IDs found: %s", property);
                if (property != null) {
                    for (String str : property.split(com.amazon.a.a.o.b.f.f34694a, -1)) {
                        c5322z3.addBundleId(str);
                    }
                }
            }
        }
    }

    private static void d(C5322z3 c5322z3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Properties properties = (Properties) it.next();
            String strK = k(properties);
            String strL = l(properties);
            String strI = i(properties);
            String strJ = j(properties);
            if (strK != null || strL != null || strI != null || strJ != null) {
                C5322z3.g distribution = c5322z3.getDistribution();
                if (strK != null && !strK.isEmpty() && distribution.f51572b.isEmpty()) {
                    c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Distribution org slug found: %s", strK);
                    distribution.f51572b = strK;
                }
                if (strL != null && !strL.isEmpty() && distribution.f51573c.isEmpty()) {
                    c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Distribution project slug found: %s", strL);
                    distribution.f51573c = strL;
                }
                if (strI != null && !strI.isEmpty() && distribution.f51571a.isEmpty()) {
                    c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Distribution org auth token found", new Object[0]);
                    distribution.f51571a = strI;
                }
                if (strJ == null || strJ.isEmpty() || distribution.f51575e != null) {
                    return;
                }
                c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Distribution build configuration found: %s", strJ);
                distribution.f51575e = strJ;
                return;
            }
        }
    }

    private static void e(C5322z3 c5322z3, List list) {
        if (c5322z3.getProguardUuid() == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strM = m((Properties) it.next());
                if (strM != null) {
                    c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Proguard UUID found: %s", strM);
                    c5322z3.setProguardUuid(strM);
                    return;
                }
            }
        }
    }

    public static void f(C5322z3 c5322z3, List list) {
        if (list != null) {
            c(c5322z3, list);
            e(c5322z3, list);
        }
    }

    public static String g(Properties properties) {
        return properties.getProperty("io.sentry.build-tool");
    }

    public static String h(Properties properties) {
        return properties.getProperty("io.sentry.build-tool-version");
    }

    private static String i(Properties properties) {
        return properties.getProperty("io.sentry.distribution.auth-token");
    }

    private static String j(Properties properties) {
        return properties.getProperty("io.sentry.distribution.build-configuration");
    }

    private static String k(Properties properties) {
        return properties.getProperty("io.sentry.distribution.org-slug");
    }

    private static String l(Properties properties) {
        return properties.getProperty("io.sentry.distribution.project-slug");
    }

    public static String m(Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
