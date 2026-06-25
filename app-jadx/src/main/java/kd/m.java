package Kd;

import Gf.AbstractC1617k;
import Gf.O;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import expo.modules.video.player.VideoPlayer;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le.InterfaceC5593d;
import pe.InterfaceC6023m;
import q2.InterfaceC6084P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements InterfaceC5593d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ub.d f11014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f11015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC6084P.d f11017d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC6084P.d {
        a() {
        }

        @Override // q2.InterfaceC6084P.d
        public void J(int i10) {
            VideoPlayer videoPlayer = (VideoPlayer) m.this.f11015b.get();
            if (videoPlayer == null) {
                return;
            }
            if (i10 != 1) {
                if (i10 == 2 || i10 == 3) {
                    if (videoPlayer.getPlayer().q0()) {
                        Id.m.f9065a.s(videoPlayer);
                        return;
                    }
                    return;
                } else if (i10 != 4) {
                    return;
                }
            }
            Id.m.f9065a.s(videoPlayer);
        }

        @Override // q2.InterfaceC6084P.d
        public void y0(boolean z10) {
            VideoPlayer videoPlayer = (VideoPlayer) m.this.f11015b.get();
            if (videoPlayer == null) {
                return;
            }
            if (z10) {
                Id.m.f9065a.s(videoPlayer);
            } else {
                Id.m.f9065a.r(videoPlayer);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11019a;

        b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return m.this.new b(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f11019a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer videoPlayer = (VideoPlayer) m.this.f11015b.get();
            if (videoPlayer == null) {
                return L.f17438a;
            }
            InterfaceC6084P.d dVar = m.this.f11017d;
            if (dVar == null) {
                return L.f17438a;
            }
            videoPlayer.getPlayer().H(dVar);
            m.this.f11017d = null;
            Id.m.f9065a.r(videoPlayer);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11021a;

        c(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return m.this.new c(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f11021a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer videoPlayer = (VideoPlayer) m.this.f11015b.get();
            if (videoPlayer == null) {
                return L.f17438a;
            }
            InterfaceC6084P.d dVarG = m.this.g();
            m.this.f11017d = dVarG;
            videoPlayer.getPlayer().a0(dVarG);
            Id.m.f9065a.s(videoPlayer);
            return L.f17438a;
        }
    }

    public m(VideoPlayer player, Ub.d appContext, boolean z10) {
        AbstractC5504s.h(player, "player");
        AbstractC5504s.h(appContext, "appContext");
        this.f11014a = appContext;
        this.f11015b = new WeakReference(player);
        this.f11016c = z10;
        if (z10) {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084P.d g() {
        return new a();
    }

    private final void h() {
        AbstractC1617k.d(this.f11014a.x(), null, null, new b(null), 3, null);
    }

    private final void i() {
        AbstractC1617k.d(this.f11014a.x(), null, null, new c(null), 3, null);
    }

    @Override // le.InterfaceC5593d
    public /* bridge */ /* synthetic */ void b(Object obj, InterfaceC6023m interfaceC6023m, Object obj2) {
        l(obj, interfaceC6023m, ((Boolean) obj2).booleanValue());
    }

    @Override // le.InterfaceC5593d, le.InterfaceC5592c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean a(Object obj, InterfaceC6023m property) {
        AbstractC5504s.h(property, "property");
        return Boolean.valueOf(this.f11016c);
    }

    public final void k(boolean z10) {
        if (z10) {
            i();
        } else {
            h();
        }
        this.f11016c = z10;
    }

    public void l(Object obj, InterfaceC6023m property, boolean z10) {
        AbstractC5504s.h(property, "property");
        k(z10);
    }

    public /* synthetic */ m(VideoPlayer videoPlayer, Ub.d dVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoPlayer, dVar, (i10 & 4) != 0 ? true : z10);
    }
}
