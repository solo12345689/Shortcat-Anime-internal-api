.class final LY/R1$a;
.super Li0/W;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY/R1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private c:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Li0/W;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, LY/R1$a;->c:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(Li0/W;)V
    .locals 2

    .line 1
    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LY/R1$a;

    .line 7
    .line 8
    iget-wide v0, p1, LY/R1$a;->c:J

    .line 9
    .line 10
    iput-wide v0, p0, LY/R1$a;->c:J

    .line 11
    .line 12
    return-void
.end method

.method public d(J)Li0/W;
    .locals 3

    .line 1
    new-instance v0, LY/R1$a;

    .line 2
    .line 3
    iget-wide v1, p0, LY/R1$a;->c:J

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1, v2}, LY/R1$a;-><init>(JJ)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final i()J
    .locals 2

    .line 1
    iget-wide v0, p0, LY/R1$a;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final j(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LY/R1$a;->c:J

    .line 2
    .line 3
    return-void
.end method
