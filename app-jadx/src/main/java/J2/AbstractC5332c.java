package j2;

import Td.InterfaceC2154e;
import Td.u;
import Td.v;
import Y.AbstractC2394b1;
import Y.H;
import androidx.lifecycle.r;
import ie.InterfaceC5082a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: j2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5332c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC2394b1 f51613a;

    static {
        Object objB;
        AbstractC2394b1 abstractC2394b1;
        try {
            u.a aVar = u.f17466b;
            ClassLoader classLoader = r.class.getClassLoader();
            AbstractC5504s.e(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC2394b1) {
                        abstractC2394b1 = (AbstractC2394b1) objInvoke;
                    }
                } else if (annotations[i10] instanceof InterfaceC2154e) {
                    break;
                } else {
                    i10++;
                }
            }
            abstractC2394b1 = null;
            objB = u.b(abstractC2394b1);
        } catch (Throwable th2) {
            u.a aVar2 = u.f17466b;
            objB = u.b(v.a(th2));
        }
        AbstractC2394b1 abstractC2394b1J = (AbstractC2394b1) (u.g(objB) ? null : objB);
        if (abstractC2394b1J == null) {
            abstractC2394b1J = H.j(new InterfaceC5082a() { // from class: j2.b
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return AbstractC5332c.b();
                }
            });
        }
        f51613a = abstractC2394b1J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r b() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }

    public static final AbstractC2394b1 c() {
        return f51613a;
    }
}
