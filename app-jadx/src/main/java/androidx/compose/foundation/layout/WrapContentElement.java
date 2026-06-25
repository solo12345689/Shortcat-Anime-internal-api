package androidx.compose.foundation.layout;

import C.EnumC1143n;
import K0.Y;
import androidx.compose.ui.platform.V0;
import i1.AbstractC5022o;
import i1.C5021n;
import i1.C5025r;
import i1.EnumC5027t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0015*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "LK0/Y;", "Landroidx/compose/foundation/layout/v;", "LC/n;", "direction", "", "unbounded", "Lkotlin/Function2;", "Li1/r;", "Li1/t;", "Li1/n;", "alignmentCallback", "", "align", "", "inspectorName", "<init>", "(LC/n;ZLkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/String;)V", "c", "()Landroidx/compose/foundation/layout/v;", "node", "LTd/L;", "h", "(Landroidx/compose/foundation/layout/v;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LC/n;", "Z", "d", "Lkotlin/jvm/functions/Function2;", "e", "Ljava/lang/Object;", "f", "Ljava/lang/String;", "g", "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class WrapContentElement extends Y {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC1143n direction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean unbounded;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function2 alignmentCallback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object align;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0452a extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.c f26115a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0452a(e.c cVar) {
                super(2);
                this.f26115a = cVar;
            }

            public final long a(long j10, EnumC5027t enumC5027t) {
                return AbstractC5022o.a(0, this.f26115a.a(0, C5025r.f(j10)));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return C5021n.c(a(((C5025r) obj).j(), (EnumC5027t) obj2));
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l0.e f26116a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(l0.e eVar) {
                super(2);
                this.f26116a = eVar;
            }

            public final long a(long j10, EnumC5027t enumC5027t) {
                return this.f26116a.a(C5025r.f48570b.a(), j10, enumC5027t);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return C5021n.c(a(((C5025r) obj).j(), (EnumC5027t) obj2));
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$a$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.b f26117a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e.b bVar) {
                super(2);
                this.f26117a = bVar;
            }

            public final long a(long j10, EnumC5027t enumC5027t) {
                return AbstractC5022o.a(this.f26117a.a(0, C5025r.g(j10), enumC5027t), 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return C5021n.c(a(((C5025r) obj).j(), (EnumC5027t) obj2));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WrapContentElement a(e.c cVar, boolean z10) {
            return new WrapContentElement(EnumC1143n.Vertical, z10, new C0452a(cVar), cVar, "wrapContentHeight");
        }

        public final WrapContentElement b(l0.e eVar, boolean z10) {
            return new WrapContentElement(EnumC1143n.Both, z10, new b(eVar), eVar, "wrapContentSize");
        }

        public final WrapContentElement c(e.b bVar, boolean z10) {
            return new WrapContentElement(EnumC1143n.Horizontal, z10, new c(bVar), bVar, "wrapContentWidth");
        }

        private Companion() {
        }
    }

    public WrapContentElement(EnumC1143n enumC1143n, boolean z10, Function2 function2, Object obj, String str) {
        this.direction = enumC1143n;
        this.unbounded = z10;
        this.alignmentCallback = function2;
        this.align = obj;
        this.inspectorName = str;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v create() {
        return new v(this.direction, this.unbounded, this.alignmentCallback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || WrapContentElement.class != other.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) other;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && AbstractC5504s.c(this.align, wrapContentElement.align);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(v node) {
        node.G1(this.direction);
        node.H1(this.unbounded);
        node.F1(this.alignmentCallback);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d(this.inspectorName);
        v02.b().c("align", this.align);
        v02.b().c("unbounded", Boolean.valueOf(this.unbounded));
    }
}
