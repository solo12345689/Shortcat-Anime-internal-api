package o2;

import androidx.lifecycle.U;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: o2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5806e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5806e f54230a = new C5806e();

    private C5806e() {
    }

    public final U a(Class modelClass) throws InvocationTargetException {
        AbstractC5504s.h(modelClass, "modelClass");
        try {
            Constructor declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + modelClass);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                AbstractC5504s.e(objNewInstance);
                return (U) objNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
            }
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
        }
    }
}
