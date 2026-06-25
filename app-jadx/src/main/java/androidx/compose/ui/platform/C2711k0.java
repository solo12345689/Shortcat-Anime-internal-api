package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.compose.ui.platform.k0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2711k0 implements InterfaceC2702h0 {

    /* JADX INFO: renamed from: b */
    public static final C2711k0 f27473b = new C2711k0();

    private C2711k0() {
    }

    @Override // androidx.compose.ui.platform.InterfaceC2702h0
    public Rect a(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (Exception e10) {
            if ((e10 instanceof NoSuchFieldException) || (e10 instanceof NoSuchMethodException) || (e10 instanceof IllegalAccessException) || (e10 instanceof InvocationTargetException)) {
                return C2708j0.f27471b.a(activity);
            }
            throw e10;
        }
    }
}
