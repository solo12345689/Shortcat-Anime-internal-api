package A1;

import H1.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z1.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class t extends z {

    /* JADX INFO: renamed from: b */
    private static Class f117b = null;

    /* JADX INFO: renamed from: c */
    private static Constructor f118c = null;

    /* JADX INFO: renamed from: d */
    private static Method f119d = null;

    /* JADX INFO: renamed from: e */
    private static Method f120e = null;

    /* JADX INFO: renamed from: f */
    private static boolean f121f = false;

    t() {
    }

    private static boolean i(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException {
        l();
        try {
            return ((Boolean) f119d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface j(Object obj) throws NoSuchMethodException {
        l();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f117b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f120e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File k(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void l() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f121f) {
            return;
        }
        f121f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f118c = constructor;
        f117b = cls;
        f119d = method2;
        f120e = method;
    }

    private static Object m() throws NoSuchMethodException {
        l();
        try {
            return f118c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // A1.z
    public Typeface a(Context context, h.c cVar, Resources resources, int i10) throws NoSuchMethodException {
        Object objM = m();
        for (h.d dVar : cVar.a()) {
            File fileE = A.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!A.c(fileE, resources, dVar.b())) {
                    return null;
                }
                if (!i(objM, fileE.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileE.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return j(objM);
    }

    @Override // A1.z
    public Typeface b(Context context, CancellationSignal cancellationSignal, j.b[] bVarArr, int i10) {
        Typeface typefaceD;
        if (bVarArr.length < 1) {
            return null;
        }
        j.b bVarH = h(bVarArr, i10);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarH.e(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileK = k(parcelFileDescriptorOpenFileDescriptor);
                if (fileK == null || !fileK.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceD = super.d(context, fileInputStream);
                        fileInputStream.close();
                    } finally {
                    }
                } else {
                    typefaceD = Typeface.createFromFile(fileK);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceD;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
