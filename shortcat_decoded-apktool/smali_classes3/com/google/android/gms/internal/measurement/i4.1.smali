.class public final Lcom/google/android/gms/internal/measurement/i4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final a:Landroid/net/Uri;

.field final b:Ljava/lang/String;

.field final c:Ljava/lang/String;

.field final d:Z

.field final e:Z


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x0

    .line 2
    const-string v3, ""

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/measurement/i4;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZZZLO9/f;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZZZLO9/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/i4;->a:Landroid/net/Uri;

    const-string p1, ""

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/i4;->b:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/i4;->c:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/measurement/i4;->d:Z

    iput-boolean p7, p0, Lcom/google/android/gms/internal/measurement/i4;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/measurement/i4;
    .locals 10

    .line 1
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/i4;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/i4;->a:Landroid/net/Uri;

    .line 10
    .line 11
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/i4;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-boolean v7, p0, Lcom/google/android/gms/internal/measurement/i4;->e:Z

    .line 14
    .line 15
    new-instance v0, Lcom/google/android/gms/internal/measurement/i4;

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v5, 0x1

    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/measurement/i4;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZZZLO9/f;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v1, "Cannot set GServices prefix and skip GServices"

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final b()Lcom/google/android/gms/internal/measurement/i4;
    .locals 10

    .line 1
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/i4;->a:Landroid/net/Uri;

    .line 2
    .line 3
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/i4;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/i4;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-boolean v5, p0, Lcom/google/android/gms/internal/measurement/i4;->d:Z

    .line 8
    .line 9
    new-instance v0, Lcom/google/android/gms/internal/measurement/i4;

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x1

    .line 16
    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/measurement/i4;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZZZLO9/f;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final c(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/o4;
    .locals 1

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget p3, Lcom/google/android/gms/internal/measurement/o4;->j:I

    .line 6
    .line 7
    new-instance p3, Lcom/google/android/gms/internal/measurement/e4;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {p3, p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/e4;-><init>(Lcom/google/android/gms/internal/measurement/i4;Ljava/lang/String;Ljava/lang/Long;Z)V

    .line 11
    .line 12
    .line 13
    return-object p3
.end method

.method public final d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;
    .locals 2

    .line 1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget v0, Lcom/google/android/gms/internal/measurement/o4;->j:I

    .line 6
    .line 7
    new-instance v0, Lcom/google/android/gms/internal/measurement/f4;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/f4;-><init>(Lcom/google/android/gms/internal/measurement/i4;Ljava/lang/String;Ljava/lang/Boolean;Z)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final e(Ljava/lang/String;D)Lcom/google/android/gms/internal/measurement/o4;
    .locals 1

    .line 1
    const-wide/high16 p1, -0x3ff8000000000000L    # -3.0

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget p2, Lcom/google/android/gms/internal/measurement/o4;->j:I

    .line 8
    .line 9
    new-instance p2, Lcom/google/android/gms/internal/measurement/g4;

    .line 10
    .line 11
    const-string p3, "measurement.test.double_flag"

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-direct {p2, p0, p3, p1, v0}, Lcom/google/android/gms/internal/measurement/g4;-><init>(Lcom/google/android/gms/internal/measurement/i4;Ljava/lang/String;Ljava/lang/Double;Z)V

    .line 15
    .line 16
    .line 17
    return-object p2
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/o4;
    .locals 2

    .line 1
    sget v0, Lcom/google/android/gms/internal/measurement/o4;->j:I

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/internal/measurement/h4;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/h4;-><init>(Lcom/google/android/gms/internal/measurement/i4;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
