.class LE3/X2;
.super LE3/q$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/X2$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(LE3/S1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/q$a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE3/X2;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic G3(LE3/m;LE3/S1;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/S1;->V3(LE3/m;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic H3(ILE3/T6;Landroid/os/Bundle;LE3/S1;)V
    .locals 0

    .line 1
    invoke-virtual {p3, p0, p1, p2}, LE3/S1;->W3(ILE3/T6;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic I3(Lq2/P$b;LE3/S1;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/S1;->T3(Lq2/P$b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic J3(Ljava/lang/String;ILE3/Y2;LE3/x;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public static synthetic K3(ILjava/util/List;LE3/S1;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, LE3/S1;->b4(ILjava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic L3(ILP9/u;LE3/S1;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, LE3/S1;->c4(ILjava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic M3(ILandroid/app/PendingIntent;LE3/S1;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, LE3/S1;->d4(ILandroid/app/PendingIntent;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic N3(Landroid/os/Bundle;LE3/S1;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/S1;->Y3(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic O3(LE3/S1;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    new-instance v1, LE3/h0;

    .line 13
    .line 14
    invoke-direct {v1, p0}, LE3/h0;-><init>(LE3/A;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, LE3/A;->k1(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic P3(LE3/W6;LE3/S1;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/S1;->R3(LE3/W6;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Q3(LE3/U6;Lq2/P$b;LE3/S1;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, LE3/S1;->U3(LE3/U6;Lq2/P$b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic R3(ILE3/V6;LE3/S1;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, LE3/S1;->X3(ILE3/V6;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic S3(ILandroid/os/Bundle;)LE3/b;
    .locals 0

    .line 1
    invoke-static {p1, p0}, LE3/b;->e(Landroid/os/Bundle;I)LE3/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic T3(Ljava/lang/String;ILE3/Y2;LE3/x;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public static synthetic U3(ILandroid/os/Bundle;)LE3/b;
    .locals 0

    .line 1
    invoke-static {p1, p0}, LE3/b;->e(Landroid/os/Bundle;I)LE3/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private W3(LE3/X2$a;)V
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :try_start_0
    iget-object v2, p0, LE3/X2;->a:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, LE3/S1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_1
    invoke-virtual {v2}, LE3/S1;->z3()LE3/A;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v3, v3, LE3/A;->e:Landroid/os/Handler;

    .line 24
    .line 25
    new-instance v4, LE3/N2;

    .line 26
    .line 27
    invoke-direct {v4, v2, p1}, LE3/N2;-><init>(LE3/S1;LE3/X2$a;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method private X3()I
    .locals 2

    .line 1
    iget-object v0, p0, LE3/X2;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LE3/S1;

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-virtual {v0}, LE3/S1;->w3()LE3/Y6;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-virtual {v0}, LE3/Y6;->d()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
.end method

.method private Y3(ILjava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :try_start_0
    iget-object v2, p0, LE3/X2;->a:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, LE3/S1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_1
    invoke-virtual {v2, p1, p2}, LE3/S1;->q4(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method

.method public static synthetic e(LE3/S1;LE3/X2$a;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/S1;->J3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p1, p0}, LE3/X2$a;->a(LE3/S1;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic h(LE3/M6;LE3/M6$c;LE3/S1;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, LE3/S1;->Z3(LE3/M6;LE3/M6$c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public C0(ILjava/util/List;)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-direct {p0}, LE3/X2;->X3()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    :goto_0
    return-void

    .line 12
    :cond_1
    new-instance v1, LE3/F2;

    .line 13
    .line 14
    invoke-direct {v1, v0}, LE3/F2;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1, p2}, Lt2/i;->d(LO9/f;Ljava/util/List;)LP9/u;

    .line 18
    .line 19
    .line 20
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    new-instance v0, LE3/O2;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2}, LE3/O2;-><init>(ILP9/u;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, LE3/X2;->W3(LE3/X2$a;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p1

    .line 31
    const-string p2, "MediaControllerStub"

    .line 32
    .line 33
    const-string v0, "Ignoring malformed Bundle for CommandButton"

    .line 34
    .line 35
    invoke-static {p2, v0, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public F0(ILandroid/app/PendingIntent;)V
    .locals 1

    .line 1
    new-instance v0, LE3/U2;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, LE3/U2;-><init>(ILandroid/app/PendingIntent;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, LE3/X2;->W3(LE3/X2$a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public G1(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {p2}, LE3/X6;->a(Landroid/os/Bundle;)LE3/X6;

    .line 5
    .line 6
    .line 7
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    invoke-direct {p0, p1, p2}, LE3/X2;->Y3(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p1

    .line 13
    const-string p2, "MediaControllerStub"

    .line 14
    .line 15
    const-string v0, "Ignoring malformed Bundle for SessionResult"

    .line 16
    .line 17
    invoke-static {p2, v0, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public H0(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {p2}, LE3/w;->b(Landroid/os/Bundle;)LE3/w;

    .line 5
    .line 6
    .line 7
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    invoke-direct {p0, p1, p2}, LE3/X2;->Y3(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p1

    .line 13
    const-string p2, "MediaControllerStub"

    .line 14
    .line 15
    const-string v0, "Ignoring malformed Bundle for LibraryResult"

    .line 16
    .line 17
    invoke-static {p2, v0, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public J0(ILjava/lang/String;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const-string v0, "MediaControllerStub"

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string p1, "onSearchResultChanged(): Ignoring empty query"

    .line 10
    .line 11
    invoke-static {v0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    if-gez p3, :cond_1

    .line 16
    .line 17
    new-instance p1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string p2, "onSearchResultChanged(): Ignoring negative itemCount: "

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {v0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    if-nez p4, :cond_2

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :try_start_0
    invoke-static {p4}, LE3/Y2;->a(Landroid/os/Bundle;)LE3/Y2;

    .line 43
    .line 44
    .line 45
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :goto_0
    new-instance p4, LE3/K2;

    .line 47
    .line 48
    invoke-direct {p4, p2, p3, p1}, LE3/K2;-><init>(Ljava/lang/String;ILE3/Y2;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p4}, LE3/X2;->W3(LE3/X2$a;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catch_0
    move-exception p1

    .line 56
    const-string p2, "Ignoring malformed Bundle for LibraryParams"

    .line 57
    .line 58
    invoke-static {v0, p2, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public K2(ILandroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const-string p1, "MediaControllerStub"

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p2}, LE3/U6;->e(Landroid/os/Bundle;)LE3/U6;

    .line 9
    .line 10
    .line 11
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 12
    :try_start_1
    invoke-static {p3}, Lq2/P$b;->e(Landroid/os/Bundle;)Lq2/P$b;

    .line 13
    .line 14
    .line 15
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 16
    new-instance p3, LE3/R2;

    .line 17
    .line 18
    invoke-direct {p3, p2, p1}, LE3/R2;-><init>(LE3/U6;Lq2/P$b;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p3}, LE3/X2;->W3(LE3/X2$a;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p2

    .line 26
    const-string p3, "Ignoring malformed Bundle for Commands"

    .line 27
    .line 28
    invoke-static {p1, p3, p2}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catch_1
    move-exception p2

    .line 33
    const-string p3, "Ignoring malformed Bundle for SessionCommands"

    .line 34
    .line 35
    invoke-static {p1, p3, p2}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
.end method

.method public V3()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/X2;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    new-instance p1, LE3/S2;

    .line 2
    .line 3
    invoke-direct {p1}, LE3/S2;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LE3/X2;->W3(LE3/X2$a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    new-instance p1, LE3/Q2;

    .line 2
    .line 3
    invoke-direct {p1}, LE3/Q2;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LE3/X2;->W3(LE3/X2$a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public f2(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p2}, LE3/V6;->a(Landroid/os/Bundle;)LE3/V6;

    .line 2
    .line 3
    .line 4
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    new-instance v0, LE3/P2;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, LE3/P2;-><init>(ILE3/V6;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, LE3/X2;->W3(LE3/X2$a;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p1

    .line 15
    const-string p2, "MediaControllerStub"

    .line 16
    .line 17
    const-string v0, "Ignoring malformed Bundle for SessionError"

    .line 18
    .line 19
    invoke-static {p2, v0, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public i(ILjava/util/List;)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-direct {p0}, LE3/X2;->X3()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    :goto_0
    return-void

    .line 12
    :cond_1
    new-instance v1, LE3/I2;

    .line 13
    .line 14
    invoke-direct {v1, v0}, LE3/I2;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1, p2}, Lt2/i;->d(LO9/f;Ljava/util/List;)LP9/u;

    .line 18
    .line 19
    .line 20
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    new-instance v0, LE3/J2;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2}, LE3/J2;-><init>(ILjava/util/List;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, LE3/X2;->W3(LE3/X2$a;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p1

    .line 31
    const-string p2, "MediaControllerStub"

    .line 32
    .line 33
    const-string v0, "Ignoring malformed Bundle for CommandButton"

    .line 34
    .line 35
    invoke-static {p2, v0, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public k0(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {p2}, LE3/m;->d(Landroid/os/Bundle;)LE3/m;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    new-instance p2, LE3/G2;

    .line 9
    .line 10
    invoke-direct {p2, p1}, LE3/G2;-><init>(LE3/m;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2}, LE3/X2;->W3(LE3/X2$a;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p2

    .line 18
    const-string v0, "MediaControllerStub"

    .line 19
    .line 20
    const-string v1, "Malformed Bundle for ConnectionResult. Disconnected from the session."

    .line 21
    .line 22
    invoke-static {v0, v1, p2}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, LE3/X2;->b(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public m3(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const-string p1, "MediaControllerStub"

    .line 4
    .line 5
    const-string p2, "Ignoring null Bundle for extras"

    .line 6
    .line 7
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p1, LE3/W2;

    .line 12
    .line 13
    invoke-direct {p1, p2}, LE3/W2;-><init>(Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, LE3/X2;->W3(LE3/X2$a;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public o2(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {p2}, Lq2/P$b;->e(Landroid/os/Bundle;)Lq2/P$b;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    new-instance p2, LE3/L2;

    .line 9
    .line 10
    invoke-direct {p2, p1}, LE3/L2;-><init>(Lq2/P$b;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2}, LE3/X2;->W3(LE3/X2$a;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p1

    .line 18
    const-string p2, "MediaControllerStub"

    .line 19
    .line 20
    const-string v0, "Ignoring malformed Bundle for Commands"

    .line 21
    .line 22
    invoke-static {p2, v0, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public u2(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {p2}, LE3/W6;->b(Landroid/os/Bundle;)LE3/W6;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    new-instance p2, LE3/H2;

    .line 9
    .line 10
    invoke-direct {p2, p1}, LE3/H2;-><init>(LE3/W6;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2}, LE3/X2;->W3(LE3/X2$a;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p1

    .line 18
    const-string p2, "MediaControllerStub"

    .line 19
    .line 20
    const-string v0, "Ignoring malformed Bundle for SessionPositionInfo"

    .line 21
    .line 22
    invoke-static {p2, v0, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public u3(ILandroid/os/Bundle;Z)V
    .locals 2

    .line 1
    new-instance v0, LE3/M6$c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p3, v1}, LE3/M6$c;-><init>(ZZ)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, LE3/M6$c;->b()Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-virtual {p0, p1, p2, p3}, LE3/X2;->y2(ILandroid/os/Bundle;Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public w2(ILandroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "MediaControllerStub"

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p2}, LE3/T6;->a(Landroid/os/Bundle;)LE3/T6;

    .line 9
    .line 10
    .line 11
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    new-instance v0, LE3/V2;

    .line 13
    .line 14
    invoke-direct {v0, p1, p2, p3}, LE3/V2;-><init>(ILE3/T6;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, LE3/X2;->W3(LE3/X2$a;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p1

    .line 22
    const-string p2, "Ignoring malformed Bundle for SessionCommand"

    .line 23
    .line 24
    invoke-static {v0, p2, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    const-string p1, "Ignoring custom command with null args."

    .line 29
    .line 30
    invoke-static {v0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public x3(ILjava/lang/String;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const-string v0, "MediaControllerStub"

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string p1, "onChildrenChanged(): Ignoring empty parentId"

    .line 10
    .line 11
    invoke-static {v0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    if-gez p3, :cond_1

    .line 16
    .line 17
    new-instance p1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string p2, "onChildrenChanged(): Ignoring negative itemCount: "

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {v0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    if-nez p4, :cond_2

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :try_start_0
    invoke-static {p4}, LE3/Y2;->a(Landroid/os/Bundle;)LE3/Y2;

    .line 43
    .line 44
    .line 45
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :goto_0
    new-instance p4, LE3/T2;

    .line 47
    .line 48
    invoke-direct {p4, p2, p3, p1}, LE3/T2;-><init>(Ljava/lang/String;ILE3/Y2;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p4}, LE3/X2;->W3(LE3/X2$a;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catch_0
    move-exception p1

    .line 56
    const-string p2, "Ignoring malformed Bundle for LibraryParams"

    .line 57
    .line 58
    invoke-static {v0, p2, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public y2(ILandroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string p1, "MediaControllerStub"

    .line 2
    .line 3
    if-eqz p2, :cond_2

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-direct {p0}, LE3/X2;->X3()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, -0x1

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    invoke-static {p2, v0}, LE3/M6;->B(Landroid/os/Bundle;I)LE3/M6;

    .line 17
    .line 18
    .line 19
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 20
    :try_start_1
    invoke-static {p3}, LE3/M6$c;->a(Landroid/os/Bundle;)LE3/M6$c;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 24
    new-instance p3, LE3/M2;

    .line 25
    .line 26
    invoke-direct {p3, p2, p1}, LE3/M2;-><init>(LE3/M6;LE3/M6$c;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p3}, LE3/X2;->W3(LE3/X2$a;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    move-exception p2

    .line 34
    const-string p3, "Ignoring malformed Bundle for BundlingExclusions"

    .line 35
    .line 36
    invoke-static {p1, p3, p2}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_1
    move-exception p2

    .line 41
    const-string p3, "Ignoring malformed Bundle for PlayerInfo"

    .line 42
    .line 43
    invoke-static {p1, p3, p2}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    return-void
.end method
