.class public final LH2/f$d;
.super LH2/f$g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final l:Z

.field public final m:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;LH2/f$f;JIJLq2/q;Ljava/lang/String;Ljava/lang/String;JJZZZ)V
    .locals 17

    .line 1
    const/16 v16, 0x0

    .line 2
    .line 3
    move-object/from16 v0, p0

    .line 4
    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    move-wide/from16 v3, p3

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    move-wide/from16 v6, p6

    .line 14
    .line 15
    move-object/from16 v8, p8

    .line 16
    .line 17
    move-object/from16 v9, p9

    .line 18
    .line 19
    move-object/from16 v10, p10

    .line 20
    .line 21
    move-wide/from16 v11, p11

    .line 22
    .line 23
    move-wide/from16 v13, p13

    .line 24
    .line 25
    move/from16 v15, p15

    .line 26
    .line 27
    invoke-direct/range {v0 .. v16}, LH2/f$g;-><init>(Ljava/lang/String;LH2/f$f;JIJLq2/q;Ljava/lang/String;Ljava/lang/String;JJZLH2/f$a;)V

    .line 28
    .line 29
    .line 30
    move/from16 v1, p16

    .line 31
    .line 32
    iput-boolean v1, v0, LH2/f$d;->l:Z

    .line 33
    .line 34
    move/from16 v1, p17

    .line 35
    .line 36
    iput-boolean v1, v0, LH2/f$d;->m:Z

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public b(JI)LH2/f$d;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, LH2/f$d;

    .line 4
    .line 5
    iget-object v2, v0, LH2/f$g;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v0, LH2/f$g;->b:LH2/f$f;

    .line 8
    .line 9
    iget-wide v4, v0, LH2/f$g;->c:J

    .line 10
    .line 11
    iget-object v9, v0, LH2/f$g;->f:Lq2/q;

    .line 12
    .line 13
    iget-object v10, v0, LH2/f$g;->g:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v11, v0, LH2/f$g;->h:Ljava/lang/String;

    .line 16
    .line 17
    iget-wide v12, v0, LH2/f$g;->i:J

    .line 18
    .line 19
    iget-wide v14, v0, LH2/f$g;->j:J

    .line 20
    .line 21
    iget-boolean v6, v0, LH2/f$g;->k:Z

    .line 22
    .line 23
    iget-boolean v7, v0, LH2/f$d;->l:Z

    .line 24
    .line 25
    iget-boolean v8, v0, LH2/f$d;->m:Z

    .line 26
    .line 27
    move/from16 v16, v6

    .line 28
    .line 29
    move/from16 v17, v7

    .line 30
    .line 31
    move/from16 v18, v8

    .line 32
    .line 33
    move-wide/from16 v7, p1

    .line 34
    .line 35
    move/from16 v6, p3

    .line 36
    .line 37
    invoke-direct/range {v1 .. v18}, LH2/f$d;-><init>(Ljava/lang/String;LH2/f$f;JIJLq2/q;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    .line 38
    .line 39
    .line 40
    return-object v1
.end method
