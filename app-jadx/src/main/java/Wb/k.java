package Wb;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import Ud.S;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import ie.InterfaceC5082a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f20838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f20839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f20840c;

    public k(Context context) {
        AbstractC5504s.h(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("expo.modules.kotlin.PersistentDataManager", 0);
        AbstractC5504s.g(sharedPreferences, "getSharedPreferences(...)");
        this.f20838a = sharedPreferences;
        this.f20839b = new Bundle();
        this.f20840c = AbstractC2163n.b(new InterfaceC5082a() { // from class: Wb.j
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return k.o(this.f20837a);
            }
        });
    }

    private final Bundle g() {
        return (Bundle) this.f20840c.getValue();
    }

    private final Bundle j() {
        String string;
        Bundle bundleD;
        Bundle bundle = new Bundle();
        if (this.f20838a.getLong("expire", 0L) > new Date().getTime() && (string = this.f20838a.getString("bundle", null)) != null && (bundleD = l.d(string)) != null) {
            bundle = bundleD;
        }
        SharedPreferences.Editor editorEdit = this.f20838a.edit();
        editorEdit.clear();
        editorEdit.commit();
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle o(k kVar) {
        return kVar.j();
    }

    public final k b(String key, Bundle value) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        this.f20839b.putBundle(key, value);
        return this;
    }

    public final k c(String key, Serializable value) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        this.f20839b.putSerializable(key, value);
        return this;
    }

    public final k d(String key, ArrayList value) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        this.f20839b.putStringArrayList(key, value);
        return this;
    }

    public final k e(String key, Map value) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        Bundle bundle = this.f20839b;
        Pair[] pairArr = (Pair[]) S.D(value).toArray(new Pair[0]);
        bundle.putBundle(key, G1.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return this;
    }

    public final k f(String key, Map value) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        Bundle bundle = this.f20839b;
        Pair[] pairArr = (Pair[]) S.D(value).toArray(new Pair[0]);
        bundle.putBundle(key, G1.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return this;
    }

    public final void h() {
        SharedPreferences.Editor editorEdit = this.f20838a.edit();
        editorEdit.putString("bundle", l.c(this.f20839b));
        editorEdit.putLong("expire", new Date().getTime() + 300000);
        editorEdit.commit();
    }

    public final Bundle i(String key) {
        AbstractC5504s.h(key, "key");
        return g().getBundle(key);
    }

    public final Serializable k(String key) {
        AbstractC5504s.h(key, "key");
        Bundle bundleG = g();
        return Build.VERSION.SDK_INT >= 33 ? bundleG.getSerializable(key, Serializable.class) : bundleG.getSerializable(key);
    }

    public final ArrayList l(String key) {
        AbstractC5504s.h(key, "key");
        return g().getStringArrayList(key);
    }

    public final Map m(String key) {
        AbstractC5504s.h(key, "key");
        Bundle bundle = g().getBundle(key);
        if (bundle == null) {
            return null;
        }
        Set<String> setKeySet = bundle.keySet();
        AbstractC5504s.e(setKeySet);
        Set<String> set = setKeySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(set, 10)), 16));
        for (Object obj : set) {
            linkedHashMap.put(obj, Integer.valueOf(bundle.getInt((String) obj)));
        }
        return linkedHashMap;
    }

    public final Map n(String key) {
        AbstractC5504s.h(key, "key");
        Bundle bundle = g().getBundle(key);
        if (bundle == null) {
            return null;
        }
        Set<String> setKeySet = bundle.keySet();
        AbstractC5504s.g(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(set, 10)), 16));
        for (Object obj : set) {
            String str = (String) obj;
            Serializable serializable = Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable(str, Serializable.class) : bundle.getSerializable(str);
            if (serializable == null) {
                throw new IllegalStateException("For a key '" + str + "' there should be a serializable class available");
            }
            linkedHashMap.put(obj, serializable);
        }
        return linkedHashMap;
    }
}
