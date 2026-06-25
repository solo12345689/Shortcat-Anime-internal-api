package com.reactnativegooglesignin;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    static Scope[] a(ReadableArray readableArray) {
        int size = readableArray.size();
        Scope[] scopeArr = new Scope[size];
        for (int i10 = 0; i10 < size; i10++) {
            scopeArr[i10] = new Scope(readableArray.getString(i10));
        }
        return scopeArr;
    }

    public static int b(n9.i iVar) {
        Exception excJ = iVar.j();
        if (excJ instanceof P8.b) {
            return ((P8.b) excJ).b();
        }
        return 8;
    }

    static GoogleSignInOptions c(Scope[] scopeArr, String str, boolean z10, boolean z11, String str2, String str3) {
        GoogleSignInOptions.a aVarE = new GoogleSignInOptions.a(GoogleSignInOptions.f38867l).e(new Scope("email"), scopeArr);
        if (str != null && !str.isEmpty()) {
            aVarE.c(str);
            if (z10) {
                aVarE.f(str, z11);
            }
        }
        if (str2 != null && !str2.isEmpty()) {
            aVarE.g(str2);
        }
        if (str3 != null && !str3.isEmpty()) {
            aVarE.h(str3);
        }
        return aVarE.a();
    }

    static WritableMap d(GoogleSignInAccount googleSignInAccount) {
        Uri uriS = googleSignInAccount.s();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(DiagnosticsEntry.ID_KEY, googleSignInAccount.l());
        writableMapCreateMap.putString("name", googleSignInAccount.c());
        writableMapCreateMap.putString("givenName", googleSignInAccount.f());
        writableMapCreateMap.putString("familyName", googleSignInAccount.e());
        writableMapCreateMap.putString("email", googleSignInAccount.d());
        writableMapCreateMap.putString("photo", uriS != null ? uriS.toString() : null);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("user", writableMapCreateMap);
        writableMapCreateMap2.putString("idToken", googleSignInAccount.r());
        writableMapCreateMap2.putString("serverAuthCode", googleSignInAccount.x());
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = googleSignInAccount.i().iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(((Scope) it.next()).toString());
        }
        writableMapCreateMap2.putArray("scopes", writableArrayCreateArray);
        return writableMapCreateMap2;
    }

    static String e(ReadableArray readableArray) {
        StringBuilder sb2 = new StringBuilder("oauth2:");
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            sb2.append(readableArray.getString(i10));
            sb2.append(" ");
        }
        return sb2.toString().trim();
    }
}
