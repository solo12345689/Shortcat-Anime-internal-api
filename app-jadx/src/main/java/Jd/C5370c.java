package jd;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Locale;
import kd.C5465c;
import kotlin.jvm.internal.AbstractC5504s;
import sb.i;

/* JADX INFO: renamed from: jd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5370c implements i {
    private final String f(Context context) {
        String string = context.getString(AbstractC5368a.f51747a);
        AbstractC5504s.g(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // sb.i
    public void a(Activity activity, Bundle bundle) {
        AbstractC5504s.h(activity, "activity");
        C5465c.c(f(activity));
    }
}
