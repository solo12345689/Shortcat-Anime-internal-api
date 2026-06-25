package me.leolin.shortcutbadger.impl;

import Zf.a;
import Zf.b;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import bg.AbstractC3051a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class XiaomiHomeBadger implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResolveInfo f53331a;

    private void c(Context context, int i10) throws b {
        if (this.f53331a == null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            this.f53331a = context.getPackageManager().resolveActivity(intent, 65536);
        }
        if (this.f53331a != null) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            Notification notificationBuild = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.f53331a.getIconResource()).build();
            try {
                Object obj = notificationBuild.getClass().getDeclaredField("extraNotification").get(notificationBuild);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i10));
                notificationManager.notify(0, notificationBuild);
            } catch (Exception e10) {
                throw new b("not able to set badge", e10);
            }
        }
    }

    @Override // Zf.a
    public List a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }

    @Override // Zf.a
    public void b(Context context, ComponentName componentName, int i10) throws b {
        Object objValueOf;
        try {
            Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = objNewInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i10 == 0) {
                objValueOf = "";
            } else {
                try {
                    objValueOf = Integer.valueOf(i10);
                } catch (Exception unused) {
                    declaredField.set(objNewInstance, Integer.valueOf(i10));
                }
            }
            declaredField.set(objNewInstance, String.valueOf(objValueOf));
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + "/" + componentName.getClassName());
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(i10 != 0 ? Integer.valueOf(i10) : ""));
            try {
                AbstractC3051a.c(context, intent);
            } catch (b unused3) {
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            c(context, i10);
        }
    }
}
