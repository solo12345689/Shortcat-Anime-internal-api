.class abstract synthetic LJf/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const v1, 0x7fffffff

    .line 3
    .line 4
    .line 5
    const-string v2, "kotlinx.coroutines.flow.defaultConcurrency"

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1}, LLf/F;->b(Ljava/lang/String;III)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sput v0, LJf/q;->a:I

    .line 14
    .line 15
    return-void
.end method

.method public static final a(LJf/e;Lkotlin/jvm/functions/Function2;)LJf/e;
    .locals 2

    .line 1
    new-instance v0, LJf/q$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, LJf/q$a;-><init>(Lkotlin/jvm/functions/Function2;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, LJf/g;->y(LJf/e;Lie/o;)LJf/e;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final b(LJf/e;Lie/o;)LJf/e;
    .locals 8

    .line 1
    new-instance v0, LKf/i;

    .line 2
    .line 3
    const/16 v6, 0x1c

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    move-object v2, p0

    .line 10
    move-object v1, p1

    .line 11
    invoke-direct/range {v0 .. v7}, LKf/i;-><init>(Lie/o;LJf/e;LZd/i;ILIf/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
