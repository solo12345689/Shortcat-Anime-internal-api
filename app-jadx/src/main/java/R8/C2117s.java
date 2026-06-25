package R8;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: R8.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2117s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f15367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15368b;

    public C2117s(Context context) {
        AbstractC2115p.l(context);
        Resources resources = context.getResources();
        this.f15367a = resources;
        this.f15368b = resources.getResourcePackageName(O8.k.f13056a);
    }

    public String a(String str) {
        String str2 = this.f15368b;
        Resources resources = this.f15367a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
