package be;

import Ud.AbstractC2263d;
import Ud.AbstractC2273n;
import java.io.Serializable;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: be.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C3049b extends AbstractC2263d implements EnumEntries, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Enum[] f33288b;

    public C3049b(Enum[] entries) {
        AbstractC5504s.h(entries, "entries");
        this.f33288b = entries;
    }

    @Override // Ud.AbstractC2261b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return f((Enum) obj);
        }
        return false;
    }

    @Override // Ud.AbstractC2261b
    public int d() {
        return this.f33288b.length;
    }

    public boolean f(Enum element) {
        AbstractC5504s.h(element, "element");
        return ((Enum) AbstractC2273n.i0(this.f33288b, element.ordinal())) == element;
    }

    @Override // Ud.AbstractC2263d, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        AbstractC2263d.f19502a.b(i10, this.f33288b.length);
        return this.f33288b[i10];
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return l((Enum) obj);
        }
        return -1;
    }

    public int l(Enum element) {
        AbstractC5504s.h(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC2273n.i0(this.f33288b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return p((Enum) obj);
        }
        return -1;
    }

    public int p(Enum element) {
        AbstractC5504s.h(element, "element");
        return indexOf(element);
    }
}
