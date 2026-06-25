package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f24243a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f24244b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C f24245c;

    public static final void a(AbstractActivityC2640j abstractActivityC2640j, M statusBarStyle, M navigationBarStyle) {
        AbstractC5504s.h(abstractActivityC2640j, "<this>");
        AbstractC5504s.h(statusBarStyle, "statusBarStyle");
        AbstractC5504s.h(navigationBarStyle, "navigationBarStyle");
        View decorView = abstractActivityC2640j.getWindow().getDecorView();
        AbstractC5504s.g(decorView, "window.decorView");
        Function1 function1B = statusBarStyle.b();
        Resources resources = decorView.getResources();
        AbstractC5504s.g(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) function1B.invoke(resources)).booleanValue();
        Function1 function1B2 = navigationBarStyle.b();
        Resources resources2 = decorView.getResources();
        AbstractC5504s.g(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) function1B2.invoke(resources2)).booleanValue();
        C a10 = f24245c;
        if (a10 == null) {
            int i10 = Build.VERSION.SDK_INT;
            a10 = i10 >= 30 ? new A() : i10 >= 29 ? new z() : i10 >= 28 ? new w() : i10 >= 26 ? new u() : new t();
        }
        C c10 = a10;
        Window window = abstractActivityC2640j.getWindow();
        AbstractC5504s.g(window, "window");
        c10.b(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = abstractActivityC2640j.getWindow();
        AbstractC5504s.g(window2, "window");
        c10.a(window2);
    }

    public static /* synthetic */ void b(AbstractActivityC2640j abstractActivityC2640j, M m10, M m11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            m10 = M.a.b(M.f24195e, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            m11 = M.a.b(M.f24195e, f24243a, f24244b, null, 4, null);
        }
        a(abstractActivityC2640j, m10, m11);
    }
}
