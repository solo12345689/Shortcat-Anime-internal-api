.class public final LE/r$b$b;
.super LE/w;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE/r$b;->a(LF/u;J)LE/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:LF/u;

.field final synthetic e:LE/I;

.field final synthetic f:Z

.field final synthetic g:Z

.field final synthetic h:I

.field final synthetic i:I

.field final synthetic j:J


# direct methods
.method constructor <init>(LE/l;LF/u;ILE/I;ZZIIJ)V
    .locals 0

    .line 1
    iput-object p2, p0, LE/r$b$b;->d:LF/u;

    .line 2
    .line 3
    iput-object p4, p0, LE/r$b$b;->e:LE/I;

    .line 4
    .line 5
    iput-boolean p5, p0, LE/r$b$b;->f:Z

    .line 6
    .line 7
    iput-boolean p6, p0, LE/r$b$b;->g:Z

    .line 8
    .line 9
    iput p7, p0, LE/r$b$b;->h:I

    .line 10
    .line 11
    iput p8, p0, LE/r$b$b;->i:I

    .line 12
    .line 13
    iput-wide p9, p0, LE/r$b$b;->j:J

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, p3}, LE/w;-><init>(LE/l;LF/u;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)LE/v;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LE/r$b$b;->d:LF/u;

    .line 4
    .line 5
    invoke-interface {v1}, LI0/m;->getLayoutDirection()Li1/t;

    .line 6
    .line 7
    .line 8
    move-result-object v9

    .line 9
    iget-object v1, v0, LE/r$b$b;->e:LE/I;

    .line 10
    .line 11
    invoke-virtual {v1}, LE/I;->r()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 12
    .line 13
    .line 14
    move-result-object v16

    .line 15
    new-instance v2, LE/v;

    .line 16
    .line 17
    iget-boolean v5, v0, LE/r$b$b;->f:Z

    .line 18
    .line 19
    iget-boolean v8, v0, LE/r$b$b;->g:Z

    .line 20
    .line 21
    iget v10, v0, LE/r$b$b;->h:I

    .line 22
    .line 23
    iget v11, v0, LE/r$b$b;->i:I

    .line 24
    .line 25
    iget-wide v13, v0, LE/r$b$b;->j:J

    .line 26
    .line 27
    const/16 v21, 0x0

    .line 28
    .line 29
    move/from16 v3, p1

    .line 30
    .line 31
    move-object/from16 v4, p2

    .line 32
    .line 33
    move-object/from16 v15, p3

    .line 34
    .line 35
    move/from16 v6, p4

    .line 36
    .line 37
    move/from16 v7, p5

    .line 38
    .line 39
    move-object/from16 v12, p6

    .line 40
    .line 41
    move-wide/from16 v17, p7

    .line 42
    .line 43
    move/from16 v19, p9

    .line 44
    .line 45
    move/from16 v20, p10

    .line 46
    .line 47
    invoke-direct/range {v2 .. v21}, LE/v;-><init>(ILjava/lang/Object;ZIIZLi1/t;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    .line 49
    .line 50
    return-object v2
.end method
