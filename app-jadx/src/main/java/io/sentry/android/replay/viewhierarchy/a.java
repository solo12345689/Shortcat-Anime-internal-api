package io.sentry.android.replay.viewhierarchy;

import Df.r;
import K0.J;
import K0.p0;
import R0.l;
import R0.m;
import R0.x;
import Td.AbstractC2163n;
import android.view.View;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import ie.InterfaceC5082a;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.android.replay.t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: c */
    private static boolean f50474c;

    /* JADX INFO: renamed from: d */
    private static WeakReference f50475d;

    /* JADX INFO: renamed from: a */
    public static final a f50472a = new a();

    /* JADX INFO: renamed from: b */
    private static final Lazy f50473b = AbstractC2163n.b(C0794a.f50477a);

    /* JADX INFO: renamed from: e */
    public static final int f50476e = 8;

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0794a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final C0794a f50477a = new C0794a();

        C0794a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final Method invoke() {
            try {
                Method declaredMethod = J.class.getDeclaredMethod("e", null);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    private a() {
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final io.sentry.android.replay.viewhierarchy.b a(K0.J r22, io.sentry.android.replay.viewhierarchy.b r23, int r24, boolean r25, io.sentry.C5322z3 r26) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.viewhierarchy.a.a(K0.J, io.sentry.android.replay.viewhierarchy.b, int, boolean, io.sentry.z3):io.sentry.android.replay.viewhierarchy.b");
    }

    private final Method c() {
        return (Method) f50473b.getValue();
    }

    private final String d(boolean z10, SemanticsConfiguration semanticsConfiguration) {
        if (z10) {
            return "android.widget.ImageView";
        }
        if (semanticsConfiguration == null) {
            return "android.view.View";
        }
        x xVar = x.f15043a;
        return (semanticsConfiguration.e(xVar.J()) || semanticsConfiguration.e(l.f14981a.z()) || semanticsConfiguration.e(xVar.g())) ? "android.widget.TextView" : "android.view.View";
    }

    public static final SemanticsConfiguration e(J node) {
        AbstractC5504s.h(node, "node");
        Method methodC = f50472a.c();
        return methodC != null ? (SemanticsConfiguration) methodC.invoke(node, null) : node.getCollapsedSemantics$ui_release();
    }

    private final boolean f(SemanticsConfiguration semanticsConfiguration, boolean z10, C5322z3 c5322z3) {
        String str = semanticsConfiguration != null ? (String) m.a(semanticsConfiguration, t.f50410a.a()) : null;
        if (AbstractC5504s.c(str, "unmask")) {
            return false;
        }
        if (AbstractC5504s.c(str, "mask")) {
            return true;
        }
        String strD = d(z10, semanticsConfiguration);
        if (c5322z3.getSessionReplay().s().contains(strD)) {
            return false;
        }
        return c5322z3.getSessionReplay().e().contains(strD);
    }

    private final void g(J j10, b bVar, boolean z10, C5322z3 c5322z3) {
        List listP = j10.P();
        if (listP.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(listP.size());
        int size = listP.size();
        int i10 = 0;
        while (i10 < size) {
            J j11 = (J) listP.get(i10);
            b bVar2 = bVar;
            boolean z11 = z10;
            C5322z3 c5322z32 = c5322z3;
            b bVarA = a(j11, bVar2, i10, z11, c5322z32);
            if (bVarA != null) {
                arrayList.add(bVarA);
                g(j11, bVarA, false, c5322z32);
            }
            i10++;
            bVar = bVar2;
            z10 = z11;
            c5322z3 = c5322z32;
        }
        bVar.f(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(View view, b bVar, C5322z3 options) {
        J root;
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(options, "options");
        String name = view.getClass().getName();
        AbstractC5504s.g(name, "getName(...)");
        if (!r.W(name, "AndroidComposeView", false, 2, null) || bVar == null) {
            return false;
        }
        try {
            p0 p0Var = view instanceof p0 ? (p0) view : null;
            if (p0Var != null && (root = p0Var.getRoot()) != null) {
                g(root, bVar, true, options);
                return true;
            }
            return false;
        } catch (Throwable th2) {
            options.getLogger().a(EnumC5215i3.ERROR, th2, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
            return false;
        }
    }
}
