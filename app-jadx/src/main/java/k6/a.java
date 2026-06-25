package K6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s5.InterfaceC6433d;
import z6.z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config f10881a = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f10882b;

    private static void c(Bitmap bitmap, Bitmap bitmap2) {
        if (!z.a() || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            return;
        }
        try {
            if (f10882b == null) {
                int i10 = Bitmaps.f35990a;
                f10882b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
            }
            f10882b.invoke(null, bitmap, bitmap2);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e13);
        }
    }

    @Override // K6.d
    public C5.a a(Bitmap bitmap, w6.d dVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f10881a;
        }
        C5.a aVarD = dVar.d(width, height, config);
        try {
            e((Bitmap) aVarD.C(), bitmap);
            return aVarD.clone();
        } finally {
            C5.a.m(aVarD);
        }
    }

    @Override // K6.d
    public InterfaceC6433d b() {
        return null;
    }

    public void e(Bitmap bitmap, Bitmap bitmap2) {
        c(bitmap, bitmap2);
        d(bitmap);
    }

    @Override // K6.d
    public String getName() {
        return "Unknown postprocessor";
    }

    public void d(Bitmap bitmap) {
    }
}
