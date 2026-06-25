.class public final LWf/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LRf/b;


# static fields
.field public static final a:LWf/q;

.field private static final b:LTf/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LWf/q;

    .line 2
    .line 3
    invoke-direct {v0}, LWf/q;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LWf/q;->a:LWf/q;

    .line 7
    .line 8
    sget-object v0, LTf/c$a;->a:LTf/c$a;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [LTf/e;

    .line 12
    .line 13
    new-instance v2, LWf/k;

    .line 14
    .line 15
    invoke-direct {v2}, LWf/k;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v3, "kotlinx.serialization.json.JsonElement"

    .line 19
    .line 20
    invoke-static {v3, v0, v1, v2}, LTf/k;->d(Ljava/lang/String;LTf/l;[LTf/e;Lkotlin/jvm/functions/Function1;)LTf/e;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, LWf/q;->b:LTf/e;

    .line 25
    .line 26
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

.method public static synthetic a(LTf/a;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0}, LWf/q;->g(LTf/a;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b()LTf/e;
    .locals 1

    .line 1
    invoke-static {}, LWf/q;->h()LTf/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic c()LTf/e;
    .locals 1

    .line 1
    invoke-static {}, LWf/q;->i()LTf/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic d()LTf/e;
    .locals 1

    .line 1
    invoke-static {}, LWf/q;->j()LTf/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic e()LTf/e;
    .locals 1

    .line 1
    invoke-static {}, LWf/q;->k()LTf/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic f()LTf/e;
    .locals 1

    .line 1
    invoke-static {}, LWf/q;->l()LTf/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final g(LTf/a;)LTd/L;
    .locals 15

    .line 1
    const-string v0, "$this$buildSerialDescriptor"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LWf/l;

    .line 7
    .line 8
    invoke-direct {v0}, LWf/l;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LWf/r;->a(Lie/a;)LTf/e;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const/16 v6, 0xc

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    const-string v2, "JsonPrimitive"

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    move-object v1, p0

    .line 23
    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object v8, v1

    .line 27
    new-instance p0, LWf/m;

    .line 28
    .line 29
    invoke-direct {p0}, LWf/m;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, LWf/r;->a(Lie/a;)LTf/e;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    const/16 v13, 0xc

    .line 37
    .line 38
    const/4 v14, 0x0

    .line 39
    const-string v9, "JsonNull"

    .line 40
    .line 41
    const/4 v11, 0x0

    .line 42
    const/4 v12, 0x0

    .line 43
    invoke-static/range {v8 .. v14}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance p0, LWf/n;

    .line 47
    .line 48
    invoke-direct {p0}, LWf/n;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, LWf/r;->a(Lie/a;)LTf/e;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    const-string v9, "JsonLiteral"

    .line 56
    .line 57
    invoke-static/range {v8 .. v14}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p0, LWf/o;

    .line 61
    .line 62
    invoke-direct {p0}, LWf/o;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {p0}, LWf/r;->a(Lie/a;)LTf/e;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    const-string v9, "JsonObject"

    .line 70
    .line 71
    invoke-static/range {v8 .. v14}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance p0, LWf/p;

    .line 75
    .line 76
    invoke-direct {p0}, LWf/p;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, LWf/r;->a(Lie/a;)LTf/e;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    const-string v9, "JsonArray"

    .line 84
    .line 85
    invoke-static/range {v8 .. v14}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, LTd/L;->a:LTd/L;

    .line 89
    .line 90
    return-object p0
.end method

.method private static final h()LTf/e;
    .locals 1

    .line 1
    sget-object v0, LWf/F;->a:LWf/F;

    .line 2
    .line 3
    invoke-virtual {v0}, LWf/F;->getDescriptor()LTf/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final i()LTf/e;
    .locals 1

    .line 1
    sget-object v0, LWf/A;->a:LWf/A;

    .line 2
    .line 3
    invoke-virtual {v0}, LWf/A;->getDescriptor()LTf/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final j()LTf/e;
    .locals 1

    .line 1
    sget-object v0, LWf/w;->a:LWf/w;

    .line 2
    .line 3
    invoke-virtual {v0}, LWf/w;->getDescriptor()LTf/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final k()LTf/e;
    .locals 1

    .line 1
    sget-object v0, LWf/D;->a:LWf/D;

    .line 2
    .line 3
    invoke-virtual {v0}, LWf/D;->getDescriptor()LTf/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final l()LTf/e;
    .locals 1

    .line 1
    sget-object v0, LWf/d;->a:LWf/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LWf/d;->getDescriptor()LTf/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public bridge synthetic deserialize(LUf/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LWf/q;->m(LUf/e;)LWf/i;

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
    sget-object v0, LWf/q;->b:LTf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public m(LUf/e;)LWf/i;
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LWf/r;->d(LUf/e;)LWf/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, LWf/h;->g()LWf/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public n(LUf/f;LWf/i;)V
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
    instance-of v0, p2, LWf/E;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object v0, LWf/F;->a:LWf/F;

    .line 19
    .line 20
    invoke-interface {p1, v0, p2}, LUf/f;->t(LRf/k;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    instance-of v0, p2, LWf/C;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    sget-object v0, LWf/D;->a:LWf/D;

    .line 29
    .line 30
    invoke-interface {p1, v0, p2}, LUf/f;->t(LRf/k;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    instance-of v0, p2, LWf/c;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    sget-object v0, LWf/d;->a:LWf/d;

    .line 39
    .line 40
    invoke-interface {p1, v0, p2}, LUf/f;->t(LRf/k;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    new-instance p1, LTd/r;

    .line 45
    .line 46
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, LWf/i;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LWf/q;->n(LUf/f;LWf/i;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
