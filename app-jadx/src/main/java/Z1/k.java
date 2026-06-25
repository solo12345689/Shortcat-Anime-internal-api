package z1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f65514a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    private static final WeakHashMap f65515b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    private static final Object f65516c = new Object();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {

        /* JADX INFO: renamed from: a */
        final ColorStateList f65517a;

        /* JADX INFO: renamed from: b */
        final Configuration f65518b;

        /* JADX INFO: renamed from: c */
        final int f65519c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f65517a = colorStateList;
            this.f65518b = configuration;
            this.f65519c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {

        /* JADX INFO: renamed from: a */
        final Resources f65520a;

        /* JADX INFO: renamed from: b */
        final Resources.Theme f65521b;

        d(Resources resources, Resources.Theme theme) {
            this.f65520a = resources;
            this.f65521b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f65520a.equals(dVar.f65520a) && K1.b.a(this.f65521b, dVar.f65521b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return K1.b.b(this.f65520a, this.f65521b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i10, Handler handler) {
            e(handler).post(new Runnable() { // from class: z1.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65527a.f(i10);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: z1.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65525a.g(typeface);
                }
            });
        }

        public abstract void f(int i10);

        public abstract void g(Typeface typeface);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a {

            /* JADX INFO: renamed from: a */
            private static final Object f65522a = new Object();

            /* JADX INFO: renamed from: b */
            private static Method f65523b;

            /* JADX INFO: renamed from: c */
            private static boolean f65524c;

            /* JADX WARN: Removed duplicated region for block: B:64:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            static void a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = z1.k.f.a.f65522a
                    monitor-enter(r0)
                    boolean r1 = z1.k.f.a.f65524c     // Catch: java.lang.Throwable -> L17
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    z1.k.f.a.f65523b = r3     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    goto L21
                L17:
                    r6 = move-exception
                    goto L39
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L17
                L21:
                    z1.k.f.a.f65524c = r1     // Catch: java.lang.Throwable -> L17
                L23:
                    java.lang.reflect.Method r1 = z1.k.f.a.f65523b     // Catch: java.lang.Throwable -> L17
                    if (r1 == 0) goto L37
                    r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L17 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
                    goto L37
                L2b:
                    r6 = move-exception
                    goto L2e
                L2d:
                    r6 = move-exception
                L2e:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r3 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r3, r6)     // Catch: java.lang.Throwable -> L17
                    z1.k.f.a.f65523b = r2     // Catch: java.lang.Throwable -> L17
                L37:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    return
                L39:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: z1.k.f.a.a(android.content.res.Resources$Theme):void");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f65516c) {
            try {
                WeakHashMap weakHashMap = f65515b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i10, new c(colorStateList, dVar.f65520a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x003c, code lost:
    
        if (r2.f65519c == r5.hashCode()) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.res.ColorStateList b(z1.k.d r5, int r6) {
        /*
            java.lang.Object r0 = z1.k.f65516c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = z1.k.f65515b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            z1.k$c r2 = (z1.k.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f65518b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f65520a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f65521b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f65519c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f65519c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f65517a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.k.b(z1.k$d, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(Resources resources, int i10, Resources.Theme theme) {
        return b.a(resources, i10, theme);
    }

    public static ColorStateList e(Resources resources, int i10, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListB = b(dVar, i10);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListL = l(resources, i10, theme);
        if (colorStateListL == null) {
            return b.b(resources, i10, theme);
        }
        a(dVar, i10, colorStateListL, theme);
        return colorStateListL;
    }

    public static Drawable f(Resources resources, int i10, Resources.Theme theme) {
        return a.a(resources, i10, theme);
    }

    public static Drawable g(Resources resources, int i10, int i11, Resources.Theme theme) {
        return a.b(resources, i10, i11, theme);
    }

    public static Typeface h(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(Context context, int i10, TypedValue typedValue, int i11, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, typedValue, i11, eVar, null, true, false);
    }

    public static void j(Context context, int i10, e eVar, Handler handler) {
        K1.f.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            n(context, i10, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    private static TypedValue k() {
        ThreadLocal threadLocal = f65514a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList l(Resources resources, int i10, Resources.Theme theme) {
        if (m(resources, i10)) {
            return null;
        }
        try {
            return AbstractC7275c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    private static boolean m(Resources resources, int i10) {
        TypedValue typedValueK = k();
        resources.getValue(i10, typedValueK, true);
        int i11 = typedValueK.type;
        return i11 >= 28 && i11 <= 31;
    }

    private static Typeface n(Context context, int i10, TypedValue typedValue, int i11, e eVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface typefaceO = o(context, resources, typedValue, i10, i11, eVar, handler, z10, z11);
        if (typefaceO != null || eVar != null || z11) {
            return typefaceO;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface o(android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, z1.k.e r18, android.os.Handler r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.k.o(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, z1.k$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
