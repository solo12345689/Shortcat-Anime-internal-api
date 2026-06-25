.class final Ln3/a;
.super LU2/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ln3/g;


# instance fields
.field private final h:J

.field private final i:I

.field private final j:I

.field private final k:Z

.field private final l:J


# direct methods
.method public constructor <init>(JJIIZ)V
    .locals 1

    .line 2
    invoke-direct/range {p0 .. p7}, LU2/i;-><init>(JJIIZ)V

    move v0, p7

    move p7, p6

    move p6, p5

    move-wide p4, p3

    move-wide p2, p1

    move-object p1, p0

    .line 3
    iput-wide p4, p1, Ln3/a;->h:J

    .line 4
    iput p6, p1, Ln3/a;->i:I

    .line 5
    iput p7, p1, Ln3/a;->j:I

    .line 6
    iput-boolean v0, p1, Ln3/a;->k:Z

    const-wide/16 p4, -0x1

    cmp-long p6, p2, p4

    if-eqz p6, :cond_0

    goto :goto_0

    :cond_0
    move-wide p2, p4

    .line 7
    :goto_0
    iput-wide p2, p1, Ln3/a;->l:J

    return-void
.end method

.method public constructor <init>(JJLU2/F$a;Z)V
    .locals 8

    .line 1
    iget v5, p5, LU2/F$a;->f:I

    iget v6, p5, LU2/F$a;->c:I

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move v7, p6

    invoke-direct/range {v0 .. v7}, Ln3/a;-><init>(JJIIZ)V

    return-void
.end method


# virtual methods
.method public d(J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LU2/i;->b(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method

.method public e()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ln3/a;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public f(J)Ln3/a;
    .locals 8

    .line 1
    new-instance v0, Ln3/a;

    .line 2
    .line 3
    iget-wide v3, p0, Ln3/a;->h:J

    .line 4
    .line 5
    iget v5, p0, Ln3/a;->i:I

    .line 6
    .line 7
    iget v6, p0, Ln3/a;->j:I

    .line 8
    .line 9
    iget-boolean v7, p0, Ln3/a;->k:Z

    .line 10
    .line 11
    move-wide v1, p1

    .line 12
    invoke-direct/range {v0 .. v7}, Ln3/a;-><init>(JJIIZ)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public j()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ln3/a;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget v0, p0, Ln3/a;->i:I

    .line 2
    .line 3
    return v0
.end method
