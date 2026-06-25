package com.revenuecat.purchases.ui.revenuecatui.fonts;

import Qf.a;
import Y0.L;
import android.os.Parcel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;", "LQf/a;", "LY0/L;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "create", "(Landroid/os/Parcel;)LY0/L;", "", "flags", "LTd/L;", "write", "(LY0/L;Landroid/os/Parcel;I)V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FontWeightParceler implements a {
    public static final int $stable = 0;
    public static final FontWeightParceler INSTANCE = new FontWeightParceler();

    private FontWeightParceler() {
    }

    /* JADX INFO: renamed from: newArray, reason: merged with bridge method [inline-methods] */
    public L[] m856newArray(int i10) {
        return (L[]) a.C0254a.a(this, i10);
    }

    /* JADX INFO: renamed from: create, reason: merged with bridge method [inline-methods] */
    public L m855create(Parcel parcel) {
        AbstractC5504s.h(parcel, "parcel");
        return new L(parcel.readInt());
    }

    public void write(L l10, Parcel parcel, int i10) {
        AbstractC5504s.h(l10, "<this>");
        AbstractC5504s.h(parcel, "parcel");
        parcel.writeInt(l10.v());
    }
}
