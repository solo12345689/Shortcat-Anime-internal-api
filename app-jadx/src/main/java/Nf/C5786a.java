package nf;

import Df.r;
import Ze.g;
import Ze.i;
import kotlin.jvm.internal.AbstractC5504s;
import lf.AbstractC5594a;

/* JADX INFO: renamed from: nf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5786a extends AbstractC5594a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C5786a f54129r = new C5786a();

    /* JADX WARN: Illegal instructions before constructor call */
    private C5786a() {
        g gVarD = g.d();
        Te.b.a(gVarD);
        AbstractC5504s.g(gVarD, "apply(...)");
        i.f packageFqName = Te.b.f17483a;
        AbstractC5504s.g(packageFqName, "packageFqName");
        i.f constructorAnnotation = Te.b.f17485c;
        AbstractC5504s.g(constructorAnnotation, "constructorAnnotation");
        i.f classAnnotation = Te.b.f17484b;
        AbstractC5504s.g(classAnnotation, "classAnnotation");
        i.f functionAnnotation = Te.b.f17486d;
        AbstractC5504s.g(functionAnnotation, "functionAnnotation");
        i.f propertyAnnotation = Te.b.f17487e;
        AbstractC5504s.g(propertyAnnotation, "propertyAnnotation");
        i.f propertyGetterAnnotation = Te.b.f17488f;
        AbstractC5504s.g(propertyGetterAnnotation, "propertyGetterAnnotation");
        i.f propertySetterAnnotation = Te.b.f17489g;
        AbstractC5504s.g(propertySetterAnnotation, "propertySetterAnnotation");
        i.f enumEntryAnnotation = Te.b.f17491i;
        AbstractC5504s.g(enumEntryAnnotation, "enumEntryAnnotation");
        i.f compileTimeValue = Te.b.f17490h;
        AbstractC5504s.g(compileTimeValue, "compileTimeValue");
        i.f parameterAnnotation = Te.b.f17492j;
        AbstractC5504s.g(parameterAnnotation, "parameterAnnotation");
        i.f typeAnnotation = Te.b.f17493k;
        AbstractC5504s.g(typeAnnotation, "typeAnnotation");
        i.f typeParameterAnnotation = Te.b.f17494l;
        AbstractC5504s.g(typeParameterAnnotation, "typeParameterAnnotation");
        super(gVarD, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, null, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, null, null, null, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    private final String s(Xe.c cVar) {
        if (cVar.c()) {
            return "default-package";
        }
        String strB = cVar.f().b();
        AbstractC5504s.g(strB, "asString(...)");
        return strB;
    }

    public final String q(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return s(fqName) + ".kotlin_builtins";
    }

    public final String r(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return r.J(fqName.a(), com.amazon.a.a.o.c.a.b.f34706a, '/', false, 4, null) + '/' + q(fqName);
    }
}
