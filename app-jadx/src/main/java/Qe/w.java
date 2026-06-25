package Qe;

import Qe.v;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class w {
    public static final x a(v vVar, Oe.g javaClass, Ue.c metadataVersion) {
        AbstractC5504s.h(vVar, "<this>");
        AbstractC5504s.h(javaClass, "javaClass");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        v.a aVarA = vVar.a(javaClass, metadataVersion);
        if (aVarA != null) {
            return aVarA.a();
        }
        return null;
    }

    public static final x b(v vVar, Xe.b classId, Ue.c metadataVersion) {
        AbstractC5504s.h(vVar, "<this>");
        AbstractC5504s.h(classId, "classId");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        v.a aVarC = vVar.c(classId, metadataVersion);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }
}
