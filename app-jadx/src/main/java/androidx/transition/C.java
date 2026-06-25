package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F f32322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Property f32323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property f32324c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            C.e(view, f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f32322a = new N();
        } else {
            f32322a = new M();
        }
        f32323b = new a(Float.class, "translationAlpha");
        f32324c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f32322a.a(view);
    }

    static float b(View view) {
        return f32322a.b(view);
    }

    static void c(View view) {
        f32322a.c(view);
    }

    static void d(View view, int i10, int i11, int i12, int i13) {
        f32322a.d(view, i10, i11, i12, i13);
    }

    static void e(View view, float f10) {
        f32322a.e(view, f10);
    }

    static void f(View view, int i10) {
        f32322a.f(view, i10);
    }

    static void g(View view, Matrix matrix) {
        f32322a.g(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        f32322a.h(view, matrix);
    }
}
