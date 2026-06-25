package Yc;

import Df.r;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22922b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f22923a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(Context context) {
        AbstractC5504s.h(context, "context");
        this.f22923a = context.getSharedPreferences("expo.modules.notifications.SharedPreferencesNotificationCategoriesStore", 0);
    }

    private final String c(String str) {
        return "notification_category-" + str;
    }

    public final Collection a() {
        Pc.c cVar;
        String str;
        Map<String, ?> all = this.f22923a.getAll();
        AbstractC5504s.g(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            AbstractC5504s.g(key, "<get-key>(...)");
            if (r.Q(key, "notification_category-", false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            try {
                str = (String) ((Map.Entry) it.next()).getValue();
            } catch (IOException | ClassNotFoundException unused) {
            }
            if (str != null) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 2));
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        Object object = objectInputStream.readObject();
                        if (!(object instanceof Pc.c)) {
                            throw new InvalidClassException("Expected serialized object to be an instance of " + Pc.c.class + ". Found: " + object);
                        }
                        fe.c.a(objectInputStream, null);
                        fe.c.a(byteArrayInputStream, null);
                        cVar = (Pc.c) object;
                    } finally {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
                try {
                    throw th2;
                } catch (Throwable th3) {
                    fe.c.a(byteArrayInputStream, th2);
                    throw th3;
                }
            }
            cVar = null;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public final Pc.c b(String identifier) throws IOException {
        AbstractC5504s.h(identifier, "identifier");
        String string = this.f22923a.getString(c(identifier), null);
        if (string == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(string, 2));
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    Object object = objectInputStream.readObject();
                    if (object instanceof Pc.c) {
                        fe.c.a(objectInputStream, null);
                        fe.c.a(byteArrayInputStream, null);
                        return (Pc.c) object;
                    }
                    throw new InvalidClassException("Expected serialized object to be an instance of " + Pc.c.class + ". Found: " + object);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
        }
    }

    public final boolean d(String identifier) {
        AbstractC5504s.h(identifier, "identifier");
        String strC = c(identifier);
        if (this.f22923a.getString(strC, null) == null) {
            return false;
        }
        return this.f22923a.edit().remove(strC).commit();
    }

    public final Pc.c e(Pc.c notificationCategory) {
        AbstractC5504s.h(notificationCategory, "notificationCategory");
        SharedPreferences.Editor editorEdit = this.f22923a.edit();
        String strB = notificationCategory.b();
        AbstractC5504s.g(strB, "getIdentifier(...)");
        if (editorEdit.putString(c(strB), Yc.a.a(notificationCategory)).commit()) {
            return notificationCategory;
        }
        return null;
    }
}
