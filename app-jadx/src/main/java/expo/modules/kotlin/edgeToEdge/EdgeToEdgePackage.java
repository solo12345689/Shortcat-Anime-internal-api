package expo.modules.kotlin.edgeToEdge;

import Td.L;
import Td.u;
import Td.v;
import Ud.AbstractC2279u;
import ac.AbstractC2602a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import com.facebook.react.views.view.WindowUtilKt;
import expo.modules.core.BasePackage;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import sb.i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/edgeToEdge/EdgeToEdgePackage;", "Lexpo/modules/core/BasePackage;", "<init>", "()V", "Landroid/content/Context;", "activityContext", "", "Lsb/i;", "b", "(Landroid/content/Context;)Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EdgeToEdgePackage extends BasePackage {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements i {
        a() {
        }

        @Override // sb.i
        public void a(Activity activity, Bundle bundle) {
            Object objB;
            Object objB2;
            Object obj = null;
            try {
                u.a aVar = u.f17466b;
                int i10 = WindowUtilKt.f38480a;
                Class[] clsArr = (Class[]) new ArrayList(0).toArray(new Class[0]);
                Object[] array = new ArrayList(0).toArray(new Object[0]);
                Method declaredMethod = WindowUtilKt.class.getDeclaredMethod("isEdgeToEdgeFeatureFlagOn", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, Arrays.copyOf(array, array.length));
                if (!(objInvoke instanceof Boolean)) {
                    objInvoke = null;
                }
                objB = u.b((Boolean) objInvoke);
            } catch (Throwable th2) {
                u.a aVar2 = u.f17466b;
                objB = u.b(v.a(th2));
            }
            Throwable thE = u.e(objB);
            if (thE != null) {
                Log.e("EdgeToEdgePackage", "Failed to invoke 'isEdgeToEdgeFeatureFlagOn' on com.facebook.react.views.view.WindowUtilKt", thE);
            }
            if (u.g(objB)) {
                objB = null;
            }
            Boolean bool = (Boolean) objB;
            if (bool != null ? bool.booleanValue() : true) {
                Pair[] pairArr = {new Pair(Window.class, activity != null ? activity.getWindow() : null)};
                try {
                    int i11 = WindowUtilKt.f38480a;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add((Class) pairArr[0].c());
                    Class[] clsArr2 = (Class[]) arrayList.toArray(new Class[0]);
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pairArr[0].d());
                    Object[] array2 = arrayList2.toArray(new Object[0]);
                    Method declaredMethod2 = WindowUtilKt.class.getDeclaredMethod("enableEdgeToEdge", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                    declaredMethod2.setAccessible(true);
                    Object objInvoke2 = declaredMethod2.invoke(null, Arrays.copyOf(array2, array2.length));
                    if (objInvoke2 instanceof L) {
                        obj = objInvoke2;
                    }
                    objB2 = u.b((L) obj);
                } catch (Throwable th3) {
                    u.a aVar3 = u.f17466b;
                    objB2 = u.b(v.a(th3));
                }
                Throwable thE2 = u.e(objB2);
                if (thE2 != null) {
                    Log.e("EdgeToEdgePackage", "Failed to invoke 'enableEdgeToEdge' on com.facebook.react.views.view.WindowUtilKt", thE2);
                }
                u.g(objB2);
                if (activity != null) {
                    AbstractC2602a.b(activity);
                }
            }
        }
    }

    @Override // expo.modules.core.BasePackage, sb.g
    public List b(Context activityContext) {
        return AbstractC2279u.e(new a());
    }
}
