package androidx.compose.foundation.text.modifiers;

import K0.Y;
import P.i;
import U0.Y0;
import Y0.AbstractC2485u;
import androidx.compose.ui.platform.V0;
import g1.v;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.InterfaceC6389t0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\u0017*\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "LK0/Y;", "LP/i;", "", "text", "LU0/Y0;", "style", "LY0/u$b;", "fontFamilyResolver", "Lg1/v;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Ls0/t0;", "color", "<init>", "(Ljava/lang/String;LU0/Y0;LY0/u$b;IZIILs0/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()LP/i;", "node", "LTd/L;", "h", "(LP/i;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "b", "Ljava/lang/String;", "LU0/Y0;", "d", "LY0/u$b;", "e", "I", "f", "Z", "g", "Ls0/t0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextStringSimpleElement extends Y {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Y0 style;
    private final InterfaceC6389t0 color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC2485u.b fontFamilyResolver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int minLines;

    public /* synthetic */ TextStringSimpleElement(String str, Y0 y02, AbstractC2485u.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC6389t0 interfaceC6389t0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, y02, bVar, i10, z10, i11, i12, interfaceC6389t0);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c */
    public i create() {
        return new i(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) other;
        return AbstractC5504s.c(this.color, textStringSimpleElement.color) && AbstractC5504s.c(this.text, textStringSimpleElement.text) && AbstractC5504s.c(this.style, textStringSimpleElement.style) && AbstractC5504s.c(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && v.g(this.overflow, textStringSimpleElement.overflow) && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h */
    public void update(i node) {
        node.M1(node.R1(this.color, this.style), node.T1(this.text), node.S1(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + v.h(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        InterfaceC6389t0 interfaceC6389t0 = this.color;
        return iHashCode + (interfaceC6389t0 != null ? interfaceC6389t0.hashCode() : 0);
    }

    private TextStringSimpleElement(String str, Y0 y02, AbstractC2485u.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC6389t0 interfaceC6389t0) {
        this.text = str;
        this.style = y02;
        this.fontFamilyResolver = bVar;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.color = interfaceC6389t0;
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
    }
}
