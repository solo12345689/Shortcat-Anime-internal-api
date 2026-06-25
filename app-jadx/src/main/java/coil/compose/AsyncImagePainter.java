package coil.compose;

import G4.f;
import G4.h;
import G4.i;
import G4.q;
import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.O;
import Gf.P;
import Gf.X0;
import I0.InterfaceC1680f;
import Jf.AbstractC1744g;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Jf.K;
import Jf.u;
import Td.InterfaceC2158i;
import Td.L;
import Td.r;
import Td.v;
import Y.C0;
import Y.InterfaceC2453v1;
import Y.U1;
import Y.b2;
import ae.AbstractC2605b;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.accompanist.drawablepainter.DrawablePainter;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.C5487a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC5499m;
import r0.C6230l;
import u0.InterfaceC6711f;
import v4.InterfaceC6845d;
import w0.AbstractC6922a;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0003'\u0080\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u000e*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0001*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\t*\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u000bJ\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\u000bJ\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u000bR\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b2\u00103R/\u0010<\u001a\u0004\u0018\u00010\u00012\b\u00105\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R+\u0010!\u001a\u00020 2\u0006\u00105\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR/\u0010&\u001a\u0004\u0018\u00010%2\b\u00105\u001a\u0004\u0018\u00010%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bB\u00107\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010K\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bH\u0010I\"\u0004\bJ\u0010\u0011R(\u0010N\u001a\u0004\u0018\u00010\u00012\b\u0010G\u001a\u0004\u0018\u00010\u00018\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001e\u0010L\"\u0004\bM\u0010;R.\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR0\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\"\u0010b\u001a\u00020[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR+\u0010j\u001a\u00020c8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010q\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR+\u0010v\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\br\u00107\u001a\u0004\bs\u0010t\"\u0004\bu\u0010\u0011R+\u0010\u0004\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00038F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u00107\u001a\u0004\bw\u0010x\"\u0004\be\u0010yR+\u0010\u0006\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00058F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00107\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001d\u0010\u007f\u001a\u0002018VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bB\u0010~\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0081\u0001"}, d2 = {"Lcoil/compose/AsyncImagePainter;", "Lw0/b;", "LY/v1;", "LG4/h;", "request", "Lv4/d;", "imageLoader", "<init>", "(LG4/h;Lv4/d;)V", "LTd/L;", "t", "()V", "P", "(LG4/h;)LG4/h;", "Lcoil/compose/AsyncImagePainter$State;", "input", "Q", "(Lcoil/compose/AsyncImagePainter$State;)V", "previous", "current", "Lcoil/compose/CrossfadePainter;", "z", "(Lcoil/compose/AsyncImagePainter$State;Lcoil/compose/AsyncImagePainter$State;)Lcoil/compose/CrossfadePainter;", "LG4/i;", "O", "(LG4/i;)Lcoil/compose/AsyncImagePainter$State;", "Landroid/graphics/drawable/Drawable;", "N", "(Landroid/graphics/drawable/Drawable;)Lw0/b;", "Lu0/f;", "m", "(Lu0/f;)V", "", "alpha", "", "a", "(F)Z", "Landroidx/compose/ui/graphics/d;", "colorFilter", "b", "(Landroidx/compose/ui/graphics/d;)Z", "c", "e", "d", "LGf/O;", "g", "LGf/O;", "rememberScope", "LJf/u;", "Lr0/l;", "h", "LJf/u;", "drawSize", "<set-?>", "i", "LY/C0;", "x", "()Lw0/b;", "G", "(Lw0/b;)V", "painter", "j", "u", "()F", "A", "(F)V", "k", "v", "()Landroidx/compose/ui/graphics/d;", "B", "(Landroidx/compose/ui/graphics/d;)V", "value", "l", "Lcoil/compose/AsyncImagePainter$State;", "M", "_state", "Lw0/b;", "L", "_painter", "Lkotlin/Function1;", "n", "Lkotlin/jvm/functions/Function1;", "getTransform$coil_compose_base_release", "()Lkotlin/jvm/functions/Function1;", "K", "(Lkotlin/jvm/functions/Function1;)V", "transform", "o", "getOnState$coil_compose_base_release", "F", "onState", "LI0/f;", "p", "LI0/f;", "getContentScale$coil_compose_base_release", "()LI0/f;", "C", "(LI0/f;)V", "contentScale", "Ls0/X0;", "q", "I", "getFilterQuality-f-v9h1I$coil_compose_base_release", "()I", "D", "(I)V", "filterQuality", "r", "Z", "isPreview$coil_compose_base_release", "()Z", "H", "(Z)V", "isPreview", "s", "getState", "()Lcoil/compose/AsyncImagePainter$State;", "J", "state", "y", "()LG4/h;", "(LG4/h;)V", "w", "()Lv4/d;", "E", "(Lv4/d;)V", "()J", "intrinsicSize", "State", "coil-compose-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AsyncImagePainter extends AbstractC6923b implements InterfaceC2453v1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Function1 f33787w = a.f33806a;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private O rememberScope;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final u drawSize = K.a(C6230l.c(C6230l.f58350b.b()));

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C0 painter = b2.e(null, null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C0 alpha = b2.e(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C0 colorFilter = b2.e(null, null, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private State _state;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private AbstractC6923b _painter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Function1 transform;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function1 onState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1680f contentScale;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int filterQuality;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isPreview;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final C0 state;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final C0 request;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final C0 imageLoader;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class State {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Error;", "Lcoil/compose/AsyncImagePainter$State;", "Lw0/b;", "painter", "LG4/f;", "result", "<init>", "(Lw0/b;LG4/f;)V", "b", "(Lw0/b;LG4/f;)Lcoil/compose/AsyncImagePainter$State$Error;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lw0/b;", "a", "()Lw0/b;", "LG4/f;", "d", "()LG4/f;", "coil-compose-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Error extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final f result;
            private final AbstractC6923b painter;

            public Error(AbstractC6923b abstractC6923b, f fVar) {
                super(null);
                this.painter = abstractC6923b;
                this.result = fVar;
            }

            public static /* synthetic */ Error c(Error error, AbstractC6923b abstractC6923b, f fVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    abstractC6923b = error.painter;
                }
                if ((i10 & 2) != 0) {
                    fVar = error.result;
                }
                return error.b(abstractC6923b, fVar);
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* JADX INFO: renamed from: a, reason: from getter */
            public AbstractC6923b getPainter() {
                return this.painter;
            }

            public final Error b(AbstractC6923b painter, f result) {
                return new Error(painter, result);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final f getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return AbstractC5504s.c(this.painter, error.painter) && AbstractC5504s.c(this.result, error.result);
            }

            public int hashCode() {
                AbstractC6923b abstractC6923b = this.painter;
                return ((abstractC6923b == null ? 0 : abstractC6923b.hashCode()) * 31) + this.result.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.painter + ", result=" + this.result + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Loading;", "Lcoil/compose/AsyncImagePainter$State;", "Lw0/b;", "painter", "<init>", "(Lw0/b;)V", "b", "(Lw0/b;)Lcoil/compose/AsyncImagePainter$State$Loading;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lw0/b;", "a", "()Lw0/b;", "coil-compose-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Loading extends State {
            private final AbstractC6923b painter;

            public Loading(AbstractC6923b abstractC6923b) {
                super(null);
                this.painter = abstractC6923b;
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* JADX INFO: renamed from: a, reason: from getter */
            public AbstractC6923b getPainter() {
                return this.painter;
            }

            public final Loading b(AbstractC6923b painter) {
                return new Loading(painter);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && AbstractC5504s.c(this.painter, ((Loading) other).painter);
            }

            public int hashCode() {
                AbstractC6923b abstractC6923b = this.painter;
                if (abstractC6923b == null) {
                    return 0;
                }
                return abstractC6923b.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.painter + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Success;", "Lcoil/compose/AsyncImagePainter$State;", "Lw0/b;", "painter", "LG4/q;", "result", "<init>", "(Lw0/b;LG4/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lw0/b;", "a", "()Lw0/b;", "LG4/q;", "b", "()LG4/q;", "coil-compose-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Success extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final q result;
            private final AbstractC6923b painter;

            public Success(AbstractC6923b abstractC6923b, q qVar) {
                super(null);
                this.painter = abstractC6923b;
                this.result = qVar;
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* JADX INFO: renamed from: a, reason: from getter */
            public AbstractC6923b getPainter() {
                return this.painter;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final q getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return AbstractC5504s.c(this.painter, success.painter) && AbstractC5504s.c(this.result, success.result);
            }

            public int hashCode() {
                return (this.painter.hashCode() * 31) + this.result.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.painter + ", result=" + this.result + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33805a = new a();

            private a() {
                super(null);
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* JADX INFO: renamed from: a */
            public AbstractC6923b getPainter() {
                return null;
            }
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract AbstractC6923b getPainter();

        private State() {
        }
    }

    /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1 a() {
            return AsyncImagePainter.f33787w;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33807a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AsyncImagePainter f33809a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AsyncImagePainter asyncImagePainter) {
                super(0);
                this.f33809a = asyncImagePainter;
            }

            @Override // ie.InterfaceC5082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h invoke() {
                return this.f33809a.y();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f33810a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f33811b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AsyncImagePainter f33812c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AsyncImagePainter asyncImagePainter, Zd.e eVar) {
                super(2, eVar);
                this.f33812c = asyncImagePainter;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h hVar, Zd.e eVar) {
                return ((b) create(hVar, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new b(this.f33812c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AsyncImagePainter asyncImagePainter;
                Object objF = AbstractC2605b.f();
                int i10 = this.f33811b;
                if (i10 == 0) {
                    v.b(obj);
                    AsyncImagePainter asyncImagePainter2 = this.f33812c;
                    InterfaceC6845d interfaceC6845dW = asyncImagePainter2.w();
                    AsyncImagePainter asyncImagePainter3 = this.f33812c;
                    h hVarP = asyncImagePainter3.P(asyncImagePainter3.y());
                    this.f33810a = asyncImagePainter2;
                    this.f33811b = 1;
                    Object objC = interfaceC6845dW.c(hVarP, this);
                    if (objC == objF) {
                        return objF;
                    }
                    asyncImagePainter = asyncImagePainter2;
                    obj = objC;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    asyncImagePainter = (AsyncImagePainter) this.f33810a;
                    v.b(obj);
                }
                return asyncImagePainter.O((i) obj);
            }
        }

        /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        /* synthetic */ class C0575c implements InterfaceC1743f, InterfaceC5499m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AsyncImagePainter f33813a;

            C0575c(AsyncImagePainter asyncImagePainter) {
                this.f33813a = asyncImagePainter;
            }

            @Override // Jf.InterfaceC1743f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(State state, Zd.e eVar) {
                Object objI = c.i(this.f33813a, state, eVar);
                return objI == AbstractC2605b.f() ? objI : L.f17438a;
            }

            @Override // kotlin.jvm.internal.InterfaceC5499m
            public final InterfaceC2158i b() {
                return new C5487a(2, this.f33813a, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC1743f) && (obj instanceof InterfaceC5499m)) {
                    return AbstractC5504s.c(b(), ((InterfaceC5499m) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        c(Zd.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object i(AsyncImagePainter asyncImagePainter, State state, Zd.e eVar) {
            asyncImagePainter.Q(state);
            return L.f17438a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return AsyncImagePainter.this.new c(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f33807a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1742e interfaceC1742eT = AbstractC1744g.t(U1.p(new a(AsyncImagePainter.this)), new b(AsyncImagePainter.this, null));
                C0575c c0575c = new C0575c(AsyncImagePainter.this);
                this.f33807a = 1;
                if (interfaceC1742eT.collect(c0575c, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e implements H4.i {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements InterfaceC1742e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC1742e f33816a;

            /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class C0576a implements InterfaceC1743f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC1743f f33817a;

                /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$e$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                public static final class C0577a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f33818a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f33819b;

                    public C0577a(Zd.e eVar) {
                        super(eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f33818a = obj;
                        this.f33819b |= Integer.MIN_VALUE;
                        return C0576a.this.emit(null, this);
                    }
                }

                public C0576a(InterfaceC1743f interfaceC1743f) {
                    this.f33817a = interfaceC1743f;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Jf.InterfaceC1743f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, Zd.e r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof coil.compose.AsyncImagePainter.e.a.C0576a.C0577a
                        if (r0 == 0) goto L13
                        r0 = r8
                        coil.compose.AsyncImagePainter$e$a$a$a r0 = (coil.compose.AsyncImagePainter.e.a.C0576a.C0577a) r0
                        int r1 = r0.f33819b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f33819b = r1
                        goto L18
                    L13:
                        coil.compose.AsyncImagePainter$e$a$a$a r0 = new coil.compose.AsyncImagePainter$e$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f33818a
                        java.lang.Object r1 = ae.AbstractC2605b.f()
                        int r2 = r0.f33819b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        Td.v.b(r8)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        Td.v.b(r8)
                        Jf.f r8 = r6.f33817a
                        r0.l r7 = (r0.C6230l) r7
                        long r4 = r7.m()
                        H4.h r7 = coil.compose.b.b(r4)
                        if (r7 == 0) goto L4b
                        r0.f33819b = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L4b
                        return r1
                    L4b:
                        Td.L r7 = Td.L.f17438a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: coil.compose.AsyncImagePainter.e.a.C0576a.emit(java.lang.Object, Zd.e):java.lang.Object");
                }
            }

            public a(InterfaceC1742e interfaceC1742e) {
                this.f33816a = interfaceC1742e;
            }

            @Override // Jf.InterfaceC1742e
            public Object collect(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
                Object objCollect = this.f33816a.collect(new C0576a(interfaceC1743f), eVar);
                return objCollect == AbstractC2605b.f() ? objCollect : L.f17438a;
            }
        }

        e() {
        }

        @Override // H4.i
        public final Object c(Zd.e eVar) {
            return AbstractC1744g.n(new a(AsyncImagePainter.this.drawSize), eVar);
        }
    }

    public AsyncImagePainter(h hVar, InterfaceC6845d interfaceC6845d) {
        State.a aVar = State.a.f33805a;
        this._state = aVar;
        this.transform = f33787w;
        this.contentScale = InterfaceC1680f.f8703a.b();
        this.filterQuality = InterfaceC6711f.f61110j0.b();
        this.state = b2.e(aVar, null, 2, null);
        this.request = b2.e(hVar, null, 2, null);
        this.imageLoader = b2.e(interfaceC6845d, null, 2, null);
    }

    private final void A(float f10) {
        this.alpha.setValue(Float.valueOf(f10));
    }

    private final void B(androidx.compose.ui.graphics.d dVar) {
        this.colorFilter.setValue(dVar);
    }

    private final void G(AbstractC6923b abstractC6923b) {
        this.painter.setValue(abstractC6923b);
    }

    private final void J(State state) {
        this.state.setValue(state);
    }

    private final void L(AbstractC6923b abstractC6923b) {
        this._painter = abstractC6923b;
        G(abstractC6923b);
    }

    private final void M(State state) {
        this._state = state;
        J(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC6923b N(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? AbstractC6922a.b(s0.O.c(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.filterQuality, 6, null) : new DrawablePainter(drawable.mutate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State O(i iVar) {
        if (iVar instanceof q) {
            q qVar = (q) iVar;
            return new State.Success(N(qVar.a()), qVar);
        }
        if (!(iVar instanceof f)) {
            throw new r();
        }
        Drawable drawableA = iVar.a();
        return new State.Error(drawableA != null ? N(drawableA) : null, (f) iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h P(h request) {
        h.a aVarO = h.R(request, null, 1, null).o(new d());
        if (request.q().m() == null) {
            aVarO.n(new e());
        }
        if (request.q().l() == null) {
            aVarO.m(coil.compose.c.g(this.contentScale));
        }
        if (request.q().k() != H4.e.EXACT) {
            aVarO.g(H4.e.INEXACT);
        }
        return aVarO.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(State input) {
        State state = this._state;
        State state2 = (State) this.transform.invoke(input);
        M(state2);
        AbstractC6923b abstractC6923bZ = z(state, state2);
        if (abstractC6923bZ == null) {
            abstractC6923bZ = state2.getPainter();
        }
        L(abstractC6923bZ);
        if (this.rememberScope != null && state.getPainter() != state2.getPainter()) {
            Object painter = state.getPainter();
            InterfaceC2453v1 interfaceC2453v1 = painter instanceof InterfaceC2453v1 ? (InterfaceC2453v1) painter : null;
            if (interfaceC2453v1 != null) {
                interfaceC2453v1.e();
            }
            Object painter2 = state2.getPainter();
            InterfaceC2453v1 interfaceC2453v12 = painter2 instanceof InterfaceC2453v1 ? (InterfaceC2453v1) painter2 : null;
            if (interfaceC2453v12 != null) {
                interfaceC2453v12.c();
            }
        }
        Function1 function1 = this.onState;
        if (function1 != null) {
            function1.invoke(state2);
        }
    }

    private final void t() {
        O o10 = this.rememberScope;
        if (o10 != null) {
            P.d(o10, null, 1, null);
        }
        this.rememberScope = null;
    }

    private final float u() {
        return ((Number) this.alpha.getValue()).floatValue();
    }

    private final androidx.compose.ui.graphics.d v() {
        return (androidx.compose.ui.graphics.d) this.colorFilter.getValue();
    }

    private final AbstractC6923b x() {
        return (AbstractC6923b) this.painter.getValue();
    }

    private final CrossfadePainter z(State previous, State current) {
        i result;
        if (!(current instanceof State.Success)) {
            if (current instanceof State.Error) {
                result = ((State.Error) current).getResult();
            }
            return null;
        }
        result = ((State.Success) current).getResult();
        K4.c cVarA = result.b().P().a(b.f33868a, result);
        if (cVarA instanceof K4.a) {
            K4.a aVar = (K4.a) cVarA;
            return new CrossfadePainter(previous instanceof State.Loading ? previous.getPainter() : null, current.getPainter(), this.contentScale, aVar.b(), ((result instanceof q) && ((q) result).d()) ? false : true, aVar.c());
        }
        return null;
    }

    public final void C(InterfaceC1680f interfaceC1680f) {
        this.contentScale = interfaceC1680f;
    }

    public final void D(int i10) {
        this.filterQuality = i10;
    }

    public final void E(InterfaceC6845d interfaceC6845d) {
        this.imageLoader.setValue(interfaceC6845d);
    }

    public final void F(Function1 function1) {
        this.onState = function1;
    }

    public final void H(boolean z10) {
        this.isPreview = z10;
    }

    public final void I(h hVar) {
        this.request.setValue(hVar);
    }

    public final void K(Function1 function1) {
        this.transform = function1;
    }

    @Override // w0.AbstractC6923b
    protected boolean a(float alpha) {
        A(alpha);
        return true;
    }

    @Override // w0.AbstractC6923b
    protected boolean b(androidx.compose.ui.graphics.d colorFilter) {
        B(colorFilter);
        return true;
    }

    @Override // Y.InterfaceC2453v1
    public void c() {
        if (this.rememberScope != null) {
            return;
        }
        O oA = P.a(X0.b(null, 1, null).w(C1608f0.c().d2()));
        this.rememberScope = oA;
        Object obj = this._painter;
        InterfaceC2453v1 interfaceC2453v1 = obj instanceof InterfaceC2453v1 ? (InterfaceC2453v1) obj : null;
        if (interfaceC2453v1 != null) {
            interfaceC2453v1.c();
        }
        if (!this.isPreview) {
            AbstractC1617k.d(oA, null, null, new c(null), 3, null);
        } else {
            Drawable drawableF = h.R(y(), null, 1, null).d(w().a()).a().F();
            Q(new State.Loading(drawableF != null ? N(drawableF) : null));
        }
    }

    @Override // Y.InterfaceC2453v1
    public void d() {
        t();
        Object obj = this._painter;
        InterfaceC2453v1 interfaceC2453v1 = obj instanceof InterfaceC2453v1 ? (InterfaceC2453v1) obj : null;
        if (interfaceC2453v1 != null) {
            interfaceC2453v1.d();
        }
    }

    @Override // Y.InterfaceC2453v1
    public void e() {
        t();
        Object obj = this._painter;
        InterfaceC2453v1 interfaceC2453v1 = obj instanceof InterfaceC2453v1 ? (InterfaceC2453v1) obj : null;
        if (interfaceC2453v1 != null) {
            interfaceC2453v1.e();
        }
    }

    @Override // w0.AbstractC6923b
    public long k() {
        AbstractC6923b abstractC6923bX = x();
        return abstractC6923bX != null ? abstractC6923bX.k() : C6230l.f58350b.a();
    }

    @Override // w0.AbstractC6923b
    protected void m(InterfaceC6711f interfaceC6711f) {
        this.drawSize.setValue(C6230l.c(interfaceC6711f.f()));
        AbstractC6923b abstractC6923bX = x();
        if (abstractC6923bX != null) {
            abstractC6923bX.j(interfaceC6711f, interfaceC6711f.f(), u(), v());
        }
    }

    public final InterfaceC6845d w() {
        return (InterfaceC6845d) this.imageLoader.getValue();
    }

    public final h y() {
        return (h) this.request.getValue();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33806a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final State invoke(State state) {
            return state;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements I4.a {
        public d() {
        }

        @Override // I4.a
        public void c(Drawable drawable) {
            AsyncImagePainter.this.Q(new State.Loading(drawable != null ? AsyncImagePainter.this.N(drawable) : null));
        }

        @Override // I4.a
        public void a(Drawable drawable) {
        }

        @Override // I4.a
        public void d(Drawable drawable) {
        }
    }
}
