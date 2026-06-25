package io.sentry.android.replay;

import Td.AbstractC2163n;
import android.util.Log;
import ie.InterfaceC5082a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f50441a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f50442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f50443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Lazy f50444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f50445e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50446a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Field invoke() throws NoSuchFieldException {
            Class clsC = v.f50441a.c();
            if (clsC == null) {
                return null;
            }
            Field declaredField = clsC.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f50447a = new b();

        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class invoke() {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable th2) {
                Log.w("WindowManagerSpy", th2);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f50448a = new c();

        c() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            Method method;
            Class clsC = v.f50441a.c();
            if (clsC == null || (method = clsC.getMethod("getInstance", null)) == null) {
                return null;
            }
            return method.invoke(null, null);
        }
    }

    static {
        Td.q qVar = Td.q.f17463c;
        f50442b = AbstractC2163n.a(qVar, b.f50447a);
        f50443c = AbstractC2163n.a(qVar, c.f50448a);
        f50444d = AbstractC2163n.a(qVar, a.f50446a);
        f50445e = 8;
    }

    private v() {
    }

    private final Field b() {
        return (Field) f50444d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class c() {
        return (Class) f50442b.getValue();
    }

    private final Object d() {
        return f50443c.getValue();
    }

    public final void e(Function1 swap) {
        Field fieldB;
        AbstractC5504s.h(swap, "swap");
        try {
            Object objD = d();
            if (objD == null || (fieldB = f50441a.b()) == null) {
                return;
            }
            Object obj = fieldB.get(objD);
            AbstractC5504s.f(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            fieldB.set(objD, swap.invoke((ArrayList) obj));
        } catch (Throwable th2) {
            Log.w("WindowManagerSpy", th2);
        }
    }
}
