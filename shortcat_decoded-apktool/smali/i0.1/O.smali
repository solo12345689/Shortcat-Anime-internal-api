.class public final Li0/O;
.super Li0/W;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private c:Lb0/e;

.field private d:I

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(JLb0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Li0/W;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Li0/O;->c:Lb0/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(Li0/W;)V
    .locals 2

    .line 1
    invoke-static {}, Li0/F;->b()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>"

    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Li0/O;

    .line 13
    .line 14
    iget-object v1, v1, Li0/O;->c:Lb0/e;

    .line 15
    .line 16
    iput-object v1, p0, Li0/O;->c:Lb0/e;

    .line 17
    .line 18
    move-object v1, p1

    .line 19
    check-cast v1, Li0/O;

    .line 20
    .line 21
    iget v1, v1, Li0/O;->d:I

    .line 22
    .line 23
    iput v1, p0, Li0/O;->d:I

    .line 24
    .line 25
    check-cast p1, Li0/O;

    .line 26
    .line 27
    iget p1, p1, Li0/O;->e:I

    .line 28
    .line 29
    iput p1, p0, Li0/O;->e:I

    .line 30
    .line 31
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    monitor-exit v0

    .line 37
    throw p1
.end method

.method public d(J)Li0/W;
    .locals 2

    .line 1
    new-instance v0, Li0/O;

    .line 2
    .line 3
    iget-object v1, p0, Li0/O;->c:Lb0/e;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1}, Li0/O;-><init>(JLb0/e;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final i()Lb0/e;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/O;->c:Lb0/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()I
    .locals 1

    .line 1
    iget v0, p0, Li0/O;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, Li0/O;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final l(Lb0/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li0/O;->c:Lb0/e;

    .line 2
    .line 3
    return-void
.end method

.method public final m(I)V
    .locals 0

    .line 1
    iput p1, p0, Li0/O;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public final n(I)V
    .locals 0

    .line 1
    iput p1, p0, Li0/O;->e:I

    .line 2
    .line 3
    return-void
.end method
