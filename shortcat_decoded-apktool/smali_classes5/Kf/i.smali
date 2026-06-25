.class public final LKf/i;
.super LKf/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final e:Lie/o;


# direct methods
.method public constructor <init>(Lie/o;LJf/e;LZd/i;ILIf/a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p2, p3, p4, p5}, LKf/g;-><init>(LJf/e;LZd/i;ILIf/a;)V

    .line 5
    iput-object p1, p0, LKf/i;->e:Lie/o;

    return-void
.end method

.method public synthetic constructor <init>(Lie/o;LJf/e;LZd/i;ILIf/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 1
    sget-object p3, LZd/j;->a:LZd/j;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, -0x2

    :cond_1
    move v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    .line 2
    sget-object p5, LIf/a;->a:LIf/a;

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    .line 3
    invoke-direct/range {v0 .. v5}, LKf/i;-><init>(Lie/o;LJf/e;LZd/i;ILIf/a;)V

    return-void
.end method

.method public static final synthetic r(LKf/i;)Lie/o;
    .locals 0

    .line 1
    iget-object p0, p0, LKf/i;->e:Lie/o;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method protected i(LZd/i;ILIf/a;)LKf/e;
    .locals 6

    .line 1
    new-instance v0, LKf/i;

    .line 2
    .line 3
    iget-object v1, p0, LKf/i;->e:Lie/o;

    .line 4
    .line 5
    iget-object v2, p0, LKf/g;->d:LJf/e;

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move v4, p2

    .line 9
    move-object v5, p3

    .line 10
    invoke-direct/range {v0 .. v5}, LKf/i;-><init>(Lie/o;LJf/e;LZd/i;ILIf/a;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method protected q(LJf/f;LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LKf/i$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, LKf/i$a;-><init>(LKf/i;LJf/f;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p2}, LGf/P;->e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 19
    .line 20
    return-object p1
.end method
