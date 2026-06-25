package Vf;

import Td.C2160k;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: Vf.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2320c {
    public static final Void a(String str, InterfaceC6014d baseClass) {
        String str2;
        AbstractC5504s.h(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.v() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + com.amazon.a.a.o.c.a.b.f34706a;
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.v() + "' has to be sealed and '@Serializable'.";
        }
        throw new Rf.j(str2);
    }

    public static final Void b(InterfaceC6014d subClass, InterfaceC6014d baseClass) {
        AbstractC5504s.h(subClass, "subClass");
        AbstractC5504s.h(baseClass, "baseClass");
        String strV = subClass.v();
        if (strV == null) {
            strV = String.valueOf(subClass);
        }
        a(strV, baseClass);
        throw new C2160k();
    }
}
