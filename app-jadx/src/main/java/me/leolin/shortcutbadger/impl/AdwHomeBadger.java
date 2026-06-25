package me.leolin.shortcutbadger.impl;

import Zf.a;
import Zf.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import bg.AbstractC3051a;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class AdwHomeBadger implements a {
    @Override // Zf.a
    public List a() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override // Zf.a
    public void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i10);
        AbstractC3051a.c(context, intent);
    }
}
