package io.sentry.config;

import io.sentry.e4;
import java.util.ArrayList;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static f a() {
        Properties propertiesA;
        Properties propertiesA2;
        e4 e4Var = new e4();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i());
        arrayList.add(new d());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (propertiesA2 = new e(property, e4Var).a()) != null) {
            arrayList.add(new h(propertiesA2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (propertiesA = new e(str, e4Var).a()) != null) {
            arrayList.add(new h(propertiesA));
        }
        Properties propertiesA3 = new b(e4Var).a();
        if (propertiesA3 != null) {
            arrayList.add(new h(propertiesA3));
        }
        Properties propertiesA4 = new e("sentry.properties", e4Var, false).a();
        if (propertiesA4 != null) {
            arrayList.add(new h(propertiesA4));
        }
        return new c(arrayList);
    }
}
