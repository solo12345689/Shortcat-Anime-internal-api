package io.sentry.android.replay;

import Td.AbstractC2163n;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import ie.InterfaceC5082a;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f50518a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f50519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f50520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f50521d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50522a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class invoke() {
            try {
                return Class.forName("com.android.internal.policy.DecorView");
            } catch (Throwable th2) {
                Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th2);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f50523a = new b();

        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Field invoke() {
            Class clsB = x.f50518a.b();
            if (clsB == null) {
                return null;
            }
            try {
                Field declaredField = clsB.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e10) {
                Log.d("WindowSpy", "Unexpected exception retrieving " + clsB + "#mWindow on API " + Build.VERSION.SDK_INT, e10);
                return null;
            }
        }
    }

    static {
        Td.q qVar = Td.q.f17463c;
        f50519b = AbstractC2163n.a(qVar, a.f50522a);
        f50520c = AbstractC2163n.a(qVar, b.f50523a);
        f50521d = 8;
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class b() {
        return (Class) f50519b.getValue();
    }

    private final Field c() {
        return (Field) f50520c.getValue();
    }

    public final Window d(View maybeDecorView) throws IllegalAccessException {
        Field fieldC;
        AbstractC5504s.h(maybeDecorView, "maybeDecorView");
        Class clsB = b();
        if (clsB == null || !clsB.isInstance(maybeDecorView) || (fieldC = f50518a.c()) == null) {
            return null;
        }
        Object obj = fieldC.get(maybeDecorView);
        AbstractC5504s.f(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
