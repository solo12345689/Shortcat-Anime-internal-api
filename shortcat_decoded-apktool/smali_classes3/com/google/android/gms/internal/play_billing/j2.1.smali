.class final Lcom/google/android/gms/internal/play_billing/j2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/p2;


# instance fields
.field private final a:Lcom/google/android/gms/internal/play_billing/f2;

.field private final b:Lcom/google/android/gms/internal/play_billing/v2;

.field private final c:Z

.field private final d:Lcom/google/android/gms/internal/play_billing/A1;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/play_billing/v2;Lcom/google/android/gms/internal/play_billing/A1;Lcom/google/android/gms/internal/play_billing/f2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/j2;->b:Lcom/google/android/gms/internal/play_billing/v2;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/google/android/gms/internal/play_billing/j2;->c:Z

    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/j2;->d:Lcom/google/android/gms/internal/play_billing/A1;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/google/android/gms/internal/play_billing/j2;->a:Lcom/google/android/gms/internal/play_billing/f2;

    .line 12
    .line 13
    return-void
.end method

.method static i(Lcom/google/android/gms/internal/play_billing/v2;Lcom/google/android/gms/internal/play_billing/A1;Lcom/google/android/gms/internal/play_billing/f2;)Lcom/google/android/gms/internal/play_billing/j2;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/j2;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/j2;-><init>(Lcom/google/android/gms/internal/play_billing/v2;Lcom/google/android/gms/internal/play_billing/A1;Lcom/google/android/gms/internal/play_billing/f2;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 2

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/play_billing/J1;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-boolean v1, p0, Lcom/google/android/gms/internal/play_billing/j2;->c:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 2

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/play_billing/J1;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/w2;->b()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-boolean v1, p0, Lcom/google/android/gms/internal/play_billing/j2;->c:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    throw p1
.end method

.method public final d(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/G2;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    throw p1
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/j2;->b:Lcom/google/android/gms/internal/play_billing/v2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/v2;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/j2;->d:Lcom/google/android/gms/internal/play_billing/A1;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/A1;->a(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/j2;->b:Lcom/google/android/gms/internal/play_billing/v2;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/r2;->u(Lcom/google/android/gms/internal/play_billing/v2;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/j2;->c:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/j2;->d:Lcom/google/android/gms/internal/play_billing/A1;

    .line 11
    .line 12
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/r2;->t(Lcom/google/android/gms/internal/play_billing/A1;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/play_billing/J1;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 5
    .line 6
    check-cast p2, Lcom/google/android/gms/internal/play_billing/J1;

    .line 7
    .line 8
    iget-object p2, p2, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    iget-boolean p2, p0, Lcom/google/android/gms/internal/play_billing/j2;->c:Z

    .line 19
    .line 20
    if-nez p2, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_1
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    throw p1
.end method

.method public final h(Ljava/lang/Object;[BIILcom/google/android/gms/internal/play_billing/d1;)V
    .locals 0

    .line 1
    move-object p2, p1

    .line 2
    check-cast p2, Lcom/google/android/gms/internal/play_billing/J1;

    .line 3
    .line 4
    iget-object p3, p2, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/w2;->c()Lcom/google/android/gms/internal/play_billing/w2;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    if-eq p3, p4, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/w2;->f()Lcom/google/android/gms/internal/play_billing/w2;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p2, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 18
    .line 19
    :goto_0
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    throw p1
.end method

.method public final m()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/j2;->a:Lcom/google/android/gms/internal/play_billing/f2;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/J1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/google/android/gms/internal/play_billing/J1;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J1;->r()Lcom/google/android/gms/internal/play_billing/J1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/f2;->f()Lcom/google/android/gms/internal/play_billing/e2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/e2;->o()Lcom/google/android/gms/internal/play_billing/f2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
