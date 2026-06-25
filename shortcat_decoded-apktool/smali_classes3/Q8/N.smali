.class public final LQ8/N;
.super LQ8/g0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private f:Ln9/j;


# direct methods
.method private constructor <init>(LQ8/i;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/common/a;->n()Lcom/google/android/gms/common/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1, v0}, LQ8/g0;-><init>(LQ8/i;Lcom/google/android/gms/common/a;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ln9/j;

    .line 9
    .line 10
    invoke-direct {p1}, Ln9/j;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LQ8/N;->f:Ln9/j;

    .line 14
    .line 15
    iget-object p1, p0, LQ8/h;->a:LQ8/i;

    .line 16
    .line 17
    const-string v0, "GmsAvailabilityHelper"

    .line 18
    .line 19
    invoke-interface {p1, v0, p0}, LQ8/i;->d(Ljava/lang/String;LQ8/h;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static t(Landroid/app/Activity;)LQ8/N;
    .locals 2

    .line 1
    invoke-static {p0}, LQ8/h;->d(Landroid/app/Activity;)LQ8/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "GmsAvailabilityHelper"

    .line 6
    .line 7
    const-class v1, LQ8/N;

    .line 8
    .line 9
    invoke-interface {p0, v0, v1}, LQ8/i;->b(Ljava/lang/String;Ljava/lang/Class;)LQ8/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LQ8/N;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object p0, v0, LQ8/N;->f:Ln9/j;

    .line 18
    .line 19
    invoke-virtual {p0}, Ln9/j;->a()Ln9/i;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ln9/i;->n()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    new-instance p0, Ln9/j;

    .line 30
    .line 31
    invoke-direct {p0}, Ln9/j;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p0, v0, LQ8/N;->f:Ln9/j;

    .line 35
    .line 36
    :cond_0
    return-object v0

    .line 37
    :cond_1
    new-instance v0, LQ8/N;

    .line 38
    .line 39
    invoke-direct {v0, p0}, LQ8/N;-><init>(LQ8/i;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method


# virtual methods
.method public final g()V
    .locals 3

    .line 1
    invoke-super {p0}, LQ8/h;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ8/N;->f:Ln9/j;

    .line 5
    .line 6
    new-instance v1, Ljava/util/concurrent/CancellationException;

    .line 7
    .line 8
    const-string v2, "Host activity was destroyed before Google Play services could be made available."

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ln9/j;->d(Ljava/lang/Exception;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method protected final m(Lcom/google/android/gms/common/ConnectionResult;I)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->e()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    const-string p2, "Error connecting to Google Play services"

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, LQ8/N;->f:Ln9/j;

    .line 10
    .line 11
    new-instance v1, LP8/b;

    .line 12
    .line 13
    new-instance v2, Lcom/google/android/gms/common/api/Status;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->d()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v2, p1, p2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v2}, LP8/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ln9/j;->b(Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method protected final n()V
    .locals 4

    .line 1
    iget-object v0, p0, LQ8/h;->a:LQ8/i;

    .line 2
    .line 3
    invoke-interface {v0}, LQ8/i;->f()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LQ8/N;->f:Ln9/j;

    .line 10
    .line 11
    new-instance v1, LP8/b;

    .line 12
    .line 13
    new-instance v2, Lcom/google/android/gms/common/api/Status;

    .line 14
    .line 15
    const/16 v3, 0x8

    .line 16
    .line 17
    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, LP8/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ln9/j;->d(Ljava/lang/Exception;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v1, p0, LQ8/g0;->e:Lcom/google/android/gms/common/a;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/a;->g(Landroid/content/Context;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, LQ8/N;->f:Ln9/j;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ln9/j;->e(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget-object v2, p0, LQ8/N;->f:Ln9/j;

    .line 43
    .line 44
    invoke-virtual {v2}, Ln9/j;->a()Ln9/i;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ln9/i;->n()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    new-instance v2, Lcom/google/android/gms/common/ConnectionResult;

    .line 55
    .line 56
    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-virtual {p0, v2, v0}, LQ8/g0;->s(Lcom/google/android/gms/common/ConnectionResult;I)V

    .line 61
    .line 62
    .line 63
    :cond_2
    return-void
.end method

.method public final u()Ln9/i;
    .locals 1

    .line 1
    iget-object v0, p0, LQ8/N;->f:Ln9/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/j;->a()Ln9/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
