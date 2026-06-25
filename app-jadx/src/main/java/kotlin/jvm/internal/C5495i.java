package kotlin.jvm.internal;

import Td.C2160k;
import Ud.AbstractC2279u;
import com.adjust.sdk.Constants;
import he.AbstractC4945a;
import he.C4946b;
import ie.InterfaceC5082a;
import ie.InterfaceC5083b;
import ie.InterfaceC5084c;
import ie.InterfaceC5085d;
import ie.InterfaceC5086e;
import ie.InterfaceC5087f;
import ie.InterfaceC5088g;
import ie.InterfaceC5089h;
import ie.InterfaceC5090i;
import ie.InterfaceC5091j;
import ie.InterfaceC5092k;
import ie.InterfaceC5093l;
import ie.InterfaceC5094m;
import ie.InterfaceC5095n;
import ie.InterfaceC5096o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: kotlin.jvm.internal.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5495i implements InterfaceC6014d, InterfaceC5494h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f52280b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f52281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap f52282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashMap f52283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f52284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f52285g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f52286a;

    /* JADX INFO: renamed from: kotlin.jvm.internal.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class jClass) {
            String str;
            AbstractC5504s.h(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) C5495i.f52284f.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C5495i.f52284f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class jClass) {
            String str;
            AbstractC5504s.h(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String str3 = (String) C5495i.f52285g.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C5495i.f52285g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                AbstractC5504s.e(simpleName);
                String strW0 = Df.r.W0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strW0 != null) {
                    return strW0;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                AbstractC5504s.e(simpleName);
                return Df.r.V0(simpleName, '$', null, 2, null);
            }
            AbstractC5504s.e(simpleName);
            return Df.r.W0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final boolean c(Object obj, Class jClass) {
            AbstractC5504s.h(jClass, "jClass");
            Map map = C5495i.f52281c;
            AbstractC5504s.f(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return V.k(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = AbstractC4945a.c(AbstractC4945a.e(jClass));
            }
            return jClass.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        List listP = AbstractC2279u.p(InterfaceC5082a.class, Function1.class, Function2.class, InterfaceC5096o.class, ie.p.class, ie.q.class, ie.r.class, ie.s.class, ie.t.class, ie.u.class, InterfaceC5083b.class, InterfaceC5084c.class, InterfaceC5085d.class, InterfaceC5086e.class, InterfaceC5087f.class, InterfaceC5088g.class, InterfaceC5089h.class, InterfaceC5090i.class, InterfaceC5091j.class, InterfaceC5092k.class, InterfaceC5093l.class, InterfaceC5094m.class, InterfaceC5095n.class);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listP, 10));
        int i10 = 0;
        for (Object obj : listP) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            arrayList.add(Td.z.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f52281c = Ud.S.w(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put(Constants.LONG, "kotlin.Long");
        map.put("double", "kotlin.Double");
        f52282d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f52283e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC5504s.g(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            AbstractC5504s.e(str);
            sb2.append(Df.r.Z0(str, com.amazon.a.a.o.c.a.b.f34706a, null, 2, null));
            sb2.append("CompanionObject");
            Pair pairA = Td.z.a(sb2.toString(), str + ".Companion");
            map3.put(pairA.c(), pairA.d());
        }
        for (Map.Entry entry : f52281c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f52284f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ud.S.e(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            AbstractC5504s.e(str2);
            linkedHashMap.put(key, Df.r.Z0(str2, com.amazon.a.a.o.c.a.b.f34706a, null, 2, null));
        }
        f52285g = linkedHashMap;
    }

    public C5495i(Class jClass) {
        AbstractC5504s.h(jClass, "jClass");
        this.f52286a = jClass;
    }

    private final Void q() {
        throw new C4946b();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5495i) && AbstractC5504s.c(AbstractC4945a.c(this), AbstractC4945a.c((InterfaceC6014d) obj));
    }

    @Override // pe.InterfaceC6012b
    public List getAnnotations() {
        q();
        throw new C2160k();
    }

    @Override // pe.InterfaceC6014d
    public int hashCode() {
        return AbstractC4945a.c(this).hashCode();
    }

    @Override // pe.InterfaceC6014d
    public Collection i() {
        q();
        throw new C2160k();
    }

    @Override // kotlin.jvm.internal.InterfaceC5494h
    public Class j() {
        return this.f52286a;
    }

    @Override // pe.InterfaceC6014d
    public List k() {
        q();
        throw new C2160k();
    }

    @Override // pe.InterfaceC6014d
    public boolean s() {
        q();
        throw new C2160k();
    }

    @Override // pe.InterfaceC6014d
    public boolean t(Object obj) {
        return f52280b.c(obj, j());
    }

    public String toString() {
        return j() + " (Kotlin reflection is not available)";
    }

    @Override // pe.InterfaceC6014d
    public String u() {
        return f52280b.a(j());
    }

    @Override // pe.InterfaceC6014d
    public String v() {
        return f52280b.b(j());
    }
}
