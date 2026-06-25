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
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020\u000b*\u00020-H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00108R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00106R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010AR\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "LK0/Y;", "Landroidx/compose/foundation/text/modifiers/b;", "LU0/e;", "text", "LU0/Y0;", "style", "LY0/u$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LU0/T0;", "LTd/L;", "onTextLayout", "Lg1/v;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LU0/e$d;", "LU0/D;", "placeholders", "Lr0/h;", "onPlaceholderLayout", "LP/g;", "selectionController", "Ls0/t0;", "color", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(LU0/e;LU0/Y0;LY0/u$b;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/text/modifiers/b;", "node", "h", "(Landroidx/compose/foundation/text/modifiers/b;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "b", "LU0/e;", "LU0/Y0;", "d", "LY0/u$b;", "e", "Lkotlin/jvm/functions/Function1;", "f", "I", "g", "Z", "i", "j", "Ljava/util/List;", "k", "l", "LP/g;", "Ls0/t0;", "m", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextAnnotatedStringElement extends Y {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C2197e text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Y0 style;
    private final InterfaceC6389t0 color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC2485u.b fontFamilyResolver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1 onTextLayout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int minLines;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List placeholders;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Function1 onPlaceholderLayout;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final g selectionController;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Function1 onShowTranslation;

    public /* synthetic */ TextAnnotatedStringElement(C2197e c2197e, Y0 y02, AbstractC2485u.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, g gVar, InterfaceC6389t0 interfaceC6389t0, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2197e, y02, bVar, function1, i10, z10, i11, i12, list, function12, gVar, interfaceC6389t0, function13);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c */
    public b create() {
        return new b(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.onShowTranslation, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) other;
        return AbstractC5504s.c(this.color, textAnnotatedStringElement.color) && AbstractC5504s.c(this.text, textAnnotatedStringElement.text) && AbstractC5504s.c(this.style, textAnnotatedStringElement.style) && AbstractC5504s.c(this.placeholders, textAnnotatedStringElement.placeholders) && AbstractC5504s.c(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && v.g(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout && AbstractC5504s.c(this.selectionController, textAnnotatedStringElement.selectionController);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h */
    public void update(b node) {
        node.L1(node.Y1(this.color, this.style), node.a2(this.text), node.Z1(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow), node.X1(this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.onShowTranslation));
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
        int iHashCode5 = (iHashCode4 + (interfaceC6389t0 != null ? interfaceC6389t0.hashCode() : 0)) * 31;
        Function1 function13 = this.onShowTranslation;
        return iHashCode5 + (function13 != null ? function13.hashCode() : 0);
    }

    private TextAnnotatedStringElement(C2197e c2197e, Y0 y02, AbstractC2485u.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, g gVar, InterfaceC6389t0 interfaceC6389t0, Function1 function13) {
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
        this.onShowTranslation = function13;
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
    }
}
