package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class SharedPreferencesEditorC3473h0 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f39771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f39772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f39773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SharedPreferencesC3482i0 f39774d;

    /* synthetic */ SharedPreferencesEditorC3473h0(SharedPreferencesC3482i0 sharedPreferencesC3482i0, byte[] bArr) {
        Objects.requireNonNull(sharedPreferencesC3482i0);
        this.f39774d = sharedPreferencesC3482i0;
        this.f39771a = false;
        this.f39772b = new HashSet();
        this.f39773c = new HashMap();
    }

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f39773c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f39771a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f39771a) {
            this.f39774d.a().clear();
        }
        SharedPreferencesC3482i0 sharedPreferencesC3482i0 = this.f39774d;
        Set set = this.f39772b;
        sharedPreferencesC3482i0.a().keySet().removeAll(set);
        Map map = this.f39773c;
        for (Map.Entry entry : map.entrySet()) {
            sharedPreferencesC3482i0.a().put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC3482i0.b()) {
            P9.X it = P9.T.k(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC3482i0, (String) it.next());
            }
        }
        return (!this.f39771a && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f39772b.add(str);
        return this;
    }
}
