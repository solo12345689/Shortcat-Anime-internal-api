.class public LM2/L$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM2/L$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:LM2/D$b;

.field private final c:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, LM2/L$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILM2/D$b;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILM2/D$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LM2/L$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    iput p2, p0, LM2/L$a;->a:I

    .line 5
    iput-object p3, p0, LM2/L$a;->b:LM2/D$b;

    return-void
.end method

.method public static synthetic a(Lt2/n;LM2/L;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lt2/n;->accept(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(LM2/L$a;LM2/y;LM2/B;Ljava/io/IOException;ZLM2/L;)V
    .locals 7

    .line 1
    iget v1, p0, LM2/L$a;->a:I

    .line 2
    .line 3
    iget-object v2, p0, LM2/L$a;->b:LM2/D$b;

    .line 4
    .line 5
    move-object v3, p1

    .line 6
    move-object v4, p2

    .line 7
    move-object v5, p3

    .line 8
    move v6, p4

    .line 9
    move-object v0, p5

    .line 10
    invoke-interface/range {v0 .. v6}, LM2/L;->G(ILM2/D$b;LM2/y;LM2/B;Ljava/io/IOException;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic c(LM2/L$a;LM2/y;LM2/B;ILM2/L;)V
    .locals 6

    .line 1
    iget v1, p0, LM2/L$a;->a:I

    .line 2
    .line 3
    iget-object v2, p0, LM2/L$a;->b:LM2/D$b;

    .line 4
    .line 5
    move-object v3, p1

    .line 6
    move-object v4, p2

    .line 7
    move v5, p3

    .line 8
    move-object v0, p4

    .line 9
    invoke-interface/range {v0 .. v5}, LM2/L;->O(ILM2/D$b;LM2/y;LM2/B;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic d(LM2/L$a;LM2/D$b;LM2/B;LM2/L;)V
    .locals 0

    .line 1
    iget p0, p0, LM2/L$a;->a:I

    .line 2
    .line 3
    invoke-interface {p3, p0, p1, p2}, LM2/L;->x0(ILM2/D$b;LM2/B;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic e(LM2/L$a;LM2/B;LM2/L;)V
    .locals 1

    .line 1
    iget v0, p0, LM2/L$a;->a:I

    .line 2
    .line 3
    iget-object p0, p0, LM2/L$a;->b:LM2/D$b;

    .line 4
    .line 5
    invoke-interface {p2, v0, p0, p1}, LM2/L;->j0(ILM2/D$b;LM2/B;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic f(LM2/L$a;LM2/y;LM2/B;LM2/L;)V
    .locals 1

    .line 1
    iget v0, p0, LM2/L$a;->a:I

    .line 2
    .line 3
    iget-object p0, p0, LM2/L$a;->b:LM2/D$b;

    .line 4
    .line 5
    invoke-interface {p3, v0, p0, p1, p2}, LM2/L;->i0(ILM2/D$b;LM2/y;LM2/B;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic g(LM2/L$a;LM2/y;LM2/B;LM2/L;)V
    .locals 1

    .line 1
    iget v0, p0, LM2/L$a;->a:I

    .line 2
    .line 3
    iget-object p0, p0, LM2/L$a;->b:LM2/D$b;

    .line 4
    .line 5
    invoke-interface {p3, v0, p0, p1, p2}, LM2/L;->a0(ILM2/D$b;LM2/y;LM2/B;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public A(ILM2/D$b;)LM2/L$a;
    .locals 2

    .line 1
    new-instance v0, LM2/L$a;

    .line 2
    .line 3
    iget-object v1, p0, LM2/L$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2}, LM2/L$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILM2/D$b;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public h(Landroid/os/Handler;LM2/L;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LM2/L$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    new-instance v1, LM2/L$a$a;

    .line 10
    .line 11
    invoke-direct {v1, p1, p2}, LM2/L$a$a;-><init>(Landroid/os/Handler;LM2/L;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public i(Lt2/n;)V
    .locals 4

    .line 1
    iget-object v0, p0, LM2/L$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, LM2/L$a$a;

    .line 18
    .line 19
    iget-object v2, v1, LM2/L$a$a;->b:LM2/L;

    .line 20
    .line 21
    iget-object v1, v1, LM2/L$a$a;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v3, LM2/K;

    .line 24
    .line 25
    invoke-direct {v3, p1, v2}, LM2/K;-><init>(Lt2/n;LM2/L;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v3}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public j(ILq2/x;ILjava/lang/Object;J)V
    .locals 10

    .line 1
    new-instance v0, LM2/B;

    .line 2
    .line 3
    invoke-static/range {p5 .. p6}, Lt2/a0;->F1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    move v2, p1

    .line 14
    move-object v3, p2

    .line 15
    move v4, p3

    .line 16
    move-object v5, p4

    .line 17
    invoke-direct/range {v0 .. v9}, LM2/B;-><init>(IILq2/x;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, LM2/L$a;->k(LM2/B;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public k(LM2/B;)V
    .locals 1

    .line 1
    new-instance v0, LM2/E;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LM2/E;-><init>(LM2/L$a;LM2/B;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, LM2/L$a;->i(Lt2/n;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public l(LM2/y;I)V
    .locals 11

    .line 1
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    invoke-virtual/range {v0 .. v10}, LM2/L$a;->m(LM2/y;IILq2/x;ILjava/lang/Object;JJ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public m(LM2/y;IILq2/x;ILjava/lang/Object;JJ)V
    .locals 10

    .line 1
    new-instance v0, LM2/B;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, Lt2/a0;->F1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, Lt2/a0;->F1(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, LM2/B;-><init>(IILq2/x;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, LM2/L$a;->n(LM2/y;LM2/B;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public n(LM2/y;LM2/B;)V
    .locals 1

    .line 1
    new-instance v0, LM2/I;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LM2/I;-><init>(LM2/L$a;LM2/y;LM2/B;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, LM2/L$a;->i(Lt2/n;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public o(LM2/y;I)V
    .locals 11

    .line 1
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    invoke-virtual/range {v0 .. v10}, LM2/L$a;->p(LM2/y;IILq2/x;ILjava/lang/Object;JJ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public p(LM2/y;IILq2/x;ILjava/lang/Object;JJ)V
    .locals 10

    .line 1
    new-instance v0, LM2/B;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, Lt2/a0;->F1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, Lt2/a0;->F1(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, LM2/B;-><init>(IILq2/x;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, LM2/L$a;->q(LM2/y;LM2/B;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public q(LM2/y;LM2/B;)V
    .locals 1

    .line 1
    new-instance v0, LM2/G;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LM2/G;-><init>(LM2/L$a;LM2/y;LM2/B;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, LM2/L$a;->i(Lt2/n;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public r(LM2/y;IILq2/x;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 10

    .line 1
    new-instance v0, LM2/B;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, Lt2/a0;->F1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, Lt2/a0;->F1(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, LM2/B;-><init>(IILq2/x;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    move-object/from16 p2, p11

    .line 21
    .line 22
    move/from16 p3, p12

    .line 23
    .line 24
    invoke-virtual {p0, p1, v0, p2, p3}, LM2/L$a;->t(LM2/y;LM2/B;Ljava/io/IOException;Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public s(LM2/y;ILjava/io/IOException;Z)V
    .locals 13

    .line 1
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    move-object/from16 v11, p3

    .line 19
    .line 20
    move/from16 v12, p4

    .line 21
    .line 22
    invoke-virtual/range {v0 .. v12}, LM2/L$a;->r(LM2/y;IILq2/x;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public t(LM2/y;LM2/B;Ljava/io/IOException;Z)V
    .locals 6

    .line 1
    new-instance v0, LM2/H;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, LM2/H;-><init>(LM2/L$a;LM2/y;LM2/B;Ljava/io/IOException;Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, LM2/L$a;->i(Lt2/n;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public u(LM2/y;II)V
    .locals 12

    .line 1
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    move v11, p3

    .line 19
    invoke-virtual/range {v0 .. v11}, LM2/L$a;->v(LM2/y;IILq2/x;ILjava/lang/Object;JJI)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public v(LM2/y;IILq2/x;ILjava/lang/Object;JJI)V
    .locals 10

    .line 1
    new-instance v0, LM2/B;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, Lt2/a0;->F1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, Lt2/a0;->F1(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, LM2/B;-><init>(IILq2/x;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    move/from16 p2, p11

    .line 21
    .line 22
    invoke-virtual {p0, p1, v0, p2}, LM2/L$a;->w(LM2/y;LM2/B;I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public w(LM2/y;LM2/B;I)V
    .locals 1

    .line 1
    new-instance v0, LM2/F;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, LM2/F;-><init>(LM2/L$a;LM2/y;LM2/B;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, LM2/L$a;->i(Lt2/n;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public x(LM2/L;)V
    .locals 3

    .line 1
    iget-object v0, p0, LM2/L$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, LM2/L$a$a;

    .line 18
    .line 19
    iget-object v2, v1, LM2/L$a$a;->b:LM2/L;

    .line 20
    .line 21
    if-ne v2, p1, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, LM2/L$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-void
.end method

.method public y(IJJ)V
    .locals 10

    .line 1
    new-instance v0, LM2/B;

    .line 2
    .line 3
    invoke-static {p2, p3}, Lt2/a0;->F1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static {p4, p5}, Lt2/a0;->F1(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x3

    .line 14
    const/4 v5, 0x0

    .line 15
    move v2, p1

    .line 16
    invoke-direct/range {v0 .. v9}, LM2/B;-><init>(IILq2/x;ILjava/lang/Object;JJ)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, LM2/L$a;->z(LM2/B;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public z(LM2/B;)V
    .locals 2

    .line 1
    iget-object v0, p0, LM2/L$a;->b:LM2/D$b;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LM2/D$b;

    .line 8
    .line 9
    new-instance v1, LM2/J;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0, p1}, LM2/J;-><init>(LM2/L$a;LM2/D$b;LM2/B;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, LM2/L$a;->i(Lt2/n;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
