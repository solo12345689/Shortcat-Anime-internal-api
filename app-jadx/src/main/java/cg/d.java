package cg;

import android.graphics.Color;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f33620a;

    public d(Bundle bundle) {
        this.f33620a = bundle;
    }

    public Integer a() {
        if (this.f33620a.containsKey("lightColor")) {
            return Integer.valueOf(Color.parseColor(this.f33620a.getString("lightColor")));
        }
        return null;
    }
}
