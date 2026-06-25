package yd;

import Df.C1271d;
import android.content.Context;
import android.util.Log;
import fe.v;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;

/* JADX INFO: renamed from: yd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7221a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C7221a f64999a = new C7221a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f65000b = C7221a.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f65001c;

    private C7221a() {
    }

    private final d a(Context context, expo.modules.updates.d dVar) {
        d dVar2 = f65001c;
        if (dVar2 != null) {
            return dVar2;
        }
        d dVarD = d(context, dVar);
        f65001c = dVarD;
        return dVarD;
    }

    private final d d(Context context, expo.modules.updates.d dVar) {
        try {
            InputStream inputStreamOpen = context.getAssets().open("app.manifest");
            try {
                AbstractC5504s.e(inputStreamOpen);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, C1271d.f3718b), 8192);
                try {
                    String strE = v.e(bufferedReader);
                    fe.c.a(bufferedReader, null);
                    JSONObject jSONObject = new JSONObject(strE);
                    jSONObject.put("isVerified", true);
                    d dVarA = r.f65055a.a(jSONObject, dVar);
                    fe.c.a(inputStreamOpen, null);
                    return dVarA;
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            Log.e(f65000b, "Could not read embedded manifest", e10);
            throw new AssertionError("The embedded manifest is invalid or could not be read. Make sure you have configured expo-updates correctly in android/app/build.gradle.", e10);
        }
    }

    public final d b(Context context, expo.modules.updates.d configuration) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(configuration, "configuration");
        if (configuration.j()) {
            return a(context, configuration);
        }
        return null;
    }

    public final d c(Context context, expo.modules.updates.d configuration) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(configuration, "configuration");
        if (configuration.o()) {
            return a(context, configuration);
        }
        return null;
    }
}
