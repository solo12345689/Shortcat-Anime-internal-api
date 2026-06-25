package com.facebook.fresco.animation.factory;

import E6.e;
import E6.k;
import E6.p;
import android.content.Context;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import i6.C5042d;
import java.util.concurrent.ExecutorService;
import r6.InterfaceC6273a;
import s6.InterfaceC6436a;
import t6.C6645a;
import t6.InterfaceC6646b;
import u6.C6740a;
import w5.C6947d;
import w5.g;
import w5.i;
import w6.d;
import x6.n;
import y5.o;
import z6.InterfaceC7302p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AnimatedFactoryV2Impl implements InterfaceC6436a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f35737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7302p f35738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f35739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f35740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s6.d f35741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC6646b f35742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C6740a f35743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private D6.a f35744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f35745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f35747k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35748l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements C6.c {
        a() {
        }

        @Override // C6.c
        public e a(k kVar, int i10, p pVar, y6.d dVar) {
            return AnimatedFactoryV2Impl.this.n().b(kVar, dVar, dVar.f64845i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements InterfaceC6646b {
        b() {
        }

        @Override // t6.InterfaceC6646b
        public InterfaceC6273a a(r6.e eVar, Rect rect) {
            return new C6645a(AnimatedFactoryV2Impl.this.m(), eVar, rect, AnimatedFactoryV2Impl.this.f35740d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements InterfaceC6646b {
        c() {
        }

        @Override // t6.InterfaceC6646b
        public InterfaceC6273a a(r6.e eVar, Rect rect) {
            return new C6645a(AnimatedFactoryV2Impl.this.m(), eVar, rect, AnimatedFactoryV2Impl.this.f35740d);
        }
    }

    public AnimatedFactoryV2Impl(d dVar, InterfaceC7302p interfaceC7302p, n nVar, boolean z10, boolean z11, int i10, int i11, g gVar) {
        this.f35737a = dVar;
        this.f35738b = interfaceC7302p;
        this.f35739c = nVar;
        this.f35746j = i10;
        this.f35747k = z11;
        this.f35740d = z10;
        this.f35745i = gVar;
        this.f35748l = i11;
    }

    public static /* synthetic */ Integer e() {
        return 2;
    }

    public static /* synthetic */ Integer f() {
        return 3;
    }

    private s6.d j() {
        return new s6.e(new c(), this.f35737a, this.f35747k);
    }

    private C5042d k() {
        y5.n nVar = new y5.n() { // from class: i6.b
            @Override // y5.n
            public final Object get() {
                return AnimatedFactoryV2Impl.e();
            }
        };
        ExecutorService c6947d = this.f35745i;
        if (c6947d == null) {
            c6947d = new C6947d(this.f35738b.d());
        }
        y5.n nVar2 = new y5.n() { // from class: i6.c
            @Override // y5.n
            public final Object get() {
                return AnimatedFactoryV2Impl.f();
            }
        };
        y5.n nVar3 = o.f64829b;
        return new C5042d(l(), i.o(), c6947d, RealtimeSinceBootClock.get(), this.f35737a, this.f35739c, nVar, nVar2, nVar3, o.a(Boolean.valueOf(this.f35747k)), o.a(Boolean.valueOf(this.f35740d)), o.a(Integer.valueOf(this.f35746j)), o.a(Integer.valueOf(this.f35748l)));
    }

    private InterfaceC6646b l() {
        if (this.f35742f == null) {
            this.f35742f = new b();
        }
        return this.f35742f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C6740a m() {
        if (this.f35743g == null) {
            this.f35743g = new C6740a();
        }
        return this.f35743g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public s6.d n() {
        if (this.f35741e == null) {
            this.f35741e = j();
        }
        return this.f35741e;
    }

    @Override // s6.InterfaceC6436a
    public D6.a a(Context context) {
        if (this.f35744h == null) {
            this.f35744h = k();
        }
        return this.f35744h;
    }

    @Override // s6.InterfaceC6436a
    public C6.c b() {
        return new C6.c() { // from class: i6.a
            @Override // C6.c
            public final e a(k kVar, int i10, p pVar, y6.d dVar) {
                return this.f48708a.n().a(kVar, dVar, dVar.f64845i);
            }
        };
    }

    @Override // s6.InterfaceC6436a
    public C6.c c() {
        return new a();
    }
}
