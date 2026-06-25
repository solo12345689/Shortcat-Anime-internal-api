package Vf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class V extends B0 {
    protected abstract String Z(String str, String str2);

    protected abstract String a0(Tf.e eVar, int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.B0
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String W(Tf.e eVar, int i10) {
        AbstractC5504s.h(eVar, "<this>");
        return c0(a0(eVar, i10));
    }

    protected final String c0(String nestedName) {
        AbstractC5504s.h(nestedName, "nestedName");
        String str = (String) V();
        if (str == null) {
            str = "";
        }
        return Z(str, nestedName);
    }
}
