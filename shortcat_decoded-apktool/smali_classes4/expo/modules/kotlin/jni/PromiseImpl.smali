.class public final Lexpo/modules/kotlin/jni/PromiseImpl;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LUb/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\t\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00082\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001cH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ%\u0010 \u001a\u00020\u00082\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001fH\u0016\u00a2\u0006\u0004\u0008 \u0010!J+\u0010&\u001a\u00020\u00082\u0006\u0010\"\u001a\u00020\u001a2\u0008\u0010#\u001a\u0004\u0018\u00010\u001a2\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0004\u0008&\u0010\'R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010(\u001a\u0004\u0008)\u0010*R$\u0010.\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00118\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010+\u001a\u0004\u0008,\u0010-R\u001e\u00102\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u00103\u00a8\u00065"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/PromiseImpl;",
        "LUb/u;",
        "Lexpo/modules/kotlin/jni/JavaCallback;",
        "callback",
        "<init>",
        "(Lexpo/modules/kotlin/jni/JavaCallback;)V",
        "",
        "value",
        "LTd/L;",
        "resolve",
        "(Ljava/lang/Object;)V",
        "b",
        "()V",
        "",
        "result",
        "c",
        "(I)V",
        "",
        "a",
        "(Z)V",
        "",
        "d",
        "(D)V",
        "",
        "e",
        "(F)V",
        "",
        "(Ljava/lang/String;)V",
        "",
        "g",
        "(Ljava/util/Collection;)V",
        "",
        "f",
        "(Ljava/util/Map;)V",
        "code",
        "message",
        "",
        "cause",
        "reject",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "Lexpo/modules/kotlin/jni/JavaCallback;",
        "i",
        "()Lexpo/modules/kotlin/jni/JavaCallback;",
        "Z",
        "j",
        "()Z",
        "wasSettled",
        "Ljava/lang/ref/WeakReference;",
        "LUb/d;",
        "Ljava/lang/ref/WeakReference;",
        "appContextHolder",
        "Ljava/lang/String;",
        "fullFunctionName",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/lang/ref/WeakReference;

.field private c:Ljava/lang/String;

.field private final callback:Lexpo/modules/kotlin/jni/JavaCallback;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/jni/JavaCallback;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    new-instance p1, Lcc/u;

    .line 6
    .line 7
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->c:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "unknown"

    .line 12
    .line 13
    :cond_0
    invoke-direct {p1, v0}, Lcc/u;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->b:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, LUb/d;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, LUb/d;->u()Lub/d;

    .line 29
    .line 30
    .line 31
    :cond_1
    throw p1

    .line 32
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->k(Z)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 39
    .line 40
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    new-instance v0, Lcc/u;

    .line 6
    .line 7
    iget-object v1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->c:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const-string v1, "unknown"

    .line 12
    .line 13
    :cond_0
    invoke-direct {v0, v1}, Lcc/u;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->b:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, LUb/d;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, LUb/d;->u()Lub/d;

    .line 29
    .line 30
    .line 31
    :cond_1
    throw v0

    .line 32
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    .line 33
    .line 34
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/JavaCallback;->b()V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 39
    .line 40
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    new-instance p1, Lcc/u;

    .line 6
    .line 7
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->c:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "unknown"

    .line 12
    .line 13
    :cond_0
    invoke-direct {p1, v0}, Lcc/u;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->b:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, LUb/d;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, LUb/d;->u()Lub/d;

    .line 29
    .line 30
    .line 31
    :cond_1
    throw p1

    .line 32
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->e(I)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 39
    .line 40
    return-void
.end method

.method public d(D)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    new-instance p1, Lcc/u;

    .line 6
    .line 7
    iget-object p2, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->c:Ljava/lang/String;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const-string p2, "unknown"

    .line 12
    .line 13
    :cond_0
    invoke-direct {p1, p2}, Lcc/u;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->b:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, LUb/d;

    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p2}, LUb/d;->u()Lub/d;

    .line 29
    .line 30
    .line 31
    :cond_1
    throw p1

    .line 32
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Lexpo/modules/kotlin/jni/JavaCallback;->c(D)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 39
    .line 40
    return-void
.end method

.method public e(F)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    new-instance p1, Lcc/u;

    .line 6
    .line 7
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->c:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "unknown"

    .line 12
    .line 13
    :cond_0
    invoke-direct {p1, v0}, Lcc/u;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->b:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, LUb/d;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, LUb/d;->u()Lub/d;

    .line 29
    .line 30
    .line 31
    :cond_1
    throw p1

    .line 32
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->d(F)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 39
    .line 40
    return-void
.end method

.method public f(Ljava/util/Map;)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    new-instance p1, Lcc/u;

    .line 11
    .line 12
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->c:Ljava/lang/String;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v0, "unknown"

    .line 17
    .line 18
    :cond_0
    invoke-direct {p1, v0}, Lcc/u;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->b:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, LUb/d;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, LUb/d;->u()Lub/d;

    .line 34
    .line 35
    .line 36
    :cond_1
    throw p1

    .line 37
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->j(Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 44
    .line 45
    return-void
.end method

.method public g(Ljava/util/Collection;)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    new-instance p1, Lcc/u;

    .line 11
    .line 12
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->c:Ljava/lang/String;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v0, "unknown"

    .line 17
    .line 18
    :cond_0
    invoke-direct {p1, v0}, Lcc/u;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->b:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, LUb/d;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, LUb/d;->u()Lub/d;

    .line 34
    .line 35
    .line 36
    :cond_1
    throw p1

    .line 37
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->i(Ljava/util/Collection;)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 44
    .line 45
    return-void
.end method

.method public h(Lexpo/modules/kotlin/exception/CodedException;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LUb/u$a;->a(LUb/u;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final i()Lexpo/modules/kotlin/jni/JavaCallback;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-string v0, "code"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 7
    .line 8
    const-string v1, "unknown"

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    new-instance p1, Lcc/u;

    .line 13
    .line 14
    iget-object p2, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->c:Ljava/lang/String;

    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v1, p2

    .line 20
    :goto_0
    invoke-direct {p1, v1}, Lcc/u;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->b:Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, LUb/d;

    .line 32
    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p2}, LUb/d;->u()Lub/d;

    .line 36
    .line 37
    .line 38
    :cond_1
    throw p1

    .line 39
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    .line 40
    .line 41
    if-nez p2, :cond_4

    .line 42
    .line 43
    if-eqz p3, :cond_3

    .line 44
    .line 45
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    const/4 p2, 0x0

    .line 51
    :goto_1
    if-nez p2, :cond_4

    .line 52
    .line 53
    move-object p2, v1

    .line 54
    :cond_4
    invoke-virtual {v0, p1, p2}, Lexpo/modules/kotlin/jni/JavaCallback;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    .line 59
    .line 60
    return-void
.end method

.method public resolve(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    if-eqz v0, :cond_2

    .line 2
    new-instance p1, Lcc/u;

    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "unknown"

    :cond_0
    invoke-direct {p1, v0}, Lcc/u;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUb/d;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LUb/d;->u()Lub/d;

    .line 4
    :cond_1
    throw p1

    .line 5
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->f(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    return-void
.end method

.method public resolve(Ljava/lang/String;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    if-eqz v0, :cond_2

    .line 8
    new-instance p1, Lcc/u;

    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "unknown"

    :cond_0
    invoke-direct {p1, v0}, Lcc/u;-><init>(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUb/d;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LUb/d;->u()Lub/d;

    .line 10
    :cond_1
    throw p1

    .line 11
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->g(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->a:Z

    return-void
.end method
