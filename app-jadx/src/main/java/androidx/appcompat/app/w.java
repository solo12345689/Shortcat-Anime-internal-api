package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Field f24527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f24528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f24529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f24530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f24531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f24532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f24533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f24534h;

    static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f24534h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f24533g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f24534h = true;
        }
        Field field = f24533g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f24528b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f24527a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f24528b = true;
        }
        Field field2 = f24527a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f24530d) {
            try {
                f24529c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f24530d = true;
        }
        Class cls = f24529c;
        if (cls == null) {
            return;
        }
        if (!f24532f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f24531e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f24532f = true;
        }
        Field field = f24531e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
