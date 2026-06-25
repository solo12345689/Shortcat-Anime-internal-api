package R4;

import S4.e;
import Y4.h;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import dg.C;
import dg.E;
import dg.F;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import o5.C5826c;
import o5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements d, InterfaceC4625f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4624e.a f15154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f15155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f15156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private F f15157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.a f15158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile InterfaceC4624e f15159f;

    public a(InterfaceC4624e.a aVar, h hVar) {
        this.f15154a = aVar;
        this.f15155b = hVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        try {
            InputStream inputStream = this.f15156c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        F f10 = this.f15157d;
        if (f10 != null) {
            f10.close();
        }
        this.f15158e = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        InterfaceC4624e interfaceC4624e = this.f15159f;
        if (interfaceC4624e != null) {
            interfaceC4624e.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public S4.a d() {
        return S4.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(g gVar, d.a aVar) {
        C.a aVarM = new C.a().m(this.f15155b.h());
        for (Map.Entry entry : this.f15155b.e().entrySet()) {
            aVarM.a((String) entry.getKey(), (String) entry.getValue());
        }
        C cB = aVarM.b();
        this.f15158e = aVar;
        this.f15159f = this.f15154a.a(cB);
        this.f15159f.O1(this);
    }

    @Override // dg.InterfaceC4625f
    public void h(InterfaceC4624e interfaceC4624e, E e10) {
        this.f15157d = e10.j();
        if (!e10.J()) {
            this.f15158e.c(new e(e10.O(), e10.o()));
            return;
        }
        InputStream inputStreamB = C5826c.b(this.f15157d.a(), ((F) k.e(this.f15157d)).h());
        this.f15156c = inputStreamB;
        this.f15158e.f(inputStreamB);
    }

    @Override // dg.InterfaceC4625f
    public void j(InterfaceC4624e interfaceC4624e, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f15158e.c(iOException);
    }
}
