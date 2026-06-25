.class public abstract Lw/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lw/m;

.field private static final b:Lw/n;

.field private static final c:Lw/o;

.field private static final d:Lw/p;

.field private static final e:Lw/m;

.field private static final f:Lw/n;

.field private static final g:Lw/o;

.field private static final h:Lw/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 2
    .line 3
    invoke-static {v0}, Lw/r;->a(F)Lw/m;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sput-object v1, Lw/b;->a:Lw/m;

    .line 8
    .line 9
    invoke-static {v0, v0}, Lw/r;->b(FF)Lw/n;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sput-object v1, Lw/b;->b:Lw/n;

    .line 14
    .line 15
    invoke-static {v0, v0, v0}, Lw/r;->c(FFF)Lw/o;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sput-object v1, Lw/b;->c:Lw/o;

    .line 20
    .line 21
    invoke-static {v0, v0, v0, v0}, Lw/r;->d(FFFF)Lw/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lw/b;->d:Lw/p;

    .line 26
    .line 27
    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    .line 28
    .line 29
    invoke-static {v0}, Lw/r;->a(F)Lw/m;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sput-object v1, Lw/b;->e:Lw/m;

    .line 34
    .line 35
    invoke-static {v0, v0}, Lw/r;->b(FF)Lw/n;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sput-object v1, Lw/b;->f:Lw/n;

    .line 40
    .line 41
    invoke-static {v0, v0, v0}, Lw/r;->c(FFF)Lw/o;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sput-object v1, Lw/b;->g:Lw/o;

    .line 46
    .line 47
    invoke-static {v0, v0, v0, v0}, Lw/r;->d(FFFF)Lw/p;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lw/b;->h:Lw/p;

    .line 52
    .line 53
    return-void
.end method

.method public static final a(FF)Lw/a;
    .locals 7

    .line 1
    new-instance v0, Lw/a;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object p0, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    .line 8
    .line 9
    invoke-static {p0}, Lw/u0;->f(Lkotlin/jvm/internal/l;)Lw/s0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/16 v5, 0x8

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct/range {v0 .. v6}, Lw/a;-><init>(Ljava/lang/Object;Lw/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static synthetic b(FFILjava/lang/Object;)Lw/a;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const p1, 0x3c23d70a    # 0.01f

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {p0, p1}, Lw/b;->a(FF)Lw/a;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static final synthetic c()Lw/m;
    .locals 1

    .line 1
    sget-object v0, Lw/b;->e:Lw/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d()Lw/n;
    .locals 1

    .line 1
    sget-object v0, Lw/b;->f:Lw/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic e()Lw/o;
    .locals 1

    .line 1
    sget-object v0, Lw/b;->g:Lw/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic f()Lw/p;
    .locals 1

    .line 1
    sget-object v0, Lw/b;->h:Lw/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic g()Lw/m;
    .locals 1

    .line 1
    sget-object v0, Lw/b;->a:Lw/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic h()Lw/n;
    .locals 1

    .line 1
    sget-object v0, Lw/b;->b:Lw/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic i()Lw/o;
    .locals 1

    .line 1
    sget-object v0, Lw/b;->c:Lw/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic j()Lw/p;
    .locals 1

    .line 1
    sget-object v0, Lw/b;->d:Lw/p;

    .line 2
    .line 3
    return-object v0
.end method
