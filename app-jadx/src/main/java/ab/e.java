package ab;

import E6.f;
import Td.L;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import w5.C6944a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends I5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f23916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f23917c;

        a(Context context, Function1 function1, Uri uri) {
            this.f23915a = context;
            this.f23916b = function1;
            this.f23917c = uri;
        }

        @Override // I5.b
        protected void e(I5.c dataSource) {
            AbstractC5504s.h(dataSource, "dataSource");
            Log.e("[RNScreens]", "Error loading image: " + this.f23917c, dataSource.c());
        }

        @Override // I5.b
        protected void f(I5.c dataSource) {
            C5.a aVar;
            AbstractC5504s.h(dataSource, "dataSource");
            if (dataSource.isFinished() && (aVar = (C5.a) dataSource.a()) != null) {
                Object objC = aVar.C();
                AbstractC5504s.g(objC, "get(...)");
                E6.e eVar = (E6.e) objC;
                if (eVar instanceof f) {
                    Bitmap bitmapG1 = ((f) eVar).G1();
                    AbstractC5504s.g(bitmapG1, "getUnderlyingBitmap(...)");
                    Resources resources = this.f23915a.getResources();
                    AbstractC5504s.g(resources, "getResources(...)");
                    this.f23916b.invoke(new BitmapDrawable(resources, bitmapG1));
                }
                aVar.close();
            }
        }
    }

    public static final void c(Context context, String uri, final com.swmansion.rnscreens.gamma.tabs.a view) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(uri, "uri");
        AbstractC5504s.h(view, "view");
        Uri uriC = new C2599a(context, uri).c(context);
        if (uriC == null) {
            return;
        }
        f(context, uriC, new Function1() { // from class: ab.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.d(view, (Drawable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L d(final com.swmansion.rnscreens.gamma.tabs.a aVar, final Drawable drawable) {
        AbstractC5504s.h(drawable, "drawable");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ab.d
            @Override // java.lang.Runnable
            public final void run() {
                e.e(aVar, drawable);
            }
        });
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.swmansion.rnscreens.gamma.tabs.a aVar, Drawable drawable) {
        aVar.setIcon(drawable);
    }

    private static final void f(Context context, Uri uri, Function1 function1) {
        O5.d.a().k(K6.c.x(uri).a(), context).f(new a(context, function1, uri), C6944a.b());
    }
}
