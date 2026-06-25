package androidx.compose.material.ripple;

import B.j;
import B.k;
import B.o;
import Gf.AbstractC1617k;
import Gf.O;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import K0.AbstractC1796k;
import K0.AbstractC1807u;
import K0.D;
import K0.InterfaceC1790h;
import K0.InterfaceC1806t;
import T.f;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import i1.AbstractC5026s;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6230l;
import s0.InterfaceC6389t0;
import t.C6546L;
import u0.InterfaceC6708c;
import u0.InterfaceC6711f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\u0014*\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\u0014*\u00020&H&¢\u0006\u0004\b'\u0010(J*\u0010-\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020*2\u0006\u0010,\u001a\u00020+H&ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)H&¢\u0006\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00109R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u00106R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00108R*\u0010K\u001a\u00020*2\u0006\u0010F\u001a\u00020*8\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00104R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00120N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0017\u0010T\u001a\u00020R8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bS\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/ui/e$c;", "LK0/h;", "LK0/t;", "LK0/D;", "LB/k;", "interactionSource", "", "bounded", "Li1/h;", "radius", "Ls0/t0;", "color", "Lkotlin/Function0;", "LT/d;", "rippleAlpha", "<init>", "(LB/k;ZFLs0/t0;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LB/o;", "pressInteraction", "LTd/L;", "P1", "(LB/o;)V", "LB/j;", "interaction", "LGf/O;", "scope", "R1", "(LB/j;LGf/O;)V", "Li1/r;", "size", "I", "(J)V", "onAttach", "()V", "Lu0/c;", "draw", "(Lu0/c;)V", "Lu0/f;", "K1", "(Lu0/f;)V", "LB/o$b;", "Lr0/l;", "", "targetRadius", "J1", "(LB/o$b;JF)V", "Q1", "(LB/o$b;)V", "a", "LB/k;", "b", "Z", "L1", "()Z", "c", "F", "Ls0/t0;", "d", "Lie/a;", "M1", "()Lie/a;", "e", "getShouldAutoInvalidate", "shouldAutoInvalidate", "Landroidx/compose/material/ripple/e;", "f", "Landroidx/compose/material/ripple/e;", "stateLayer", "g", "<set-?>", "h", "J", "O1", "()J", "rippleSize", "i", "hasValidSize", "Lt/L;", "j", "Lt/L;", "pendingInteractions", "Ls0/r0;", "N1", "rippleColor", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RippleNode extends e.c implements InterfaceC1790h, InterfaceC1806t, D {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final k interactionSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float radius;
    private final InterfaceC6389t0 color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC5082a rippleAlpha;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private e stateLayer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float targetRadius;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long rippleSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean hasValidSize;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C6546L pendingInteractions;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f26510a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f26511b;

        /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleNode$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0460a implements InterfaceC1743f {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ RippleNode f26513a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ O f26514b;

            C0460a(RippleNode rippleNode, O o10) {
                this.f26513a = rippleNode;
                this.f26514b = o10;
            }

            @Override // Jf.InterfaceC1743f
            /* JADX INFO: renamed from: a */
            public final Object emit(j jVar, Zd.e eVar) {
                if (!(jVar instanceof o)) {
                    this.f26513a.R1(jVar, this.f26514b);
                } else if (this.f26513a.hasValidSize) {
                    this.f26513a.P1((o) jVar);
                } else {
                    this.f26513a.pendingInteractions.k(jVar);
                }
                return L.f17438a;
            }
        }

        a(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = RippleNode.this.new a(eVar);
            aVar.f26511b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f26510a;
            if (i10 == 0) {
                v.b(obj);
                O o10 = (O) this.f26511b;
                InterfaceC1742e interfaceC1742eB = RippleNode.this.interactionSource.b();
                C0460a c0460a = new C0460a(RippleNode.this, o10);
                this.f26510a = 1;
                if (interfaceC1742eB.collect(c0460a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    public /* synthetic */ RippleNode(k kVar, boolean z10, float f10, InterfaceC6389t0 interfaceC6389t0, InterfaceC5082a interfaceC5082a, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, z10, f10, interfaceC6389t0, interfaceC5082a);
    }

    public final void P1(o pressInteraction) {
        if (pressInteraction instanceof o.b) {
            J1((o.b) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof o.c) {
            Q1(((o.c) pressInteraction).a());
        } else if (pressInteraction instanceof o.a) {
            Q1(((o.a) pressInteraction).a());
        }
    }

    public final void R1(j interaction, O scope) {
        e eVar = this.stateLayer;
        if (eVar == null) {
            eVar = new e(this.bounded, this.rippleAlpha);
            AbstractC1807u.a(this);
            this.stateLayer = eVar;
        }
        eVar.c(interaction, scope);
    }

    @Override // K0.D
    public void I(long size) {
        this.hasValidSize = true;
        InterfaceC5011d interfaceC5011dJ = AbstractC1796k.j(this);
        this.rippleSize = AbstractC5026s.d(size);
        this.targetRadius = Float.isNaN(this.radius) ? f.a(interfaceC5011dJ, this.bounded, this.rippleSize) : interfaceC5011dJ.l1(this.radius);
        C6546L c6546l = this.pendingInteractions;
        Object[] objArr = c6546l.f60006a;
        int i10 = c6546l.f60007b;
        for (int i11 = 0; i11 < i10; i11++) {
            P1((o) objArr[i11]);
        }
        this.pendingInteractions.n();
    }

    public abstract void J1(o.b interaction, long size, float targetRadius);

    public abstract void K1(InterfaceC6711f interfaceC6711f);

    /* JADX INFO: renamed from: L1, reason: from getter */
    protected final boolean getBounded() {
        return this.bounded;
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    protected final InterfaceC5082a getRippleAlpha() {
        return this.rippleAlpha;
    }

    public final long N1() {
        return this.color.a();
    }

    /* JADX INFO: renamed from: O1, reason: from getter */
    protected final long getRippleSize() {
        return this.rippleSize;
    }

    public abstract void Q1(o.b interaction);

    @Override // K0.InterfaceC1806t
    public void draw(InterfaceC6708c interfaceC6708c) {
        interfaceC6708c.B1();
        e eVar = this.stateLayer;
        if (eVar != null) {
            eVar.b(interfaceC6708c, this.targetRadius, N1());
        }
        K1(interfaceC6708c);
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        AbstractC1617k.d(getCoroutineScope(), null, null, new a(null), 3, null);
    }

    private RippleNode(k kVar, boolean z10, float f10, InterfaceC6389t0 interfaceC6389t0, InterfaceC5082a interfaceC5082a) {
        this.interactionSource = kVar;
        this.bounded = z10;
        this.radius = f10;
        this.color = interfaceC6389t0;
        this.rippleAlpha = interfaceC5082a;
        this.rippleSize = C6230l.f58350b.b();
        this.pendingInteractions = new C6546L(0, 1, null);
    }
}
