.class public final LWf/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LRf/b;


# static fields
.field public static final a:LWf/A;

.field private static final b:LTf/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, LWf/A;

    .line 2
    .line 3
    invoke-direct {v0}, LWf/A;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LWf/A;->a:LWf/A;

    .line 7
    .line 8
    sget-object v2, LTf/l$b;->a:LTf/l$b;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    new-array v3, v0, [LTf/e;

    .line 12
    .line 13
    const/16 v5, 0x8

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const-string v1, "kotlinx.serialization.json.JsonNull"

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static/range {v1 .. v6}, LTf/k;->e(Ljava/lang/String;LTf/l;[LTf/e;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LTf/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LWf/A;->b:LTf/e;

    .line 24
    .line 25
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(LUf/e;)LWf/z;
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LWf/r;->b(LUf/e;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, LUf/e;->D()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, LUf/e;->j()Ljava/lang/Void;

    .line 16
    .line 17
    .line 18
    sget-object p1, LWf/z;->INSTANCE:LWf/z;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    new-instance p1, LXf/y;

    .line 22
    .line 23
    const-string v0, "Expected \'null\' literal"

    .line 24
    .line 25
    invoke-direct {p1, v0}, LXf/y;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public b(LUf/f;LWf/z;)V
    .locals 1

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LWf/r;->c(LUf/f;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, LUf/f;->v()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public bridge synthetic deserialize(LUf/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LWf/A;->a(LUf/e;)LWf/z;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, LWf/A;->b:LTf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, LWf/z;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LWf/A;->b(LUf/f;LWf/z;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
