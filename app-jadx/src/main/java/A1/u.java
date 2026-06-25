package A1;

import H1.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import t.i0;
import z1.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class u extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor f123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f125e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f123c = constructor;
        f122b = cls;
        f124d = method2;
        f125e = method;
    }

    u() {
    }

    private static boolean i(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f124d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f122b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f125e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean k() {
        Method method = f124d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object l() {
        try {
            return f123c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // A1.z
    public Typeface a(Context context, h.c cVar, Resources resources, int i10) {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        for (h.d dVar : cVar.a()) {
            ByteBuffer byteBufferB = A.b(context, resources, dVar.b());
            if (byteBufferB == null || !i(objL, byteBufferB, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return j(objL);
    }

    @Override // A1.z
    public Typeface b(Context context, CancellationSignal cancellationSignal, j.b[] bVarArr, int i10) {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        i0 i0Var = new i0();
        for (j.b bVar : bVarArr) {
            Uri uriE = bVar.e();
            ByteBuffer byteBufferF = (ByteBuffer) i0Var.get(uriE);
            if (byteBufferF == null) {
                byteBufferF = A.f(context, cancellationSignal, uriE);
                i0Var.put(uriE, byteBufferF);
            }
            if (byteBufferF == null || !i(objL, byteBufferF, bVar.d(), bVar.g(), bVar.h())) {
                return null;
            }
        }
        Typeface typefaceJ = j(objL);
        if (typefaceJ == null) {
            return null;
        }
        return Typeface.create(typefaceJ, i10);
    }
}
