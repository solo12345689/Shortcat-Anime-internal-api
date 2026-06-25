package pc;

import Ud.AbstractC2279u;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import he.AbstractC4945a;
import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5969K;
import pe.InterfaceC6018h;
import pe.InterfaceC6022l;
import pe.InterfaceC6025o;
import qe.AbstractC6173c;
import re.AbstractC6308a;

/* JADX INFO: renamed from: pc.J */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5968J {
    public static final void a(WritableArray writableArray, Object obj) {
        AbstractC5504s.h(writableArray, "<this>");
        if (obj == null || (obj instanceof Td.L)) {
            writableArray.pushNull();
            return;
        }
        if (obj instanceof ReadableArray) {
            writableArray.pushArray((ReadableArray) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            writableArray.pushMap((ReadableMap) obj);
            return;
        }
        if (obj instanceof String) {
            writableArray.pushString((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableArray.pushInt(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writableArray.pushLong(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Number) {
            writableArray.pushDouble(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
            return;
        }
        throw new IllegalArgumentException("Could not put '" + obj.getClass() + "' to WritableArray");
    }

    public static final void b(WritableMap writableMap, String key, Object obj) {
        AbstractC5504s.h(writableMap, "<this>");
        AbstractC5504s.h(key, "key");
        if (obj == null || (obj instanceof Td.L)) {
            writableMap.putNull(key);
            return;
        }
        if (obj instanceof ReadableArray) {
            writableMap.putArray(key, (ReadableArray) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            writableMap.putMap(key, (ReadableMap) obj);
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(key, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(key, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writableMap.putLong(key, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(key, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(key, ((Boolean) obj).booleanValue());
            return;
        }
        throw new IllegalArgumentException("Could not put '" + obj.getClass() + "' to WritableMap");
    }

    public static final WritableArray c(Collection collection, C5969K.a containerProvider) {
        AbstractC5504s.h(collection, "<this>");
        AbstractC5504s.h(containerProvider, "containerProvider");
        WritableArray writableArrayA = containerProvider.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a(writableArrayA, C5969K.f55891a.c(it.next(), containerProvider));
        }
        return writableArrayA;
    }

    public static final WritableArray d(Pair pair, C5969K.a containerProvider) {
        AbstractC5504s.h(pair, "<this>");
        AbstractC5504s.h(containerProvider, "containerProvider");
        WritableArray writableArrayA = containerProvider.a();
        C5969K c5969k = C5969K.f55891a;
        Object objC = c5969k.c(pair.c(), containerProvider);
        Object objC2 = c5969k.c(pair.d(), containerProvider);
        a(writableArrayA, objC);
        a(writableArrayA, objC2);
        return writableArrayA;
    }

    public static final WritableArray e(double[] dArr, C5969K.a containerProvider) {
        AbstractC5504s.h(dArr, "<this>");
        AbstractC5504s.h(containerProvider, "containerProvider");
        WritableArray writableArrayA = containerProvider.a();
        for (double d10 : dArr) {
            writableArrayA.pushDouble(d10);
        }
        return writableArrayA;
    }

    public static final WritableArray f(float[] fArr, C5969K.a containerProvider) {
        AbstractC5504s.h(fArr, "<this>");
        AbstractC5504s.h(containerProvider, "containerProvider");
        WritableArray writableArrayA = containerProvider.a();
        for (float f10 : fArr) {
            writableArrayA.pushDouble(f10);
        }
        return writableArrayA;
    }

    public static final WritableArray g(int[] iArr, C5969K.a containerProvider) {
        AbstractC5504s.h(iArr, "<this>");
        AbstractC5504s.h(containerProvider, "containerProvider");
        WritableArray writableArrayA = containerProvider.a();
        for (int i10 : iArr) {
            writableArrayA.pushInt(i10);
        }
        return writableArrayA;
    }

    public static final WritableArray h(long[] jArr, C5969K.a containerProvider) {
        AbstractC5504s.h(jArr, "<this>");
        AbstractC5504s.h(containerProvider, "containerProvider");
        WritableArray writableArrayA = containerProvider.a();
        for (long j10 : jArr) {
            writableArrayA.pushLong(j10);
        }
        return writableArrayA;
    }

    public static final WritableArray i(Object[] objArr, C5969K.a containerProvider) {
        AbstractC5504s.h(objArr, "<this>");
        AbstractC5504s.h(containerProvider, "containerProvider");
        WritableArray writableArrayA = containerProvider.a();
        for (Object obj : objArr) {
            a(writableArrayA, C5969K.f55891a.c(obj, containerProvider));
        }
        return writableArrayA;
    }

    public static final WritableArray j(boolean[] zArr, C5969K.a containerProvider) {
        AbstractC5504s.h(zArr, "<this>");
        AbstractC5504s.h(containerProvider, "containerProvider");
        WritableArray writableArrayA = containerProvider.a();
        for (boolean z10 : zArr) {
            writableArrayA.pushBoolean(z10);
        }
        return writableArrayA;
    }

    public static final WritableMap k(Bundle bundle, C5969K.a containerProvider) {
        AbstractC5504s.h(bundle, "<this>");
        AbstractC5504s.h(containerProvider, "containerProvider");
        WritableMap writableMapB = containerProvider.b();
        for (String str : bundle.keySet()) {
            Object objC = C5969K.f55891a.c(bundle.get(str), containerProvider);
            AbstractC5504s.e(str);
            b(writableMapB, str, objC);
        }
        return writableMapB;
    }

    public static final WritableMap l(Map map, C5969K.a containerProvider) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(containerProvider, "containerProvider");
        WritableMap writableMapB = containerProvider.b();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            b(writableMapB, String.valueOf(key), C5969K.f55891a.c(entry.getValue(), containerProvider));
        }
        return writableMapB;
    }

    public static final WritableMap m(InterfaceC5364b interfaceC5364b, C5969K.a containerProvider) {
        Object next;
        AbstractC5504s.h(interfaceC5364b, "<this>");
        AbstractC5504s.h(containerProvider, "containerProvider");
        WritableMap writableMapB = containerProvider.b();
        Collection<InterfaceC6025o> collectionB = AbstractC6173c.b(AbstractC4945a.e(interfaceC5364b.getClass()));
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collectionB, 10));
        for (InterfaceC6025o interfaceC6025o : collectionB) {
            Iterator it = interfaceC6025o.getAnnotations().iterator();
            while (true) {
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
                String strKey = interfaceC5363a.key();
                String name = AbstractC5504s.c(strKey, "") ? null : strKey;
                if (name == null) {
                    name = interfaceC6025o.getName();
                }
                AbstractC6308a.b(interfaceC6025o, true);
                b(writableMapB, name, C5969K.f55891a.c(interfaceC6025o.get(interfaceC5364b), containerProvider));
            }
            arrayList.add(Td.L.f17438a);
        }
        return writableMapB;
    }

    public static final Object n(Enum r42) {
        Object next;
        AbstractC5504s.h(r42, "<this>");
        InterfaceC6018h interfaceC6018hC = AbstractC6173c.c(kotlin.jvm.internal.O.b(r42.getClass()));
        if (interfaceC6018hC == null) {
            throw new IllegalArgumentException("Cannot convert enum without the primary constructor to js value");
        }
        if (interfaceC6018hC.getParameters().isEmpty()) {
            return r42.name();
        }
        if (interfaceC6018hC.getParameters().size() != 1) {
            throw new IllegalStateException("Enum '" + r42.getClass() + "' cannot be used as return type (incompatible with JS)");
        }
        String name = ((InterfaceC6022l) AbstractC2279u.m0(interfaceC6018hC.getParameters())).getName();
        AbstractC5504s.e(name);
        Iterator it = AbstractC6173c.a(kotlin.jvm.internal.O.b(r42.getClass())).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5504s.c(((InterfaceC6025o) next).getName(), name)) {
                break;
            }
        }
        AbstractC5504s.f(next, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Enum<*>, *>");
        return ((InterfaceC6025o) next).get(r42);
    }

    public static final String o(Uri uri) {
        AbstractC5504s.h(uri, "<this>");
        String string = uri.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public static final String p(File file) {
        AbstractC5504s.h(file, "<this>");
        String absolutePath = file.getAbsolutePath();
        AbstractC5504s.g(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public static final String q(URI uri) {
        AbstractC5504s.h(uri, "<this>");
        String string = uri.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public static final String r(URL url) {
        AbstractC5504s.h(url, "<this>");
        String string = url.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public static final Collection s(Collection collection) {
        AbstractC5504s.h(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(C5969K.b(C5969K.f55891a, it.next(), null, true, 2, null));
        }
        return arrayList;
    }

    public static final Map t(Bundle bundle) {
        AbstractC5504s.h(bundle, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            linkedHashMap.put(str, C5969K.b(C5969K.f55891a, bundle.get(str), null, true, 2, null));
        }
        return linkedHashMap;
    }

    public static final Map u(Map map) {
        AbstractC5504s.h(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(Td.z.a(String.valueOf(entry.getKey()), C5969K.b(C5969K.f55891a, entry.getValue(), null, true, 2, null)));
        }
        return Ud.S.w(arrayList);
    }

    public static final Map v(InterfaceC5364b interfaceC5364b) {
        Object next;
        AbstractC5504s.h(interfaceC5364b, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Collection<InterfaceC6025o> collectionB = AbstractC6173c.b(AbstractC4945a.e(interfaceC5364b.getClass()));
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collectionB, 10));
        for (InterfaceC6025o interfaceC6025o : collectionB) {
            Iterator it = interfaceC6025o.getAnnotations().iterator();
            while (true) {
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
                String strKey = interfaceC5363a.key();
                String name = AbstractC5504s.c(strKey, "") ? null : strKey;
                if (name == null) {
                    name = interfaceC6025o.getName();
                }
                AbstractC6308a.b(interfaceC6025o, true);
                linkedHashMap.put(name, C5969K.b(C5969K.f55891a, interfaceC6025o.get(interfaceC5364b), null, true, 2, null));
            }
            arrayList.add(Td.L.f17438a);
        }
        return linkedHashMap;
    }
}
