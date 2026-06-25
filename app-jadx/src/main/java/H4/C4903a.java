package h4;

import android.util.Log;
import he.AbstractC4945a;
import ie.InterfaceC5082a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: h4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4903a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4903a f47606a = new C4903a();

    private C4903a() {
    }

    public static final boolean e(String str, InterfaceC5082a block) {
        AbstractC5504s.h(block, "block");
        try {
            boolean zBooleanValue = ((Boolean) block.invoke()).booleanValue();
            if (!zBooleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ClassNotFound: ");
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            Log.e("ReflectionGuard", sb2.toString());
            return false;
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("NoSuchMethod: ");
            if (str == null) {
                str = "";
            }
            sb3.append(str);
            Log.e("ReflectionGuard", sb3.toString());
            return false;
        }
    }

    public final boolean a(InterfaceC5082a classLoader) {
        AbstractC5504s.h(classLoader, "classLoader");
        try {
            classLoader.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean b(Method method, Class clazz) {
        AbstractC5504s.h(method, "<this>");
        AbstractC5504s.h(clazz, "clazz");
        return method.getReturnType().equals(clazz);
    }

    public final boolean c(Method method, InterfaceC6014d clazz) {
        AbstractC5504s.h(method, "<this>");
        AbstractC5504s.h(clazz, "clazz");
        return b(method, AbstractC4945a.b(clazz));
    }

    public final boolean d(Method method) {
        AbstractC5504s.h(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}
