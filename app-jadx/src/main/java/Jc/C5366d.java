package jc;

import Df.r;
import Td.AbstractC2163n;
import Td.L;
import Td.z;
import Ud.S;
import cc.k;
import cc.l;
import cc.w;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import ec.EnumC4666a;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import ie.InterfaceC5082a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.AbstractC5990u;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6016f;
import pe.InterfaceC6025o;
import pe.InterfaceC6027q;
import qe.AbstractC6173c;
import rb.AbstractC6300a;

/* JADX INFO: renamed from: jc.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5366d extends AbstractC5990u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X f51740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6027q f51741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Xb.e f51742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f51743d;

    /* JADX INFO: renamed from: jc.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final expo.modules.kotlin.types.b f51744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC5363a f51745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f51746c;

        public a(expo.modules.kotlin.types.b typeConverter, InterfaceC5363a fieldAnnotation, boolean z10) {
            AbstractC5504s.h(typeConverter, "typeConverter");
            AbstractC5504s.h(fieldAnnotation, "fieldAnnotation");
            this.f51744a = typeConverter;
            this.f51745b = fieldAnnotation;
            this.f51746c = z10;
        }

        public final InterfaceC5363a a() {
            return this.f51745b;
        }

        public final expo.modules.kotlin.types.b b() {
            return this.f51744a;
        }

        public final boolean c() {
            return this.f51746c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(this.f51744a, aVar.f51744a) && AbstractC5504s.c(this.f51745b, aVar.f51745b) && this.f51746c == aVar.f51746c;
        }

        public int hashCode() {
            return (((this.f51744a.hashCode() * 31) + this.f51745b.hashCode()) * 31) + Boolean.hashCode(this.f51746c);
        }

        public String toString() {
            return "PropertyDescriptor(typeConverter=" + this.f51744a + ", fieldAnnotation=" + this.f51745b + ", isRequired=" + this.f51746c + ")";
        }
    }

    public C5366d(X converterProvider, InterfaceC6027q type) {
        AbstractC5504s.h(converterProvider, "converterProvider");
        AbstractC5504s.h(type, "type");
        this.f51740a = converterProvider;
        this.f51741b = type;
        this.f51742c = new Xb.e();
        this.f51743d = AbstractC2163n.b(new InterfaceC5082a() { // from class: jc.c
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C5366d.p(this.f51739a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5364b l(ReadableMap readableMap, Ub.d dVar, boolean z10) throws l {
        k kVar;
        InterfaceC6016f interfaceC6016fC = this.f51741b.c();
        AbstractC5504s.f(interfaceC6016fC, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Object objA = m((InterfaceC6014d) interfaceC6016fC).a();
        for (Map.Entry entry : n().entrySet()) {
            InterfaceC6025o interfaceC6025o = (InterfaceC6025o) entry.getKey();
            a aVar = (a) entry.getValue();
            String strKey = aVar.a().key();
            if (r.l0(strKey)) {
                strKey = null;
            }
            if (strKey == null) {
                strKey = interfaceC6025o.getName();
            }
            if (readableMap.hasKey(strKey)) {
                Dynamic dynamic = readableMap.getDynamic(strKey);
                try {
                    Field fieldB = re.c.b(interfaceC6025o);
                    AbstractC5504s.e(fieldB);
                    try {
                        Object objA2 = aVar.b().a(dynamic, dVar, z10);
                        fieldB.setAccessible(true);
                        fieldB.set(objA, objA2);
                        L l10 = L.f17438a;
                    } finally {
                    }
                } finally {
                    dynamic.recycle();
                }
            } else if (aVar.c()) {
                throw new l(interfaceC6025o);
            }
        }
        AbstractC5504s.f(objA, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter");
        return (InterfaceC5364b) objA;
    }

    private final Xb.a m(InterfaceC6014d interfaceC6014d) {
        return this.f51742c.d(interfaceC6014d);
    }

    private final Map n() {
        return (Map) this.f51743d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map p(C5366d c5366d) {
        Object objA;
        Object next;
        InterfaceC6016f interfaceC6016fC = c5366d.f51741b.c();
        AbstractC5504s.f(interfaceC6016fC, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Collection<InterfaceC6025o> collectionB = AbstractC6173c.b((InterfaceC6014d) interfaceC6016fC);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC6025o interfaceC6025o : collectionB) {
            Iterator it = interfaceC6025o.getAnnotations().iterator();
            while (true) {
                objA = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Annotation) next) instanceof InterfaceC5363a) {
                    break;
                }
            }
            InterfaceC5363a interfaceC5363a = (InterfaceC5363a) next;
            if (interfaceC5363a != null) {
                expo.modules.kotlin.types.b bVarA = c5366d.f51740a.a(interfaceC6025o.getReturnType());
                Iterator it2 = interfaceC6025o.getAnnotations().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((Annotation) next2) instanceof InterfaceC5367e) {
                        objA = next2;
                        break;
                    }
                }
                objA = z.a(interfaceC6025o, new a(bVarA, interfaceC5363a, ((InterfaceC5367e) objA) != null));
            }
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return S.w(arrayList);
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(EnumC4666a.f45840m);
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC5364b e(Object value, Ub.d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        return value instanceof ReadableMap ? l((ReadableMap) value, dVar, z10) : value instanceof Map ? k((Map) value, dVar, z10) : (InterfaceC5364b) value;
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public InterfaceC5364b f(Dynamic value, Ub.d dVar, boolean z10) throws w {
        CodedException unexpectedException;
        AbstractC5504s.h(value, "value");
        try {
            ReadableMap readableMapAsMap = value.asMap();
            if (readableMapAsMap != null) {
                return l(readableMapAsMap, dVar, z10);
            }
            throw new DynamicCastException(O.b(ReadableMap.class));
        } catch (Throwable th2) {
            if (th2 instanceof CodedException) {
                unexpectedException = (CodedException) th2;
            } else if (th2 instanceof AbstractC6300a) {
                AbstractC6300a abstractC6300a = (AbstractC6300a) th2;
                String strA = abstractC6300a.a();
                AbstractC5504s.g(strA, "getCode(...)");
                unexpectedException = new CodedException(strA, abstractC6300a.getMessage(), abstractC6300a.getCause());
            } else {
                unexpectedException = new UnexpectedException(th2);
            }
            throw new w(o(), unexpectedException);
        }
    }

    public final InterfaceC5364b k(Map map, Ub.d dVar, boolean z10) throws l, IllegalAccessException, k {
        CodedException unexpectedException;
        AbstractC5504s.h(map, "map");
        InterfaceC6016f interfaceC6016fC = this.f51741b.c();
        AbstractC5504s.f(interfaceC6016fC, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Object objA = m((InterfaceC6014d) interfaceC6016fC).a();
        for (Map.Entry entry : n().entrySet()) {
            InterfaceC6025o interfaceC6025o = (InterfaceC6025o) entry.getKey();
            a aVar = (a) entry.getValue();
            String strKey = aVar.a().key();
            if (r.l0(strKey)) {
                strKey = null;
            }
            if (strKey == null) {
                strKey = interfaceC6025o.getName();
            }
            if (map.containsKey(strKey)) {
                Object objValueOf = map.get(strKey);
                if (objValueOf instanceof Number) {
                    InterfaceC6016f interfaceC6016fC2 = interfaceC6025o.getReturnType().c();
                    objValueOf = AbstractC5504s.c(interfaceC6016fC2, O.b(Integer.TYPE)) ? Integer.valueOf(((Number) objValueOf).intValue()) : AbstractC5504s.c(interfaceC6016fC2, O.b(Long.TYPE)) ? Long.valueOf(((Number) objValueOf).longValue()) : AbstractC5504s.c(interfaceC6016fC2, O.b(Float.TYPE)) ? Float.valueOf(((Number) objValueOf).floatValue()) : AbstractC5504s.c(interfaceC6016fC2, O.b(Double.TYPE)) ? Double.valueOf(((Number) objValueOf).doubleValue()) : (Number) objValueOf;
                }
                Field fieldB = re.c.b(interfaceC6025o);
                AbstractC5504s.e(fieldB);
                try {
                    Object objA2 = aVar.b().a(objValueOf, dVar, z10);
                    fieldB.setAccessible(true);
                    fieldB.set(objA, objA2);
                } catch (Throwable th2) {
                    if (th2 instanceof CodedException) {
                        unexpectedException = (CodedException) th2;
                    } else if (th2 instanceof AbstractC6300a) {
                        AbstractC6300a abstractC6300a = (AbstractC6300a) th2;
                        String strA = abstractC6300a.a();
                        AbstractC5504s.g(strA, "getCode(...)");
                        unexpectedException = new CodedException(strA, abstractC6300a.getMessage(), abstractC6300a.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th2);
                    }
                    throw new k(interfaceC6025o.getName(), interfaceC6025o.getReturnType(), o(), unexpectedException);
                }
            } else if (aVar.c()) {
                throw new l(interfaceC6025o);
            }
        }
        AbstractC5504s.f(objA, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter");
        return (InterfaceC5364b) objA;
    }

    public final InterfaceC6027q o() {
        return this.f51741b;
    }
}
