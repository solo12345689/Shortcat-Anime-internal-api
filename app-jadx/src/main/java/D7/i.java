package d7;

import Td.L;
import Td.r;
import android.app.Activity;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.inspector.TracingState;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4569a f45054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f45055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f45057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TracingState f45058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45059f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45060a;

        static {
            int[] iArr = new int[TracingState.values().length];
            try {
                iArr[TracingState.ENABLED_IN_BACKGROUND_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TracingState.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TracingState.ENABLED_IN_CDP_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45060a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements InterfaceC5082a {
        b(Object obj) {
            super(0, obj, i.class, "handleRecordingButtonPress", "handleRecordingButtonPress()V", 0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m938invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m938invoke() {
            ((i) this.receiver).l();
        }
    }

    public i(InterfaceC4569a devHelper, InterfaceC5082a onRequestOpenDevTools) {
        AbstractC5504s.h(devHelper, "devHelper");
        AbstractC5504s.h(onRequestOpenDevTools, "onRequestOpenDevTools");
        this.f45054a = devHelper;
        this.f45055b = onRequestOpenDevTools;
        this.f45058e = TracingState.ENABLED_IN_CDP_MODE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(i iVar) {
        l lVar = iVar.f45057d;
        if (lVar != null) {
            lVar.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(i iVar) {
        Activity activityA = iVar.f45054a.a();
        if (activityA == null) {
            return;
        }
        if (iVar.f45057d == null) {
            iVar.f45057d = new l(activityA, new b(iVar));
        }
        l lVar = iVar.f45057d;
        if (lVar != null) {
            lVar.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        int i10 = a.f45060a[this.f45058e.ordinal()];
        if (i10 == 1) {
            c cVarD = this.f45054a.d();
            if (cVarD == null || cVarD.pauseAndAnalyzeBackgroundTrace()) {
                return;
            }
            this.f45055b.invoke();
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new r();
            }
        } else {
            c cVarD2 = this.f45054a.d();
            if (cVarD2 != null) {
                cVarD2.resumeBackgroundTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(i iVar) {
        l lVar = iVar.f45057d;
        if (lVar != null) {
            int i10 = iVar.f45059f + 1;
            iVar.f45059f = i10;
            lVar.l(i10);
        }
        l lVar2 = iVar.f45057d;
        if (lVar2 != null) {
            lVar2.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(i iVar, TracingState tracingState) {
        l lVar = iVar.f45057d;
        if (lVar != null) {
            lVar.m(tracingState);
        }
        l lVar2 = iVar.f45057d;
        if (lVar2 != null) {
            lVar2.l(iVar.f45059f);
        }
        l lVar3 = iVar.f45057d;
        if (lVar3 != null) {
            lVar3.k();
        }
    }

    @Override // d7.m
    public void a(String name) {
        AbstractC5504s.h(name, "name");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: d7.e
            @Override // java.lang.Runnable
            public final void run() {
                i.n(this.f45049a);
            }
        });
    }

    @Override // d7.m
    public void b(final TracingState state) {
        AbstractC5504s.h(state, "state");
        this.f45058e = state;
        if (state != TracingState.DISABLED) {
            this.f45059f = 0;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: d7.g
            @Override // java.lang.Runnable
            public final void run() {
                i.o(this.f45051a, state);
            }
        });
    }

    public final void h() {
        this.f45056c = false;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: d7.f
            @Override // java.lang.Runnable
            public final void run() {
                i.i(this.f45050a);
            }
        });
    }

    public final void j() {
        if (this.f45056c) {
            return;
        }
        this.f45056c = true;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: d7.h
            @Override // java.lang.Runnable
            public final void run() {
                i.k(this.f45053a);
            }
        });
    }

    public final boolean m() {
        return this.f45056c;
    }

    public final void p() {
        c cVarD;
        if (this.f45056c && (cVarD = this.f45054a.d()) != null) {
            cVarD.resumeBackgroundTrace();
            b(cVarD.getTracingState());
        }
    }

    public final void q() {
        c cVarD;
        if (this.f45056c && (cVarD = this.f45054a.d()) != null) {
            cVarD.stopBackgroundTrace();
            b(cVarD.getTracingState());
        }
    }
}
