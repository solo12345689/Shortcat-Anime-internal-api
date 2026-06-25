package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f37369a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f37370b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends ThreadLocal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37371a;

        a(int i10) {
            this.f37371a = i10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] initialValue() {
            return new Object[this.f37371a];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends m {
        public b(B7.a aVar, Method method) {
            super(aVar, "Array", method);
        }

        @Override // com.facebook.react.uimanager.B0.m
        protected Object c(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f37372i;

        public c(B7.a aVar, Method method, boolean z10) {
            super(aVar, "boolean", method);
            this.f37372i = z10;
        }

        @Override // com.facebook.react.uimanager.B0.m
        protected Object c(Object obj, Context context) {
            return obj == null ? this.f37372i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends m {
        public d(B7.a aVar, Method method) {
            super(aVar, "boolean", method);
        }

        @Override // com.facebook.react.uimanager.B0.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e extends m {
        public e(B7.a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        @Override // com.facebook.react.uimanager.B0.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ColorPropConverter.getColor(obj, context);
            }
            return null;
        }

        public e(B7.b bVar, Method method, int i10) {
            super(bVar, "mixed", method, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class f extends m {
        public f(B7.a aVar, Method method) {
            super(aVar, "number", method);
        }

        @Override // com.facebook.react.uimanager.B0.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return obj instanceof Double ? Integer.valueOf(((Double) obj).intValue()) : (Integer) obj;
            }
            return null;
        }

        public f(B7.b bVar, Method method, int i10) {
            super(bVar, "number", method, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class i extends m {
        public i(B7.a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        @Override // com.facebook.react.uimanager.B0.m
        protected Object c(Object obj, Context context) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }

        public i(B7.b bVar, Method method, int i10) {
            super(bVar, "mixed", method, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class l extends m {
        public l(B7.a aVar, Method method) {
            super(aVar, "Map", method);
        }

        @Override // com.facebook.react.uimanager.B0.m
        protected Object c(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class n extends m {
        public n(B7.a aVar, Method method) {
            super(aVar, "String", method);
        }

        @Override // com.facebook.react.uimanager.B0.m
        protected Object c(Object obj, Context context) {
            return (String) obj;
        }
    }

    public static void b() {
        f37369a.clear();
        f37370b.clear();
    }

    private static m c(B7.a aVar, Method method, Class cls) {
        if (cls == Dynamic.class) {
            return new i(aVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new c(aVar, method, aVar.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return "Color".equals(aVar.customType()) ? new g(aVar, method, aVar.defaultInt()) : new k(aVar, method, aVar.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new j(aVar, method, aVar.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new h(aVar, method, aVar.defaultDouble());
        }
        if (cls == String.class) {
            return new n(aVar, method);
        }
        if (cls == Boolean.class) {
            return new d(aVar, method);
        }
        if (cls == Integer.class) {
            return "Color".equals(aVar.customType()) ? new e(aVar, method) : new f(aVar, method);
        }
        if (cls == ReadableArray.class) {
            return new b(aVar, method);
        }
        if (cls == ReadableMap.class) {
            return new l(aVar, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    private static void d(B7.b bVar, Method method, Class cls, Map map) {
        String[] strArrNames = bVar.names();
        int i10 = 0;
        if (cls == Dynamic.class) {
            while (i10 < strArrNames.length) {
                map.put(strArrNames[i10], new i(bVar, method, i10));
                i10++;
            }
            return;
        }
        if (cls == Integer.TYPE) {
            while (i10 < strArrNames.length) {
                if ("Color".equals(bVar.customType())) {
                    map.put(strArrNames[i10], new g(bVar, method, i10, bVar.defaultInt()));
                } else {
                    map.put(strArrNames[i10], new k(bVar, method, i10, bVar.defaultInt()));
                }
                i10++;
            }
            return;
        }
        if (cls == Float.TYPE) {
            while (i10 < strArrNames.length) {
                map.put(strArrNames[i10], new j(bVar, method, i10, bVar.defaultFloat()));
                i10++;
            }
            return;
        }
        if (cls == Double.TYPE) {
            for (int i11 = 0; i11 < strArrNames.length; i11++) {
                map.put(strArrNames[i11], new h(bVar, method, i11, bVar.defaultDouble()));
            }
            return;
        }
        if (cls == Integer.class) {
            while (i10 < strArrNames.length) {
                if ("Color".equals(bVar.customType())) {
                    map.put(strArrNames[i10], new e(bVar, method, i10));
                } else {
                    map.put(strArrNames[i10], new f(bVar, method, i10));
                }
                i10++;
            }
            return;
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ThreadLocal e(int i10) {
        if (i10 <= 0) {
            return null;
        }
        return new a(i10);
    }

    private static void f(Class cls, Map map) {
        for (Method method : cls.getDeclaredMethods()) {
            B7.a aVar = (B7.a) method.getAnnotation(B7.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map.put(aVar.name(), c(aVar, method, parameterTypes[0]));
            }
            B7.b bVar = (B7.b) method.getAnnotation(B7.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                d(bVar, method, parameterTypes2[1], map);
            }
        }
    }

    private static void g(Class cls, Map map) {
        for (Method method : cls.getDeclaredMethods()) {
            B7.a aVar = (B7.a) method.getAnnotation(B7.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                map.put(aVar.name(), c(aVar, method, parameterTypes[1]));
            }
            B7.b bVar = (B7.b) method.getAnnotation(B7.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[1] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                d(bVar, method, parameterTypes2[2], map);
            }
        }
    }

    static Map h(Class cls) {
        if (cls == null) {
            return f37370b;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == O.class) {
                return f37370b;
            }
        }
        Map map = f37369a;
        Map map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(h(cls.getSuperclass()));
        f(cls, map3);
        map.put(cls, map3);
        return map3;
    }

    static Map i(Class cls) {
        if (cls == ViewManager.class) {
            return f37370b;
        }
        Map map = f37369a;
        Map map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(i(cls.getSuperclass()));
        g(cls, map3);
        map.put(cls, map3);
        return map3;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class g extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f37373i;

        public g(B7.a aVar, Method method, int i10) {
            super(aVar, "mixed", method);
            this.f37373i = i10;
        }

        @Override // com.facebook.react.uimanager.B0.m
        protected Object c(Object obj, Context context) {
            return obj == null ? Integer.valueOf(this.f37373i) : ColorPropConverter.getColor(obj, context);
        }

        public g(B7.b bVar, Method method, int i10, int i11) {
            super(bVar, "mixed", method, i10);
            this.f37373i = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class h extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final double f37374i;

        public h(B7.a aVar, Method method, double d10) {
            super(aVar, "number", method);
            this.f37374i = d10;
        }

        @Override // com.facebook.react.uimanager.B0.m
        protected Object c(Object obj, Context context) {
            return Double.valueOf(obj == null ? this.f37374i : ((Double) obj).doubleValue());
        }

        public h(B7.b bVar, Method method, int i10, double d10) {
            super(bVar, "number", method, i10);
            this.f37374i = d10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class j extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f37375i;

        public j(B7.a aVar, Method method, float f10) {
            super(aVar, "number", method);
            this.f37375i = f10;
        }

        @Override // com.facebook.react.uimanager.B0.m
        protected Object c(Object obj, Context context) {
            return Float.valueOf(obj == null ? this.f37375i : ((Double) obj).floatValue());
        }

        public j(B7.b bVar, Method method, int i10, float f10) {
            super(bVar, "number", method, i10);
            this.f37375i = f10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class k extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f37376i;

        public k(B7.a aVar, Method method, int i10) {
            super(aVar, "number", method);
            this.f37376i = i10;
        }

        @Override // com.facebook.react.uimanager.B0.m
        protected Object c(Object obj, Context context) {
            return Integer.valueOf(obj == null ? this.f37376i : ((Double) obj).intValue());
        }

        public k(B7.b bVar, Method method, int i10, int i11) {
            super(bVar, "number", method, i10);
            this.f37376i = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final ThreadLocal f37377e = B0.e(2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final ThreadLocal f37378f = B0.e(3);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final ThreadLocal f37379g = B0.e(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final ThreadLocal f37380h = B0.e(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final String f37381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final String f37382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Method f37383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final Integer f37384d;

        public String a() {
            return this.f37381a;
        }

        public String b() {
            return this.f37382b;
        }

        protected abstract Object c(Object obj, Context context);

        public void d(O o10, Object obj) {
            Object[] objArr;
            try {
                if (this.f37384d == null) {
                    objArr = (Object[]) f37379g.get();
                    objArr[0] = c(obj, o10.getThemedContext());
                } else {
                    objArr = (Object[]) f37380h.get();
                    objArr[0] = this.f37384d;
                    objArr[1] = c(obj, o10.getThemedContext());
                }
                this.f37383c.invoke(o10, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th2) {
                AbstractC7283a.j(ViewManager.class, "Error while updating prop " + this.f37381a, th2);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f37381a + "' in shadow node of type: " + o10.getViewClass(), th2);
            }
        }

        public void e(ViewManager viewManager, View view, Object obj) {
            Object[] objArr;
            try {
                if (this.f37384d == null) {
                    objArr = (Object[]) f37377e.get();
                    objArr[0] = view;
                    objArr[1] = c(obj, view.getContext());
                } else {
                    objArr = (Object[]) f37378f.get();
                    objArr[0] = view;
                    objArr[1] = this.f37384d;
                    objArr[2] = c(obj, view.getContext());
                }
                this.f37383c.invoke(viewManager, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th2) {
                AbstractC7283a.j(ViewManager.class, "Error while updating prop " + this.f37381a, th2);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f37381a + "' of a view managed by: " + viewManager.getName(), th2);
            }
        }

        private m(B7.a aVar, String str, Method method) {
            this.f37381a = aVar.name();
            this.f37382b = "__default_type__".equals(aVar.customType()) ? str : aVar.customType();
            this.f37383c = method;
            this.f37384d = null;
        }

        private m(B7.b bVar, String str, Method method, int i10) {
            this.f37381a = bVar.names()[i10];
            this.f37382b = "__default_type__".equals(bVar.customType()) ? str : bVar.customType();
            this.f37383c = method;
            this.f37384d = Integer.valueOf(i10);
        }
    }
}
