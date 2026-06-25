.class public abstract LD/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF/x;


# instance fields
.field private final a:LD/m;

.field private final b:LF/u;

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(JZLD/m;LF/u;)V
    .locals 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p4, p0, LD/u;->a:LD/m;

    .line 4
    iput-object p5, p0, LD/u;->b:LF/u;

    const p4, 0x7fffffff

    if-eqz p3, :cond_0

    .line 5
    invoke-static {p1, p2}, Li1/b;->l(J)I

    move-result p5

    move v1, p5

    goto :goto_0

    :cond_0
    move v1, p4

    :goto_0
    if-nez p3, :cond_1

    .line 6
    invoke-static {p1, p2}, Li1/b;->k(J)I

    move-result p4

    :cond_1
    move v3, p4

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 7
    invoke-static/range {v0 .. v5}, Li1/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p1

    iput-wide p1, p0, LD/u;->c:J

    return-void
.end method

.method public synthetic constructor <init>(JZLD/m;LF/u;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LD/u;-><init>(JZLD/m;LF/u;)V

    return-void
.end method

.method public static synthetic e(LD/u;IJILjava/lang/Object;)LD/t;
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    iget-wide p2, p0, LD/u;->c:J

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LD/u;->d(IJ)LD/t;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string p1, "Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0
.end method


# virtual methods
.method public bridge synthetic a(IIIJ)LF/w;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, LD/u;->c(IIIJ)LD/t;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract b(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)LD/t;
.end method

.method public c(IIIJ)LD/t;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p4, p5}, LD/u;->d(IJ)LD/t;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final d(IJ)LD/t;
    .locals 8

    .line 1
    iget-object v0, p0, LD/u;->a:LD/m;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF/q;->d(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    iget-object v0, p0, LD/u;->a:LD/m;

    .line 8
    .line 9
    invoke-interface {v0, p1}, LF/q;->f(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget-object v0, p0, LD/u;->b:LF/u;

    .line 14
    .line 15
    invoke-interface {v0, p1, p2, p3}, LF/u;->g0(IJ)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    move-object v1, p0

    .line 20
    move v2, p1

    .line 21
    move-wide v6, p2

    .line 22
    invoke-virtual/range {v1 .. v7}, LD/u;->b(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)LD/t;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-wide v0, p0, LD/u;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final g()Landroidx/compose/foundation/lazy/layout/c;
    .locals 1

    .line 1
    iget-object v0, p0, LD/u;->a:LD/m;

    .line 2
    .line 3
    invoke-interface {v0}, LD/m;->b()Landroidx/compose/foundation/lazy/layout/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
