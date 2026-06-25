.class public final LH2/f$f;
.super LH2/f$g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final l:Ljava/lang/String;

.field public final m:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V
    .locals 18

    const/16 v16, 0x0

    .line 1
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v17

    const/4 v2, 0x0

    .line 2
    const-string v3, ""

    const-wide/16 v4, 0x0

    const/4 v6, -0x1

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v12, p2

    move-wide/from16 v14, p4

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    invoke-direct/range {v0 .. v17}, LH2/f$f;-><init>(Ljava/lang/String;LH2/f$f;Ljava/lang/String;JIJLq2/q;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LH2/f$f;Ljava/lang/String;JIJLq2/q;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V
    .locals 17

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p4

    move/from16 v5, p6

    move-wide/from16 v6, p7

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-wide/from16 v11, p12

    move-wide/from16 v13, p14

    move/from16 v15, p16

    .line 3
    invoke-direct/range {v0 .. v16}, LH2/f$g;-><init>(Ljava/lang/String;LH2/f$f;JIJLq2/q;Ljava/lang/String;Ljava/lang/String;JJZLH2/f$a;)V

    move-object/from16 v1, p3

    .line 4
    iput-object v1, v0, LH2/f$f;->l:Ljava/lang/String;

    .line 5
    invoke-static/range {p17 .. p17}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    move-result-object v1

    iput-object v1, v0, LH2/f$f;->m:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public b(JI)LH2/f$f;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move-wide/from16 v3, p1

    .line 10
    .line 11
    :goto_0
    iget-object v5, v0, LH2/f$f;->m:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-ge v2, v5, :cond_0

    .line 18
    .line 19
    iget-object v5, v0, LH2/f$f;->m:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, LH2/f$d;

    .line 26
    .line 27
    move/from16 v7, p3

    .line 28
    .line 29
    invoke-virtual {v5, v3, v4, v7}, LH2/f$d;->b(JI)LH2/f$d;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    iget-wide v5, v5, LH2/f$g;->c:J

    .line 37
    .line 38
    add-long/2addr v3, v5

    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move/from16 v7, p3

    .line 43
    .line 44
    move-object/from16 v18, v1

    .line 45
    .line 46
    new-instance v1, LH2/f$f;

    .line 47
    .line 48
    iget-object v2, v0, LH2/f$g;->a:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v3, v0, LH2/f$g;->b:LH2/f$f;

    .line 51
    .line 52
    iget-object v4, v0, LH2/f$f;->l:Ljava/lang/String;

    .line 53
    .line 54
    iget-wide v5, v0, LH2/f$g;->c:J

    .line 55
    .line 56
    iget-object v10, v0, LH2/f$g;->f:Lq2/q;

    .line 57
    .line 58
    iget-object v11, v0, LH2/f$g;->g:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v12, v0, LH2/f$g;->h:Ljava/lang/String;

    .line 61
    .line 62
    iget-wide v13, v0, LH2/f$g;->i:J

    .line 63
    .line 64
    iget-wide v8, v0, LH2/f$g;->j:J

    .line 65
    .line 66
    iget-boolean v15, v0, LH2/f$g;->k:Z

    .line 67
    .line 68
    move/from16 v17, v15

    .line 69
    .line 70
    move-wide v15, v8

    .line 71
    move-wide/from16 v8, p1

    .line 72
    .line 73
    invoke-direct/range {v1 .. v18}, LH2/f$f;-><init>(Ljava/lang/String;LH2/f$f;Ljava/lang/String;JIJLq2/q;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    .line 74
    .line 75
    .line 76
    return-object v1
.end method
