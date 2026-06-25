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
public class ApexHomeBadger implements a {
    @Override // Zf.a
    public List a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // Zf.a
    public void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i10);
        intent.putExtra("class", componentName.getClassName());
        AbstractC3051a.c(context, intent);
    }
}
