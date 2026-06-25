package Yc;

import Df.r;
import Ud.AbstractC2279u;
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
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22924b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f22925a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(Context context) {
        AbstractC5504s.h(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("expo.modules.notifications.SharedPreferencesNotificationsStore", 0);
        AbstractC5504s.g(sharedPreferences, "getSharedPreferences(...)");
        this.f22925a = sharedPreferences;
    }

    private final String c(String str) {
        return "notification_request-" + str;
    }

    private final SharedPreferences.Editor e(SharedPreferences.Editor editor, String str) {
        return editor.remove(c(str));
    }

    public final Collection a() {
        Pc.g gVar;
        String str;
        Map<String, ?> all = this.f22925a.getAll();
        AbstractC5504s.g(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            AbstractC5504s.g(key, "<get-key>(...)");
            if (r.Q(key, "notification_request-", false, 2, null)) {
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
                        if (!(object instanceof Pc.g)) {
                            throw new InvalidClassException("Expected serialized object to be an instance of " + Pc.g.class + ". Found: " + object);
                        }
                        fe.c.a(objectInputStream, null);
                        fe.c.a(byteArrayInputStream, null);
                        gVar = (Pc.g) object;
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
            gVar = null;
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    public final Pc.g b(String identifier) throws IOException {
        AbstractC5504s.h(identifier, "identifier");
        String string = this.f22925a.getString(c(identifier), null);
        if (string == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(string, 2));
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    Object object = objectInputStream.readObject();
                    if (object instanceof Pc.g) {
                        fe.c.a(objectInputStream, null);
                        fe.c.a(byteArrayInputStream, null);
                        return (Pc.g) object;
                    }
                    throw new InvalidClassException("Expected serialized object to be an instance of " + Pc.g.class + ". Found: " + object);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
        }
    }

    public final Collection d() {
        SharedPreferences.Editor editorEdit = this.f22925a.edit();
        Collection<Pc.g> collectionA = a();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collectionA, 10));
        for (Pc.g gVar : collectionA) {
            AbstractC5504s.e(editorEdit);
            String strB = gVar.b();
            AbstractC5504s.g(strB, "getIdentifier(...)");
            e(editorEdit, strB);
            arrayList.add(gVar.b());
        }
        editorEdit.apply();
        return arrayList;
    }

    public final void f(String identifier) {
        AbstractC5504s.h(identifier, "identifier");
        SharedPreferences.Editor editorEdit = this.f22925a.edit();
        AbstractC5504s.g(editorEdit, "edit(...)");
        e(editorEdit, identifier).apply();
    }

    public final void g(Pc.g notificationRequest) {
        AbstractC5504s.h(notificationRequest, "notificationRequest");
        SharedPreferences.Editor editorEdit = this.f22925a.edit();
        String strB = notificationRequest.b();
        AbstractC5504s.g(strB, "getIdentifier(...)");
        editorEdit.putString(c(strB), Yc.a.a(notificationRequest)).apply();
    }
}
