package f4;

import Ud.AbstractC2279u;
import a4.AbstractC2573h;
import a4.C2567b;
import a4.EnumC2575j;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import c4.InterfaceC3073a;
import c4.InterfaceC3075c;
import c4.d;
import c4.j;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4771a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0751a f46843b = new C0751a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f46844c = C4771a.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC2575j f46845a;

    /* JADX INFO: renamed from: f4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0751a {
        public /* synthetic */ C0751a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(SidecarDeviceState sidecarDeviceState) {
            AbstractC5504s.h(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return 0;
                }
            } catch (NoSuchFieldError unused2) {
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) objInvoke).intValue();
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            AbstractC5504s.h(sidecarDeviceState, "sidecarDeviceState");
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        public final List c(SidecarWindowLayoutInfo info) {
            AbstractC5504s.h(info, "info");
            try {
                try {
                    List list = info.displayFeatures;
                    return list == null ? AbstractC2279u.m() : list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return AbstractC2279u.m();
                }
                return AbstractC2279u.m();
            } catch (NoSuchFieldError unused2) {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) objInvoke;
            }
        }

        public final void d(SidecarDeviceState sidecarDeviceState, int i10) {
            AbstractC5504s.h(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i10;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
            }
        }

        private C0751a() {
        }
    }

    /* JADX INFO: renamed from: f4.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46846a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            AbstractC5504s.h(require, "$this$require");
            boolean z10 = true;
            if (require.getType() != 1 && require.getType() != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: renamed from: f4.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f46847a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            AbstractC5504s.h(require, "$this$require");
            return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
        }
    }

    /* JADX INFO: renamed from: f4.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f46848a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            AbstractC5504s.h(require, "$this$require");
            boolean z10 = true;
            if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: renamed from: f4.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f46849a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            AbstractC5504s.h(require, "$this$require");
            return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
        }
    }

    public C4771a(EnumC2575j verificationMode) {
        AbstractC5504s.h(verificationMode, "verificationMode");
        this.f46845a = verificationMode;
    }

    private final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (AbstractC5504s.c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return AbstractC5504s.c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!b((SidecarDisplayFeature) list.get(i10), (SidecarDisplayFeature) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (AbstractC5504s.c(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        C0751a c0751a = f46843b;
        return c0751a.b(sidecarDeviceState) == c0751a.b(sidecarDeviceState2);
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (AbstractC5504s.c(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        C0751a c0751a = f46843b;
        return c(c0751a.c(sidecarWindowLayoutInfo), c0751a.c(sidecarWindowLayoutInfo2));
    }

    public final j e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        AbstractC5504s.h(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new j(AbstractC2279u.m());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        C0751a c0751a = f46843b;
        c0751a.d(sidecarDeviceState, c0751a.b(state));
        return new j(f(c0751a.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final List f(List sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        AbstractC5504s.h(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        AbstractC5504s.h(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            InterfaceC3073a interfaceC3073aG = g((SidecarDisplayFeature) it.next(), deviceState);
            if (interfaceC3073aG != null) {
                arrayList.add(interfaceC3073aG);
            }
        }
        return arrayList;
    }

    public final InterfaceC3073a g(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
        d.b bVarA;
        InterfaceC3075c.C0564c c0564c;
        AbstractC5504s.h(feature, "feature");
        AbstractC5504s.h(deviceState, "deviceState");
        AbstractC2573h.a aVar = AbstractC2573h.f23783a;
        String TAG = f46844c;
        AbstractC5504s.g(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) AbstractC2573h.a.b(aVar, feature, TAG, this.f46845a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f46846a).c("Feature bounds must not be 0", c.f46847a).c("TYPE_FOLD must have 0 area", d.f46848a).c("Feature be pinned to either left or top", e.f46849a).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVarA = d.b.f33476b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = d.b.f33476b.b();
        }
        int iB = f46843b.b(deviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            c0564c = InterfaceC3075c.C0564c.f33470d;
        } else {
            if (iB != 3 && iB == 4) {
                return null;
            }
            c0564c = InterfaceC3075c.C0564c.f33469c;
        }
        Rect rect = feature.getRect();
        AbstractC5504s.g(rect, "feature.rect");
        return new c4.d(new C2567b(rect), bVarA, c0564c);
    }

    public /* synthetic */ C4771a(EnumC2575j enumC2575j, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC2575j.QUIET : enumC2575j);
    }
}
