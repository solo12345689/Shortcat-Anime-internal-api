.class public final LY0/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY0/u$b;


# instance fields
.field private final a:LY0/U;

.field private final b:LY0/Z;

.field private final c:LY0/s0;

.field private final d:LY0/D;

.field private final e:LY0/T;

.field private final f:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LY0/U;LY0/Z;LY0/s0;LY0/D;LY0/T;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LY0/y;->a:LY0/U;

    .line 3
    iput-object p2, p0, LY0/y;->b:LY0/Z;

    .line 4
    iput-object p3, p0, LY0/y;->c:LY0/s0;

    .line 5
    iput-object p4, p0, LY0/y;->d:LY0/D;

    .line 6
    iput-object p5, p0, LY0/y;->e:LY0/T;

    .line 7
    new-instance p1, LY0/w;

    invoke-direct {p1, p0}, LY0/w;-><init>(LY0/y;)V

    iput-object p1, p0, LY0/y;->f:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(LY0/U;LY0/Z;LY0/s0;LY0/D;LY0/T;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 8
    sget-object p2, LY0/Z;->a:LY0/Z$a;

    invoke-virtual {p2}, LY0/Z$a;->a()LY0/Z;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 9
    invoke-static {}, LY0/z;->b()LY0/s0;

    move-result-object p3

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 10
    new-instance p4, LY0/D;

    invoke-static {}, LY0/z;->a()LY0/n;

    move-result-object p2

    const/4 p3, 0x0

    const/4 p7, 0x2

    invoke-direct {p4, p2, p3, p7, p3}, LY0/D;-><init>(LY0/n;LZd/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    .line 11
    new-instance p5, LY0/T;

    invoke-direct {p5}, LY0/T;-><init>()V

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    .line 12
    invoke-direct/range {v0 .. v5}, LY0/y;-><init>(LY0/U;LY0/Z;LY0/s0;LY0/D;LY0/T;)V

    return-void
.end method

.method public static synthetic c(LY0/y;LY0/q0;Lkotlin/jvm/functions/Function1;)LY0/t0;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY0/y;->g(LY0/y;LY0/q0;Lkotlin/jvm/functions/Function1;)LY0/t0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(LY0/y;LY0/q0;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY0/y;->e(LY0/y;LY0/q0;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final e(LY0/y;LY0/q0;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/16 v6, 0x1e

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    move-object v0, p1

    .line 10
    invoke-static/range {v0 .. v7}, LY0/q0;->b(LY0/q0;LY0/u;LY0/L;IILjava/lang/Object;ILjava/lang/Object;)LY0/q0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {p0, p1}, LY0/y;->f(LY0/q0;)LY/h2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private final f(LY0/q0;)LY/h2;
    .locals 2

    .line 1
    iget-object v0, p0, LY0/y;->c:LY0/s0;

    .line 2
    .line 3
    new-instance v1, LY0/x;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LY0/x;-><init>(LY0/y;LY0/q0;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, v1}, LY0/s0;->b(LY0/q0;Lkotlin/jvm/functions/Function1;)LY/h2;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method private static final g(LY0/y;LY0/q0;Lkotlin/jvm/functions/Function1;)LY0/t0;
    .locals 3

    .line 1
    iget-object v0, p0, LY0/y;->d:LY0/D;

    .line 2
    .line 3
    iget-object v1, p0, LY0/y;->a:LY0/U;

    .line 4
    .line 5
    iget-object v2, p0, LY0/y;->f:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1, p2, v2}, LY0/D;->a(LY0/q0;LY0/U;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LY0/t0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LY0/y;->e:LY0/T;

    .line 14
    .line 15
    iget-object v1, p0, LY0/y;->a:LY0/U;

    .line 16
    .line 17
    iget-object p0, p0, LY0/y;->f:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1, p2, p0}, LY0/T;->a(LY0/q0;LY0/U;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LY0/t0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string p1, "Could not load font"

    .line 29
    .line 30
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :cond_1
    return-object v0
.end method


# virtual methods
.method public b(LY0/u;LY0/L;II)LY/h2;
    .locals 7

    .line 1
    new-instance v0, LY0/q0;

    .line 2
    .line 3
    iget-object v1, p0, LY0/y;->b:LY0/Z;

    .line 4
    .line 5
    invoke-interface {v1, p1}, LY0/Z;->b(LY0/u;)LY0/u;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object p1, p0, LY0/y;->b:LY0/Z;

    .line 10
    .line 11
    invoke-interface {p1, p2}, LY0/Z;->c(LY0/L;)LY0/L;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object p1, p0, LY0/y;->b:LY0/Z;

    .line 16
    .line 17
    invoke-interface {p1, p3}, LY0/Z;->a(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget-object p1, p0, LY0/y;->b:LY0/Z;

    .line 22
    .line 23
    invoke-interface {p1, p4}, LY0/Z;->d(I)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget-object p1, p0, LY0/y;->a:LY0/U;

    .line 28
    .line 29
    invoke-interface {p1}, LY0/U;->a()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-direct/range {v0 .. v6}, LY0/q0;-><init>(LY0/u;LY0/L;IILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0}, LY0/y;->f(LY0/q0;)LY/h2;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method
