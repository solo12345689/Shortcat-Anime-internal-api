package com.google.android.gms.auth.api.signin.internal;

import K8.g;
import P8.f;
import android.os.Bundle;
import androidx.loader.app.a;
import java.util.Objects;
import p2.AbstractC5918b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class a implements a.InterfaceC0519a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f38908a;

    /* synthetic */ a(SignInHubActivity signInHubActivity, byte[] bArr) {
        Objects.requireNonNull(signInHubActivity);
        this.f38908a = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0519a
    public final AbstractC5918b a(int i10, Bundle bundle) {
        return new g(this.f38908a, f.c());
    }

    @Override // androidx.loader.app.a.InterfaceC0519a
    public final /* bridge */ /* synthetic */ void b(AbstractC5918b abstractC5918b, Object obj) {
        SignInHubActivity signInHubActivity = this.f38908a;
        signInHubActivity.setResult(signInHubActivity.J(), signInHubActivity.K());
        signInHubActivity.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0519a
    public final void c(AbstractC5918b abstractC5918b) {
    }
}
