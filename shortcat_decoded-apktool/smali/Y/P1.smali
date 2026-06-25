.class public abstract LY/P1;
.super Li0/V;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/z0;
.implements Li0/A;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY/P1$a;
    }
.end annotation


# instance fields
.field private b:LY/P1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(F)V
    .locals 4

    .line 1
    invoke-direct {p0}, Li0/V;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Li0/v;->M()Li0/l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, LY/P1$a;

    .line 9
    .line 10
    invoke-virtual {v0}, Li0/l;->i()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    invoke-direct {v1, v2, v3, p1}, LY/P1$a;-><init>(JF)V

    .line 15
    .line 16
    .line 17
    instance-of v0, v0, Li0/b;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    new-instance v0, LY/P1$a;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-static {v2}, Li0/q;->c(I)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-direct {v0, v2, v3, p1}, LY/P1$a;-><init>(JF)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Li0/W;->g(Li0/W;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iput-object v1, p0, LY/P1;->b:LY/P1$a;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public c()F
    .locals 1

    .line 1
    iget-object v0, p0, LY/P1;->b:LY/P1$a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Li0/v;->e0(Li0/W;Li0/U;)Li0/W;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LY/P1$a;

    .line 8
    .line 9
    invoke-virtual {v0}, LY/P1$a;->i()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public d()LY/T1;
    .locals 1

    .line 1
    invoke-static {}, LY/U1;->q()LY/T1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public i(Li0/W;Li0/W;Li0/W;)Li0/W;
    .locals 1

    .line 1
    const-string p1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    move-object v0, p2

    .line 7
    check-cast v0, LY/P1$a;

    .line 8
    .line 9
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast p3, LY/P1$a;

    .line 13
    .line 14
    invoke-virtual {v0}, LY/P1$a;->i()F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p3}, LY/P1$a;->i()F

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    cmpg-float p1, p1, p3

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    return-object p2

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return-object p1
.end method

.method public k(F)V
    .locals 4

    .line 1
    iget-object v0, p0, LY/P1;->b:LY/P1$a;

    .line 2
    .line 3
    invoke-static {v0}, Li0/v;->K(Li0/W;)Li0/W;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LY/P1$a;

    .line 8
    .line 9
    invoke-virtual {v0}, LY/P1$a;->i()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    cmpg-float v1, v1, p1

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v1, p0, LY/P1;->b:LY/P1$a;

    .line 19
    .line 20
    invoke-static {}, Li0/v;->O()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    monitor-enter v2

    .line 25
    :try_start_0
    sget-object v3, Li0/l;->e:Li0/l$a;

    .line 26
    .line 27
    invoke-virtual {v3}, Li0/l$a;->c()Li0/l;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v1, p0, v3, v0}, Li0/v;->Z(Li0/W;Li0/U;Li0/l;Li0/W;)Li0/W;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, LY/P1$a;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, LY/P1$a;->j(F)V

    .line 38
    .line 39
    .line 40
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    monitor-exit v2

    .line 43
    invoke-static {v3, p0}, Li0/v;->X(Li0/l;Li0/U;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    monitor-exit v2

    .line 49
    throw p1
.end method

.method public l()Li0/W;
    .locals 1

    .line 1
    iget-object v0, p0, LY/P1;->b:LY/P1$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public r(Li0/W;)V
    .locals 1

    .line 1
    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LY/P1$a;

    .line 7
    .line 8
    iput-object p1, p0, LY/P1;->b:LY/P1$a;

    .line 9
    .line 10
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, LY/P1;->b:LY/P1$a;

    .line 2
    .line 3
    invoke-static {v0}, Li0/v;->K(Li0/W;)Li0/W;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LY/P1$a;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "MutableFloatState(value="

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, LY/P1$a;->i()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, ")@"

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method
