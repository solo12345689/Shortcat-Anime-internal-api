package Ib;

import Td.AbstractC2163n;
import android.os.Build;
import b5.AbstractC3012n;
import expo.modules.image.records.DecodeFormat;
import ie.InterfaceC5082a;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final DecodeFormat f9008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Lazy f9009k;

    public u(DecodeFormat decodeFormat) {
        AbstractC5504s.h(decodeFormat, "decodeFormat");
        this.f9008j = decodeFormat;
        this.f9009k = AbstractC2163n.b(new InterfaceC5082a() { // from class: Ib.t
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return Integer.valueOf(u.e());
            }
        });
    }

    private final int d() {
        return ((Number) this.f9009k.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        try {
            Method method = Class.forName(com.amazon.a.a.o.b.at).getMethod("getInt", String.class, Integer.TYPE);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, "ro.hwui.max_texture_allocation_size", 104857600);
            AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return AbstractC5874j.e(((Integer) objInvoke).intValue(), 104857600);
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // b5.AbstractC3012n
    public AbstractC3012n.g a(int i10, int i11, int i12, int i13) {
        return AbstractC3012n.g.MEMORY;
    }

    @Override // b5.AbstractC3012n
    public float b(int i10, int i11, int i12, int i13) {
        if (d() <= 0 || i10 * i11 * this.f9008j.toBytes() <= d()) {
            return 1.0f;
        }
        return (float) (((double) ((int) Math.floor(Math.sqrt(((double) (d() / this.f9008j.toBytes())) / (((double) Math.min(i10, i11)) / ((double) Math.max(i10, i11))))))) / ((double) Math.max(i10, i11)));
    }

    @Override // Ib.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f9008j == ((u) obj).f9008j;
    }

    @Override // Ib.c
    public int hashCode() {
        return (super.hashCode() * 31) + this.f9008j.hashCode();
    }
}
