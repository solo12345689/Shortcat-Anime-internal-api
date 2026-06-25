package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import t.C6551a;

/* JADX INFO: renamed from: com.google.firebase.messaging.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3967e {

    /* JADX INFO: renamed from: a */
    public static final long f43430a = TimeUnit.MINUTES.toMillis(3);

    /* JADX INFO: renamed from: com.google.firebase.messaging.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static C6551a a(Bundle bundle) {
            C6551a c6551a = new C6551a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c6551a.put(str, str2);
                    }
                }
            }
            return c6551a;
        }
    }
}
