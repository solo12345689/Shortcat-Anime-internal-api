.class public abstract LE/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF/x;


# instance fields
.field private final a:LE/l;

.field private final b:LF/u;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LE/l;LF/u;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE/w;->a:LE/l;

    .line 5
    .line 6
    iput-object p2, p0, LE/w;->b:LF/u;

    .line 7
    .line 8
    iput p3, p0, LE/w;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic a(IIIJ)LF/w;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, LE/w;->c(IIIJ)LE/v;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract b(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)LE/v;
.end method

.method public c(IIIJ)LE/v;
    .locals 7

    .line 1
    iget v6, p0, LE/w;->c:I

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move v1, p1

    .line 5
    move v4, p2

    .line 6
    move v5, p3

    .line 7
    move-wide v2, p4

    .line 8
    invoke-virtual/range {v0 .. v6}, LE/w;->d(IJIII)LE/v;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final d(IJIII)LE/v;
    .locals 11

    .line 1
    iget-object v2, p0, LE/w;->a:LE/l;

    .line 2
    .line 3
    invoke-interface {v2, p1}, LF/q;->d(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v3, p0, LE/w;->a:LE/l;

    .line 8
    .line 9
    invoke-interface {v3, p1}, LF/q;->f(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, p0, LE/w;->b:LF/u;

    .line 14
    .line 15
    invoke-interface {v4, p1, p2, p3}, LF/u;->g0(IJ)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-static {p2, p3}, Li1/b;->j(J)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    invoke-static {p2, p3}, Li1/b;->n(J)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    :goto_0
    move-object v0, p0

    .line 30
    move v1, p1

    .line 31
    move-wide v7, p2

    .line 32
    move v9, p4

    .line 33
    move/from16 v10, p5

    .line 34
    .line 35
    move/from16 v5, p6

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-static {p2, p3}, Li1/b;->i(J)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-static {p2, p3}, Li1/b;->m(J)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    goto :goto_0

    .line 49
    :goto_1
    invoke-virtual/range {v0 .. v10}, LE/w;->b(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)LE/v;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    return-object v1

    .line 54
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    const-string v1, "does not have fixed height"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0
.end method

.method public final e()Landroidx/compose/foundation/lazy/layout/c;
    .locals 1

    .line 1
    iget-object v0, p0, LE/w;->a:LE/l;

    .line 2
    .line 3
    invoke-interface {v0}, LE/l;->b()Landroidx/compose/foundation/lazy/layout/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
