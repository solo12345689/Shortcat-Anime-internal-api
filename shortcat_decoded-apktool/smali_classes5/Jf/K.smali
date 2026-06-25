.class public abstract LJf/K;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LLf/E;

.field private static final b:LLf/E;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LLf/E;

    .line 2
    .line 3
    const-string v1, "NONE"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LLf/E;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LJf/K;->a:LLf/E;

    .line 9
    .line 10
    new-instance v0, LLf/E;

    .line 11
    .line 12
    const-string v1, "PENDING"

    .line 13
    .line 14
    invoke-direct {v0, v1}, LLf/E;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LJf/K;->b:LLf/E;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Ljava/lang/Object;)LJf/u;
    .locals 1

    .line 1
    new-instance v0, LJf/J;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, LKf/p;->a:LLf/E;

    .line 6
    .line 7
    :cond_0
    invoke-direct {v0, p0}, LJf/J;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static final synthetic b()LLf/E;
    .locals 1

    .line 1
    sget-object v0, LJf/K;->a:LLf/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c()LLf/E;
    .locals 1

    .line 1
    sget-object v0, LJf/K;->b:LLf/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final d(LJf/I;LZd/i;ILIf/a;)LJf/e;
    .locals 1

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-ge p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, -0x2

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    :goto_0
    sget-object v0, LIf/a;->b:LIf/a;

    .line 11
    .line 12
    if-ne p3, v0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    invoke-static {p0, p1, p2, p3}, LJf/A;->e(LJf/y;LZd/i;ILIf/a;)LJf/e;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
