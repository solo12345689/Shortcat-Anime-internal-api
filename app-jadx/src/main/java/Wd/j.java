package wd;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rd.C6306a;
import yd.C7221a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f63061a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63062b = j.class.getSimpleName();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final byte[] a(C6306a asset, File destination, Context context) {
        AbstractC5504s.h(asset, "asset");
        AbstractC5504s.h(destination, "destination");
        AbstractC5504s.h(context, "context");
        if (asset.b() != null) {
            return b(asset, destination, context);
        }
        if (asset.n() != null && asset.o() != null) {
            return c(asset, destination, context);
        }
        throw new AssertionError("Failed to copy embedded asset " + asset.j() + " from APK assets or resources because not enough information was provided.");
    }

    public final byte[] b(C6306a asset, File destination, Context context) throws Exception {
        AbstractC5504s.h(asset, "asset");
        AbstractC5504s.h(destination, "destination");
        AbstractC5504s.h(context, "context");
        try {
            AssetManager assets = context.getAssets();
            String strB = asset.b();
            AbstractC5504s.e(strB);
            InputStream inputStreamOpen = assets.open(strB);
            try {
                expo.modules.updates.g gVar = expo.modules.updates.g.f46458a;
                AbstractC5504s.e(inputStreamOpen);
                byte[] bArrL = gVar.l(inputStreamOpen, destination, null);
                fe.c.a(inputStreamOpen, null);
                return bArrL;
            } finally {
            }
        } catch (Exception e10) {
            Log.e(f63062b, "Failed to copy asset " + asset.b(), e10);
            throw e10;
        }
    }

    public final byte[] c(C6306a asset, File destination, Context context) throws Exception {
        AbstractC5504s.h(asset, "asset");
        AbstractC5504s.h(destination, "destination");
        AbstractC5504s.h(context, "context");
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(context.getResources().getIdentifier(asset.n(), asset.o(), context.getPackageName()));
            try {
                expo.modules.updates.g gVar = expo.modules.updates.g.f46458a;
                AbstractC5504s.e(inputStreamOpenRawResource);
                byte[] bArrL = gVar.l(inputStreamOpenRawResource, destination, null);
                fe.c.a(inputStreamOpenRawResource, null);
                return bArrL;
            } finally {
            }
        } catch (Exception e10) {
            Log.e(f63062b, "Failed to copy resource asset " + asset.o() + "/" + asset.b(), e10);
            throw e10;
        }
    }

    public final boolean d(Context context, File file, String str) {
        AbstractC5504s.h(context, "context");
        if (str == null) {
            return false;
        }
        if (Dd.a.f3689a.d(context, str)) {
            return true;
        }
        return new File(file, str).exists();
    }

    public final yd.q e(Context context, expo.modules.updates.d configuration) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(configuration, "configuration");
        return C7221a.f64999a.b(context, configuration);
    }
}
