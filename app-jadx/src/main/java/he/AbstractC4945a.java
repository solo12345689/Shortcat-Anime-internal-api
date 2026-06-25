package he;

import com.adjust.sdk.Constants;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.InterfaceC5494h;
import kotlin.jvm.internal.O;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: he.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4945a {
    public static final InterfaceC6014d a(Annotation annotation) {
        AbstractC5504s.h(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        AbstractC5504s.g(clsAnnotationType, "annotationType(...)");
        InterfaceC6014d interfaceC6014dE = e(clsAnnotationType);
        AbstractC5504s.f(interfaceC6014dE, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return interfaceC6014dE;
    }

    public static final Class b(InterfaceC6014d interfaceC6014d) {
        AbstractC5504s.h(interfaceC6014d, "<this>");
        Class clsJ = ((InterfaceC5494h) interfaceC6014d).j();
        AbstractC5504s.f(clsJ, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsJ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class c(InterfaceC6014d interfaceC6014d) {
        AbstractC5504s.h(interfaceC6014d, "<this>");
        Class clsJ = ((InterfaceC5494h) interfaceC6014d).j();
        if (!clsJ.isPrimitive()) {
            AbstractC5504s.f(clsJ, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsJ;
        }
        String name = clsJ.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsJ = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsJ = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsJ = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsJ = Character.class;
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    clsJ = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsJ = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsJ = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsJ = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsJ = Short.class;
                }
                break;
        }
        AbstractC5504s.f(clsJ, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsJ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class d(InterfaceC6014d interfaceC6014d) {
        AbstractC5504s.h(interfaceC6014d, "<this>");
        Class clsJ = ((InterfaceC5494h) interfaceC6014d).j();
        if (clsJ.isPrimitive()) {
            AbstractC5504s.f(clsJ, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return clsJ;
        }
        String name = clsJ.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final InterfaceC6014d e(Class cls) {
        AbstractC5504s.h(cls, "<this>");
        return O.b(cls);
    }
}
