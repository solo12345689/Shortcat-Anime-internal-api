package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f32494b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f32493a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f32495c = new ArrayList();

    public y(View view) {
        this.f32494b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f32494b == yVar.f32494b && this.f32493a.equals(yVar.f32493a);
    }

    public int hashCode() {
        return (this.f32494b.hashCode() * 31) + this.f32493a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f32494b + "\n") + "    values:";
        for (String str2 : this.f32493a.keySet()) {
            str = str + "    " + str2 + ": " + this.f32493a.get(str2) + "\n";
        }
        return str;
    }
}
