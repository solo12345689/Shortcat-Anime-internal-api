package Xf;

import Tf.l;
import Wf.AbstractC2358b;
import Wf.EnumC2357a;
import Wf.InterfaceC2362f;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class S {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21940a;

        static {
            int[] iArr = new int[EnumC2357a.values().length];
            try {
                iArr[EnumC2357a.f20890a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2357a.f20892c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2357a.f20891b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21940a = iArr;
        }
    }

    public static final void b(Tf.l kind) {
        AbstractC5504s.h(kind, "kind");
        if (kind instanceof l.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof Tf.d) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof Tf.c) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(Tf.e eVar, AbstractC2358b json) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(json, "json");
        for (Annotation annotation : eVar.getAnnotations()) {
            if (annotation instanceof InterfaceC2362f) {
                return ((InterfaceC2362f) annotation).discriminator();
            }
        }
        return json.f().e();
    }

    public static final void d(Rf.k kVar, Rf.k kVar2, String str) {
        if ((kVar instanceof Rf.h) && Vf.K.a(kVar2.getDescriptor()).contains(str)) {
            String strO = ((Rf.h) kVar).getDescriptor().o();
            throw new IllegalStateException(("Sealed class '" + kVar2.getDescriptor().o() + "' cannot be serialized as base class '" + strO + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
