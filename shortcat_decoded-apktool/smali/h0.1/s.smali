.class public abstract Lh0/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LY/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lh0/r;

    .line 2
    .line 3
    invoke-direct {v0}, Lh0/r;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LY/H;->j(Lie/a;)LY/b1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lh0/s;->a:LY/b1;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a()Lh0/p;
    .locals 1

    .line 1
    invoke-static {}, Lh0/s;->b()Lh0/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final b()Lh0/p;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public static final c(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Lh0/p;
    .locals 1

    .line 1
    new-instance v0, Lh0/q;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lh0/q;-><init>(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final synthetic d(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lh0/s;->f(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic e(Ljava/util/Map;)Lt/P;
    .locals 0

    .line 1
    invoke-static {p0}, Lh0/s;->h(Ljava/util/Map;)Lt/P;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final f(Ljava/lang/CharSequence;)Z
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-static {v3}, LDf/a;->c(C)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method public static final g()LY/b1;
    .locals 1

    .line 1
    sget-object v0, Lh0/s;->a:LY/b1;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final h(Ljava/util/Map;)Lt/P;
    .locals 2

    .line 1
    new-instance v0, Lt/P;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Lt/P;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lt/P;->s(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
