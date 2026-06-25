package Vf;

import Td.AbstractC2163n;
import Ud.AbstractC2273n;
import ie.InterfaceC5082a;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2356z implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Enum[] f20260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Tf.e f20261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f20262c;

    public C2356z(final String serialName, Enum[] values) {
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(values, "values");
        this.f20260a = values;
        this.f20262c = AbstractC2163n.b(new InterfaceC5082a() { // from class: Vf.y
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C2356z.c(this.f20255a, serialName);
            }
        });
    }

    private final Tf.e b(String str) {
        C2354x c2354x = new C2354x(str, this.f20260a.length);
        for (Enum r02 : this.f20260a) {
            C2337k0.q(c2354x, r02.name(), false, 2, null);
        }
        return c2354x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tf.e c(C2356z c2356z, String str) {
        Tf.e eVar = c2356z.f20261b;
        return eVar == null ? c2356z.b(str) : eVar;
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        int iK = decoder.k(getDescriptor());
        if (iK >= 0) {
            Enum[] enumArr = this.f20260a;
            if (iK < enumArr.length) {
                return enumArr[iK];
            }
        }
        throw new Rf.j(iK + " is not among valid " + getDescriptor().o() + " enum values, values size is " + this.f20260a.length);
    }

    @Override // Rf.k
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(Uf.f encoder, Enum value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        int iN0 = AbstractC2273n.n0(this.f20260a, value);
        if (iN0 != -1) {
            encoder.e(getDescriptor(), iN0);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().o());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.f20260a);
        AbstractC5504s.g(string, "toString(...)");
        sb2.append(string);
        throw new Rf.j(sb2.toString());
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return (Tf.e) this.f20262c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().o() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2356z(String serialName, Enum[] values, Tf.e descriptor) {
        this(serialName, values);
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(values, "values");
        AbstractC5504s.h(descriptor, "descriptor");
        this.f20261b = descriptor;
    }
}
