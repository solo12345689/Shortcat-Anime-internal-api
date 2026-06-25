.class public final Landroidx/media3/exoplayer/dash/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/media3/exoplayer/dash/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lw2/g$a;

.field private final b:I

.field private final c:LN2/f$a;


# direct methods
.method public constructor <init>(LN2/f$a;Lw2/g$a;I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/d$a;->c:LN2/f$a;

    .line 5
    iput-object p2, p0, Landroidx/media3/exoplayer/dash/d$a;->a:Lw2/g$a;

    .line 6
    iput p3, p0, Landroidx/media3/exoplayer/dash/d$a;->b:I

    return-void
.end method

.method public constructor <init>(Lw2/g$a;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/dash/d$a;-><init>(Lw2/g$a;I)V

    return-void
.end method

.method public constructor <init>(Lw2/g$a;I)V
    .locals 1

    .line 2
    new-instance v0, LN2/d$b;

    invoke-direct {v0}, LN2/d$b;-><init>()V

    invoke-direct {p0, v0, p1, p2}, Landroidx/media3/exoplayer/dash/d$a;-><init>(LN2/f$a;Lw2/g$a;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lr3/r$a;)Landroidx/media3/exoplayer/dash/a$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/d$a;->h(Lr3/r$a;)Landroidx/media3/exoplayer/dash/d$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(I)Landroidx/media3/exoplayer/dash/a$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/d$a;->g(I)Landroidx/media3/exoplayer/dash/d$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic c(Z)Landroidx/media3/exoplayer/dash/a$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/d$a;->f(Z)Landroidx/media3/exoplayer/dash/d$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public d(Lq2/x;)Lq2/x;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/d$a;->c:LN2/f$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LN2/f$a;->d(Lq2/x;)Lq2/x;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public e(LQ2/n;LE2/c;LD2/b;I[ILP2/A;IJZLjava/util/List;Landroidx/media3/exoplayer/dash/f$c;Lw2/F;LB2/K1;LQ2/e;)Landroidx/media3/exoplayer/dash/a;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p13

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/d$a;->a:Lw2/g$a;

    .line 6
    .line 7
    invoke-interface {v2}, Lw2/g$a;->a()Lw2/g;

    .line 8
    .line 9
    .line 10
    move-result-object v12

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v12, v1}, Lw2/g;->i(Lw2/F;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v3, Landroidx/media3/exoplayer/dash/d;

    .line 17
    .line 18
    iget-object v4, v0, Landroidx/media3/exoplayer/dash/d$a;->c:LN2/f$a;

    .line 19
    .line 20
    iget v15, v0, Landroidx/media3/exoplayer/dash/d$a;->b:I

    .line 21
    .line 22
    move-object/from16 v5, p1

    .line 23
    .line 24
    move-object/from16 v6, p2

    .line 25
    .line 26
    move-object/from16 v7, p3

    .line 27
    .line 28
    move/from16 v8, p4

    .line 29
    .line 30
    move-object/from16 v9, p5

    .line 31
    .line 32
    move-object/from16 v10, p6

    .line 33
    .line 34
    move/from16 v11, p7

    .line 35
    .line 36
    move-wide/from16 v13, p8

    .line 37
    .line 38
    move/from16 v16, p10

    .line 39
    .line 40
    move-object/from16 v17, p11

    .line 41
    .line 42
    move-object/from16 v18, p12

    .line 43
    .line 44
    move-object/from16 v19, p14

    .line 45
    .line 46
    move-object/from16 v20, p15

    .line 47
    .line 48
    invoke-direct/range {v3 .. v20}, Landroidx/media3/exoplayer/dash/d;-><init>(LN2/f$a;LQ2/n;LE2/c;LD2/b;I[ILP2/A;ILw2/g;JIZLjava/util/List;Landroidx/media3/exoplayer/dash/f$c;LB2/K1;LQ2/e;)V

    .line 49
    .line 50
    .line 51
    return-object v3
.end method

.method public f(Z)Landroidx/media3/exoplayer/dash/d$a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/d$a;->c:LN2/f$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LN2/f$a;->c(Z)LN2/f$a;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public g(I)Landroidx/media3/exoplayer/dash/d$a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/d$a;->c:LN2/f$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LN2/f$a;->b(I)LN2/f$a;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public h(Lr3/r$a;)Landroidx/media3/exoplayer/dash/d$a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/d$a;->c:LN2/f$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LN2/f$a;->a(Lr3/r$a;)LN2/f$a;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
