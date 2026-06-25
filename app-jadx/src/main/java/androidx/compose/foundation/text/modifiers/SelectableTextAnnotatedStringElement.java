package androidx.compose.foundation.text.modifiers;

import K0.Y;
import P.g;
import U0.C2197e;
import U0.Y0;
import Y0.AbstractC2485u;
import androidx.compose.ui.platform.V0;
import g1.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.InterfaceC6389t0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\u000b*\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00109R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "LK0/Y;", "Landroidx/compose/foundation/text/modifiers/a;", "LU0/e;", "text", "LU0/Y0;", "style", "LY0/u$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LU0/T0;", "LTd/L;", "onTextLayout", "Lg1/v;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LU0/e$d;", "LU0/D;", "placeholders", "Lr0/h;", "onPlaceholderLayout", "LP/g;", "selectionController", "Ls0/t0;", "color", "<init>", "(LU0/e;LU0/Y0;LY0/u$b;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;LP/g;Ls0/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/text/modifiers/a;", "node", "h", "(Landroidx/compose/foundation/text/modifiers/a;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "toString", "()Ljava/lang/String;", "b", "LU0/e;", "LU0/Y0;", "d", "LY0/u$b;", "e", "Lkotlin/jvm/functions/Function1;", "f", "I", "g", "Z", "i", "j", "Ljava/util/List;", "k", "l", "LP/g;", "Ls0/t0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SelectableTextAnnotatedStringElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final C2197e text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Y0 style;
    private final InterfaceC6389t0 color;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC2485u.b fontFamilyResolver;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function1 onTextLayout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int overflow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean softWrap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minLines;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List placeholders;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function1 onPlaceholderLayout;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final g selectionController;

    public /* synthetic */ SelectableTextAnnotatedStringElement(C2197e c2197e, Y0 y02, AbstractC2485u.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, g gVar, InterfaceC6389t0 interfaceC6389t0, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2197e, y02, bVar, function1, i10, z10, i11, i12, list, function12, gVar, interfaceC6389t0);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a create() {
        return new a(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null, 4096, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) other;
        return AbstractC5504s.c(this.color, selectableTextAnnotatedStringElement.color) && AbstractC5504s.c(this.text, selectableTextAnnotatedStringElement.text) && AbstractC5504s.c(this.style, selectableTextAnnotatedStringElement.style) && AbstractC5504s.c(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && AbstractC5504s.c(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == selectableTextAnnotatedStringElement.onTextLayout && v.g(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && this.onPlaceholderLayout == selectableTextAnnotatedStringElement.onPlaceholderLayout && AbstractC5504s.c(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(a node) {
        node.K1(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color);
    }

    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        Function1 function1 = this.onTextLayout;
        int iHashCode2 = (((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + v.h(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List list = this.placeholders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.onPlaceholderLayout;
        int iHashCode4 = (((iHashCode3 + (function12 != null ? function12.hashCode() : 0)) * 31) + 0) * 31;
        InterfaceC6389t0 interfaceC6389t0 = this.color;
        return iHashCode4 + (interfaceC6389t0 != null ? interfaceC6389t0.hashCode() : 0);
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.text) + ", style=" + this.style + ", fontFamilyResolver=" + this.fontFamilyResolver + ", onTextLayout=" + this.onTextLayout + ", overflow=" + ((Object) v.i(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", placeholders=" + this.placeholders + ", onPlaceholderLayout=" + this.onPlaceholderLayout + ", selectionController=" + this.selectionController + ", color=" + this.color + ')';
    }

    private SelectableTextAnnotatedStringElement(C2197e c2197e, Y0 y02, AbstractC2485u.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, g gVar, InterfaceC6389t0 interfaceC6389t0) {
        this.text = c2197e;
        this.style = y02;
        this.fontFamilyResolver = bVar;
        this.onTextLayout = function1;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.placeholders = list;
        this.onPlaceholderLayout = function12;
        this.selectionController = gVar;
        this.color = interfaceC6389t0;
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
    }
}
