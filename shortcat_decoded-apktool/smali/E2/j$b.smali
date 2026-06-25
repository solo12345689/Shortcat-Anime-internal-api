.class public LE2/j$b;
.super LE2/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LD2/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field final i:LE2/k$a;


# direct methods
.method public constructor <init>(JLq2/x;Ljava/util/List;LE2/k$a;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 10

    .line 1
    const/4 v9, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-wide v1, p1

    .line 4
    move-object v3, p3

    .line 5
    move-object v4, p4

    .line 6
    move-object v5, p5

    .line 7
    move-object/from16 v6, p6

    .line 8
    .line 9
    move-object/from16 v7, p7

    .line 10
    .line 11
    move-object/from16 v8, p8

    .line 12
    .line 13
    invoke-direct/range {v0 .. v9}, LE2/j;-><init>(JLq2/x;Ljava/util/List;LE2/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;LE2/j$a;)V

    .line 14
    .line 15
    .line 16
    iput-object p5, p0, LE2/j$b;->i:LE2/k$a;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public b()LD2/f;
    .locals 0

    .line 1
    return-object p0
.end method

.method public c()LE2/i;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public d(J)J
    .locals 1

    .line 1
    iget-object v0, p0, LE2/j$b;->i:LE2/k$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LE2/k$a;->j(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public e(JJ)J
    .locals 1

    .line 1
    iget-object v0, p0, LE2/j$b;->i:LE2/k$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LE2/k$a;->h(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public f(JJ)J
    .locals 1

    .line 1
    iget-object v0, p0, LE2/j$b;->i:LE2/k$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LE2/k$a;->d(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public g(JJ)J
    .locals 1

    .line 1
    iget-object v0, p0, LE2/j$b;->i:LE2/k$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LE2/k$a;->f(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public h(J)LE2/i;
    .locals 1

    .line 1
    iget-object v0, p0, LE2/j$b;->i:LE2/k$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, LE2/k$a;->k(LE2/j;J)LE2/i;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public i(JJ)J
    .locals 1

    .line 1
    iget-object v0, p0, LE2/j$b;->i:LE2/k$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LE2/k$a;->i(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public j(J)J
    .locals 1

    .line 1
    iget-object v0, p0, LE2/j$b;->i:LE2/k$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LE2/k$a;->g(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE2/j$b;->i:LE2/k$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LE2/k$a;->l()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public l()J
    .locals 2

    .line 1
    iget-object v0, p0, LE2/j$b;->i:LE2/k$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LE2/k$a;->e()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public m(JJ)J
    .locals 1

    .line 1
    iget-object v0, p0, LE2/j$b;->i:LE2/k$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LE2/k$a;->c(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method
