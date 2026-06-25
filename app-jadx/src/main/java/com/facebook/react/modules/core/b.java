package com.facebook.react.modules.core;

import Td.L;
import android.view.Choreographer;
import be.AbstractC3048a;
import com.facebook.react.bridge.UiThreadUtil;
import g7.InterfaceC4859b;
import java.util.ArrayDeque;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0617b f36977f = new C0617b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static b f36978g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4859b.a f36979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque[] f36980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Choreographer.FrameCallback f36983e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f36984b = new a("PERF_MARKERS", 0, 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f36985c = new a("DISPATCH_UI", 1, 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f36986d = new a("NATIVE_ANIMATED_MODULE", 2, 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f36987e = new a("TIMERS_EVENTS", 3, 3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f36988f = new a("IDLE_EVENT", 4, 4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ a[] f36989g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f36990h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f36991a;

        static {
            a[] aVarArrA = a();
            f36989g = aVarArrA;
            f36990h = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10, int i11) {
            this.f36991a = i11;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f36984b, f36985c, f36986d, f36987e, f36988f};
        }

        public static EnumEntries b() {
            return f36990h;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f36989g.clone();
        }

        public final int c() {
            return this.f36991a;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.modules.core.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0617b {
        public /* synthetic */ C0617b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            b bVar = b.f36978g;
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("ReactChoreographer needs to be initialized.");
        }

        public final void b(InterfaceC4859b choreographerProvider) {
            AbstractC5504s.h(choreographerProvider, "choreographerProvider");
            if (b.f36978g == null) {
                b.f36978g = new b(choreographerProvider, null);
            }
        }

        private C0617b() {
        }
    }

    public /* synthetic */ b(InterfaceC4859b interfaceC4859b, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4859b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(b bVar, InterfaceC4859b interfaceC4859b) {
        bVar.f36979a = interfaceC4859b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(b bVar, long j10) {
        synchronized (bVar.f36980b) {
            try {
                bVar.f36982d = false;
                int length = bVar.f36980b.length;
                for (int i10 = 0; i10 < length; i10++) {
                    ArrayDeque arrayDeque = bVar.f36980b[i10];
                    int size = arrayDeque.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) arrayDeque.pollFirst();
                        if (frameCallback != null) {
                            frameCallback.doFrame(j10);
                            bVar.f36981c--;
                        } else {
                            AbstractC7283a.m("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                bVar.j();
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final b h() {
        return f36977f.a();
    }

    public static final void i(InterfaceC4859b interfaceC4859b) {
        f36977f.b(interfaceC4859b);
    }

    private final void j() {
        Q6.a.a(this.f36981c >= 0);
        if (this.f36981c == 0 && this.f36982d) {
            InterfaceC4859b.a aVar = this.f36979a;
            if (aVar != null) {
                aVar.b(this.f36983e);
            }
            this.f36982d = false;
        }
    }

    private final void l() {
        if (this.f36982d) {
            return;
        }
        InterfaceC4859b.a aVar = this.f36979a;
        if (aVar == null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: q7.j
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.react.modules.core.b.m(this.f57689a);
                }
            });
        } else {
            aVar.a(this.f36983e);
            this.f36982d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(b bVar) {
        synchronized (bVar.f36980b) {
            bVar.l();
            L l10 = L.f17438a;
        }
    }

    public final void k(a type, Choreographer.FrameCallback callback) {
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(callback, "callback");
        synchronized (this.f36980b) {
            this.f36980b[type.c()].addLast(callback);
            boolean z10 = true;
            int i10 = this.f36981c + 1;
            this.f36981c = i10;
            if (i10 <= 0) {
                z10 = false;
            }
            Q6.a.a(z10);
            l();
            L l10 = L.f17438a;
        }
    }

    public final void n(a type, Choreographer.FrameCallback frameCallback) {
        AbstractC5504s.h(type, "type");
        synchronized (this.f36980b) {
            try {
                if (this.f36980b[type.c()].removeFirstOccurrence(frameCallback)) {
                    this.f36981c--;
                    j();
                } else {
                    AbstractC7283a.m("ReactNative", "Tried to remove non-existent frame callback");
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private b(final InterfaceC4859b interfaceC4859b) {
        int size = a.b().size();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[size];
        for (int i10 = 0; i10 < size; i10++) {
            arrayDequeArr[i10] = new ArrayDeque();
        }
        this.f36980b = arrayDequeArr;
        this.f36983e = new Choreographer.FrameCallback() { // from class: q7.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                com.facebook.react.modules.core.b.g(this.f57686a, j10);
            }
        };
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: q7.i
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.react.modules.core.b.d(this.f57687a, interfaceC4859b);
            }
        });
    }
}
