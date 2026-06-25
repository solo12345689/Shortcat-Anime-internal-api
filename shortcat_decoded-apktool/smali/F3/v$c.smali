.class public final LF3/v$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private b:I

.field private c:J

.field private d:J

.field private e:F

.field private f:J

.field private g:I

.field private h:Ljava/lang/CharSequence;

.field private i:J

.field private j:J

.field private k:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LF3/v$c;->a:Ljava/util/List;

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, LF3/v$c;->j:J

    return-void
.end method

.method public constructor <init>(LF3/v;)V
    .locals 3

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LF3/v$c;->a:Ljava/util/List;

    const-wide/16 v1, -0x1

    .line 6
    iput-wide v1, p0, LF3/v$c;->j:J

    .line 7
    iget v1, p1, LF3/v;->a:I

    iput v1, p0, LF3/v$c;->b:I

    .line 8
    iget-wide v1, p1, LF3/v;->b:J

    iput-wide v1, p0, LF3/v$c;->c:J

    .line 9
    iget v1, p1, LF3/v;->d:F

    iput v1, p0, LF3/v$c;->e:F

    .line 10
    iget-wide v1, p1, LF3/v;->h:J

    iput-wide v1, p0, LF3/v$c;->i:J

    .line 11
    iget-wide v1, p1, LF3/v;->c:J

    iput-wide v1, p0, LF3/v$c;->d:J

    .line 12
    iget-wide v1, p1, LF3/v;->e:J

    iput-wide v1, p0, LF3/v$c;->f:J

    .line 13
    iget v1, p1, LF3/v;->f:I

    iput v1, p0, LF3/v$c;->g:I

    .line 14
    iget-object v1, p1, LF3/v;->g:Ljava/lang/CharSequence;

    iput-object v1, p0, LF3/v$c;->h:Ljava/lang/CharSequence;

    .line 15
    iget-object v1, p1, LF3/v;->i:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 17
    :cond_0
    iget-wide v0, p1, LF3/v;->j:J

    iput-wide v0, p0, LF3/v$c;->j:J

    .line 18
    iget-object p1, p1, LF3/v;->k:Landroid/os/Bundle;

    iput-object p1, p0, LF3/v$c;->k:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public a(LF3/v$d;)LF3/v$c;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/v$c;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public b()LF3/v;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, LF3/v;

    .line 4
    .line 5
    iget v2, v0, LF3/v$c;->b:I

    .line 6
    .line 7
    iget-wide v3, v0, LF3/v$c;->c:J

    .line 8
    .line 9
    iget-wide v5, v0, LF3/v$c;->d:J

    .line 10
    .line 11
    iget v7, v0, LF3/v$c;->e:F

    .line 12
    .line 13
    iget-wide v8, v0, LF3/v$c;->f:J

    .line 14
    .line 15
    iget v10, v0, LF3/v$c;->g:I

    .line 16
    .line 17
    iget-object v11, v0, LF3/v$c;->h:Ljava/lang/CharSequence;

    .line 18
    .line 19
    iget-wide v12, v0, LF3/v$c;->i:J

    .line 20
    .line 21
    iget-object v14, v0, LF3/v$c;->a:Ljava/util/List;

    .line 22
    .line 23
    move-object v15, v1

    .line 24
    move/from16 v16, v2

    .line 25
    .line 26
    iget-wide v1, v0, LF3/v$c;->j:J

    .line 27
    .line 28
    move-wide/from16 v17, v1

    .line 29
    .line 30
    iget-object v1, v0, LF3/v$c;->k:Landroid/os/Bundle;

    .line 31
    .line 32
    move/from16 v2, v16

    .line 33
    .line 34
    move-wide/from16 v19, v17

    .line 35
    .line 36
    move-object/from16 v17, v1

    .line 37
    .line 38
    move-object v1, v15

    .line 39
    move-wide/from16 v15, v19

    .line 40
    .line 41
    invoke-direct/range {v1 .. v17}, LF3/v;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/List;JLandroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    move-object v15, v1

    .line 45
    return-object v15
.end method

.method public c(J)LF3/v$c;
    .locals 0

    .line 1
    iput-wide p1, p0, LF3/v$c;->f:J

    .line 2
    .line 3
    return-object p0
.end method

.method public d(J)LF3/v$c;
    .locals 0

    .line 1
    iput-wide p1, p0, LF3/v$c;->j:J

    .line 2
    .line 3
    return-object p0
.end method

.method public e(J)LF3/v$c;
    .locals 0

    .line 1
    iput-wide p1, p0, LF3/v$c;->d:J

    .line 2
    .line 3
    return-object p0
.end method

.method public f(ILjava/lang/CharSequence;)LF3/v$c;
    .locals 0

    .line 1
    iput p1, p0, LF3/v$c;->g:I

    .line 2
    .line 3
    iput-object p2, p0, LF3/v$c;->h:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-object p0
.end method

.method public g(Landroid/os/Bundle;)LF3/v$c;
    .locals 0

    .line 1
    iput-object p1, p0, LF3/v$c;->k:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object p0
.end method

.method public h(IJFJ)LF3/v$c;
    .locals 0

    .line 1
    iput p1, p0, LF3/v$c;->b:I

    .line 2
    .line 3
    iput-wide p2, p0, LF3/v$c;->c:J

    .line 4
    .line 5
    iput-wide p5, p0, LF3/v$c;->i:J

    .line 6
    .line 7
    iput p4, p0, LF3/v$c;->e:F

    .line 8
    .line 9
    return-object p0
.end method
